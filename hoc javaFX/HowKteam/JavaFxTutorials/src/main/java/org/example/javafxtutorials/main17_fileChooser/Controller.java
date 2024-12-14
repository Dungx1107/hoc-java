package org.example.javafxtutorials.main17_fileChooser;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class Controller {
    @FXML
    private AnchorPane AP;
    @FXML
    private ImageView imageView;


    public void ChooseImage(ActionEvent event) {

        Stage stage = (Stage) AP.getScene().getWindow();
        FileChooser fc = new FileChooser();
        fc.setTitle("choose image");
        //lm cho chi chon dc file anh
        FileChooser.ExtensionFilter imageFilter = new
                FileChooser.ExtensionFilter("image file", "*.jpg", "*.png");
        fc.getExtensionFilters().addAll(imageFilter);
        File file = fc.showOpenDialog(stage);
        if (file != null) {
            Image image = new Image(file.toURI().toString(),220,390,false,true);
            imageView.setImage(image);
        }
    }
}
