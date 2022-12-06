package ASoftwareForLearning.Database;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class addSubjectFromFrame {
    
     DatabaseConnection database = new DatabaseConnection();
    Connection conn = null;
    Statement stmt = null;
    
    public void addSubject(String Subject){
        try {
            conn = database.connectToDatabase();
            String sql = "INSERT INTO subject(Subject_Name, Date_Created) VALUES('" + Subject + "', NOW()" +")";
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            ASoftwareForLearning.pages.addSubject.subjectSuccess.setText("Success");
            new forTitleAndSubjectJList().fillDataSubjectJList(ASoftwareForLearning.component.addSubjectPanel.subjectJList);
            new buttonsUnderWelcomeDatabase().fillTitlesTable(ASoftwareForLearning.pages.Subjects.SubjectsTable);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Could not add value to title");
        }
        
        
        
    }
    
    
    
    
    
}
