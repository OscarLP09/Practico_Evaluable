package org.example.practico_evaluable;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Clase principal de la aplicación JavaFX.
 */
public class HelloApplication extends Application {

    /**
     * Método de inicio de la aplicación JavaFX.
     *
     * @param stage El escenario principal de la aplicación.
     * @throws Exception Si hay un error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle("Mi Aplicación JavaFX");
        stage.show();
    }

    /**
     * Método principal que lanza la aplicación.
     *
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        launch();
    }
}
