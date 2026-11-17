package fr.cda.voiture.projetscrapping;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AnnonceApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AnnonceApplication.class.getResource("annonce-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 700);
        stage.setTitle("Recherche de véhicules");
        stage.setScene(scene);
        stage.show();
    }
}
