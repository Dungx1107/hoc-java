package org.example.javafxtutorials.Main8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField height;

    public void submit(ActionEvent event){
        String he = height.getText();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Chiều cao của bạn: " + he);
        alert.show();
    }
}
