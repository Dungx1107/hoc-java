package org.example.javafxtutorials.main11;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    TreeView<String> treeView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TreeItem<String> root = new TreeItem<>("Root");
        TreeItem<String> javaFXTutorial = new TreeItem<>("javaFXTutorial");
        TreeItem<String> sample = new TreeItem<>("sample");
        TreeItem<String> main8 = new TreeItem<>("main8");
        TreeItem<String> main10 = new TreeItem<>("main10");
        TreeItem<String> main11 = new TreeItem<>("main11");

        sample.getChildren().addAll(main8, main10, main11);
        javaFXTutorial.getChildren().add(sample);
        root.getChildren().add(javaFXTutorial);
        root.setExpanded(true);
        sample.setExpanded(true);

        treeView.setRoot(root);
        treeView.setShowRoot(false);
        treeView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                System.out.println(newValue.getValue());
            }
        });
    }
}
