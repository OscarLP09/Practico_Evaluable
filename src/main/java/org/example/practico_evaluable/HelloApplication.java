package org.example.practico_evaluable;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = loadFXML(); // Llama al método para cargar el FXML
        Scene scene = new Scene(root); // Crea la escena con el root
        stage.setScene(scene); // Establece la escena en el escenario
        stage.setTitle("Mi Aplicación JavaFX");
        stage.show(); // Muestra el escenario
    }

    private Parent loadFXML() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        return fxmlLoader.load();
    }



    public static void main(String[] args) {
        launch();
    }
}