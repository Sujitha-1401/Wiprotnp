import os
from tensorflow.keras.preprocessing.image import ImageDataGenerator
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import (
    Conv2D,
    MaxPooling2D,
    Flatten,
    Dense,
    Dropout,
    BatchNormalization,
)
from tensorflow.keras.optimizers import Adam

TRAIN_DIR = os.path.join("dataset", "train")
TEST_DIR = os.path.join("dataset", "test")
MODEL_SAVE_PATH = os.path.join("model", "landmark_model.keras")
IMAGE_SIZE = (224, 224)
BATCH_SIZE = 16
EPOCHS = 15


def build_model(num_classes):
    model = Sequential(
        [
            Conv2D(32, (3, 3), activation="relu", input_shape=(*IMAGE_SIZE, 3)),
            BatchNormalization(),
            MaxPooling2D(2, 2),
            Conv2D(64, (3, 3), activation="relu"),
            BatchNormalization(),
            MaxPooling2D(2, 2),
            Conv2D(128, (3, 3), activation="relu"),
            BatchNormalization(),
            MaxPooling2D(2, 2),
            Flatten(),
            Dense(256, activation="relu"),
            Dropout(0.4),
            Dense(num_classes, activation="softmax"),
        ]
    )
    model.compile(
        optimizer=Adam(learning_rate=1e-4),
        loss="categorical_crossentropy",
        metrics=["accuracy"],
    )
    return model


if __name__ == "__main__":
    if not os.path.isdir(TRAIN_DIR):
        raise FileNotFoundError(
            f"Training directory not found: {TRAIN_DIR}. Create the dataset with subfolders for each landmark."
        )

    train_datagen = ImageDataGenerator(
        rescale=1.0 / 255.0,
        rotation_range=20,
        width_shift_range=0.15,
        height_shift_range=0.15,
        zoom_range=0.15,
        horizontal_flip=True,
        fill_mode="nearest",
    )

    validation_datagen = ImageDataGenerator(rescale=1.0 / 255.0)

    train_generator = train_datagen.flow_from_directory(
        TRAIN_DIR,
        target_size=IMAGE_SIZE,
        batch_size=BATCH_SIZE,
        class_mode="categorical",
    )

    validation_generator = validation_datagen.flow_from_directory(
        TEST_DIR,
        target_size=IMAGE_SIZE,
        batch_size=BATCH_SIZE,
        class_mode="categorical",
    )

    model = build_model(train_generator.num_classes)
    model.fit(
        train_generator,
        epochs=EPOCHS,
        validation_data=validation_generator,
    )

    os.makedirs(os.path.dirname(MODEL_SAVE_PATH), exist_ok=True)
    model.save(MODEL_SAVE_PATH)
    print(f"Saved trained model to {MODEL_SAVE_PATH}")
