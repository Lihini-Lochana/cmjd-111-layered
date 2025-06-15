/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ijse.layered;
import edu.ijse.layered.db.DBConnection;
import java.sql.SQLException;

/**
 *
 * @author Lihini
 */
public class Main {

    
    public static void main(String[] args)  throws ClassNotFoundException, SQLException  {
         DBConnection.getInstance().getConnection();
    }
    
}
