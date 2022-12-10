
package ASoftwareForLearning.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class forStudying {
    
    DatabaseConnection database = new DatabaseConnection();
    Connection conn = null;
    ResultSet rs = null;
    Statement stmt = null;

    public void fillStudyQuestionLabels(JLabel questionLabel) throws SQLException{
        
        try {
            conn = database.connectToDatabase();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM questions");
        } catch (SQLException ex) {
            Logger.getLogger(forStudying.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while (rs.next()) {
            questionLabel.setText(rs.getString("Question"));
            
           
        }
        
        
        
    }
    
    
    public void fillStudyAnswerLabels(JLabel answerLabl) throws SQLException{
        
        
         try {
            conn = database.connectToDatabase();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM questions");
        } catch (SQLException ex) {
            Logger.getLogger(forStudying.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while (rs.next()) {
            answerLabl.setText(rs.getString("Answer"));
            
        }
        
        
        
    }
    
    
    
    
    
    
    
    
}
