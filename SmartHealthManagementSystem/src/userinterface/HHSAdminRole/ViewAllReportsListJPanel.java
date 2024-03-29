/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HHSAdminRole;

import Business.Ecoe;
import Business.Enterprise.Enterprise;
import Business.Organization.HealthAndHumanServicesOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientDoctorWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sahil Sonawane
 */
public class ViewAllReportsListJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private HealthAndHumanServicesOrganization organization;
    private Ecoe ecoe;
    /**
     * Creates new form ViewAllReportsListJPanel
     */
    public ViewAllReportsListJPanel(JPanel userProcessContainer, UserAccount account, HealthAndHumanServicesOrganization organization, Enterprise enterprise, Ecoe ecoe) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.organization = (HealthAndHumanServicesOrganization)organization;
        this.enterprise = enterprise;
        this.ecoe = ecoe;
        populateTable();
    }
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) reportsListJTable.getModel();
        model.setRowCount(0);

        if (userAccount.getWorkQueue().getWorkRequestList() != null) {
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            if (request != null) {
                PatientDoctorWorkRequest patientDoctorWorkRequest = (PatientDoctorWorkRequest) request;
                    Object[] row = new Object[7];
                    patientDoctorWorkRequest.setDate();
                    row[0] = patientDoctorWorkRequest;
                    row[1] = patientDoctorWorkRequest.getSenderEnterprise();
                    row[2] = patientDoctorWorkRequest.getDoctor();
                    row[3] = patientDoctorWorkRequest.getpatientName();
                    row[4] = patientDoctorWorkRequest.getisisNormal();
                    row[5] = patientDoctorWorkRequest.getFtisNormal();
                    row[6] = patientDoctorWorkRequest.getstatGov() == null ? null : patientDoctorWorkRequest.getstatGov();
                    model.addRow(row);
                
            }
        }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        reportsListJTable = new javax.swing.JTable();
        assignToMeJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(182, 145, 145));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reportsListJTable.setBackground(new java.awt.Color(182, 145, 145));
        reportsListJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Timestamp", "Hospital", "Sender", "Patient", "Vital Signs", "Fitness", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(reportsListJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 770, 190));

        assignToMeJButton.setBackground(new java.awt.Color(0, 24, 91));
        assignToMeJButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        assignToMeJButton.setForeground(new java.awt.Color(255, 255, 255));
        assignToMeJButton.setText("Process");
        assignToMeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignToMeJButtonActionPerformed(evt);
            }
        });
        add(assignToMeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));

        backJButton.setBackground(new java.awt.Color(0, 24, 91));
        backJButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 24, 91));

        jLabel14.setBackground(new java.awt.Color(0, 51, 153));
        jLabel14.setFont(new java.awt.Font("Raanana", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("REPORTS");
        jPanel1.add(jLabel14);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 770, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void assignToMeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignToMeJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = reportsListJTable.getSelectedRow();        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "please select one row");
        }
        PatientDoctorWorkRequest patientDoctorWorkRequest = (PatientDoctorWorkRequest) reportsListJTable.getValueAt(selectedRow, 0);     
        patientDoctorWorkRequest.setstatGov("Complete");
        populateTable();
    }//GEN-LAST:event_assignToMeJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignToMeJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable reportsListJTable;
    // End of variables declaration//GEN-END:variables
}
