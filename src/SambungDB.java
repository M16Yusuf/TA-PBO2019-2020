
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M16Yusuf
 */
public class SambungDB {
    String user     = "root";
    String pass     = "";
    String db       = "db_rentalps"; 
    String urlValue = "Jdbc:mysql://localhost:3306/"+db;
    String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    Connection conn = null;
    Statement sate  = null;
    
    SambungDB(){
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(urlValue,user,pass);
        }
        catch (SQLException e){
            System.out.println("Koneksi Gagal "+e.toString());
        } 
        catch(ClassNotFoundException e){
           System.out.println("JDBC Driver tidak ditemukan ");
        }
    }
    
}
