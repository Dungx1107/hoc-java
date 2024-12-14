package org.example.javafxtutorials;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Optional;

public class Main3_Alert extends Application implements EventHandler<ActionEvent> {

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Nguyen Thi Ha Phuong");
        button = new Button("Close");

//        button.setOnAction(event -> {
//            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
//            alert.setTitle("confirmation");
//            alert.setHeaderText("Alert Information");
//            alert.setContentText("choose your option");
//
//            ButtonType buttonTypeYes = new ButtonType("Yes", ButtonBar.ButtonData.YES);
//            ButtonType buttonTypeNo = new ButtonType("No", ButtonBar.ButtonData.NO);
//            ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);
//
//            alert.getButtonTypes().addAll(buttonTypeYes, buttonTypeNo, buttonTypeCancel);
//            Optional<ButtonType> result = alert.showAndWait();
//
//            if (result.get() == buttonTypeYes) {
//                System.out.println("code for yes");
//            } else if (result.get().getButtonData() == ButtonBar.ButtonData.NO) {
//                System.out.println("Code for no");
//            } else System.out.println("code for cacnel");
//
//            String mess = result.get().getText();
//            Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
//            alert1.setTitle("Information");
//            alert1.setHeaderText("Notification");
//            alert1.setContentText(mess);
//            alert1.show();
//
//        });

        button.setOnAction(this);

        StackPane layout = new StackPane();
        layout.getChildren().addAll(button);
        Scene scene = new Scene(layout, 300, 240);
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public void handle(ActionEvent event) {
        if (event.getSource() == button) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("confirmation");
            alert.setHeaderText("Alert Information");
            alert.setContentText("choose your option");

            // Xóa các nút mặc định trước khi thêm nút tùy chỉnh
            alert.getButtonTypes().clear();

            ButtonType buttonTypeYes = new ButtonType("Yes", ButtonBar.ButtonData.YES);
            ButtonType buttonTypeNo = new ButtonType("No", ButtonBar.ButtonData.NO);
            ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);

            alert.getButtonTypes().addAll(buttonTypeYes, buttonTypeNo, buttonTypeCancel);
            Optional<ButtonType> result = alert.showAndWait();

            if (result.isPresent()) {
                ButtonType selectedButton = result.get();
                if (selectedButton == buttonTypeYes) {
                    System.out.println("Code for yes");
                } else if (selectedButton.getButtonData() == ButtonBar.ButtonData.NO) {
                    System.out.println("Code for no");
                } else {
                    System.out.println("Code for cancel");
                }

                // Hiển thị văn bản của nút đã chọn trong hộp thoại mới
                String message = selectedButton.getText();
                Alert infoAlert = new Alert(Alert.AlertType.INFORMATION);
                infoAlert.setTitle("Information");
                infoAlert.setHeaderText("Notification");
                infoAlert.setContentText(message);
                infoAlert.show();
            }

        }
    }
}
