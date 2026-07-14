# Landmark Detection Project

A beginner-friendly TensorFlow landmark detection project with a Flask web interface.

## Project structure

```
Landmark_Detection_Project/
├── dataset/
│   ├── train/
│   │   ├── Taj_Mahal/
│   │   ├── Eiffel_Tower/
│   │   ├── Statue_of_Liberty/
│   │   ├── India_Gate/
│   │   └── Charminar/
│   ├── test/
├── model/
│   └── landmark_model.keras
├── static/
│   └── css/
│       └── style.css
├── templates/
│   ├── index.html
│   └── result.html
├── app.py
├── predict.py
├── train_model.py
├── requirements.txt
└── README.md
```

## Setup

1. Create a Python virtual environment:

```powershell
python -m venv venv
.\venv\Scripts\Activate.ps1
```

2. Install dependencies:

```powershell
pip install -r requirements.txt
```

3. Prepare the dataset:

- Add landmark images under `dataset/train/<landmark_name>/`
- Add validation images under `dataset/test/<landmark_name>/`

Supported landmarks:
- Taj Mahal
- Eiffel Tower
- Statue of Liberty
- India Gate
- Charminar

## Training the model

```powershell
python train_model.py
```

The trained model will be saved to `model/landmark_model.keras`.

## Running the web app

```powershell
python app.py
```

Then open `http://127.0.0.1:5000` in your browser.

## Notes

- If the project cannot load the model, train it first or place a saved Keras model at `model/landmark_model.keras`.
- You can expand the dataset with more landmark categories and improve accuracy by using transfer learning or a larger network.
