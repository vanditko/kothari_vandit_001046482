/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecoe;
import Business.Enterprise.Enterprise;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.LabAssistant.LabAssistantWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author dongyueli
 */
public class LabAssistantRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecoe business) {
        return new LabAssistantWorkAreaJPanel(userProcessContainer, account, (LabOrganization)organization, enterprise);
    }
}
