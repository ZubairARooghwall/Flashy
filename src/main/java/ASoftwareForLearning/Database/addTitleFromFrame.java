package ASoftwareForLearning.Database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class addTitleFromFrame {
   DatabaseConnection database = new DatabaseConnection();
    Connection conn = null;
    Statement stmt = null;
    
    public void addTitle(String Title, String Subject){
        try {
            conn = database.connectToDatabase();
            String sql = "INSERT INTO titles(Title_Name, Subject_Name_Fkey, Date_Created) VALUES('"  + Title + "', '" + Subject + "', NOW()" +")";
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            ASoftwareForLearning.pages.addTitle.TitleSuccess.setText("Success");
            new forTitleAndSubjectJList().fillDataTitleJList(ASoftwareForLearning.component.AddTitlePanel.titleJList);
            new buttonsUnderWelcomeDatabase().fillTitlesTable(ASoftwareForLearning.pages.Titles.TitlesTable);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Could not add value to title");
        }
        
        
        
        
        
    }
    
    
    
    
    
}
