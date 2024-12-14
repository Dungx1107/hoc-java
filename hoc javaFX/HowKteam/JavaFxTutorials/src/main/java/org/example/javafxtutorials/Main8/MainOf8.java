package org.example.javafxtutorials.Main8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainOf8 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load(
                    getClass().getResource("/org/example/javafxtutorials/sample.fxml"));
            stage.setTitle("Hello!");
            Scene scene = new Scene(root, 640, 240);
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            System.out.println("Lỗi khi tải tệp FXML: " + e.getMessage());
            e.printStackTrace(); // In ra stack trace để dễ dàng gỡ lỗi
        }
    }
}
