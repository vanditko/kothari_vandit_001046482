/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.UberCatalog;
import javax.swing.JPanel;
import Business.Uber;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class ManuJPanel extends javax.swing.JPanel {
    private JPanel rightJPanel;
    private UberCatalog uberCatalog;

    /**
     * Creates new form ManuJPanel
     */
    

    ManuJPanel(JPanel rightJPanel, UberCatalog uberCatalog) {
        initComponents();
        this.rightJPanel = rightJPanel;
        this.uberCatalog = uberCatalog;
        populateTable();//To change body of generated methods, choose Tools | Templates.
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblManu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        tblManu.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        tblManu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MANUFACTURERS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblManu);
        if (tblManu.getColumnModel().getColumnCount() > 0) {
            tblManu.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("MANUFACTURERS LIST");

        btnBack4.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        btnBack4.setText("< Back");
        btnBack4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(286, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(346, 346, 346))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack4ActionPerformed
        // TODO add your handling code here:
        rightJPanel.remove(this);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.previous(rightJPanel);
    }//GEN-LAST:event_btnBack4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblManu;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        //To change body of generated methods, choose Tools | Templates.
        DefaultTableModel dtm = (DefaultTableModel) tblManu.getModel();
            dtm.setRowCount(0);
             ArrayList<String> brands = new ArrayList <String>();
            for (Uber uber : uberCatalog.getUberList()){
                Object[] row = new Object [1];
     
            if (brands.contains(uber.getBrand()))
            {
                
            }
            else 
            {
            row [0] = uber.getBrand();
            dtm.addRow(row);
            brands.add(uber.getBrand());
            }
            }
    }
}
