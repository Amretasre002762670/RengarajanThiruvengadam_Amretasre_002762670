/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.EmpDetail;
import model.EmpDetailsList;

/**
 *
 * @author amretasrerengarajan
 */
public class UpdatePanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdatePanel
     */
    EmpDetail empDetail;
    EmpDetailsList empList;
    int selectedEmpInd;
    
    public UpdatePanel(EmpDetail empDetail, EmpDetailsList empList, int selectedEmpInd) {
        initComponents();
        
        this.empDetail = empDetail;
        this.empList = empList;
        this.selectedEmpInd = selectedEmpInd;
        
        
        addFormValues();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblEmpId = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        lblTeamInfo = new javax.swing.JLabel();
        lblPosTitle = new javax.swing.JLabel();
        lblMobNum = new javax.swing.JLabel();
        lblEmailId = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmpId = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtTeamInfo = new javax.swing.JTextField();
        txtPosTitle = new javax.swing.JTextField();
        txtMobNum = new javax.swing.JTextField();
        txtEmailId = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Employee Details");

        lblName.setText("Name:");

        lblEmpId.setText("Employee ID:");

        lblAge.setText("Age:");

        lblGender.setText("Gender:");

        lblStartDate.setText("Start Date:");

        lblLevel.setText("Level:");

        lblTeamInfo.setText("Team Information:");

        lblPosTitle.setText("Position Title:");

        lblMobNum.setText("Mobile Number:");

        lblEmailId.setText("Email ID:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });

        txtEmpId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmpIdKeyPressed(evt);
            }
        });

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgeKeyPressed(evt);
            }
        });

        txtGender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGenderKeyPressed(evt);
            }
        });

        txtStartDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtStartDateKeyPressed(evt);
            }
        });

        txtLevel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLevelKeyPressed(evt);
            }
        });

        txtTeamInfo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTeamInfoKeyPressed(evt);
            }
        });

        txtPosTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPosTitleKeyPressed(evt);
            }
        });

        txtMobNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMobNumKeyPressed(evt);
            }
        });

        txtEmailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIdActionPerformed(evt);
            }
        });
        txtEmailId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailIdKeyPressed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEmailId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMobNum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPosTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLevel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStartDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmpId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTeamInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addComponent(txtEmpId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAge, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtGender, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtLevel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPosTitle)
                    .addComponent(txtMobNum, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmailId, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(108, 108, 108))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(btnSave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpId)
                    .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartDate)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLevel)
                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTeamInfo)
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPosTitle)
                    .addComponent(txtPosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMobNum)
                    .addComponent(txtMobNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailId)
                    .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        String name = txtName.getText(); 
        int empId = Integer.parseInt(txtEmpId.getText());
        int age = Integer.parseInt(txtAge.getText());
        String gender = txtGender.getText();
        String startDate = txtStartDate.getText();
        String level = txtLevel.getText();
        String teamInfo = txtTeamInfo.getText();
        String posTitle = txtPosTitle.getText();
        long mobileNum = Long.parseLong(txtMobNum.getText());
        String emailId = txtEmailId.getText();
        
        // initialising the empDetails
        EmpDetail selectedEmpDetails;
        selectedEmpDetails = empList.updateEmpDetails(empDetail, selectedEmpInd );
        
        // using the empDet object to set the emp detail values
        selectedEmpDetails.setName(name);
        selectedEmpDetails.setEmpId(empId);
        selectedEmpDetails.setAge(age);
        selectedEmpDetails.setGender(gender);
        selectedEmpDetails.setStartDate(startDate);
        selectedEmpDetails.setLevel(level);
        selectedEmpDetails.setTeamInfo(teamInfo);
        selectedEmpDetails.setPositionTitle(posTitle);
        selectedEmpDetails.setMobileNum(mobileNum);
        selectedEmpDetails.setEmailId(emailId);
        
        JOptionPane.showMessageDialog(this, "Details Successfully Saved!");
        // clearing the form fields after saving the details
        txtName.setText("");
        txtEmpId.setText("");
        txtAge.setText("");
        txtGender.setText("");
        txtStartDate.setText("");
        txtLevel.setText("");
        txtTeamInfo.setText("");
        txtPosTitle.setText("");
        txtMobNum.setText("");
        txtEmailId.setText("");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIdActionPerformed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
        char typedCharacter = evt.getKeyChar();
        if(Character.isLetter(typedCharacter) || Character.isWhitespace(typedCharacter) || Character.isISOControl(typedCharacter)) {
            txtName.setEditable(true);
        } else {
            txtName.setEditable(false);
        }
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtGenderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenderKeyPressed
        // TODO add your handling code here:
        char typedCharacter = evt.getKeyChar();
        if(Character.isLetter(typedCharacter) || Character.isISOControl(typedCharacter)) {
            txtGender.setEditable(true);
        } else {
            txtGender.setEditable(false);
        }
    }//GEN-LAST:event_txtGenderKeyPressed

    private void txtStartDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStartDateKeyPressed
        // TODO add your handling code here:
        char typedCharacter = evt.getKeyChar();
        if(Character.isLetter(typedCharacter) || Character.isISOControl(typedCharacter) || Character.isDigit(typedCharacter)) {
            txtStartDate.setEditable(true);
        } else {
            txtStartDate.setEditable(false);
        }
    }//GEN-LAST:event_txtStartDateKeyPressed

    private void txtLevelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLevelKeyPressed
        // TODO add your handling code here:
        char typedCharacter = evt.getKeyChar();
        if(Character.isLetter(typedCharacter) || Character.isISOControl(typedCharacter)) {
            txtLevel.setEditable(true);
        } else {
            txtLevel.setEditable(false);
        }
    }//GEN-LAST:event_txtLevelKeyPressed

    private void txtTeamInfoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTeamInfoKeyPressed
        // TODO add your handling code here:
        char typedCharacter = evt.getKeyChar();
        if(Character.isLetter(typedCharacter) || Character.isISOControl(typedCharacter)) {
            txtTeamInfo.setEditable(true);
        } else {
            txtTeamInfo.setEditable(false);
        }
    }//GEN-LAST:event_txtTeamInfoKeyPressed

    private void txtPosTitleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPosTitleKeyPressed
        // TODO add your handling code here:
        char typedCharacter = evt.getKeyChar();
        if(Character.isLetter(typedCharacter) || Character.isISOControl(typedCharacter)) {
            txtPosTitle.setEditable(true);
        } else {
            txtPosTitle.setEditable(false);
        }
    }//GEN-LAST:event_txtPosTitleKeyPressed

    private void txtEmailIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailIdKeyPressed
        // TODO add your handling code here:
        char typedCharacter = evt.getKeyChar();
        if(Character.isLetter(typedCharacter) || Character.isISOControl(typedCharacter) || Character.isDigit(typedCharacter)) {
            txtPosTitle.setEditable(true);
        } else {
            txtPosTitle.setEditable(false);
        }
    }//GEN-LAST:event_txtEmailIdKeyPressed

    private void txtEmpIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpIdKeyPressed
        // TODO add your handling code here:
        char typedCharacter = evt.getKeyChar();
        if(Character.isDigit(typedCharacter)) {
            txtPosTitle.setEditable(true);
        } else {
            txtPosTitle.setEditable(false);
        }
    }//GEN-LAST:event_txtEmpIdKeyPressed

    private void txtAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyPressed
        // TODO add your handling code here:
        char typedCharacter = evt.getKeyChar();
        if(Character.isDigit(typedCharacter)) {
            txtPosTitle.setEditable(true);
        } else {
            txtPosTitle.setEditable(false);
        }
    }//GEN-LAST:event_txtAgeKeyPressed

    private void txtMobNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobNumKeyPressed
        // TODO add your handling code here:
        char typedCharacter = evt.getKeyChar();
        if(Character.isDigit(typedCharacter)) {
            txtPosTitle.setEditable(true);
        } else {
            txtPosTitle.setEditable(false);
        }
    }//GEN-LAST:event_txtMobNumKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblEmailId;
    private javax.swing.JLabel lblEmpId;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblMobNum;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPosTitle;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtMobNum;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPosTitle;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables

    private void addFormValues() {
        
        txtName.setText(String.valueOf(empDetail.getName()));
        txtEmpId.setText(String.valueOf(empDetail.getEmpId()));
        txtAge.setText(String.valueOf(empDetail.getAge()));
        txtGender.setText(String.valueOf(empDetail.getGender()));
        txtStartDate.setText(String.valueOf(empDetail.getStartDate()));
        txtLevel.setText(String.valueOf(empDetail.getLevel()));
        txtTeamInfo.setText(String.valueOf(empDetail.getTeamInfo()));
        txtPosTitle.setText(String.valueOf(empDetail.getPositionTitle()));
        txtMobNum.setText(String.valueOf(empDetail.getMobileNum()));
        txtEmailId.setText(String.valueOf(empDetail.getEmailId())); 
        
        
    }
}
