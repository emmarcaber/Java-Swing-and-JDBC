/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session2;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnect {
    public static Connection getConn() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost/session2";
            String uname = "root";
            String password = "";
            
            conn = DriverManager.getConnection(url, uname, password);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conn;
    }
}
