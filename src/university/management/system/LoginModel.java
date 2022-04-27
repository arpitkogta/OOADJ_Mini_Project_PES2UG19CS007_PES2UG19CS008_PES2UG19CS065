/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university.management.system;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kogta
 */
public class LoginModel {
        private String username;
        private String password;
        public ResultSet getDetails(String u, String v){
            conn c1 = new conn();
            String q = "select * from login where username='"+u+"' and password='"+v+"'";
            
            ResultSet rs=null; 
            try {
                rs = c1.s.executeQuery(q);
            } catch (SQLException ex) {
                Logger.getLogger(LoginModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return rs;
        }
}
