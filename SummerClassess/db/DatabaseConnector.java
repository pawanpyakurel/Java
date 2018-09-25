package SummerClassess.db;

import java.sql.*;

class MysqlCon {
//
//    MysqlCon(String query) {
//        try {
////            Class.forName("com.mysql.jdbc.Driver");
////            Connection con = DriverManager.getConnection(
////                    "jdbc:mysql://localhost:3306/login_register", "root", "");
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
//            }
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
    
    public void dbConnect() throws ClassNotFoundException, SQLException{
        
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/login_register", "root", "");
    }
    
    
}
