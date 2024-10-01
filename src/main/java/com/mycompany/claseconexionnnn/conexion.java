/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.claseconexionnnn;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author mayda
 */
public class conexion {
    Connection conectar=null;
    String url="jdbc:postgresql://localhost:5432/POO";
    String user= "postgres";
    String password="123456";
    public Connection Conexionconbasededatos(){
        try {
            Class.forName("org.postgresql.Driver");
            conectar=DriverManager.getConnection(url,user,password);
            JOptionPane.showMessageDialog(null,"SE COENCTO CORRECTAMENTE A LA BASE DE DATOS");
      
        }catch (Exception e){
            JOptionPane.showConfirmDialog(null,"ERROR AL CONECTARSE A LA BASE DE DATOS"+e.toString());
        }
        return conectar;
    }
    
}
