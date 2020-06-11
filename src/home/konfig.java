/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Agan
 */
public class konfig {
     private static Connection MySQLConfig;
     
     public static Connection configDB() throws SQLException{
         try{
             String url = "jdbc:mysql://localhost:3306/azmicake";
             String user = "root";
             String pass = "";
             
             DriverManager.registerDriver(new com.mysql.jdbc.Driver());
             MySQLConfig = DriverManager.getConnection(url,user,pass);
         }catch (SQLException e){
             System.out.println("Koneksi ke Database Gagal");
         }
         return MySQLConfig;
     }

    static Connection getKoneksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
