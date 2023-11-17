module com.example.school3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens school3 to javafx.fxml;
    exports school3;
}