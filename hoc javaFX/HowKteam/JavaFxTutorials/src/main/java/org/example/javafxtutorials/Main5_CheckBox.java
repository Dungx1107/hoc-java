package org.example.javafxtutorials;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main5_CheckBox extends Application implements EventHandler {

    private Button button;
    private CheckBox box1;
    private CheckBox box2;
    private CheckBox box3;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Programming Language");
        box1 = new CheckBox("Java");
        box2 = new CheckBox("C++");
        box3 = new CheckBox("Python");

        box1.setSelected(true);

        button = new Button("submit");
        button.setOnAction(this);

        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(box1, box2, box3);
        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(label, hBox, button);

        Scene scene = new Scene(vBox, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(Event event) {
        if (event.getSource() == button) {
            String mess = "Your language : ";
            if (box1.isSelected()) {
                mess += box1.getText() + " ";
            }
            if (box2.isSelected()) {
                mess += box2.getText() + " ";
            }
            if (box3.isSelected()) {
                mess += box3.getText() + " ";
            }
            System.out.println(mess);
        }
    }
}
