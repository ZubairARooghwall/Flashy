package ASoftwareForLearning.Database;

import com.formdev.flatlaf.FlatLaf;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class buttonsUnderWelcomeDatabase {
     DatabaseConnection database = new DatabaseConnection();
    Connection conn = null;
    ResultSet rs = null;
    Statement stmt = null;
    
    public void fillQuestionTable(buttonsUnderWelcomeDatabase jTable){
        try {
            DefaultTableModel tableModel = new DefaultTableModel();
            conn = database.connectToDatabase();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM questions");
            
            tableModel = (DefaultTableModel) ASoftwareForLearning.pages.Questions.questionTable.getModel();
            tableModel.setRowCount(0);
            while(rs.next()){
                tableModel.addRow(new String[]{ rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(7), rs.getString(12), rs.getString(9)  } );
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "could not load questions");
        }
    }
    
    public void fillTitlesTable(JTable jTable){
          try {
            DefaultTableModel tableModel = new DefaultTableModel();
            conn = database.connectToDatabase();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM titles");
            
            tableModel = (DefaultTableModel) ASoftwareForLearning.pages.Titles.TitlesTable.getModel();
            tableModel.setRowCount(0);
            while(rs.next()){
                tableModel.addRow(new String[]{ rs.getString(1), rs.getString(2), rs.getString(3) } );
            }   
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "could not load titles");
        }  
    }
    
    public void fillSubjectsTable(JTable jTable){
         try {
            DefaultTableModel tableModel = new DefaultTableModel();
            conn = database.connectToDatabase();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM subject");
            
            tableModel = (DefaultTableModel) ASoftwareForLearning.pages.Subjects.SubjectsTable.getModel();
            tableModel.setRowCount(0);
            while(rs.next()){
                tableModel.addRow(new String[]{ rs.getString(1), rs.getString(2) } );
            }   
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "could not load subjects");
        }  
        
    }
    
    
    
}
