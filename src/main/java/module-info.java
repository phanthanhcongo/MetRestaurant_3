module com.restaurant.restaurantmanagement {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.restaurant.restaurantmanagement to javafx.fxml;
    exports com.restaurant.restaurantmanagement;
}