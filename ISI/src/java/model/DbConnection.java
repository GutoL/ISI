/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Renan
 */
public class DbConnection {
    
    static String dbName = "subway";
    static String user = "root";
    static String pass = "";
    static String server = "localhost";
    
    public static String executeUpdate(String sql) throws SQLException {

        int erro = 0;
        
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // 1. Get a connection to database
            myConn = DriverManager.getConnection("jdbc:mysql://"+server+":3306/"+dbName, user, pass);
            // 2. Create a statement
            myStmt = myConn.createStatement();
            // 3. Execute SQL query
            myStmt.executeUpdate(sql);
            
            return "Ok!";
            
        } catch (Exception exc) {
            return exc.getMessage();
        }        
        
        
    }
    
    public static ArrayList<Venda> executeQuery() throws SQLException {
        
        String sql = "SELECT * FROM `venda` WHERE 1";
        
        int erro = 0;
        ArrayList<Venda> vendas = new ArrayList<>();
        
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // 1. Get a connection to database
            myConn = DriverManager.getConnection("jdbc:mysql://"+server+":3306/"+dbName, user, pass);
            // 2. Create a statement
            myStmt = myConn.createStatement();
           // 3. Execute SQL query
            myRs = myStmt.executeQuery("select * from venda");
            // 4. Process the result set
            while (myRs.next()) {
                vendas.add(new Venda(myRs.getInt("id"), myRs.getString("pao"), myRs.getInt("tamanho"), myRs.getString("recheio"), myRs.getString("queijo"), myRs.getString("adicionais"), myRs.getString("vegetais"), myRs.getString("molho") ));
            }
            return vendas;
            
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
            return null;
        }        
        
        
    }

    
    
}
