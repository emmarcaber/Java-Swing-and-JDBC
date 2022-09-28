/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package session2;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Session2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      new Login();
      printAllEmployeesFromDB();
    }
    
    private static  void printAllEmployeesFromDB() {
        try {
            String url = "jdbc:mysql://localhost/session2";
            String uname = "root";
            String pass = "";
            
            String query = "SELECT * FROM employees";
            
            Statement st = DBConnect.getConn().createStatement();
            
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()) {
                System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName"));
            }
            
            st.close();
            rs.close();
            
        }  catch (SQLException ex) {
            Logger.getLogger(Session2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
