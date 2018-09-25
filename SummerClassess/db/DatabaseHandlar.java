/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SummerClassess.db;

//import com.mysql.jdbc.Connection;
import java.sql.*;

/**
 *
 * @author Jiwan
 */
public class DatabaseHandlar {

    public void DatabaseHandlar() {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        String dbUrl = "jdbc:mysql://localhost:3306/login_register";
        String dbUsr = "root";
        String dbPass = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(dbUrl, dbUsr, dbPass);
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM registration");
            while (rs.next()) {
                //Get values
                String someValue = rs.getString("t_first");

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
        }
    }
}
