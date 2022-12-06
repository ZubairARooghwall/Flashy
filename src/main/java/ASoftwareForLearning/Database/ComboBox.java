package ASoftwareForLearning.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ComboBox {
    DatabaseConnection database = new DatabaseConnection();
    Connection conn = null;
    ResultSet rs = null;
    Statement stmt = null;
    
    public void fillTitleForQuestion(JComboBox comboBox){
         try {
            conn = database.connectToDatabase();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM titles");
             
            while(rs.next()){
                String title = rs.getString("Title_Name");
                comboBox.addItem(title);   
            }
            conn.close();
             
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "could not combo box items");
        }
    }
        
    public void fillSubjectForTitle(JComboBox comboBox){
        try {
            conn = database.connectToDatabase();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM subject");
             
            while(rs.next()){
                String subjects = rs.getString("Subject_Name");
                comboBox.addItem(subjects);   
            }
            conn.close();
             
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "could not combo box items");
        }
        
        
        
        
        
        
    }
    
    
    
    
    
    
}
