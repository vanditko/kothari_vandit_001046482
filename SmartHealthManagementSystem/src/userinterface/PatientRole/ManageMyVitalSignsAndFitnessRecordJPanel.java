/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import Business.Ecoe;
import Business.Enterprise.Enterprise;
import Business.Enterprise.GovernmentEnterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.HealthAndHumanServicesOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Patient.Patient;
import Business.Patient.PatientDirectory;
import Business.Patient.Record;
import Business.Patient.RecordHistory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientDoctorWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Sahil Sonawane
 */
public class ManageMyVitalSignsAndFitnessRecordJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;    
    private Ecoe ecoe;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PatientOrganization patientOrganization;
    private Patient patient;
    private RecordHistory recordHistory;
    //private PatientDirectory patientDirectory;
    /**
     * Creates new form ManageMyVitalSignsJPanel
     */
    public ManageMyVitalSignsAndFitnessRecordJPanel(JPanel userProcessContainer,UserAccount userAccount, PatientOrganization patientOrganization, Enterprise enterprise,Ecoe ecoe) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoe = ecoe;
        this.userAccount = userAccount;
        this.patientOrganization = (PatientOrganization)patientOrganization;
        this.enterprise = enterprise;
        this.patient=userAccount.getPatient();
        this.recordHistory = patient.getRecordHistory();
        
        //this.patientDirectory = patientDirectory;
        populateTable();
    }
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) viewVitalSignsJTable1.getModel();
        model.setRowCount(0);

        DoctorOrganization doctorOrganization=null;
        for(Organization o :enterprise.getOrganizationDirectory().getOrganizationList()){
                        if(o instanceof DoctorOrganization){
                            DoctorOrganization dO =(DoctorOrganization)o;
                            doctorOrganization = dO;
                            break;
                        }
        }

       

        for (WorkRequest request : doctorOrganization.getWorkQueue().getWorkRequestList()) {
            if (request != null) {
                PatientDoctorWorkRequest patientDoctorWorkRequest = (PatientDoctorWorkRequest) request;
                Record r = patientDoctorWorkRequest.getRecord();
                    Object[] row = new Object[5];                  
                    row[0] = r;
                    row[1] = r.getisNormal();
                    row[2] = r.gettotTime();
                    row[3] = r.getneedsToWorkout();
                    String respondStatus = patientDoctorWorkRequest.getRespondStatus();
row[4] = respondStatus == null ? "Waiting" : respondStatus;
                    model.addRow(row);
                
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

        addJButton = new javax.swing.JButton();
        viewJButton = new javax.swing.JButton();
        editJButton = new javax.swing.JButton();
        deleteJButton = new javax.swing.JButton();
        showVitalSignsChartJButton = new javax.swing.JButton();
        viewResponseJButton = new javax.swing.JButton();
        sendToMyDoctorJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        viewVitalSignsJTable1 = new javax.swing.JTable();
        showFitnessChartJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(167, 221, 214));

        addJButton.setBackground(new java.awt.Color(167, 221, 214));
        addJButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        addJButton.setText("Add Record");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        viewJButton.setBackground(new java.awt.Color(167, 221, 214));
        viewJButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        viewJButton.setText("View Details");
        viewJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewJButtonActionPerformed(evt);
            }
        });

        editJButton.setBackground(new java.awt.Color(167, 221, 214));
        editJButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        editJButton.setText("Edit Record");

        deleteJButton.setBackground(new java.awt.Color(167, 221, 214));
        deleteJButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        deleteJButton.setText("Delete Record");

        showVitalSignsChartJButton.setBackground(new java.awt.Color(167, 221, 214));
        showVitalSignsChartJButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        showVitalSignsChartJButton.setText("Show VItal Signs Chart");
        showVitalSignsChartJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showVitalSignsChartJButtonActionPerformed(evt);
            }
        });

        viewResponseJButton.setBackground(new java.awt.Color(167, 221, 214));
        viewResponseJButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        viewResponseJButton.setText("View Response");
        viewResponseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewResponseJButtonActionPerformed(evt);
            }
        });

        sendToMyDoctorJButton.setBackground(new java.awt.Color(167, 221, 214));
        sendToMyDoctorJButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        sendToMyDoctorJButton.setText("Send To My Doctor");
        sendToMyDoctorJButton.setMaximumSize(new java.awt.Dimension(131, 29));
        sendToMyDoctorJButton.setMinimumSize(new java.awt.Dimension(131, 29));
        sendToMyDoctorJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToMyDoctorJButtonActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(0, 24, 91));
        backJButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        viewVitalSignsJTable1.setBackground(new java.awt.Color(167, 221, 214));
        viewVitalSignsJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Timestamp", "Vital Signs", "Fitness Total Time(mins)", "Fitness", "Respond"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(viewVitalSignsJTable1);
        if (viewVitalSignsJTable1.getColumnModel().getColumnCount() > 0) {
            viewVitalSignsJTable1.getColumnModel().getColumn(0).setResizable(false);
            viewVitalSignsJTable1.getColumnModel().getColumn(1).setResizable(false);
            viewVitalSignsJTable1.getColumnModel().getColumn(2).setResizable(false);
            viewVitalSignsJTable1.getColumnModel().getColumn(3).setResizable(false);
            viewVitalSignsJTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        showFitnessChartJButton.setBackground(new java.awt.Color(167, 221, 214));
        showFitnessChartJButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        showFitnessChartJButton.setText("Show Fitness Chart");
        showFitnessChartJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showFitnessChartJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setBackground(new java.awt.Color(167, 221, 214));
        refreshJButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 24, 91));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 33)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("MANAGE VITAL SIGNS AND FITNESS RECORD");
        jPanel1.add(jLabel11);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(editJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(viewJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(deleteJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(showVitalSignsChartJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(showFitnessChartJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(viewResponseJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(sendToMyDoctorJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(refreshJButton)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addJButton)
                    .addComponent(editJButton)
                    .addComponent(deleteJButton)
                    .addComponent(viewJButton))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewResponseJButton)
                    .addComponent(showFitnessChartJButton)
                    .addComponent(showVitalSignsChartJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendToMyDoctorJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshJButton))
                .addGap(75, 75, 75)
                .addComponent(backJButton)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void showVitalSignsChartJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showVitalSignsChartJButtonActionPerformed
        // TODO add your handling code here:
        ArrayList<Record> recordList = patient.getRecordHistory().getRecordList();
        /*At least 2 vital sign records needed to show chart */
        if (recordList.isEmpty() || recordList.size() == 1) {
            JOptionPane.showMessageDialog(this, "No Vital Signs or only one Vital Sign found. At least 2 Vital Signs records needed to show chart!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        VitalSignsChartJPanel panel = new VitalSignsChartJPanel(userProcessContainer,userAccount,patientOrganization,enterprise,ecoe);
        userProcessContainer.add("VitalSignsChartJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_showVitalSignsChartJButtonActionPerformed

    private void showFitnessChartJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showFitnessChartJButtonActionPerformed
        // TODO add your handling code here:
        createChart();
    }//GEN-LAST:event_showFitnessChartJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void viewJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewVitalSignsJTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first to view detail", "Warning", JOptionPane.WARNING_MESSAGE);

        }else{
            
            Record vs = (Record) viewVitalSignsJTable1.getValueAt(selectedRow, 0);
            ViewUpdateRecordDetailsJPanel panel = new ViewUpdateRecordDetailsJPanel(userProcessContainer,userAccount,patientOrganization,enterprise,ecoe,vs);
            userProcessContainer.add("ViewUpdateRecordDetailsJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            
            
        }
        
    
    }//GEN-LAST:event_viewJButtonActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        // TODO add your handling code here:
        AddRecordJPanel panel = new AddRecordJPanel(userProcessContainer,userAccount,patientOrganization,enterprise,ecoe);
        userProcessContainer.add("AddRecordJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_addJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void sendToMyDoctorJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToMyDoctorJButtonActionPerformed
//         TODO add your handling code here:
        int selectedRow = viewVitalSignsJTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first to view detail", "Warning", JOptionPane.WARNING_MESSAGE);

        }else{

            UserAccount doctor = (UserAccount) patient.getMydoctor();
            PatientDoctorWorkRequest request = new PatientDoctorWorkRequest();
            request.setDoctor(doctor);
            request.setpatientName(userAccount.getName());
            request.setDate();
            request.setisisNormal("Abnormal");
            request.setFtisNormal("Need More Excercise");
            
            Organization org = null;
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof DoctorOrganization) {
                    org = organization;
                    break;
                }
            }

            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(request);
                userAccount.getWorkQueue().getWorkRequestList().add(request);
                doctor.getWorkQueue().getWorkRequestList().add(request);
                JOptionPane.showMessageDialog(null, "Success! ");
            }
            
        }
    }//GEN-LAST:event_sendToMyDoctorJButtonActionPerformed

    private void createChart()
    {
        DefaultCategoryDataset vitalSignDataset=new DefaultCategoryDataset();
        int selectedRow = viewVitalSignsJTable1.getSelectedRow();
        ArrayList<Record> recordList = patient.getRecordHistory().getRecordList();
        /*At least 2 vital sign records needed to show chart */
        if (recordList.isEmpty() || recordList.size() == 1) {
            JOptionPane.showMessageDialog(this, "No Fitness Record or only one fitness record found. At least 2 fitness records needed to show chart!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (Record record : recordList) {
            vitalSignDataset.addValue(record.getStandTime(),"StandTime", record.getDate());
            vitalSignDataset.addValue(record.getmovementClock(),"movementClock", record.getDate());
            vitalSignDataset.addValue(record.getworkoutTime(),"workoutTime", record.getDate());
            vitalSignDataset.addValue(record.getTotalTime(),"TotalTime", record.getDate());
           // vitalSignDataset.addValue(record.gettotTime(),"totTime", record.getDate());
        }
        
        JFreeChart vitalSignChart= ChartFactory.createBarChart3D("Fitness Record Chart", "Time Stamp", "Time(mins)", vitalSignDataset, PlotOrientation.VERTICAL, true, false, false);
        vitalSignChart.setBackgroundPaint(Color.white);
        CategoryPlot vitalSignChartPlot = vitalSignChart.getCategoryPlot();
        vitalSignChartPlot.setBackgroundPaint(Color.lightGray);    
        
        CategoryAxis vitalSignDomainAxis = vitalSignChartPlot.getDomainAxis();
        vitalSignDomainAxis.setCategoryLabelPositions(
            CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0)
        );
        
        NumberAxis vitalSignRangeAxis = (NumberAxis) vitalSignChartPlot.getRangeAxis();
        vitalSignRangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        
        ChartFrame chartFrame = new ChartFrame("Chart", vitalSignChart);
        chartFrame.setVisible(true);
        chartFrame.setSize(500, 500);
    }
    private void viewResponseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewResponseJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewResponseJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JButton editJButton;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton sendToMyDoctorJButton;
    private javax.swing.JButton showFitnessChartJButton;
    private javax.swing.JButton showVitalSignsChartJButton;
    private javax.swing.JButton viewJButton;
    private javax.swing.JButton viewResponseJButton;
    private javax.swing.JTable viewVitalSignsJTable1;
    // End of variables declaration//GEN-END:variables
}