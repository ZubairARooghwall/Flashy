/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ASoftwareForLearning.component;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author Zubai
 */
public class buttonUnderWelcome extends javax.swing.JPanel {

    /**
     * Creates new form buttonUnderWelcome
     */
    public buttonUnderWelcome() {
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

        QuestionsUnderWelcome = new javax.swing.JButton();
        TitlesUnderWelcome = new javax.swing.JButton();
        SubjectsUnderWelcome = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(650, 40));
        setMinimumSize(new java.awt.Dimension(650, 40));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(650, 40));

        QuestionsUnderWelcome.setText("Questions");
        QuestionsUnderWelcome.setToolTipText("");
        QuestionsUnderWelcome.setMaximumSize(new java.awt.Dimension(200, 30));
        QuestionsUnderWelcome.setMinimumSize(new java.awt.Dimension(200, 30));
        QuestionsUnderWelcome.setPreferredSize(new java.awt.Dimension(200, 30));

        TitlesUnderWelcome.setText("Titles");
        TitlesUnderWelcome.setMaximumSize(new java.awt.Dimension(200, 30));
        TitlesUnderWelcome.setMinimumSize(new java.awt.Dimension(200, 30));
        TitlesUnderWelcome.setPreferredSize(new java.awt.Dimension(200, 30));

        SubjectsUnderWelcome.setText("Subjects");
        SubjectsUnderWelcome.setMaximumSize(new java.awt.Dimension(200, 30));
        SubjectsUnderWelcome.setMinimumSize(new java.awt.Dimension(200, 30));
        SubjectsUnderWelcome.setPreferredSize(new java.awt.Dimension(200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(QuestionsUnderWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TitlesUnderWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SubjectsUnderWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubjectsUnderWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TitlesUnderWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuestionsUnderWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


      @Override
    protected void paintComponent(Graphics grphcs) {
        int width =  getWidth();
        int height = getHeight();
        
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        super.paintComponent(grphcs);
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton QuestionsUnderWelcome;
    private javax.swing.JButton SubjectsUnderWelcome;
    private javax.swing.JButton TitlesUnderWelcome;
    // End of variables declaration//GEN-END:variables
}