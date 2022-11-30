/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ASoftwareForLearning.component;

/**
 *
 * @author Zubai
 */
public class Header extends javax.swing.JPanel {

    /**
     * Creates new form Header
     */
    public Header() {
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

        homeLabel = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        settingLabel = new javax.swing.JLabel();
        textFieldAnimation1 = new ASoftwareForLearning.swing.TextFieldAnimation();
        userPanel1 = new ASoftwareForLearning.component.UserPanel();

        setMaximumSize(new java.awt.Dimension(1200, 40));
        setMinimumSize(new java.awt.Dimension(1200, 40));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1200, 40));

        homeLabel.setIcon(new javax.swing.ImageIcon("C:\\Projects\\UniversityProject\\ASoftwareForLearning\\app\\src\\main\\java\\ASoftwareForLearning\\icon\\home_Filled.png")); // NOI18N

        logoLabel.setIcon(new javax.swing.ImageIcon("C:\\Projects\\UniversityProject\\ASoftwareForLearning\\app\\src\\main\\java\\ASoftwareForLearning\\icon\\logo_Dark.png")); // NOI18N

        settingLabel.setIcon(new javax.swing.ImageIcon("C:\\Projects\\UniversityProject\\ASoftwareForLearning\\app\\src\\main\\java\\ASoftwareForLearning\\icon\\setting_OutlineFilled.png")); // NOI18N

        textFieldAnimation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldAnimation1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logoLabel)
                .addGap(115, 115, 115)
                .addComponent(textFieldAnimation1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(homeLabel)
                .addGap(18, 18, 18)
                .addComponent(settingLabel)
                .addGap(73, 73, 73)
                .addComponent(userPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(settingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldAnimation1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldAnimation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldAnimation1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldAnimation1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel homeLabel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel settingLabel;
    private ASoftwareForLearning.swing.TextFieldAnimation textFieldAnimation1;
    private ASoftwareForLearning.component.UserPanel userPanel1;
    // End of variables declaration//GEN-END:variables
}