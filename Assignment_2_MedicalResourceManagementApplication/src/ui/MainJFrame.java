/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.CommunityList;
import model.DoctorList;
import model.HospitalList;
import model.LoginClass;
import model.PatientRecord;
import model.PatientRecordList;
import model.PersonList;

/**
 *
 * @author amretasrerengarajan
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    PersonList prsnList;
    HospitalList hspList;
    PatientRecord patientRecord;
    PatientRecordList patientRecordList;
    DoctorList doctorList;
    LoginClass loginList;
    CommunityList commList;

    public MainJFrame() {
        initComponents();
        this.prsnList = new PersonList();
        this.hspList = new HospitalList();
        this.patientRecord = new PatientRecord();
        this.patientRecordList = new PatientRecordList();
        this.doctorList = new DoctorList();
        this.loginList = new LoginClass();
        this.commList = new CommunityList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        loginOptions = new javax.swing.JPanel();
        btnUserLogin = new javax.swing.JButton();
        btnDoctorLogin = new javax.swing.JButton();
        btnSystemAdmin = new javax.swing.JButton();
        btnCommAdmin = new javax.swing.JButton();
        loginForm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginOptions.setBackground(new java.awt.Color(0, 204, 204));

        btnUserLogin.setBackground(new java.awt.Color(204, 255, 204));
        btnUserLogin.setForeground(new java.awt.Color(0, 204, 51));
        btnUserLogin.setText("User");
        btnUserLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserLoginActionPerformed(evt);
            }
        });

        btnDoctorLogin.setBackground(new java.awt.Color(204, 255, 204));
        btnDoctorLogin.setForeground(new java.awt.Color(0, 204, 51));
        btnDoctorLogin.setText("Doctor");
        btnDoctorLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorLoginActionPerformed(evt);
            }
        });

        btnSystemAdmin.setBackground(new java.awt.Color(204, 255, 204));
        btnSystemAdmin.setForeground(new java.awt.Color(0, 204, 51));
        btnSystemAdmin.setText("System Admin");
        btnSystemAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSystemAdminActionPerformed(evt);
            }
        });

        btnCommAdmin.setBackground(new java.awt.Color(204, 255, 204));
        btnCommAdmin.setForeground(new java.awt.Color(0, 204, 51));
        btnCommAdmin.setText("Community Admin");
        btnCommAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginOptionsLayout = new javax.swing.GroupLayout(loginOptions);
        loginOptions.setLayout(loginOptionsLayout);
        loginOptionsLayout.setHorizontalGroup(
            loginOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginOptionsLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(loginOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDoctorLogin)
                    .addComponent(btnUserLogin)
                    .addComponent(btnSystemAdmin)
                    .addComponent(btnCommAdmin))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        loginOptionsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCommAdmin, btnDoctorLogin, btnSystemAdmin, btnUserLogin});

        loginOptionsLayout.setVerticalGroup(
            loginOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginOptionsLayout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(btnSystemAdmin)
                .addGap(230, 230, 230)
                .addComponent(btnCommAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(btnUserLogin)
                .addGap(230, 230, 230)
                .addComponent(btnDoctorLogin)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        splitPane.setTopComponent(loginOptions);

        loginForm.setBackground(new java.awt.Color(0, 255, 204));

        javax.swing.GroupLayout loginFormLayout = new javax.swing.GroupLayout(loginForm);
        loginForm.setLayout(loginFormLayout);
        loginFormLayout.setHorizontalGroup(
            loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        loginFormLayout.setVerticalGroup(
            loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 932, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(loginForm);

        jLabel1.setBackground(new java.awt.Color(153, 0, 255));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Medical Resource Management Application");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(splitPane)
                .addGap(9, 9, 9))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(splitPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserLoginActionPerformed
        // TODO add your handling code here:
        UserLoginPanel userLoginPanel = new UserLoginPanel(splitPane, hspList, loginList, doctorList);
//        SearchHospitalPanel searchHospitals = new SearchHospitalPanel(hspList, "User Login");
        splitPane.setRightComponent(userLoginPanel);
    }//GEN-LAST:event_btnUserLoginActionPerformed

    private void btnCommAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommAdminActionPerformed
        // TODO add your handling code here:
        CommunityLoginPanel commLoginPanel = new CommunityLoginPanel(splitPane, hspList, prsnList, loginList, commList);
//        CommuityPanel commPanel = new CommuityPanel(hspList);
        splitPane.setRightComponent(commLoginPanel);
    }//GEN-LAST:event_btnCommAdminActionPerformed

    private void btnDoctorLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorLoginActionPerformed
        // TODO add your handling code here:
        DoctorLoginPanel doctorLoginPanel = new DoctorLoginPanel(splitPane, patientRecord, patientRecordList, prsnList, loginList);
//        DoctorPanel doctorPanel = new DoctorPanel(patientRecord, patientRecordList, prsnList);
        splitPane.setRightComponent(doctorLoginPanel);
    }//GEN-LAST:event_btnDoctorLoginActionPerformed

    private void btnSystemAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSystemAdminActionPerformed
        // TODO add your handling code here:
        SystemLoginPanel systemLoginPanel = new SystemLoginPanel(splitPane, patientRecord, patientRecordList, prsnList, hspList, doctorList, loginList, commList);
//        SystemAdminPanel systemAdminPanel = new SystemAdminPanel(patientRecord, patientRecordList, prsnList, hspList);
        splitPane.setBottomComponent(systemLoginPanel);
    }//GEN-LAST:event_btnSystemAdminActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCommAdmin;
    private javax.swing.JButton btnDoctorLogin;
    private javax.swing.JButton btnSystemAdmin;
    private javax.swing.JButton btnUserLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel loginForm;
    private javax.swing.JPanel loginOptions;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
