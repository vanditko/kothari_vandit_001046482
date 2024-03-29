/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Orders.OrderDirectory;
import Business.Orders.Orders;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class EcoSystemTest {
    
    public EcoSystemTest() {
    }
    
 
    private EcoSystem ecoSystem;
    private DB4OUtil dB4OUtil;
    @Before
    public void setup() {
        dB4OUtil = DB4OUtil.getInstance();
        ecoSystem = dB4OUtil.retrieveSystem();
    }

    @Test
   // public void testCustomerLogin() {
        // testing code
     //   assertNotNull( ecoSystem.loginCustomer("kd@neu.edu","12345"));
       // assertNull( ecoSystem.loginCustomer("nousr","nopass"));
    //}

   // @Test
    public void testRestaurantLogin() {
        // testing code
        assertNotNull( ecoSystem.loginResaturant("w@neu.com","12345"));
        assertNull( ecoSystem.loginResaturant("nousr","nopass"));
        assertNotNull(ecoSystem.findRestaurant( "w@neu.com"));
    }

    @Test
    public void testFindRestaurant() {
        // testing code
        assertNull( ecoSystem.findRestaurant("IamNotArestaurent"));
        assertNotNull(ecoSystem.findRestaurant( "w@neu.com"));
    }
}
    

