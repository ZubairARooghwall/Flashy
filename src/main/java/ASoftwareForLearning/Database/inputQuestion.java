package ASoftwareForLearning.Database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class inputQuestion {
    
    DatabaseConnection database = new DatabaseConnection();
    Connection conn = null;
    Statement stmt = null;
    
    public void addQuestion(String Question, String Answer, String Title){
        try{
        conn = database.connectToDatabase();
        String sql = "INSERT INTO questions(Question, Answer, Title_Name_FKey,  Repetition,  Date_created) VALUES('" + Question + "', '" + Answer + "' , '" + Title + "', 0, NOW() )" ;
        stmt = conn.createStatement();
        stmt.execute(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Could not add Question");
        }
        
        ASoftwareForLearning.pages.Input.questionSuccess.setText("Success");
        
       
        
        
    }
    
    
    

    
}
