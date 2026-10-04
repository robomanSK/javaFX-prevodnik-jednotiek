module com.example.prevodnik_jednotiek {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.jshell;


    opens com.example.prevodnik_jednotiek to javafx.fxml;
    exports com.example.prevodnik_jednotiek;
}