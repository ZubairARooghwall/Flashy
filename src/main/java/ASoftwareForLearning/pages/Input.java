/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ASoftwareForLearning.pages;

import ASoftwareForLearning.Database.ComboBox;
import ASoftwareForLearning.Database.buttonsUnderWelcomeDatabase;
import ASoftwareForLearning.Database.inputQuestion;
import ASoftwareForLearning.component.buttonUnderWelcome;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class Input extends javax.swing.JInternalFrame {

    ComboBox titleBox = new ComboBox();
    
    public Input() {
        initComponents();
        
        addButton.setkStartColor(Color.decode("#0061ff"));
        addButton.setkEndColor(Color.decode("#60efff"));
        
        
        //for inter 
        this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi  = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        //for combo box
        titleBox.fillTitleForQuestion(comboForQuestions);
        
        
        //change the label of titles
        comboForQuestions.setLabeText("Title");
        
        
        
        
        
        
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
        QuestionInputTxt = new ASoftwareForLearning.InputPageComponents.TextField();
        jLabel1 = new javax.swing.JLabel();
        textAreaScroll1 = new ASoftwareForLearning.InputPageComponents.TextAreaScroll();
        AnswerInputTxt = new ASoftwareForLearning.InputPageComponents.TextArea();
        header1 = new ASoftwareForLearning.component.Header();
        addButton = new ASoftwareForLearning.component.KButton();
        comboForQuestions = new ASoftwareForLearning.component.Combobox();
        questionSuccess = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 600));
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setNormalBounds(new java.awt.Rectangle(0, 0, 1200, 600));
        setPreferredSize(new java.awt.Dimension(1200, 600));
        getContentPane().setLayout(null);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setMaximumSize(new java.awt.Dimension(1200, 600));
        panelBorder1.setMinimumSize(new java.awt.Dimension(1200, 600));
        panelBorder1.setPreferredSize(new java.awt.Dimension(1200, 600));

        QuestionInputTxt.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Projects\\UniversityProject\\ASoftwareForLearning\\app\\src\\main\\java\\ASoftwareForLearning\\icon\\maximize-size-option_20.png")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        textAreaScroll1.setOpaque(false);

        AnswerInputTxt.setBackground(new java.awt.Color(255, 255, 255));
        AnswerInputTxt.setColumns(20);
        AnswerInputTxt.setForeground(new java.awt.Color(0, 0, 0));
        AnswerInputTxt.setRows(5);
        textAreaScroll1.setViewportView(AnswerInputTxt);

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        questionSuccess.setBackground(new java.awt.Color(255, 255, 255));
        questionSuccess.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelBorder1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(442, 442, 442)
                            .addComponent(questionSuccess, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(QuestionInputTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textAreaScroll1, javax.swing.GroupLayout.DEFAULT_SIZE, 1055, Short.MAX_VALUE))
                        .addComponent(comboForQuestions, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(comboForQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuestionInputTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textAreaScroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(questionSuccess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        getContentPane().add(panelBorder1);
        panelBorder1.setBounds(0, 0, 1200, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        
        InputQuestionsFrame frame = new InputQuestionsFrame();
        
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        
        String Question = QuestionInputTxt.getText();
        String Answer = AnswerInputTxt.getText();
        String Title = comboForQuestions.getSelectedItem().toString();
        
        inputQuestion add = new inputQuestion();
        add.addQuestion(Question, Answer, Title);
        
        
        
        
        
        
        
        new buttonsUnderWelcomeDatabase().fillQuestionTable(ASoftwareForLearning.pages.Questions.questionTable);
        QuestionInputTxt.setText("");
        AnswerInputTxt.setText("");
        QuestionInputTxt.requestFocus();
    }//GEN-LAST:event_addButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ASoftwareForLearning.InputPageComponents.TextArea AnswerInputTxt;
    private ASoftwareForLearning.InputPageComponents.TextField QuestionInputTxt;
    private ASoftwareForLearning.component.KButton addButton;
    private ASoftwareForLearning.component.Combobox comboForQuestions;
    private ASoftwareForLearning.component.Header header1;
    private javax.swing.JLabel jLabel1;
    private ASoftwareForLearning.swing.PanelBorder panelBorder1;
    public static javax.swing.JLabel questionSuccess;
    private ASoftwareForLearning.InputPageComponents.TextAreaScroll textAreaScroll1;
    // End of variables declaration//GEN-END:variables
}
