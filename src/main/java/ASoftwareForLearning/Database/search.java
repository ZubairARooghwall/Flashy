package ASoftwareForLearning.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class search {
    
     DatabaseConnection database = new DatabaseConnection();
    Connection conn = null;
    ResultSet rs = null;
    Statement stmt = null;
    

    public void fillQuestionTable(JTable jTable, search search){
        try {
            DefaultTableModel tableModel = new DefaultTableModel();
            conn = database.connectToDatabase();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM questions WHERE Question = '" + search + "'");
            
            tableModel = (DefaultTableModel) ASoftwareForLearning.pages.Questions.questionTable.getModel();
            tableModel.setRowCount(0);
            while(rs.next()){
                tableModel.addRow(new String[]{ rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)  } );
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "could not load questions");
        }
    }
    
    
    
      
}
