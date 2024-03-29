/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerServiceRole;

import Business.Ecoe;
import Business.Enterprise.Enterprise;
import Business.Organization.CustomerServiceOrganization;
import Business.Organization.PatientOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FeedbackWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mitishah
 */
public class CustomerServiceWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerServiceWorkAreaJPanel
     */
    Timer timer;
    public CustomerServiceWorkAreaJPanel() {
        initComponents();
//                String d = Calendar.getInstance().getTime().toString();
//        String e = java.time.LocalTime.now().toString();
//        Labdate.setText(d);
        
        ActionListener actionlistener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             Date date = new Date();
        DateFormat timeformat = new SimpleDateFormat("HH:mm:ss");
        String time = timeformat.format(date);
        Labtime.setText(time);   
            }
        };
        
        timer = new Timer(1000, actionlistener);
        timer.setInitialDelay(0);
        timer.start();
    }
     private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private CustomerServiceOrganization organization;
    private PatientOrganization patientOrganization;
    private Ecoe ecoe;
    
    /**
     * Creates new form CustomerServiceWorkAreaJPanel
     */
    public CustomerServiceWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, CustomerServiceOrganization organization, Enterprise enterprise, Ecoe ecoe) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = (CustomerServiceOrganization)organization;
        this.enterprise = enterprise;
        this.ecoe = ecoe;
        
        populateTable();
        
    }
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) viewFeedbackFromEquipmentManufactureJTable.getModel();

        model.setRowCount(0);
        if (userAccount.getWorkQueue().getWorkRequestList() != null) {
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            if (request != null) {
                FeedbackWorkRequest feedbackWorkRequest = (FeedbackWorkRequest) request;
                
                    Object[] row = new Object[4];
                    
                    row[0] = feedbackWorkRequest;
                    row[1] = feedbackWorkRequest.getSender().getPatient().getpatientName();
                    row[2] = feedbackWorkRequest.getReceiver() == null ? null : feedbackWorkRequest.getReceiver().getName();
                    row[3] = feedbackWorkRequest.getStatus();

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

        jScrollPane2 = new javax.swing.JScrollPane();
        viewFeedbackFromEquipmentManufactureJTable = new javax.swing.JTable();
        viewDetailsJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Labtime = new javax.swing.JLabel();

        setBackground(new java.awt.Color(228, 204, 243));

        viewFeedbackFromEquipmentManufactureJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Timestamp", "Sender", "Receiver", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(viewFeedbackFromEquipmentManufactureJTable);

        viewDetailsJButton.setBackground(new java.awt.Color(0, 24, 91));
        viewDetailsJButton.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        viewDetailsJButton.setForeground(new java.awt.Color(255, 255, 255));
        viewDetailsJButton.setText("View Detatils");
        viewDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsJButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 24, 91));
        jButton1.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Process");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 24, 91));
        jButton2.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Assign To Me");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 24, 91));

        jLabel13.setBackground(new java.awt.Color(0, 51, 153));
        jLabel13.setFont(new java.awt.Font("Raanana", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CUSTOMER SERVICES");
        jPanel1.add(jLabel13);

        Labtime.setBackground(new java.awt.Color(228, 204, 243));
        Labtime.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Labtime.setForeground(new java.awt.Color(0, 24, 91));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jButton2)
                        .addGap(60, 60, 60)
                        .addComponent(viewDetailsJButton)
                        .addGap(48, 48, 48)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Labtime, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Labtime, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(viewDetailsJButton)
                    .addComponent(jButton2))
                .addContainerGap(201, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewFeedbackFromEquipmentManufactureJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.");
        }else{
            FeedbackWorkRequest request = (FeedbackWorkRequest) viewFeedbackFromEquipmentManufactureJTable.getValueAt(selectedRow, 0);
            //Patient patient =(Patient) viewFeedbackFromEquipmentManufactureJTable.getValueAt(selectedRow, 0);
            ViewFeedbackDetailsJPanel vfdj = new ViewFeedbackDetailsJPanel(userProcessContainer, userAccount, request, enterprise,ecoe);
            userProcessContainer.add("ViewFeedbackDetailsJPanel", vfdj);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

    }//GEN-LAST:event_viewDetailsJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewFeedbackFromEquipmentManufactureJTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "please select one row");
        }
        WorkRequest request = (WorkRequest) viewFeedbackFromEquipmentManufactureJTable.getValueAt(selectedRow, 0);
        request.setStatus("Finish");
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewFeedbackFromEquipmentManufactureJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "please select one row");
        }else{
            FeedbackWorkRequest request = (FeedbackWorkRequest) viewFeedbackFromEquipmentManufactureJTable.getValueAt(selectedRow, 0);
            request.setReceiver(userAccount);
            request.setStatus("Pending");
            populateTable();
            JOptionPane.showMessageDialog(null, "Success");

        }

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Labtime;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton viewDetailsJButton;
    private javax.swing.JTable viewFeedbackFromEquipmentManufactureJTable;
    // End of variables declaration//GEN-END:variables
}
