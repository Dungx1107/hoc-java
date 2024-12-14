package org.example.javafxtutorials.main14;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.util.converter.NumberStringConverter;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    TextField textField;
    @FXML
    Slider slider;

    static  final  double INIT_VALUE=50;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        slider.setValue(INIT_VALUE);
        textField.setText(String.valueOf(INIT_VALUE));
        slider.setMax(200);
        // rang buoc 2 chieu giua textField va slider
        textField.textProperty().bindBidirectional(slider.valueProperty(),new NumberStringConverter());
//        slider.valueProperty().bindBidirectional(textField.textProperty(),new NumberStringConverter());

    }
}
