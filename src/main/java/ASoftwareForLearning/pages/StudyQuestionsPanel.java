/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ASoftwareForLearning.pages;

import java.awt.Color;
import java.awt.Cursor;

/**
 *
 * @author Zubai
 */
public class StudyQuestionsPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudyQuestionsPanel
     */
    public StudyQuestionsPanel() {
        initComponents();
        
        showAnswer.kStartColor = Color.decode("#0061ff");
        showAnswer.kEndColor = Color.decode("#60efff");
        
        showAnswer.kHoverStartColor = Color.decode("#103783");
        showAnswer.kHoverEndColor = Color.decode("#0061ff");
        
        
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
        questionReviewedLabel = new javax.swing.JLabel();
        answerReviewedLabel = new javax.swing.JLabel();
        showAnswer = new ASoftwareForLearning.component.KButton();
        HomeButton = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(1190, 590));
        setMinimumSize(new java.awt.Dimension(1190, 590));

        panelBorder1.setMaximumSize(new java.awt.Dimension(1190, 590));
        panelBorder1.setMinimumSize(new java.awt.Dimension(1190, 590));

        questionReviewedLabel.setBackground(new java.awt.Color(255, 255, 255));
        questionReviewedLabel.setFont(new java.awt.Font("Segoe UI Variable", 0, 36)); // NOI18N
        questionReviewedLabel.setForeground(new java.awt.Color(0, 0, 0));
        questionReviewedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        questionReviewedLabel.setText("QuestionReviewLabel");

        answerReviewedLabel.setBackground(new java.awt.Color(255, 255, 255));
        answerReviewedLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        answerReviewedLabel.setForeground(new java.awt.Color(0, 0, 0));
        answerReviewedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        answerReviewedLabel.setText("AnswerReviewLabel");

        showAnswer.setText("Show Answer");

        HomeButton.setIcon(new javax.swing.ImageIcon("C:\\Projects\\UniversityProject\\ASoftwareForLearning\\app\\src\\main\\java\\ASoftwareForLearning\\icon\\home_Outlined.png")); // NOI18N
        HomeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeButtonMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(questionReviewedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(answerReviewedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGap(464, 464, 464)
                                .addComponent(showAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(HomeButton)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HomeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(questionReviewedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(answerReviewedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(showAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(panelBorder1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void HomeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeButtonMouseEntered
        // TODO add your handling code here:
        
       setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_HomeButtonMouseEntered

    private void HomeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeButtonMouseClicked
        // TODO add your handling code here:
        
        
        
        
    }//GEN-LAST:event_HomeButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HomeButton;
    private javax.swing.JLabel answerReviewedLabel;
    private ASoftwareForLearning.swing.PanelBorder panelBorder1;
    private javax.swing.JLabel questionReviewedLabel;
    private ASoftwareForLearning.component.KButton showAnswer;
    // End of variables declaration//GEN-END:variables
}