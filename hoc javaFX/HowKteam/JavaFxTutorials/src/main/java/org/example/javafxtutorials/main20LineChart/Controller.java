package org.example.javafxtutorials.main20LineChart;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    LineChart<String, Number> lineChart;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        XYChart.Data<String, Number> jan = new XYChart.Data<>("Jan", 300);
        XYChart.Data<String, Number> feb = new XYChart.Data<>("Feb", 330);
        XYChart.Data<String, Number> feb2 = new XYChart.Data<>("Feb", 500);
        XYChart.Data<String, Number> mar = new XYChart.Data<>("Mar", 4500);
        XYChart.Data<String, Number> app = new XYChart.Data<>("App", 5000);

        series.getData().addAll(jan, feb, feb2, mar, app);
        series.setName("Salary per month of An ");

        XYChart.Series<String, Number> series2 = new XYChart.Series<>();
        XYChart.Data<String, Number> jan1 = new XYChart.Data<>("Jan", 350);
        XYChart.Data<String, Number> feb1 = new XYChart.Data<>("Feb", 3000);
        XYChart.Data<String, Number> mar1 = new XYChart.Data<>("Mar", 450);
        XYChart.Data<String, Number> app1 = new XYChart.Data<>("App", 800);


        series2.setName("Salary per month of dung ");
        series2.getData().addAll(jan1, feb1, mar1, app1);

        lineChart.getData().addAll(series, series2);

    }
}
