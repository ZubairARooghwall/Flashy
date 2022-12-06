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
public class Titles extends javax.swing.JPanel {

    /**
     * Creates new form Titles
     */
    public Titles() {
        initComponents();
        
        
         TitlesTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        TitlesTable.setOpaque(false);
        TitlesTable.getTableHeader().setBackground(Color.decode("#103783"));
        TitlesTable.getTableHeader().setForeground(new Color(0, 0, 0));
        TitlesTable.setRowHeight(25);
        TitlesTable.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        
        buttonsUnderWelcomeDatabase titlesTableData = new buttonsUnderWelcomeDatabase();
        titlesTableData.fillTitlesTable(TitlesTable);
        
        
        
        
        
        
        
        
        
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
        TitlesTable = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(910, 520));
        setMinimumSize(new java.awt.Dimension(910, 520));
        setPreferredSize(new java.awt.Dimension(910, 520));

        TitlesTable.setBackground(new java.awt.Color(255, 255, 255));
        TitlesTable.setForeground(new java.awt.Color(0, 0, 0));
        TitlesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title Name", "Date Created", "Parent Title", "Subject ID"
            }
        ));
        TitlesTable.setSelectionBackground(new java.awt.Color(0, 97, 255));
        TitlesTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        TitlesTable.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(TitlesTable);

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
    public static javax.swing.JTable TitlesTable;
    private javax.swing.JScrollPane jScrollPane1;
    private ASoftwareForLearning.swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
