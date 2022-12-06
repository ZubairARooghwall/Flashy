package ASoftwareForLearning.Database;

import ASoftwareForLearning.component.AddTitlePanel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class forTitleAndSubjectJList {
    
    DatabaseConnection database = new DatabaseConnection();
    Connection conn = null;
    ResultSet rs = null;
    Statement stmt = null;
    
    public void fillDataTitleJList(JList jList){
        try {
            DefaultListModel titleModel = new DefaultListModel();
            conn = database.connectToDatabase();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM titles");
            
            while(rs.next()){
                String title = rs.getString("Title_Name");
                titleModel.addElement(title);
            }     
            jList.setModel(titleModel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Could not load title list");
        }
    }
    
    public void fillDataSubjectJList(JList jList){
        try {
            DefaultListModel subjectModel = new DefaultListModel();
            conn = database.connectToDatabase();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM subject");
            
            while(rs.next()){
                String subject = rs.getString("Subject_Name");
                subjectModel.addElement(subject);
            }
            jList.setModel(subjectModel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Could not load subject list");
        }
        
        
    
    }
    
  
    
//    public void fillDataQuestionInTitle(JList jList){
//        try {
//            DefaultListModel questionModel = new DefaultListModel();
//            conn = database.connectToDatabase();
//            stmt = conn.createStatement();
//            rs = stmt.executeQuery("SELECT * FROM questions WHERE Title_Name = " + titlePanel.getSelectedTitle());
//            
//            while(rs.next()){
//                String question = rs.getString("Question");
//                questionModel.addElement(question);
//            }
//            jList.setModel(questionModel);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "could not load question list");
//        }
//        
//        
//        
//    }
    
    
    
    
    
    
    
    
}
