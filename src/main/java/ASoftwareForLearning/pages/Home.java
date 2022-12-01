/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ASoftwareForLearning.pages;

import ASoftwareForLearning.App;


public class Home extends javax.swing.JPanel {

 
    public Home() {
        initComponents();
        
        
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
        jSeparator2 = new javax.swing.JSeparator();
        subjectsUnderWelcome1 = new ASoftwareForLearning.component.SubjectsUnderWelcome();
        notes1 = new ASoftwareForLearning.TODO.Notes();
        buttonUnderWelcome1 = new ASoftwareForLearning.component.buttonUnderWelcome();
        subjectsUnderWelcome2 = new ASoftwareForLearning.component.SubjectsUnderWelcome();
        buttonUnderWelcome2 = new ASoftwareForLearning.component.buttonUnderWelcome();
        subjectsUnderWelcome3 = new ASoftwareForLearning.component.SubjectsUnderWelcome();
        graph2 = new ASoftwareForLearning.pages.Graph();
        recentlyAddedQuestionsList1 = new ASoftwareForLearning.component.RecentlyAddedQuestionsList();

        setMaximumSize(new java.awt.Dimension(1190, 590));
        setMinimumSize(new java.awt.Dimension(1190, 590));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1190, 590));
        setLayout(null);
        add(header1);
        header1.setBounds(6, 6, 1184, 40);

        welcome1.setMaximumSize(new java.awt.Dimension(650, 200));
        welcome1.setMinimumSize(new java.awt.Dimension(650, 200));
        welcome1.setPreferredSize(new java.awt.Dimension(650, 200));
        add(welcome1);
        welcome1.setBounds(250, 70, 650, 200);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2);
        jSeparator2.setBounds(0, 1354, 48, 0);

        javax.swing.GroupLayout subjectsUnderWelcome1Layout = new javax.swing.GroupLayout(subjectsUnderWelcome1);
        subjectsUnderWelcome1.setLayout(subjectsUnderWelcome1Layout);
        subjectsUnderWelcome1Layout.setHorizontalGroup(
            subjectsUnderWelcome1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        subjectsUnderWelcome1Layout.setVerticalGroup(
            subjectsUnderWelcome1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );

        add(subjectsUnderWelcome1);
        subjectsUnderWelcome1.setBounds(248, 1104, 0, 244);

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
        add(buttonUnderWelcome1);
        buttonUnderWelcome1.setBounds(248, 796, 650, 40);

        subjectsUnderWelcome2.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout subjectsUnderWelcome2Layout = new javax.swing.GroupLayout(subjectsUnderWelcome2);
        subjectsUnderWelcome2.setLayout(subjectsUnderWelcome2Layout);
        subjectsUnderWelcome2Layout.setHorizontalGroup(
            subjectsUnderWelcome2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        subjectsUnderWelcome2Layout.setVerticalGroup(
            subjectsUnderWelcome2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        add(subjectsUnderWelcome2);
        subjectsUnderWelcome2.setBounds(248, 846, 650, 240);
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

        graph2.setBackground(new java.awt.Color(255, 204, 204));
        graph2.setOpaque(false);

        javax.swing.GroupLayout graph2Layout = new javax.swing.GroupLayout(graph2);
        graph2.setLayout(graph2Layout);
        graph2Layout.setHorizontalGroup(
            graph2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 242, Short.MAX_VALUE)
        );
        graph2Layout.setVerticalGroup(
            graph2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );

        add(graph2);
        graph2.setBounds(0, 330, 242, 258);

        recentlyAddedQuestionsList1.setBackground(new java.awt.Color(153, 255, 255));
        recentlyAddedQuestionsList1.setOpaque(false);
        add(recentlyAddedQuestionsList1);
        recentlyAddedQuestionsList1.setBounds(910, 70, 280, 520);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ASoftwareForLearning.component.buttonUnderWelcome buttonUnderWelcome1;
    private ASoftwareForLearning.component.buttonUnderWelcome buttonUnderWelcome2;
    private ASoftwareForLearning.pages.Graph graph2;
    private ASoftwareForLearning.component.Header header1;
    private javax.swing.JSeparator jSeparator2;
    private ASoftwareForLearning.TODO.Notes notes1;
    private ASoftwareForLearning.component.RecentlyAddedQuestionsList recentlyAddedQuestionsList1;
    private ASoftwareForLearning.component.SubjectsUnderWelcome subjectsUnderWelcome1;
    private ASoftwareForLearning.component.SubjectsUnderWelcome subjectsUnderWelcome2;
    private ASoftwareForLearning.component.SubjectsUnderWelcome subjectsUnderWelcome3;
    private ASoftwareForLearning.component.Welcome welcome1;
    // End of variables declaration//GEN-END:variables
}
