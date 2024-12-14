package org.example.javafxtutorials.main19_PieChart;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField CID, JavaID, CplusID;
    @FXML
    PieChart pieChart;

    public void load(ActionEvent e) {
        try {
            int CSharpValue = Integer.parseInt(CID.getText());
            int JavaValue = Integer.parseInt(JavaID.getText());
            int CplusValue = Integer.parseInt(CplusID.getText());
            
            PieChart.Data Charp = new PieChart.Data("C#", CSharpValue);
            PieChart.Data Cplus = new PieChart.Data("C++", CplusValue);
            PieChart.Data Java = new PieChart.Data("Java", JavaValue);

            pieChart.getData().clear();
            pieChart.getData().addAll(Charp, Cplus, Java);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
