/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Analytic;
import Model.Encounter;
import Model.MedSystem;
import Model.Patient;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harshaljaiswal
 */
public class Analytics extends javax.swing.JPanel {

    /**
     * Creates new form Analytics
     */
    HashMap<String, Integer> ageGroup;
    MedSystem ms;
    ArrayList<Analytic> ana;

    public Analytics(MedSystem ms) {
        initComponents();
        this.ms = ms;

        ana = new ArrayList<>();

        for (Patient pat : ms.getPatientList().getPatients()) {
            for (Encounter enc : pat.getEncounterHistory().getEncounterHistory()) {
                int bp = enc.getVitalSign().getBloodPressure();
                Period period = Period.between(pat.getDob().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), LocalDate.now());
                System.out.println("sdf " + isAbnormal(period.getYears(), bp));

                int age = period.getYears();
                int index = isInArray(pat.getResidence().getCommunity().getCommunity());
                if (age < 21) {
                    if (!isAbnormal(period.getYears(), bp)) {
                        if (index < 0) {
                            Analytic analytic = new Analytic(pat.getResidence().getCommunity().getCommunity(), 0);
                            ana.add(analytic);
                        } else {
                            int res = ana.get(index).arr[0];
                            ana.get(index).addAgeAnalytics(0, ++res);
                        }
                    }

                } else if (age < 46) {
                    if (!isAbnormal(period.getYears(), bp)) {
                        if (index < 0) {
                            Analytic analytic = new Analytic(pat.getResidence().getCommunity().getCommunity(), 1);
                            ana.add(analytic);
                        } else {
                            int res = ana.get(index).arr[1];
                            ana.get(index).addAgeAnalytics(1, ++res);
                        }
                    }

                } else if (age < 65) {
                    if (!isAbnormal(period.getYears(), bp)) {

                        if (index < 0) {
                            Analytic analytic = new Analytic(pat.getResidence().getCommunity().getCommunity(), 2);
                            ana.add(analytic);
                        } else {
                            int res = ana.get(index).arr[2];
                            ana.get(index).addAgeAnalytics(2, ++res);
                        }

                    }
                } else {
                    if (!isAbnormal(period.getYears(), bp)) {

                        if (index < 0) {
                            Analytic analytic = new Analytic(pat.getResidence().getCommunity().getCommunity(), 3);
                            ana.add(analytic);
                        } else {
                            int res = ana.get(index).arr[3];
                            ana.get(index).addAgeAnalytics(3, ++res);
                        }
                    }
                }
            }
        }
        displayPatient();

//        int i = 0;
//        String legend = null;
//        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//
////                for(Object vs : ana.toArray()){
////                    if(vs.getState().equalsIgnoreCase("ABNORMAL"))   
////                        legend=vs.getTimestamp().concat(" (" +vs.getState()+")");
////                    else
////                        legend=vs.getTimestamp();
////                    dataset.addValue(, legend, "Respiratory Rate");
//        dataset.setValue(4, ana.get(i).Community, "below 21");
//        dataset.setValue(5, ana.get(i).Community, "21-46");
//        dataset.setValue(6, ana.get(i).Community, "46-65");
//        dataset.setValue(3, ana.get(i).Community, "65+");
//        i++;
//
////                }
//        JFreeChart chart = ChartFactory.createBarChart3D("Vital Signs", "Vital Signs", "Values", dataset, PlotOrientation.VERTICAL, true, true, true);
//        CategoryPlot P = chart.getCategoryPlot();
//        P.setRangeGridlinePaint(Color.BLACK);
//
//        ChartFrame frame = new ChartFrame("Bar Charts", chart);
//        frame.setVisible(true);
//        frame.setSize(650, 550);

    }

    public int isInArray(String comm) {
        int i = 0;
        for (Analytic anc : ana) {

            if (anc.getCommunity().equals(comm)) {
                return i;
            }

            i++;
        }
        return -1;
    }

    public boolean isAbnormal(int age, int val) {
        System.out.println("jkdsf" + age + " " + val);

        if (age < 21) {
            if (val >= 109 && val <= 121) {
                return true;
            } else {
                return false;
            }
        } else if (age < 46) {
            if (val >= 115 && val <= 125) {
                return true;
            } else {
                return false;
            }
        } else if (age < 65) {
            if (val >= 118 && val <= 129) {
                return true;
            } else {
                return false;
            }
        } else {
            if (val >= 130 && val <= 143) {
                return true;
            } else {
                return false;
            }
        }

    }

    private void displayPatient() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        int i = 0;
        for (Object key : ana.toArray()) {

            Object[] row = new Object[5];
            row[0] = ana.get(i).Community;
            row[1] = ana.get(i).arr[0];
            row[2] = ana.get(i).arr[1];
            row[3] = ana.get(i).arr[2];
            row[4] = ana.get(i).arr[3];
//            row[1] = set.get(key).get(0);
//            row[2] = set.get(key).get(1);
//            row[3] = set.get(key).get(2);
//            row[4] = set.get(key).get(3);

            i++;
            model.addRow(row);
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Community", "below 21", "21-46", "46-65", "65+"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Abnormal BP Analytics");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1)))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(341, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
