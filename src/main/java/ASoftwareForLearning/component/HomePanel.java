/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ASoftwareForLearning.component;

/**
 *
 * @author Zubai
 */
public class HomePanel extends javax.swing.JPanel {

    /**
     * Creates new form HomePanel
     */
    public HomePanel() {
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

        welcome1 = new ASoftwareForLearning.component.Welcome();
        buttonUnderWelcome1 = new ASoftwareForLearning.component.buttonUnderWelcome();
        subjectsUnderWelcome1 = new ASoftwareForLearning.component.SubjectsUnderWelcome();
        panelBorder1 = new ASoftwareForLearning.swing.PanelBorder();

        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(910, 520));
        setMinimumSize(new java.awt.Dimension(910, 520));
        setLayout(null);
        add(welcome1);
        welcome1.setBounds(0, 0, 650, 200);
        add(buttonUnderWelcome1);
        buttonUnderWelcome1.setBounds(0, 210, 650, 40);

        javax.swing.GroupLayout subjectsUnderWelcome1Layout = new javax.swing.GroupLayout(subjectsUnderWelcome1);
        subjectsUnderWelcome1.setLayout(subjectsUnderWelcome1Layout);
        subjectsUnderWelcome1Layout.setHorizontalGroup(
            subjectsUnderWelcome1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        subjectsUnderWelcome1Layout.setVerticalGroup(
            subjectsUnderWelcome1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        add(subjectsUnderWelcome1);
        subjectsUnderWelcome1.setBounds(0, 260, 650, 260);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        add(panelBorder1);
        panelBorder1.setBounds(660, 0, 250, 520);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ASoftwareForLearning.component.buttonUnderWelcome buttonUnderWelcome1;
    private ASoftwareForLearning.swing.PanelBorder panelBorder1;
    private ASoftwareForLearning.component.SubjectsUnderWelcome subjectsUnderWelcome1;
    private ASoftwareForLearning.component.Welcome welcome1;
    // End of variables declaration//GEN-END:variables
}
