

package userinterface.AdminRole;


import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Business.Organization.Organization;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
/**
 *
 * @author  Sahil Sonawane
 */
    
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Timer timer;
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer) {
        initComponents();
        
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
        this.userProcessContainer = userProcessContainer;
      
        //valueLabel.setText();
    }
    
    Enterprise enterprise;
    UserAccount ua;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise,UserAccount ua) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.ua = ua;
        valueLabel.setText(enterprise.getName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageUserAccountJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        manageOrgJButton = new javax.swing.JButton();
        manageEmpJButton = new javax.swing.JButton();
        manageRegisterRequestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labAdmin = new javax.swing.JLabel();
        Labtime = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageUserAccountJButton.setBackground(new java.awt.Color(255, 204, 204));
        manageUserAccountJButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        manageUserAccountJButton.setText("Manage User Account");
        manageUserAccountJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserAccountJButtonActionPerformed(evt);
            }
        });
        add(manageUserAccountJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, -1, 30));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        valueLabel.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        manageOrgJButton.setBackground(new java.awt.Color(255, 204, 204));
        manageOrgJButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        manageOrgJButton.setText("Manage Organization");
        manageOrgJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrgJButtonActionPerformed(evt);
            }
        });
        add(manageOrgJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, 30));

        manageEmpJButton.setBackground(new java.awt.Color(255, 204, 204));
        manageEmpJButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        manageEmpJButton.setText("Manage Employee");
        manageEmpJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmpJButtonActionPerformed(evt);
            }
        });
        add(manageEmpJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, 30));

        manageRegisterRequestJButton.setBackground(new java.awt.Color(255, 204, 204));
        manageRegisterRequestJButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        manageRegisterRequestJButton.setText("Manage Register Request");
        manageRegisterRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRegisterRequestJButtonActionPerformed(evt);
            }
        });
        add(manageRegisterRequestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, 30));

        jLabel1.setFont(new java.awt.Font("Savoye LET", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Manage the requests");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, -1, -1));

        jLabel3.setFont(new java.awt.Font("Savoye LET", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Modify the user Account");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));

        jLabel4.setFont(new java.awt.Font("Savoye LET", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Modify the Employees");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 24, 91));

        labAdmin.setBackground(new java.awt.Color(0, 0, 153));
        labAdmin.setFont(new java.awt.Font("Raanana", 1, 36)); // NOI18N
        labAdmin.setForeground(new java.awt.Color(255, 255, 255));
        labAdmin.setText("   ADMIN WORK AREA");
        jPanel1.add(labAdmin);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 820, 50));

        Labtime.setBackground(new java.awt.Color(255, 255, 255));
        Labtime.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Labtime.setForeground(new java.awt.Color(0, 24, 91));
        add(Labtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 190, 40));

        jLabel5.setFont(new java.awt.Font("Savoye LET", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Modify the organization ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageUserAccountJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserAccountJButtonActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageUserAccountJButtonActionPerformed

    private void manageOrgJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrgJButtonActionPerformed
        // TODO add your handling code here:
        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory(),enterprise);
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrgJButtonActionPerformed

    private void manageEmpJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmpJButtonActionPerformed
        // TODO add your handling code here:
        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmpJButtonActionPerformed

    private void manageRegisterRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRegisterRequestJButtonActionPerformed
        // TODO add your handling code here:
        ManageRegisterRequestJPanel manageRegisterRequestJPanel=new ManageRegisterRequestJPanel(userProcessContainer,ua);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageRegisterRequestJPanel",manageRegisterRequestJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageRegisterRequestJButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Labtime;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labAdmin;
    private javax.swing.JButton manageEmpJButton;
    private javax.swing.JButton manageOrgJButton;
    private javax.swing.JButton manageRegisterRequestJButton;
    private javax.swing.JButton manageUserAccountJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
