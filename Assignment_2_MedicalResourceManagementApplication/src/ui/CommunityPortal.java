/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.Hospital;
import model.HospitalList;

/**
 *
 * @author amretasrerengarajan
 */
public class CommunityPortal extends javax.swing.JPanel {

    /**
     * Creates new form CommunityPortal
     */
    
    boolean isHosNameValid = false;
    boolean isCommValid = false;
    boolean isCityValid = false;
    boolean isPincodeValid = false;
    boolean isHelplineValid = false;
    
    String hosName;
    String hosCommunity;
    String hosCity;
    long hosPincode;
    long hosHelpline;
    
    HospitalList hosList;

    
    public CommunityPortal(HospitalList hosList) {
        initComponents();
        this.hosList = hosList;
        lblWarningCity.setVisible(false);
        lblWarningCommunity.setVisible(false);
        lblWarningHelpline.setVisible(false);
        lblWarningHosName.setVisible(false);
        lblWarningPincode.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.WARNING: Do NOT modify this code.The content of this method is always
 regenerated by the Form Editor.
     * @param hosName
     * @return 
     */
    @SuppressWarnings("unchecked")
    
    public String checkHosName(String hosName) {
        String regex = "^[a-zA-Z]*$";
        isHosNameValid = hosName.matches(regex);
        if(isHosNameValid) {
            return hosName;
        } else {
            return "";
        }
    }
    
    public String checkCommunity(String hosCommunity) {
        String regex = "^[\\p{L} .'-]+$";
        isCommValid = hosCommunity.matches(regex);
        if(isCommValid) {
            return hosCommunity;
        } else {
            return "";
        }
    }
    
    public String checkCity(String hosCity) {
        String regex = "^[a-zA-Z]*$";
        isCityValid = hosCity.matches(regex);
        if(isCommValid) {
            if (hosCity.equals("Boston") || hosCity.equals("Boston")) {
                return hosCity;
            } else {
                return "";
            }
            
        } else {
            return "";
        }
    }
    
    public long checkPincode(String hosPincode) {
       String regex = "\\d{5}";
       long result;
       isPincodeValid = hosPincode.matches(regex);
        if (isPincodeValid) {
            result = Long.parseLong(hosPincode);
        } else {
            result = 0;
        }
        return result;
    }
    
    public long checkHelpline(String hosHelpline) {
       String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
       long result;
       isHelplineValid = hosHelpline.matches(regex);
        if (isHelplineValid) {
            result = Long.parseLong(hosHelpline);
        } else {
            result = 0;
        }
        return result;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblHospitalName = new javax.swing.JLabel();
        txtHospitalName = new javax.swing.JTextField();
        lblCommunity = new javax.swing.JLabel();
        txtCommunity = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblPincode = new javax.swing.JLabel();
        txtPincode = new javax.swing.JTextField();
        lblHosHelpline = new javax.swing.JLabel();
        txtHosHelpline = new javax.swing.JTextField();
        btnAddHospital = new javax.swing.JButton();
        lblWarningHosName = new javax.swing.JLabel();
        lblWarningCommunity = new javax.swing.JLabel();
        lblWarningCity = new javax.swing.JLabel();
        lblWarningPincode = new javax.swing.JLabel();
        lblWarningHelpline = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 255, 204));

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 0, 153));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Add New Hospitals in the Community!");

        lblHospitalName.setBackground(new java.awt.Color(255, 0, 153));
        lblHospitalName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblHospitalName.setForeground(new java.awt.Color(255, 0, 153));
        lblHospitalName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHospitalName.setText("Hospital Name:");

        txtHospitalName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHospitalNameFocusLost(evt);
            }
        });

        lblCommunity.setBackground(new java.awt.Color(255, 0, 153));
        lblCommunity.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblCommunity.setForeground(new java.awt.Color(255, 0, 153));
        lblCommunity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCommunity.setText("Community:");

        txtCommunity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCommunityFocusLost(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 0, 153));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("City:");

        txtCity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCityFocusLost(evt);
            }
        });
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        lblPincode.setBackground(new java.awt.Color(255, 0, 153));
        lblPincode.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblPincode.setForeground(new java.awt.Color(255, 0, 153));
        lblPincode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPincode.setText("Pincode");

        txtPincode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPincodeFocusLost(evt);
            }
        });
        txtPincode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPincodeActionPerformed(evt);
            }
        });

        lblHosHelpline.setBackground(new java.awt.Color(255, 0, 153));
        lblHosHelpline.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblHosHelpline.setForeground(new java.awt.Color(255, 0, 153));
        lblHosHelpline.setText("Hospital Helpline:");

        txtHosHelpline.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHosHelplineFocusLost(evt);
            }
        });

        btnAddHospital.setBackground(new java.awt.Color(204, 255, 204));
        btnAddHospital.setForeground(new java.awt.Color(0, 153, 0));
        btnAddHospital.setText("Add Details");
        btnAddHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHospitalActionPerformed(evt);
            }
        });

        lblWarningHosName.setForeground(new java.awt.Color(255, 0, 51));
        lblWarningHosName.setText("Invalid!");

        lblWarningCommunity.setForeground(new java.awt.Color(255, 0, 51));
        lblWarningCommunity.setText("Invalid!");

        lblWarningCity.setForeground(new java.awt.Color(255, 51, 51));
        lblWarningCity.setText("Invalid!");

        lblWarningPincode.setForeground(new java.awt.Color(255, 51, 51));
        lblWarningPincode.setText("Invalid!");

        lblWarningHelpline.setForeground(new java.awt.Color(255, 51, 51));
        lblWarningHelpline.setText("Invalid!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblHosHelpline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPincode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHospitalName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddHospital)
                            .addComponent(txtPincode)
                            .addComponent(txtCity)
                            .addComponent(txtCommunity)
                            .addComponent(txtHospitalName)
                            .addComponent(txtHosHelpline, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblWarningHosName, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(lblWarningCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblWarningCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblWarningPincode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblWarningHelpline, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblWarningCommunity, lblWarningHosName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTitle)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHospitalName)
                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWarningHosName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWarningCommunity))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWarningCity))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPincode)
                    .addComponent(txtPincode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWarningPincode))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHosHelpline)
                    .addComponent(txtHosHelpline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWarningHelpline))
                .addGap(48, 48, 48)
                .addComponent(btnAddHospital)
                .addContainerGap(73, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtPincodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPincodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPincodeActionPerformed

    private void btnAddHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddHospitalActionPerformed
        // TODO add your handling code here:
        Hospital hos = hosList.addHospitals();
        
        if(hosName.equals("") || hosCommunity.equals("") || hosCity.equals("") || hosPincode == 0 || hosHelpline == 0) {
            JOptionPane.showMessageDialog(this, "Every Field Should Be Filled!");
        } else {
            //Adding the entered values to Hospital List
            hos.setHosName(hosName);
            hos.setHosCommunity(hosCommunity);
            hos.setHosCity(hosCity);
            hos.setPicode(hosPincode);
            hos.setHosHelpLine(hosHelpline);
            //clearing the warning text
            lblWarningHosName.setVisible(false);
            lblWarningCommunity.setVisible(false);
            lblWarningCity.setVisible(false);
            lblWarningPincode.setVisible(false);
            lblWarningHelpline.setVisible(false);
            //success message after adding the details
            JOptionPane.showMessageDialog(this, "Hospital Details Added to Community!");
            //clearing the form
            txtHospitalName.setText("");
            txtCommunity.setText("");
            txtCity.setText("");
            txtPincode.setText("");
            txtHosHelpline.setText("");
            
        }
    }//GEN-LAST:event_btnAddHospitalActionPerformed

    private void txtHospitalNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHospitalNameFocusLost
        // TODO add your handling code here:
        String typedHospitalName = txtHospitalName.getText();
        hosName = checkHosName(typedHospitalName);
        if(typedHospitalName.equals("")) {
            lblWarningHosName.setVisible(false);
        } else {
            if (isHosNameValid) {
                lblWarningHosName.setVisible(false);
            } else {
                lblWarningHosName.setVisible(true);
            }
        }
    }//GEN-LAST:event_txtHospitalNameFocusLost

    private void txtCommunityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCommunityFocusLost
        // TODO add your handling code here:
        String typedHospitalCommunity = txtCommunity.getText();
        hosCommunity = checkCommunity(typedHospitalCommunity);
        if(typedHospitalCommunity.equals("")) {
            lblWarningCommunity.setVisible(false);
        } else {
            if (isCommValid) {
                lblWarningCommunity.setVisible(false);
            } else {
                lblWarningCommunity.setVisible(true);

            }
        }
    }//GEN-LAST:event_txtCommunityFocusLost

    private void txtCityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCityFocusLost
        // TODO add your handling code here:
        String typedHospitalCity = txtCity.getText();
        hosCity = checkCity(typedHospitalCity);
        if(typedHospitalCity.equals("")) {
            lblWarningCity.setVisible(false);
        } else {
            if (isCityValid) {
                lblWarningCity.setVisible(false);
            } else {
                lblWarningCity.setVisible(true);

            }
        }
    }//GEN-LAST:event_txtCityFocusLost

    private void txtPincodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPincodeFocusLost
        // TODO add your handling code here:
        String typedPincode = txtPincode.getText();
        hosPincode = checkPincode(typedPincode);
        if(typedPincode.isEmpty()){
            lblWarningPincode.setVisible(false);
        } else {
            if(hosPincode == 0) {
                txtPincode.setText("");
                lblWarningPincode.setVisible(true);
            } else {
                lblWarningPincode.setVisible(false);
            }
        }
    }//GEN-LAST:event_txtPincodeFocusLost

    private void txtHosHelplineFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHosHelplineFocusLost
        // TODO add your handling code here:
        String typedHelpline = txtHosHelpline.getText();
        hosHelpline = checkHelpline(typedHelpline);
        if(typedHelpline.isEmpty()){
            lblWarningHelpline.setVisible(false);
        } else {
            if(hosHelpline == 0) {
                txtHosHelpline.setText("");
                lblWarningHelpline.setVisible(true);
            } else {
                lblWarningHelpline.setVisible(false);
            }
        }
    }//GEN-LAST:event_txtHosHelplineFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddHospital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblHosHelpline;
    private javax.swing.JLabel lblHospitalName;
    private javax.swing.JLabel lblPincode;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWarningCity;
    private javax.swing.JLabel lblWarningCommunity;
    private javax.swing.JLabel lblWarningHelpline;
    private javax.swing.JLabel lblWarningHosName;
    private javax.swing.JLabel lblWarningPincode;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtHosHelpline;
    private javax.swing.JTextField txtHospitalName;
    private javax.swing.JTextField txtPincode;
    // End of variables declaration//GEN-END:variables
}
