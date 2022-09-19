/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;


/**
 *
 * @author Ximp
 */
public class Conexion {
    
    Connection con = null;
   public Connection conectar() throws SQLException {
      
        try {
            //cargar nuestro driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca_db","root","root");
            System.out.println("conexion establecida");
            //JOptionPane.showMessageDialog(null, "conexion establecida");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexion");

        }
        
        return con;
    }
    
    public static void main(String[] args) throws SQLException {
        Conexion cnn = new Conexion();
        System.out.println("Estas conectado" + cnn.conectar());
   }
   
}

    

