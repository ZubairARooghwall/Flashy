/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ASoftwareForLearning.pages;

import ASoftwareForLearning.Database.buttonsUnderWelcomeDatabase;
import java.awt.Color;
import java.awt.Font;



  

public class Questions extends javax.swing.JPanel {

  
    
    
    
    public Questions() {
        initComponents();
        
        
        questionTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        questionTable.setOpaque(false);
        questionTable.getTableHeader().setBackground(Color.decode("#103783"));
        questionTable.getTableHeader().setForeground(new Color(0, 0, 0));
        questionTable.setRowHeight(25);
        questionTable.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        
        buttonsUnderWelcomeDatabase questionTable = new buttonsUnderWelcomeDatabase();
        
        questionTable.fillQuestionTable(Questions.questionTable);
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new ASoftwareForLearning.swing.PanelBorder();
        jScrollPane2 = new javax.swing.JScrollPane();
        questionTable = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(910, 520));
        setMinimumSize(new java.awt.Dimension(910, 520));
        setPreferredSize(new java.awt.Dimension(910, 520));

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setMaximumSize(new java.awt.Dimension(910, 520));
        panelBorder1.setMinimumSize(new java.awt.Dimension(910, 520));
        panelBorder1.setPreferredSize(new java.awt.Dimension(910, 520));

        questionTable.setBackground(new java.awt.Color(255, 255, 255));
        questionTable.setForeground(new java.awt.Color(0, 0, 0));
        questionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Question", "Answer", "Date Created", "Repetition", "Title Name"
            }
        ));
        questionTable.setFocusable(false);
        questionTable.setRowHeight(25);
        questionTable.setSelectionBackground(new java.awt.Color(0, 97, 255));
        questionTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        questionTable.setShowHorizontalLines(true);
        questionTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(questionTable);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 898, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private ASoftwareForLearning.swing.PanelBorder panelBorder1;
    public static javax.swing.JTable questionTable;
    // End of variables declaration//GEN-END:variables
}
