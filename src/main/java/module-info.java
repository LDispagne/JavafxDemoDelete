module com.example.javafxdemodelete {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.javafxdemodelete to javafx.fxml;
    exports com.example.javafxdemodelete;
}