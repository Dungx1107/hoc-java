package org.example.luuanh;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.classfile.Label;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.text.html.ImageView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private AnchorPane AP;
    @FXML
    private ImageView image;
    @FXML
    private Label welcomeText;
    @FXML
    private Button load;
    @FXML
    private Button open;

    private PreparedStatement store, retrieve;
    private String storeStatement = "INSERT INTO user_images(user_id,image_name ,image_data) VALUES(?, ?,?)";
    private String retrieveStatement = "SELECT image_data FROM user_images WHERE user_id = ?";
    private Connection connection;
    private String linkImage;

    public void ChooseImage(ActionEvent event) {
        Stage stage = (Stage) AP.getScene().getWindow();
        FileChooser fc = new FileChooser();
        fc.setTitle("Choose Image");

        // Chỉ chọn file ảnh
        FileChooser.ExtensionFilter imageFilter = new FileChooser.ExtensionFilter("Image files", "*.jpg", "*.png");
        fc.getExtensionFilters().add(imageFilter);

        File file = fc.showOpenDialog(stage);
        if (file == null) {
            System.out.println("file null");
            return;
        }
        linkImage = file.getAbsolutePath();
        System.out.println("link anh :" + linkImage);

        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            // Lưu ảnh vào cơ sở dữ liệu
            store.setString(1, "son of bitch"); // ID người dùng mẫu (thay đổi theo logic ứng dụng)
            store.setString(2, "an mup");
            store.setBinaryStream(3, fileInputStream, fileInputStream.available());
            store.executeUpdate();

            // Hiển thị ảnh trong ImageView
            Image image1 = new Image(file.toURI().toString());
            image.setImage(image1);

        } catch (IOException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void initialize() {
        try {
            String url = "jdbc:mysql://localhost:3307/libraryManagement";
            connection = DriverManager.getConnection(url, "root", "");
            System.out.println(connection.getMetaData().getDatabaseProductName());

            store = connection.prepareStatement(storeStatement);
            retrieve = connection.prepareStatement(retrieveStatement);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void close() {
        try {
            if (store != null) store.close();
            if (retrieve != null) retrieve.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    private ImageView image333;

    public void LoadImage(ActionEvent event) {
        try {
            // Đặt ID người dùng cần lấy ảnh (thay thế "user_id" bằng giá trị thực tế)
            retrieve.setString(1, "son of bitch"); // user_id là "son of bitch" (chỉnh sửa nếu cần)
            // Thực thi truy vấn
            ResultSet resultSet = retrieve.executeQuery();
            if (resultSet.next()) {
                // Lấy dữ liệu ảnh từ cột "image_data"
                InputStream input = resultSet.getBinaryStream("image_data");
                if (input != null) {
                    // Tạo đối tượng Image từ dữ liệu trong cơ sở dữ liệu
                    Image dbImage = new Image(input);
                    if (dbImage == null) {
                        System.out.println("null r");
                    }
                    image333.setImage(dbImage); // Hiển thị ảnh trên ImageView
                    System.out.println("Ảnh đã được tải lên từ cơ sở dữ liệu.");
                } else {
                    System.out.println("Không có dữ liệu ảnh cho user_id này.");
                }
            } else {
                System.out.println("Không tìm thấy user_id trong cơ sở dữ liệu.");
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi truy vấn cơ sở dữ liệu: " + e.getMessage());
        }
    }

}
