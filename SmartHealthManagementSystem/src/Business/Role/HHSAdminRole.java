/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecoe;
import Business.Enterprise.Enterprise;
import Business.Organization.HealthAndHumanServicesOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.HHSAdminRole.HHSAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author dongyueli
 */
public class HHSAdminRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecoe business) {
        return new HHSAdminWorkAreaJPanel(userProcessContainer, account, (HealthAndHumanServicesOrganization)organization, enterprise,business);
    }
}
