/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ASoftwareForLearning.pages;

import ASoftwareForLearning.App;


public class Home extends javax.swing.JPanel {

 
    public Home() {
        initComponents();
        statistics1.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header1 = new ASoftwareForLearning.component.Header();
        notes1 = new ASoftwareForLearning.TODO.Notes();
        graph1 = new ASoftwareForLearning.component.Graph();
        homePanel2 = new ASoftwareForLearning.component.HomePanel();
        statistics1 = new ASoftwareForLearning.pages.Statistics();

        setMaximumSize(new java.awt.Dimension(1190, 590));
        setMinimumSize(new java.awt.Dimension(1190, 590));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1190, 590));
        setLayout(null);
        add(header1);
        header1.setBounds(10, 10, 1190, 40);

        notes1.setBackground(new java.awt.Color(51, 255, 255));
        notes1.setOpaque(false);

        javax.swing.GroupLayout notes1Layout = new javax.swing.GroupLayout(notes1);
        notes1.setLayout(notes1Layout);
        notes1Layout.setHorizontalGroup(
            notes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        notes1Layout.setVerticalGroup(
            notes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        add(notes1);
        notes1.setBounds(10, 60, 250, 250);

        graph1.setBackground(new java.awt.Color(0, 0, 255));
        graph1.setOpaque(false);
        graph1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                graph1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout graph1Layout = new javax.swing.GroupLayout(graph1);
        graph1.setLayout(graph1Layout);
        graph1Layout.setHorizontalGroup(
            graph1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        graph1Layout.setVerticalGroup(
            graph1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );

        add(graph1);
        graph1.setBounds(10, 320, 250, 258);

        homePanel2.setOpaque(false);
        add(homePanel2);
        homePanel2.setBounds(270, 60, 910, 520);
        add(statistics1);
        statistics1.setBounds(270, 60, 910, 520);
    }// </editor-fold>//GEN-END:initComponents

    private void graph1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graph1MousePressed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_graph1MousePressed

    private void graph1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graph1MouseClicked
        // TODO add your handling code here:
        homePanel2.setVisible(false);
        statistics1.setVisible(true);
    }//GEN-LAST:event_graph1MouseClicked

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ASoftwareForLearning.component.Graph graph1;
    private ASoftwareForLearning.component.Header header1;
    public static ASoftwareForLearning.component.HomePanel homePanel2;
    private ASoftwareForLearning.TODO.Notes notes1;
    public static ASoftwareForLearning.pages.Statistics statistics1;
    // End of variables declaration//GEN-END:variables
}
