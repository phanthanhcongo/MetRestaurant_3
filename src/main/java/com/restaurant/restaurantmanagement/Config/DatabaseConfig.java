package com.restaurant.restaurantmanagement.Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
    // Thông tin kết nối
    private static final String URL = "jdbc:mysql://localhost:3306/metrestaurant"; // Thay thế "ten_cua_database" bằng tên của cơ sở dữ liệu của bạn
    private static final String USER = "root"; // Thay thế "root" bằng tên người dùng của bạn
    private static final String PASSWORD = "123456"; // Thay thế "password" bằng mật khẩu của bạn

    // Hàm kết nối đến MySQL
    public static Connection connect() {
        try {
            // Kết nối đến cơ sở dữ liệu MySQL
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            return connection;
        } catch (SQLException e) {
            System.out.println("Lỗi kết nối: " + e.getMessage());
            return null;
        }
    }

    // Hàm kiểm tra kết nối
    public static boolean checkConnection() {
        Connection connection = connect();
        try {
            if (connection != null && !connection.isClosed()) {
                System.out.println("Kết nối thành công!");
                return true; // Kết nối thành công
            } else {
                System.out.println("Kết nối thất bại.");
                return false; // Kết nối thất bại
            }
        } catch (SQLException e) {
            System.out.println("Lỗi khi kiểm tra kết nối: " + e.getMessage());
            return false; // Lỗi khi kiểm tra kết nối
        }
    }

//    public static void main(String[] args) {
//        // Kiểm tra kết nối MySQL
//        checkConnection();
//    }
}
