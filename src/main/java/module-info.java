module com.example.foodshop {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;
    requires org.jsoup;


    opens com.example.foodshop to javafx.fxml, com.google.gson;
    exports com.example.foodshop;
    exports com.example.foodshop.Controllers;
    opens com.example.foodshop.Controllers to com.google.gson, javafx.fxml;
    exports com.example.foodshop.Lib;
    opens com.example.foodshop.Lib to com.google.gson, javafx.fxml;
    exports com.example.foodshop.Models;
    opens com.example.foodshop.Models to com.google.gson, javafx.fxml;
}