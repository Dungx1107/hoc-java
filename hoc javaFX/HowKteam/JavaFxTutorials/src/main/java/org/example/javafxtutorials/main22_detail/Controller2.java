package org.example.javafxtutorials.main22_detail;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class Controller2 implements Initializable {


    @FXML
    private TableView<Person> tableView;
    @FXML
    private TableColumn<Person, String> name;
    @FXML
    private TableColumn<Person, Integer> age;
    @FXML
    private TableColumn<Person, String> address;
    @FXML
    private TableColumn<Person, String> gmail;
    @FXML
    private TableColumn<Person, String> phone;
    @FXML
    private TableColumn<Person, Boolean> sex;
    @FXML
    private TableColumn<Person, Date> date;

    @FXML
    private Label Name;
    @FXML
    private Label Age;
    @FXML
    private Label Addrress;
    @FXML
    private Label Gmail;
    @FXML
    private Label Phone;
    @FXML
    private Label Sex;
    @FXML
    private Label DateBirth;

    @FXML
    private TextField personName;
    @FXML
    private TextField personAge;
    @FXML
    private TextField personAddrress;
    @FXML
    private TextField personGmail;
    @FXML
    private TextField personPhone;
    @FXML
    private TextField personSex;
    @FXML
    private TextField personDateBirth;


    private ObservableList<Person> personObservableList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        personObservableList = FXCollections.observableArrayList(
                new Person("dung", 19, "khuc thua du", "dung@gmail.com", "0123", true, new Date(105, 10, 1)),
                new Person("duong", 19, "khuc thua du", "duong@gmail.com", "4567", true, new Date(105, 1, 1)),
                new Person("canh", 19, "pham van dong", "canh@gmail.com", "8962", true, new Date(105, 4, 1))
        );


        // Căn giữa dữ liệu trong các cột
        name.setStyle("-fx-alignment: CENTER;");
        age.setStyle("-fx-alignment: CENTER;");
        address.setStyle("-fx-alignment: CENTER;");
        gmail.setStyle("-fx-alignment: CENTER;");
        phone.setStyle("-fx-alignment: CENTER;");
        sex.setStyle("-fx-alignment: CENTER;");
        date.setStyle("-fx-alignment: CENTER;");

        // Đặt cột cho TableView
        name.setCellValueFactory(new PropertyValueFactory<>("personName"));
        age.setCellValueFactory(new PropertyValueFactory<>("personAge"));
        address.setCellValueFactory(new PropertyValueFactory<>("personAddress"));
        gmail.setCellValueFactory(new PropertyValueFactory<>("personGmail"));
        phone.setCellValueFactory(new PropertyValueFactory<>("personPhone"));
        sex.setCellValueFactory(new PropertyValueFactory<>("personSex"));
        date.setCellValueFactory(new PropertyValueFactory<>("personDateBirth"));

        // Thiết lập dữ liệu cho TableView
        tableView.setItems(personObservableList);
    }

    public void add(ActionEvent e) {
        String ten = personName.getText();
        int tuoi = Integer.parseInt(personAge.getText());
        String diachi = personAddrress.getText();
        String mail = personGmail.getText();
        String sdt = personPhone.getText();
        String gtinh1 = personSex.getText();
        boolean gtinh = false;
        if (gtinh1.equals("name")) gtinh = true;
        String ngaysinh = personDateBirth.getText();
        String[] part = ngaysinh.split("/");
        int ngay = Integer.parseInt(part[0]);
        int thang = Integer.parseInt(part[1]);
        int nam = Integer.parseInt(part[2]);

        Person them = new Person(ten, tuoi, diachi, mail, sdt, gtinh, new Date(nam, thang, ngay));
        personObservableList.add(them);
    }

    public void delete(ActionEvent e) {
        Person xoa = tableView.getSelectionModel().getSelectedItem();
        personObservableList.remove(xoa);
    }

    public void changeSceneDetail(ActionEvent e) throws IOException {
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/org/example/javafxtutorials/main22.fxml"));
        System.out.println("son of bitch");
        Parent parent = loader.load();
        System.out.println("son of bitch");
        if (parent == null) {
            System.out.println("son of bitch");
        } else {
            Scene scene = new Scene(parent);
            Controller controller = loader.getController();
            Person chon = tableView.getSelectionModel().getSelectedItem();
            controller.getDetail(chon);
            stage.setScene(scene);
        }
    }

    public TableView<Person> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<Person> tableView) {
        this.tableView = tableView;
    }
}
