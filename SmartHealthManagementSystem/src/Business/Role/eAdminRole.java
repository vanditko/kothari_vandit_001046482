/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecoe;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author dongyueli
 */
public class eAdminRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecoe ecoe) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, ecoe);
    }
    
}
