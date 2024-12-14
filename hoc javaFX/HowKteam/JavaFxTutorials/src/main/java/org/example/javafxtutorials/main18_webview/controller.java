package org.example.javafxtutorials.main18_webview;

import javafx.concurrent.Worker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class controller implements Initializable {

    @FXML
    private WebView webView;
    @FXML
    private TextField addressBar;

    private WebEngine engine;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        engine = webView.getEngine();

        // Kiểm tra sự thay đổi của engine
        engine.getLoadWorker().stateProperty().addListener((observable, oldState, newState) -> {
            if (newState == Worker.State.SUCCEEDED) {
                addressBar.setText(engine.getLocation()); // Cập nhật địa chỉ trong TextField
            }
        });
    }


    public void keyHandle(KeyEvent ke) {
        if (ke.getCode().equals(KeyCode.ENTER)) {
            String address = addressBar.getText();
            engine.load(address);
        }
    }

    public void backHandle(ActionEvent event) {
        if (engine.getHistory().getCurrentIndex() > 0) {
            engine.getHistory().go(-1); // lui ve 1 buoc
        }
    }

    public void forwardHandle(ActionEvent e) {
        try {
            int currentIndex = engine.getHistory().getCurrentIndex(); // Lấy chỉ số hiện tại
            int entryCount = engine.getHistory().getEntries().size(); // Lấy số lượng mục trong lịch sử

            // Kiểm tra xem có mục tiếp theo không
            if (currentIndex < entryCount - 1) {
                engine.getHistory().go(currentIndex + 1); // Chuyển đến mục tiếp theo
            } else {
                System.out.println("Đã ở cuối lịch sử."); // Thông báo nếu đã ở cuối
            }
        } catch (IndexOutOfBoundsException ex) {
            // Xử lý ngoại lệ nếu chỉ số không hợp lệ
            System.err.println("Chỉ số không hợp lệ: " + ex.getMessage());
        } catch (Exception ex) {
            ex.printStackTrace(); // Ghi lại lỗi nếu có
        }
    }


}
