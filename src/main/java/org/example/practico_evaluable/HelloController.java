package org.example.practico_evaluable;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.example.practico_evaluable.models.User;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Controlador para la aplicación de gestión de usuarios.
 */
public class HelloController {

    @FXML
    private TableView<User> userTable;
    @FXML
    private TableColumn<User, String> emailColumn;
    @FXML
    private TableColumn<User, String> platformColumn;
    @FXML
    private TableColumn<User, String> adminColumn;
    @FXML
    private TableColumn<User, String> versionColumn;
    @FXML
    private TableColumn<User, String> dateTimeColumn;

    @FXML
    private TextField emailTxt;
    @FXML
    private ChoiceBox<String> plataformaChoice;
    @FXML
    private Spinner<Integer> versionSpinner;
    @FXML
    private CheckBox is_Admin;

    @FXML
    private AnchorPane addUserPane;

    private ObservableList<User> userList;

    /**
     * Inicializa el controlador. Configura las columnas de la tabla y llena los elementos iniciales.
     */
    @FXML
    private void initialize() {
        emailColumn.setCellValueFactory(data -> data.getValue().emailProperty());
        platformColumn.setCellValueFactory(data -> data.getValue().platformProperty());
        adminColumn.setCellValueFactory(data -> data.getValue().adminProperty());
        versionColumn.setCellValueFactory(data -> data.getValue().versionProperty());
        dateTimeColumn.setCellValueFactory(data -> data.getValue().dateTimeProperty());

        userList = FXCollections.observableArrayList();
        userTable.setItems(userList);

        plataformaChoice.getItems().addAll("Windows", "Linux", "MacOS");
        versionSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 1));
    }

    /**
     * Añade un nuevo usuario a la tabla después de validar los campos del formulario.
     * Muestra una alerta si algún campo está vacío.
     */
    @FXML
    private void añadirUsuario() {
        if (emailTxt.getText().isEmpty() || plataformaChoice.getValue() == null ||
                versionSpinner.getValue() == null) {
            showAlert("Error", "Todos los campos deben estar completos.");
            return;
        }

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        User user = new User(
                emailTxt.getText(),
                plataformaChoice.getValue(),
                is_Admin.isSelected() ? "Sí" : "No",
                versionSpinner.getValue().toString(),
                formattedDateTime
        );
        userList.add(user);
        clearForm();
    }

    /**
     * Limpia los campos del formulario.
     */
    private void clearForm() {
        emailTxt.clear();
        plataformaChoice.setValue(null);
        versionSpinner.getValueFactory().setValue(1);
        is_Admin.setSelected(false);
    }

    /**
     * Vacía la tabla de usuarios después de una confirmación del usuario.
     */
    @FXML
    private void limpiarTabla() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmación");
        alert.setHeaderText("Vaciar tabla");
        alert.setContentText("¿Estás seguro de que deseas vaciar la tabla?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            userList.clear();
        }
    }

    /**
     * Muestra una alerta con un mensaje especificado.
     *
     * @param title   Título de la alerta.
     * @param message Mensaje de la alerta.
     */
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
