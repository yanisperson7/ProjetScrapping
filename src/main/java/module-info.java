module org.example.projetscrapping {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.cda.voiture.projetscrapping to javafx.fxml;
    exports fr.cda.voiture.projetscrapping;
}