import os
import numpy as np
from tensorflow.keras.models import load_model
from tensorflow.keras.preprocessing.image import load_img, img_to_array

MODEL_PATH = os.path.join("model", "landmark_model.keras")

CLASS_MAP = {
    0: "Taj Mahal",
    1: "Eiffel Tower",
    2: "Statue of Liberty",
    3: "India Gate",
    4: "Charminar",
}

DETAILS_MAP = {
    "Taj Mahal": {
        "location": "Agra, India",
        "description": "A white marble mausoleum built by Mughal emperor Shah Jahan.",
    },
    "Eiffel Tower": {
        "location": "Paris, France",
        "description": "A wrought-iron lattice tower and one of the most visited monuments in the world.",
    },
    "Statue of Liberty": {
        "location": "New York City, USA",
        "description": "A symbol of freedom and democracy gifted by France to the United States.",
    },
    "India Gate": {
        "location": "New Delhi, India",
        "description": "A war memorial built to honor Indian soldiers who died during World War I.",
    },
    "Charminar": {
        "location": "Hyderabad, India",
        "description": "A historic mosque and landmark with four grand arches built in 1591.",
    },
}

_model = None


def get_model():
    global _model
    if _model is None:
        if not os.path.exists(MODEL_PATH):
            raise FileNotFoundError(
                f"Model file not found. Train the model first or place it at {MODEL_PATH}."
            )
        _model = load_model(MODEL_PATH)
    return _model


def preprocess_image(image_path, target_size=(224, 224)):
    image = load_img(image_path, target_size=target_size)
    image = img_to_array(image)
    image = image.astype("float32") / 255.0
    image = np.expand_dims(image, axis=0)
    return image


def predict_landmark(image_path):
    model = get_model()
    image = preprocess_image(image_path)
    predictions = model.predict(image)[0]
    class_index = int(np.argmax(predictions))
    label = CLASS_MAP.get(class_index, "Unknown")
    confidence = float(predictions[class_index])
    details = DETAILS_MAP.get(label, {})
    return label, confidence, details
