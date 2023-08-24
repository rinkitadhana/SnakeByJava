module com.snake {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.snake to javafx.fxml;
    exports com.snake;
}