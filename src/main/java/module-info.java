module com.restaurant.restaurantmanagement {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    // Mở các gói chứa lớp cần truy cập bằng reflection từ JavaFX FXML
    opens com.restaurant.restaurantmanagement to javafx.fxml;
    opens com.restaurant.restaurantmanagement.Config to javafx.fxml;

    // Exports gói để các mô-đun khác có thể sử dụng
    exports com.restaurant.restaurantmanagement;
    exports com.restaurant.restaurantmanagement.Config;
}
