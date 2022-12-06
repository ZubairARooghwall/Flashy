package ASoftwareForLearning.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DatabaseConnection {
   private Connection connection;
   
    
    
    public Connection connectToDatabase(){
       try {
           
           try {
               Class.forName("com.mysql.cj.jdbc.Driver");
           } catch (ClassNotFoundException ex) {
               JOptionPane.showMessageDialog(null, "could not find class jdbc ");
               
               Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           
           connection = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/flashcard", "root", "133613");

           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "could not connect to database");
           Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
           
       }
        
        
        
        return connection;
        
    }
    
    
    
    
    
    
    
    
    
    
}