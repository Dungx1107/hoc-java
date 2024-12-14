package org.example.javafxtutorials;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application implements EventHandler<ActionEvent> {


    private Button button1;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader =
                new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        stage.setTitle("Hello!");

        button1 = new Button("Click me");
        Button button2 = new Button("hello world");
        StackPane layout = new StackPane();
        layout.getChildren().addAll(button1);

        button1.setOnAction(this);
//        button1.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("son ");
//            }
//        });

//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Scene scene = new Scene(layout, 320, 240);
        stage.setScene(scene);
        stage.show();
    }


    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == button1)
            System.out.println("ha phuong");
    }
}