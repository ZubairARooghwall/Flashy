/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ASoftwareForLearning.pages;

import ASoftwareForLearning.Database.buttonsUnderWelcomeDatabase;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Zubai
 */
public class Subjects extends javax.swing.JPanel {

    /**
     * Creates new form Subjects
     */
    public Subjects() {
        initComponents();
        
        
        
         SubjectsTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        SubjectsTable.setOpaque(false);
        SubjectsTable.getTableHeader().setBackground(Color.decode("#103783"));
        SubjectsTable.getTableHeader().setForeground(new Color(0, 0, 0));
        SubjectsTable.setRowHeight(25);
        SubjectsTable.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        
        buttonsUnderWelcomeDatabase subjectTableData = new buttonsUnderWelcomeDatabase();
        subjectTableData.fillSubjectsTable(SubjectsTable);
        
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        SubjectsTable = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(910, 520));
        setMinimumSize(new java.awt.Dimension(910, 520));
        setPreferredSize(new java.awt.Dimension(910, 520));

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        SubjectsTable.setBackground(new java.awt.Color(255, 255, 255));
        SubjectsTable.setForeground(new java.awt.Color(0, 0, 0));
        SubjectsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Subject Name", "Date Created", "No of Titles"
            }
        ));
        SubjectsTable.setSelectionBackground(new java.awt.Color(0, 97, 255));
        SubjectsTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        SubjectsTable.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(SubjectsTable);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable SubjectsTable;
    private javax.swing.JScrollPane jScrollPane1;
    private ASoftwareForLearning.swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
