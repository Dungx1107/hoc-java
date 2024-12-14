module org.example.javafxtutorials {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens org.example.javafxtutorials to javafx.fxml;
    exports org.example.javafxtutorials;
    exports org.example.javafxtutorials.Main8;
    opens org.example.javafxtutorials.Main8 to javafx.fxml;
    exports org.example.javafxtutorials.main11;
    opens org.example.javafxtutorials.main11 to javafx.fxml;
    exports org.example.javafxtutorials.main12;
    opens org.example.javafxtutorials.main12 to javafx.fxml;
    exports org.example.javafxtutorials.main13;
    opens org.example.javafxtutorials.main13 to javafx.fxml;
    exports org.example.javafxtutorials.main14;
    opens org.example.javafxtutorials.main14 to javafx.fxml;
    exports org.example.javafxtutorials.main15;
    opens org.example.javafxtutorials.main15 to javafx.fxml;
    exports org.example.javafxtutorials.main16_imageView;
    opens org.example.javafxtutorials.main16_imageView to javafx.fxml;
    exports org.example.javafxtutorials.main17_fileChooser;
    opens org.example.javafxtutorials.main17_fileChooser to javafx.fxml;
    exports org.example.javafxtutorials.main18_webview;
    opens org.example.javafxtutorials.main18_webview to javafx.fxml;
    exports org.example.javafxtutorials.main19_PieChart;
    opens org.example.javafxtutorials.main19_PieChart to javafx.fxml;
    exports org.example.javafxtutorials.main20LineChart;
    opens org.example.javafxtutorials.main20LineChart to javafx.fxml;
    exports org.example.javafxtutorials.main21TableView;
    opens org.example.javafxtutorials.main21TableView to javafx.fxml;
    exports org.example.javafxtutorials.main22_detail;
    opens org.example.javafxtutorials.main22_detail to javafx.fxml;
    opens org.example to javafx.fxml;


}
