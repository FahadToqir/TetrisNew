module com.example.tetrisnew {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tetrisnew to javafx.fxml;
    exports com.example.tetrisnew;
}