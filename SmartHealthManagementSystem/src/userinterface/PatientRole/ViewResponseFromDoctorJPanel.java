/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import Business.Ecoe;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientDoctorWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Sahil Sonawane
 */
public class ViewResponseFromDoctorJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;    
    private Ecoe ecoe;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PatientOrganization patientOrganization;
    private PatientDoctorWorkRequest patientDoctorWorkRequest;
    /**
     * Creates new form VitalSignsResponseFromDoctorJPanel
     */
    public ViewResponseFromDoctorJPanel(JPanel userProcessContainer, UserAccount userAccount, PatientDoctorWorkRequest patientDoctorWorkRequest, Enterprise enterprise, Ecoe ecoe) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoe = ecoe;
        this.userAccount = userAccount;
        this.patientOrganization = (PatientOrganization)patientOrganization;
        this.enterprise = enterprise;
        this.patientDoctorWorkRequest = patientDoctorWorkRequest;
        
        
        Network targetNetwork = null;
        for (Network network : ecoe.getNetworkList()) {
            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (e == enterprise) {
                    targetNetwork = network;
                    break;
                }
            }
        }
        
        Organization org = null;
        for (Enterprise e : targetNetwork.getEnterpriseDirectory().getEnterpriseList()) {        
            if (e instanceof HospitalEnterprise) {
                HospitalEnterprise emfe =(HospitalEnterprise)e;
                for(Organization o:emfe.getOrganizationDirectory().getOrganizationList()){
                    if(o instanceof DoctorOrganization){
                        org=o;
                        break;
                    }
                }
            }
        }
       
        
        if (org != null) {
            for (WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList()){
            if(wr instanceof PatientDoctorWorkRequest){
                patientDoctorWorkRequest=(PatientDoctorWorkRequest)wr;
                break;
            }
        }
        }
        
        populateDetails();
        
        
        
        

        

    }
    
    private void populateDetails() {
        respondJTextArea.setText(patientDoctorWorkRequest.getDoctorResponseMessage());
        

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
        respondJTextArea = new javax.swing.JTextArea();
        backJButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(167, 221, 214));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        respondJTextArea.setColumns(20);
        respondJTextArea.setRows(5);
        jScrollPane1.setViewportView(respondJTextArea);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 140, 320, 150));

        backJButton.setBackground(new java.awt.Color(0, 24, 91));
        backJButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, 40));

        jPanel1.setBackground(new java.awt.Color(0, 24, 91));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 33)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("RESPONSE FROM DOCTOR");
        jPanel1.add(jLabel11);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 590, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea respondJTextArea;
    // End of variables declaration//GEN-END:variables
}
