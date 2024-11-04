module org.example.practico_evaluable {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.practico_evaluable to javafx.fxml;
    exports org.example.practico_evaluable;
}