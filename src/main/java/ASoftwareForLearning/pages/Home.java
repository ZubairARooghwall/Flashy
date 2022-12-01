/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ASoftwareForLearning.pages;

import ASoftwareForLearning.App;


public class Home extends javax.swing.JPanel {

 
    public Home() {
        initComponents();
        statistics2.setVisible(false);
        
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
        welcome1 = new ASoftwareForLearning.component.Welcome();
        notes1 = new ASoftwareForLearning.TODO.Notes();
        buttonUnderWelcome2 = new ASoftwareForLearning.component.buttonUnderWelcome();
        subjectsUnderWelcome3 = new ASoftwareForLearning.component.SubjectsUnderWelcome();
        recentlyAddedQuestionsList1 = new ASoftwareForLearning.component.RecentlyAddedQuestionsList();
        graph1 = new ASoftwareForLearning.component.Graph();
        statistics2 = new ASoftwareForLearning.pages.Statistics();

        setMaximumSize(new java.awt.Dimension(1190, 590));
        setMinimumSize(new java.awt.Dimension(1190, 590));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1190, 590));
        setLayout(null);
        add(header1);
        header1.setBounds(6, 6, 1184, 40);
        add(welcome1);
        welcome1.setBounds(250, 70, 650, 200);

        notes1.setBackground(new java.awt.Color(204, 204, 255));
        notes1.setMaximumSize(new java.awt.Dimension(242, 258));
        notes1.setMinimumSize(new java.awt.Dimension(242, 258));
        notes1.setOpaque(false);
        notes1.setPreferredSize(new java.awt.Dimension(242, 258));

        javax.swing.GroupLayout notes1Layout = new javax.swing.GroupLayout(notes1);
        notes1.setLayout(notes1Layout);
        notes1Layout.setHorizontalGroup(
            notes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 242, Short.MAX_VALUE)
        );
        notes1Layout.setVerticalGroup(
            notes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );

        add(notes1);
        notes1.setBounds(0, 70, 242, 258);
        add(buttonUnderWelcome2);
        buttonUnderWelcome2.setBounds(250, 280, 650, 40);

        subjectsUnderWelcome3.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout subjectsUnderWelcome3Layout = new javax.swing.GroupLayout(subjectsUnderWelcome3);
        subjectsUnderWelcome3.setLayout(subjectsUnderWelcome3Layout);
        subjectsUnderWelcome3Layout.setHorizontalGroup(
            subjectsUnderWelcome3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        subjectsUnderWelcome3Layout.setVerticalGroup(
            subjectsUnderWelcome3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        add(subjectsUnderWelcome3);
        subjectsUnderWelcome3.setBounds(250, 330, 650, 260);

        recentlyAddedQuestionsList1.setBackground(new java.awt.Color(153, 255, 255));
        recentlyAddedQuestionsList1.setOpaque(false);
        add(recentlyAddedQuestionsList1);
        recentlyAddedQuestionsList1.setBounds(910, 70, 280, 520);

        graph1.setBackground(new java.awt.Color(255, 204, 204));
        graph1.setOpaque(false);
        graph1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                graph1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout graph1Layout = new javax.swing.GroupLayout(graph1);
        graph1.setLayout(graph1Layout);
        graph1Layout.setHorizontalGroup(
            graph1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 242, Short.MAX_VALUE)
        );
        graph1Layout.setVerticalGroup(
            graph1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );

        add(graph1);
        graph1.setBounds(0, 330, 242, 258);

        statistics2.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout statistics2Layout = new javax.swing.GroupLayout(statistics2);
        statistics2.setLayout(statistics2Layout);
        statistics2Layout.setHorizontalGroup(
            statistics2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        statistics2Layout.setVerticalGroup(
            statistics2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        add(statistics2);
        statistics2.setBounds(250, 70, 940, 520);
    }// </editor-fold>//GEN-END:initComponents

    private void graph1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graph1MousePressed
        // TODO add your handling code here:
        welcome1.setVisible(false);
        subjectsUnderWelcome3.setVisible(false);
        recentlyAddedQuestionsList1.setVisible(false);
        buttonUnderWelcome2.setVisible(false);
        statistics2.setVisible(true);
        
    }//GEN-LAST:event_graph1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ASoftwareForLearning.component.buttonUnderWelcome buttonUnderWelcome2;
    private ASoftwareForLearning.component.Graph graph1;
    public ASoftwareForLearning.component.Header header1;
    private ASoftwareForLearning.TODO.Notes notes1;
    private ASoftwareForLearning.component.RecentlyAddedQuestionsList recentlyAddedQuestionsList1;
    private ASoftwareForLearning.pages.Statistics statistics2;
    private ASoftwareForLearning.component.SubjectsUnderWelcome subjectsUnderWelcome3;
    private ASoftwareForLearning.component.Welcome welcome1;
    // End of variables declaration//GEN-END:variables
}
