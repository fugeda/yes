package tools;

import java.sql.*;

public class JDBCUtils {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/fruit?useSSL=false";
        String name = "root";
        String password = "tzy202625";
        Connection conn = DriverManager.getConnection(url, name, password);
        Statement stmt = conn.createStatement();
        return conn;
    }

    public static void release(Statement stmt, Connection conn) {
        if (stmt != null) {
            try {
                stmt.close();
                ;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void release(ResultSet rs,Statement stmt, Connection conn){
        if (rs!=null){
            try {
                rs.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        release(stmt,conn);
    }

}
