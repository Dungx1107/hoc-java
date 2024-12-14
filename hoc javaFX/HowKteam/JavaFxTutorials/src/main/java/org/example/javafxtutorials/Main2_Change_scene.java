package org.example.javafxtutorials;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main2_Change_scene extends Application {
    Stage window;
    Scene scene1, scene2;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        // scene 1
        Label label1 = new Label("welcom ");
        Button button1 = new Button("go to course");
        VBox layout1 = new VBox();
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 300, 200);

        button1.setOnAction(event -> {
            window.setScene(scene2);
        });

        //ccene 2
        Button button2 = new Button("go back");

        button2.setOnAction(event -> {
            window.setScene(scene1);
        });
        StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(button2);
        scene2 = new Scene(layout2, 200, 300);

        window.setScene(scene1);
        window.show();

    }
}
