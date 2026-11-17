module org.example.projetscrapping {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.projetscrapping to javafx.fxml;
    exports org.example.projetscrapping;
}