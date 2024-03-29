/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Doctor;
import model.DoctorList;
import model.Hospital;
import model.HospitalList;

/**
 *
 * @author amretasrerengarajan
 */
public class ViewDoctorPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDoctorPanel
     */
    
    DoctorList doctorList;
    HospitalList hosList;
    
    long doctorID;
    
    public ViewDoctorPanel(DoctorList doctorList, HospitalList hosList, String Pannel) {
        initComponents();
        
        this.doctorList = doctorList;
        this.hosList = hosList;
        
        populateTable();
        populateHospName();
        
        if(Pannel.equals("User Login")) {
            panelUpdateDoctor.setVisible(false);
            btnUpdate.setVisible(false);
            btnDelete.setVisible(false);
        }
    }
    
    public void populateTable() {
        DefaultTableModel doctorTable = (DefaultTableModel) tblViewDoctors.getModel();
        doctorTable.setRowCount(0);
        for (Doctor doctor : doctorList.getDoctorList()) {
            Object[] row = new Object[6];
            row[0] = doctor.getDoctorID();
            row[1] = doctor;
            row[2] = doctor.getDoctorDept();
            row[3] = doctor.getDoctorHospName();
            row[4] = doctor.getDoctorHospComm();
            row[5] = doctor.getDoctorNum();

            doctorTable.addRow(row);
        }
    } 
    
    public void populateTableWithSearch(ArrayList<Doctor> searchResult) {
        DefaultTableModel doctorTable = (DefaultTableModel) tblViewDoctors.getModel();
        doctorTable.setRowCount(0);
        for (Doctor doctor : searchResult) {
            Object[] row = new Object[6];
            row[0] = doctor.getDoctorID();
            row[1] = doctor;
            row[2] = doctor.getDoctorDept();
            row[3] = doctor.getDoctorHospName();
            row[4] = doctor.getDoctorHospComm();
            row[5] = doctor.getDoctorNum();

            doctorTable.addRow(row);
        }
    }
    
    public void populateHospName() {
        for (Hospital hospital : hosList.getHospital()) {
            txtUpdateHospName.addItem(hospital.getHosName());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpDoctorType = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewDoctors = new javax.swing.JTable();
        lblSearch = new javax.swing.JLabel();
        rdBtnDoctorName = new javax.swing.JRadioButton();
        rdBtnDepartment = new javax.swing.JRadioButton();
        rdBtnHospName = new javax.swing.JRadioButton();
        rdBtnHospComm = new javax.swing.JRadioButton();
        txtSearchField = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        panelUpdateDoctor = new javax.swing.JPanel();
        lblDocName = new javax.swing.JLabel();
        lblDepartmenr = new javax.swing.JLabel();
        lblHospName = new javax.swing.JLabel();
        lblHosComm = new javax.swing.JLabel();
        lblPhoneNum = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtUpdateDocName = new javax.swing.JTextField();
        txtUpdateDept = new javax.swing.JComboBox<>();
        txtUpdateHospName = new javax.swing.JComboBox<>();
        txtUpdateHospComm = new javax.swing.JTextField();
        txtUpdatePhoneNum = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 255, 204));

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 0, 153));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Doctor Panel!");

        tblViewDoctors.setBackground(new java.awt.Color(255, 0, 204));
        tblViewDoctors.setForeground(new java.awt.Color(0, 255, 204));
        tblViewDoctors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Doctor ID", "Doctor Name", "Department", "Hospital Name", "Hospital Branch", "Phone Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewDoctors);

        lblSearch.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblSearch.setForeground(new java.awt.Color(255, 0, 153));
        lblSearch.setText("Search: ");

        btnGrpDoctorType.add(rdBtnDoctorName);
        rdBtnDoctorName.setText("Doctor Name");
        rdBtnDoctorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnDoctorNameActionPerformed(evt);
            }
        });

        btnGrpDoctorType.add(rdBtnDepartment);
        rdBtnDepartment.setText("Department");
        rdBtnDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnDepartmentActionPerformed(evt);
            }
        });

        btnGrpDoctorType.add(rdBtnHospName);
        rdBtnHospName.setText("Hospital Name");
        rdBtnHospName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnHospNameActionPerformed(evt);
            }
        });

        btnGrpDoctorType.add(rdBtnHospComm);
        rdBtnHospComm.setText("Hospital Community");
        rdBtnHospComm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnHospCommActionPerformed(evt);
            }
        });

        txtSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchFieldActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(204, 255, 204));
        btnSearch.setForeground(new java.awt.Color(0, 204, 0));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        panelUpdateDoctor.setBackground(new java.awt.Color(255, 0, 204));

        lblDocName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblDocName.setForeground(new java.awt.Color(0, 255, 204));
        lblDocName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocName.setText("Doctor Name:");

        lblDepartmenr.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblDepartmenr.setForeground(new java.awt.Color(0, 255, 204));
        lblDepartmenr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDepartmenr.setText("Department:");

        lblHospName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblHospName.setForeground(new java.awt.Color(0, 255, 204));
        lblHospName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHospName.setText("Hospital Name:");

        lblHosComm.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblHosComm.setForeground(new java.awt.Color(0, 255, 204));
        lblHosComm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHosComm.setText("Hospital Community:");

        lblPhoneNum.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblPhoneNum.setForeground(new java.awt.Color(0, 255, 204));
        lblPhoneNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhoneNum.setText("Phone Number:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtUpdateDept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiology Department", "Gynecology  Depatment", "Pediatrician Department", "Dentistry" }));

        txtUpdateHospName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateHospNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelUpdateDoctorLayout = new javax.swing.GroupLayout(panelUpdateDoctor);
        panelUpdateDoctor.setLayout(panelUpdateDoctorLayout);
        panelUpdateDoctorLayout.setHorizontalGroup(
            panelUpdateDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUpdateDoctorLayout.createSequentialGroup()
                .addGroup(panelUpdateDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUpdateDoctorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelUpdateDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDocName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDepartmenr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHospName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHosComm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPhoneNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelUpdateDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUpdateDocName)
                            .addComponent(txtUpdatePhoneNum)
                            .addComponent(txtUpdateDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUpdateHospName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUpdateHospComm)))
                    .addGroup(panelUpdateDoctorLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnSave)))
                .addGap(25, 25, 25))
        );
        panelUpdateDoctorLayout.setVerticalGroup(
            panelUpdateDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUpdateDoctorLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelUpdateDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocName)
                    .addComponent(txtUpdateDocName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelUpdateDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepartmenr)
                    .addComponent(txtUpdateDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelUpdateDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHospName)
                    .addComponent(txtUpdateHospName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelUpdateDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHosComm)
                    .addComponent(txtUpdateHospComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelUpdateDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPhoneNum)
                    .addComponent(txtUpdatePhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addContainerGap())
        );

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblSearch)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdBtnHospComm)
                            .addComponent(rdBtnDoctorName)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdBtnHospName)
                                    .addComponent(rdBtnDepartment))
                                .addGap(18, 18, 18)
                                .addComponent(txtSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btnSearch)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addGap(89, 89, 89))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelUpdateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {rdBtnDepartment, rdBtnDoctorName, rdBtnHospComm, rdBtnHospName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearch)
                    .addComponent(rdBtnDoctorName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdBtnDepartment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdBtnHospName)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch))
                        .addGap(26, 26, 26)))
                .addComponent(rdBtnHospComm)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelUpdateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchFieldActionPerformed

    private void rdBtnDoctorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnDoctorNameActionPerformed
        // TODO add your handling code here:
        rdBtnDoctorName.setActionCommand("Doctor Name");
    }//GEN-LAST:event_rdBtnDoctorNameActionPerformed

    private void rdBtnDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnDepartmentActionPerformed
        // TODO add your handling code here:
        rdBtnDepartment.setActionCommand("Department");
    }//GEN-LAST:event_rdBtnDepartmentActionPerformed

    private void rdBtnHospNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnHospNameActionPerformed
        // TODO add your handling code here:
        rdBtnHospName.setActionCommand("Hospital Name");
    }//GEN-LAST:event_rdBtnHospNameActionPerformed

    private void rdBtnHospCommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnHospCommActionPerformed
        // TODO add your handling code here:
        rdBtnHospComm.setActionCommand("Hospital Community");
    }//GEN-LAST:event_rdBtnHospCommActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String searchText = txtSearchField.getText();
        ArrayList<Doctor> searchResult = new ArrayList<Doctor>();
        if(btnGrpDoctorType.getSelection().getActionCommand().equals("")) {
            JOptionPane.showMessageDialog(this, "Choose the type of Search");
        } else {
            if(searchText.equals("")) {
                JOptionPane.showMessageDialog(this, "Search Field Cannot Be Empty");
            } else if(btnGrpDoctorType.getSelection().getActionCommand().equals("Doctor Name")) {
                searchResult = doctorList.searchDocName(searchText);
                populateTableWithSearch(searchResult);
                
            } else if(btnGrpDoctorType.getSelection().getActionCommand().equals("Department")) {
                searchResult = doctorList.searchDocDept(searchText);
                populateTableWithSearch(searchResult);
                
            } else if(btnGrpDoctorType.getSelection().getActionCommand().equals("Hospital Name")) {
                searchResult = doctorList.searchDocHospName(searchText);
                populateTableWithSearch(searchResult);
                
            } else if(btnGrpDoctorType.getSelection().getActionCommand().equals("Hospital Community")) {
                searchResult = doctorList.searchDocComm(searchText);
                populateTableWithSearch(searchResult);
                
            } else {
                JOptionPane.showMessageDialog(this, "No Record Found!");
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int doctorInd = tblViewDoctors.getSelectedRow();

        if (doctorInd < 0) {
            //if there is no row selected then a dialog is displayed
            JOptionPane.showMessageDialog(this, "Select the Record to be Updated.");
            return;
        }

        DefaultTableModel doctorTable = (DefaultTableModel) tblViewDoctors.getModel();

        Doctor selectedDoctor = (Doctor) doctorTable.getValueAt(doctorInd, 1);

        txtUpdateDocName.setText(selectedDoctor.getDoctorName());
        txtUpdateDept.setSelectedItem(selectedDoctor.getDoctorDept());
        txtUpdateHospName.setSelectedItem(selectedDoctor.getDoctorHospName());
        txtUpdateHospComm.setText(selectedDoctor.getDoctorHospComm());
        txtUpdatePhoneNum.setText(String.valueOf(selectedDoctor.getDoctorNum()));
        doctorID = selectedDoctor.getDoctorID();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtUpdateHospNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateHospNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateHospNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String updatedDepartment = (String) txtUpdateDept.getSelectedItem();
        String updatedHosName = String.valueOf(txtUpdateHospName.getSelectedItem());
        int doctorInd = tblViewDoctors.getSelectedRow();

        if (doctorInd < 0) {
            //if there is no row selected then a dialog is displayed
            JOptionPane.showMessageDialog(this, "Select the Record to be Updated.");
            return;
        }
        
//        Doctor selectedDoctor = new Doctor();


        DefaultTableModel doctorTable = (DefaultTableModel) tblViewDoctors.getModel();

        Doctor selectedDoctor = (Doctor) doctorTable.getValueAt(doctorInd, 1);
        
        Doctor updatedDoctor = doctorList.updateDoctorDetails(selectedDoctor, doctorInd);
        
        updatedDoctor.setDoctorID(doctorID);
        updatedDoctor.setDoctorHospName(updatedHosName);
        updatedDoctor.setDoctorDept(updatedDepartment);
        updatedDoctor.setDoctorName(txtUpdateDocName.getText());
        updatedDoctor.setDoctorNum(Long.parseLong(txtUpdatePhoneNum.getText()));
        updatedDoctor.setDoctorHospComm(txtUpdateHospComm.getText());
        
        JOptionPane.showMessageDialog(this, "Updated Doctor Details");
        
        txtUpdateDocName.setText("");
        txtUpdatePhoneNum.setText("");
        txtUpdateHospComm.setText("");
        
        populateTable();
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.ButtonGroup btnGrpDoctorType;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDepartmenr;
    private javax.swing.JLabel lblDocName;
    private javax.swing.JLabel lblHosComm;
    private javax.swing.JLabel lblHospName;
    private javax.swing.JLabel lblPhoneNum;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelUpdateDoctor;
    private javax.swing.JRadioButton rdBtnDepartment;
    private javax.swing.JRadioButton rdBtnDoctorName;
    private javax.swing.JRadioButton rdBtnHospComm;
    private javax.swing.JRadioButton rdBtnHospName;
    private javax.swing.JTable tblViewDoctors;
    private javax.swing.JTextField txtSearchField;
    private javax.swing.JComboBox<String> txtUpdateDept;
    private javax.swing.JTextField txtUpdateDocName;
    private javax.swing.JTextField txtUpdateHospComm;
    private javax.swing.JComboBox<String> txtUpdateHospName;
    private javax.swing.JTextField txtUpdatePhoneNum;
    // End of variables declaration//GEN-END:variables
}
