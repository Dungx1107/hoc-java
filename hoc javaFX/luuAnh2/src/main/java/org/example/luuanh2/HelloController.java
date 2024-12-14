package org.example.luuanh2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private AnchorPane AP;

    @FXML
    private ImageView image1;

    @FXML
    private Button load;

    @FXML
    private Button open;

    public void ChooseImage(ActionEvent event) {
        Stage stage = (Stage) AP.getScene().getWindow();
        FileChooser fc = new FileChooser();
        fc.setTitle("choose image");
        //lm cho chi chon dc file anh
        FileChooser.ExtensionFilter imageFilter = new
                FileChooser.ExtensionFilter("image file", "*.jpg", "*.png");
        fc.getExtensionFilters().addAll(imageFilter);
        File file = fc.showOpenDialog(stage);
        if (file != null) {
            Image image = new Image(file.toURI().toString(),220,390,false,true);
            image1.setImage(image);
            saveImage(file);
        }
    }

    /**
     * Lưu ảnh vào SQL
     */
    public static void saveImage(File file) {
        String url = "jdbc:mysql://localhost:3306/librarymanagement";
        String user = "root";
        String password = "";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String sql = "INSERT INTO user_images (user_id, image_name, image_data) VALUES (?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setInt(1, 1); // Giả sử user_id = 1
            statement.setString(2, file.getName());
            FileInputStream input = new FileInputStream(file);
            statement.setBinaryStream(3, input);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Image saved successfully!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Tải và hiển thị ảnh từ SQL
     */
    public static Image loadImage(int imageId) {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String user = "your_user";
        String password = "your_password";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String sql = "SELECT image_data FROM user_images WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, imageId);

            ResultSet result = statement.executeQuery();
            if (result.next()) {
                byte[] imgData = result.getBytes("image_data");
                return new Image(new ByteArrayInputStream(imgData));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void displayImage(Image image, ImageView imageView) {
        if (image != null) {
            imageView.setImage(image);
        }
    }

}