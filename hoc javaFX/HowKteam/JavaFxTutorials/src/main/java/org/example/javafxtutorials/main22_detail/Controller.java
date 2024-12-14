package org.example.javafxtutorials.main22_detail;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    private Label nameDetail;
    @FXML
    private Label ageDetail;
    @FXML
    private Label addressDetail;
    @FXML
    private Label gmailDetail;
    @FXML
    private Label phoneDetail;
    @FXML
    private Label sexDetail;
    @FXML
    private Label dateDetail;


    public void getDetail(Person chon) {
        nameDetail.setText(chon.personName);
        ageDetail.setText(String.valueOf(chon.personAge));
        addressDetail.setText(chon.personAddress);
        gmailDetail.setText(chon.personGmail);
        phoneDetail.setText(chon.personPhone);
        sexDetail.setText(chon.getPersonSex());
        dateDetail.setText(chon.getPersonDateBirth());
    }

    public void goBack(ActionEvent e) throws IOException {
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/org/example/javafxtutorials/main22_.fxml"));
        Parent parent = loader.load();
        Scene scene = new Scene(parent);
        stage.setScene(scene);

    }
}
