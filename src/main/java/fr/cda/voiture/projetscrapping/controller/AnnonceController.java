package fr.cda.voiture.projetscrapping.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AnnonceController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
