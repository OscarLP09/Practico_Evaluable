package org.example.practico_evaluable;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.practico_evaluable.models.User;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {
    @FXML
    private TextField emailTxt;
    @FXML
    private ChoiceBox<String> plataformaChoice;
    @FXML
    private Spinner<Integer> versionSpinner;
    @FXML
    private CheckBox is_Admin;
    @FXML
    private Button añadirBtn;
    @FXML
    private TableView<User> tableView;

    @FXML
    public void añadirUsuario(ActionEvent event) {
        if(emailTxt.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Tiene que completar este campo");
            alert.setHeaderText(null);
            alert.setContentText("Debe ingresar el email");
            alert.showAndWait();
        }
    }
}