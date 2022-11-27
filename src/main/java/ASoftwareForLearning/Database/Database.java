
package ASoftwareForLearning.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Database {
   Connection connection;
    DriverManager driverManager;
    ResultSet resultSet;
    Statement statement;
    PreparedStatement preparedStatement;

    public Database() {
        connectToDatabase();
        
        
        
    }
    
    
    
    private void connectToDatabase(){
       try {
           
           try {
               Class.forName("com.mysql.cj.jdbc.Driver");
           } catch (ClassNotFoundException ex) {
               JOptionPane.showMessageDialog(null, "could not find class jdbc ");
               
               Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/flashcard", "root", "133613");

           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "could not connect to database");
           Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
           
       }
        
        
        
        
        
    }
    
    
    
    
    
    
    
}
