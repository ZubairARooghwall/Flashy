/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ASoftwareForLearning.component;

import java.awt.Color;
import java.awt.Cursor;
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
        
        QuestionsUnderWelcome.setkStartColor(new Color(66, 4, 126));
        QuestionsUnderWelcome.setkEndColor(new Color(7, 244, 158));
        
         TitlesUnderWelcome.setkStartColor(new Color(66, 4, 126));
        TitlesUnderWelcome.setkEndColor(new Color(7, 244, 158));
        
         SubjectsUnderWelcome.setkStartColor(new Color(66, 4, 126));
        SubjectsUnderWelcome.setkEndColor(new Color(7, 244, 158));
        
        QuestionsUnderWelcome.setkForeGround(Color.white);
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        QuestionsUnderWelcome = new ASoftwareForLearning.component.KButton();
        TitlesUnderWelcome = new ASoftwareForLearning.component.KButton();
        SubjectsUnderWelcome = new ASoftwareForLearning.component.KButton();

        setMaximumSize(new java.awt.Dimension(650, 40));
        setMinimumSize(new java.awt.Dimension(650, 40));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(650, 40));

        QuestionsUnderWelcome.setText("Questions");
        QuestionsUnderWelcome.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        QuestionsUnderWelcome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuestionsUnderWelcomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QuestionsUnderWelcomeMouseEntered(evt);
            }
        });
        QuestionsUnderWelcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuestionsUnderWelcomeActionPerformed(evt);
            }
        });

        TitlesUnderWelcome.setText("Titles");
        TitlesUnderWelcome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TitlesUnderWelcomeMouseEntered(evt);
            }
        });
        TitlesUnderWelcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitlesUnderWelcomeActionPerformed(evt);
            }
        });

        SubjectsUnderWelcome.setText("Subjects");
        SubjectsUnderWelcome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SubjectsUnderWelcomeMouseEntered(evt);
            }
        });
        SubjectsUnderWelcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubjectsUnderWelcomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(QuestionsUnderWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(TitlesUnderWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(SubjectsUnderWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SubjectsUnderWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(TitlesUnderWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(QuestionsUnderWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void QuestionsUnderWelcomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuestionsUnderWelcomeMouseEntered
        // TODO add your handling code here:
        
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        
    }//GEN-LAST:event_QuestionsUnderWelcomeMouseEntered

    private void TitlesUnderWelcomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitlesUnderWelcomeMouseEntered
        // TODO add your handling code here:
        
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        
    }//GEN-LAST:event_TitlesUnderWelcomeMouseEntered

    private void SubjectsUnderWelcomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubjectsUnderWelcomeMouseEntered
        // TODO add your handling code here:
        
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        
    }//GEN-LAST:event_SubjectsUnderWelcomeMouseEntered

    private void QuestionsUnderWelcomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuestionsUnderWelcomeMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_QuestionsUnderWelcomeMouseClicked

    private void QuestionsUnderWelcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuestionsUnderWelcomeActionPerformed
        // TODO add your handling code here:
        
        ASoftwareForLearning.pages.Home.statistics1.setVisible(false);
        ASoftwareForLearning.pages.Home.titles1.setVisible(false);
        ASoftwareForLearning.pages.Home.subjects1.setVisible(false);
        ASoftwareForLearning.pages.Home.homePanel2.setVisible(false);
        ASoftwareForLearning.pages.Home.studyButton.setVisible(false);
        ASoftwareForLearning.pages.Home.questions1.setVisible(true);
        
    }//GEN-LAST:event_QuestionsUnderWelcomeActionPerformed

    private void TitlesUnderWelcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitlesUnderWelcomeActionPerformed
        // TODO add your handling code here:
         ASoftwareForLearning.pages.Home.statistics1.setVisible(false);
        ASoftwareForLearning.pages.Home.titles1.setVisible(true);
        ASoftwareForLearning.pages.Home.subjects1.setVisible(false);
        ASoftwareForLearning.pages.Home.homePanel2.setVisible(false);
        ASoftwareForLearning.pages.Home.studyButton.setVisible(false);
        ASoftwareForLearning.pages.Home.questions1.setVisible(false);
        
        
    }//GEN-LAST:event_TitlesUnderWelcomeActionPerformed

    private void SubjectsUnderWelcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubjectsUnderWelcomeActionPerformed
        // TODO add your handling code here:
         ASoftwareForLearning.pages.Home.statistics1.setVisible(false);
        ASoftwareForLearning.pages.Home.titles1.setVisible(false);
        ASoftwareForLearning.pages.Home.subjects1.setVisible(true);
        ASoftwareForLearning.pages.Home.homePanel2.setVisible(false);
        ASoftwareForLearning.pages.Home.studyButton.setVisible(false);
        ASoftwareForLearning.pages.Home.questions1.setVisible(false);
    }//GEN-LAST:event_SubjectsUnderWelcomeActionPerformed

    
    
    
    

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
    private ASoftwareForLearning.component.KButton QuestionsUnderWelcome;
    private ASoftwareForLearning.component.KButton SubjectsUnderWelcome;
    private ASoftwareForLearning.component.KButton TitlesUnderWelcome;
    // End of variables declaration//GEN-END:variables
}
