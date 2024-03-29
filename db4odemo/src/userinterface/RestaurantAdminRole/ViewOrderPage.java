/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.RestaurantAdminRole;

import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Orders.Orders;
import Business.Restaurant.Restaurant;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VanditKothari
 */
public class ViewOrderPage extends javax.swing.JPanel {

    /**
     * Creates new form ViewOrderPage
     */
    EcoSystem e;
    DB4OUtil dB4OUtil;
    Restaurant restaurant;

    public ViewOrderPage(EcoSystem e, DB4OUtil dB4OUtil, Restaurant r) {
        initComponents();
        this.e = e;
        this.dB4OUtil = dB4OUtil;
        this.restaurant = r;
        populateTable();
        populateTableDelivery();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("View Order");

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item", "price", "customer", "delivery"
            }
        ));
        jScrollPane1.setViewportView(tb1);

        jButton1.setText("Add Delivery Man");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tb2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "userName"
            }
        ));
        jScrollPane2.setViewportView(tb2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap(326, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        int selectedRow = tb1.getSelectedRow();
        int selectedDelivery = tb2.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a order");
            return;
        }
        if (selectedDelivery < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a delivery man");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        DefaultTableModel modelDelivery = (DefaultTableModel) tb2.getModel();
        System.out.println("column count " + selectedRow);
        int columnCount = selectedRow;
        int i = 0;
        for (Orders c : e.getOrderDirectory().getOrderList()) {
            if (c.getRestaurantName().equals(restaurant.getName())) {
                if (i == columnCount) {
                    c.setDeliveryMan(modelDelivery.getValueAt(selectedDelivery, 1).toString());
                    break;
                }
                i++;
            }

        }

        dB4OUtil.storeSystem(e);
        populateTable();
        populateTableDelivery();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tb1;
    private javax.swing.JTable tb2;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        model.setRowCount(0);

        for (Orders c : e.getOrderDirectory().getOrderList()) {
            if (c.getRestaurantName().equals(restaurant.getName())) {
                Object[] row = new Object[5];

                row[0] = c.getItem();
                row[1] = c.getPrice();
                row[2] = c.getUserName();
                row[3] = c.getDeliveryMan();
                model.addRow(row);
            }

        }

    }

    private void populateTableDelivery() {
        DefaultTableModel model = (DefaultTableModel) tb2.getModel();
        model.setRowCount(0);

        for (DeliveryMan c : e.getDeliveryManDirectory().getDeliveryMans()) {

            Object[] row = new Object[4];
            row[0] = c.getName();
            row[1] = c.getUsername();

            model.addRow(row);
        }

    }
}
