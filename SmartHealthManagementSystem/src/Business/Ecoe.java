/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.eAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Aki
 */
public class Ecoe  extends Organization{
    private static Ecoe ecoe;
    private ArrayList<Network> networkList;
    
    public static Ecoe getInstance(){
        if(ecoe == null){
            ecoe = new Ecoe();
        }
          return ecoe;
    }
    private Ecoe(){
        super(null);
        networkList  = new ArrayList<>();
    }

    public static Ecoe getBusiness() {     //////////////
        return ecoe;
    }


    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

  
    public Network createAndAddNetwork(){
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {        //现在去了s
        ArrayList <Role> roleList = new ArrayList<>();
        roleList.add(new eAdminRole());
        return roleList;
    }
    
    
}


