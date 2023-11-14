/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import database.ConnectionBase;
import java.sql.Connection;

/**
 *
 * @author aram
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Connection connection = null;
        try {
            ConnectionBase cb = new ConnectionBase();
            connection = cb.dbConnect();
            System.out.println(connection);
            connection.close();
        } catch (Exception e) {
            throw new Exception("Error on main with " + e.getMessage());
        }
    }
}
