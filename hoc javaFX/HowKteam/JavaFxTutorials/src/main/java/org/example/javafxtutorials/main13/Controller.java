package org.example.javafxtutorials.main13;

import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;


public class Controller {
    /**
     * cái j tạo ra trong String builder cx đi với 1 @FXML tương ứng
     * ở file Controller.
     */
    @FXML
    ProgressBar progressBar;  // xem tiến đọ công vc giống như download
    @FXML
    ProgressIndicator progressIndicator;
    @FXML
    Label label;
    @FXML
    Button buttonStart;
    @FXML
    Button buttonCancel;
    @FXML
    ProgressBar progressBar1;
    @FXML
    ProgressIndicator progressIndicator1;

    /**
     * ko tạo id cho 2 phím, chỉ bắt sự kiện cho nó thôi
     */

    doWork task;

    // xu li su kien cho 2 nut: start va Cancel
    public void start(ActionEvent e) {
        task = new doWork();

        // Ràng buộc tiến trình của progressBar, progressIndicator và label
        progressBar.progressProperty().bind(task.progressProperty());
        progressIndicator.progressProperty().bind(task.progressProperty());
        label.textProperty().bind(task.messageProperty());

        // Khởi chạy task trong một luồng mới
        Thread thread = new Thread(task);
        thread.setDaemon(true); // Đảm bảo ứng dụng sẽ tắt khi task hoàn thành
        thread.start();
    }

    public void start1(ActionEvent e) {
        task = new doWork();
        //mo ta tien trinh cua progressBar
        progressBar1.progressProperty().bind(task.progressProperty());
        progressIndicator1.progressProperty().bind(task.progressProperty());
        label.textProperty().bind(task.messageProperty());
        new Thread(task).start();

    }

    public void cancel(ActionEvent e) {
        task.cancel();
        progressBar.progressProperty().unbind();
        progressBar.setProgress(0);
        progressIndicator.progressProperty().unbind();
        progressIndicator.setProgress(0);
        label.textProperty().unbind();
        label.setText("Ready");

        progressBar1.progressProperty().unbind();
        progressBar1.setProgress(0);
        progressIndicator1.progressProperty().unbind();
        progressIndicator1.setProgress(0);

    }

}

class doWork extends Task<Void> {

    @Override
    protected Void call() throws Exception {
        for (int i = 0; i < 10; ++i) {
            if (isCancelled()) {
                updateMessage("Cancel");
                break;
            }
            updateProgress(i + 1, 10); // thuc hien duoc bao nhieu phan cong viec
            updateMessage("Loading...");
            Thread.sleep(200);
        }
        updateMessage("Finish");
        return null;
    }
}
//public void start(ActionEvent e) {
//        task = new doWork();
//        //mo ta tien trinh cua progressBar
//        progressBar.progressProperty().bind(task.progressProperty());
//        progressIndicator.progressProperty().bind(task.progressProperty());
//        label.textProperty().bind(task.messageProperty());
//        new Thread(String.valueOf(task.state()));
//
//    }