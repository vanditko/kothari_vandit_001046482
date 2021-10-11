
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
//import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author hp
 */
public class UberCatalog {
    private ArrayList<Uber> uberList;
    private ArrayList<Uber> templist;
    
    //private Timestamp lastUpdated;  
    
    public UberCatalog(){
        this.uberList = new ArrayList<Uber>();
        
        
        Uber uber1 = new Uber  ("BMW", 2015, 2, 5, 1, "B1", "JP", true, false);
        Uber uber2 = new Uber  ("TESLA", 2016, 1, 4, 2, "TE1", "BOSTON", true, true);
        Uber uber3 = new Uber  ("AUDI", 2017, 2, 6, 3, "A1", "NEW YORK", false, false);
        Uber uber4 = new Uber  ("TOYOTA", 2014, 3, 5, 4, "TO1", "ARLINGTON", false, true);
        Uber uber5 = new Uber  ("TATA", 2018, 2, 6, 5, "TA1", "WORCESTER", true, true);
        Uber uber6 = new Uber  ("SUZUKI", 2012, 2, 7, 6, "SU1", "PUNE", false, false);
        Uber uber7 = new Uber  ("MAHINDRA", 2011, 2, 8, 7, "MA1", "MUMBAI", true, false);
        Uber uber8 = new Uber  ("MAHINDRA", 2011, 2, 5, 8, "MA2", "MUMBAI", true, true);
        Uber uber9 = new Uber  ("IMPALA", 2014, 1, 4, 9, "IM1", "DALLAS", true, false);
        Uber uber10 = new Uber ("TESLA", 2011, 2, 5, 10, "TE2", "MUMBAI", true, true);
        Uber uber11 = new Uber ("MAXX", 2011, 2, 6, 11, "MX1", "MUMBAI", true, false);
        Uber uber12 = new Uber ("BMW", 2011, 2, 7, 12, "MB2", "MUMBAI", false, false);
        Uber uber13 = new Uber ("AUDI", 2012, 2, 4, 13, "A1", "MUMBAI", false, true);
        Uber uber14 = new Uber ("BMW", 2014, 2, 9, 14, "B1", "MUMBAI", true, false);
        Uber uber15 = new Uber ("TATA", 2016, 2, 5, 15, "TA1", "MUMBAI", true, false);
        
        
        uberList.add(uber1);
        uberList.add(uber2);
        uberList.add(uber3);
        uberList.add(uber4);
        uberList.add(uber5);
        uberList.add(uber6);
        uberList.add(uber7);
        uberList.add(uber8);
        uberList.add(uber9);
        uberList.add(uber10);
        uberList.add(uber11);
        uberList.add(uber12);
        uberList.add(uber13);
        uberList.add(uber14);
        uberList.add(uber15);
        
       /* Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        this.lastUpdated = timestamp ;
    }

    public Timestamp getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
        */
    }

    public ArrayList<Uber> getUberList() {
        return uberList;
    }

    public void setUberList(ArrayList<Uber> uberList) {
        this.uberList = uberList;
    }
    
    public Uber addUber()
    {
        Uber uber = new Uber();
        uberList.add(uber);
        return uber;
    }
    
    public void deleteUber (Uber uber)
    {
        uberList.remove(uber);
    }
    public ArrayList<Uber>searchBrand (String brandName ){
        templist = new ArrayList<Uber>();
        for(Uber uber : uberList){
            if (uber.getBrand().equalsIgnoreCase(brandName)){
                templist.add(uber);
            }
        }
        return templist;
        
    }
    
    public ArrayList<Uber>searchBrand1 (String brandName1, ArrayList<Uber> result ){
        templist = new ArrayList<Uber>();
        for(Uber uber : result){
            if (uber.getBrand().equalsIgnoreCase(brandName1)){
                templist.add(uber);
            }
        }
        return templist;
        
    }
    

     public ArrayList<Uber>searchManuYear (String manuYear, ArrayList<Uber> result){
        templist = new ArrayList<Uber>();
        for(Uber uber : result){
            if (uber.getManufacturedYear()== Integer.parseInt(manuYear))
                    {
                templist.add(uber);
            }
        }
        return templist;
    }
     public ArrayList<Uber>searchSeatsAvail (int minSeats, int maxSeats, ArrayList<Uber> result){
        templist = new ArrayList<Uber>();
       
        for (Uber uber : result) {
           if (minSeats <= uber.getMinSeats() && maxSeats >= uber.getMaxSeats())
           {
               templist.add(uber);
           }
       
       }
        return templist;
    }
     
    

      public ArrayList<Uber>searchSerialNumber (String serialNumber, ArrayList<Uber> result){
        templist = new ArrayList<Uber>();
        for(Uber uber : result){
            if (uber.getSerialNumber()== Integer.parseInt(serialNumber))
                    {
                templist.add(uber);
            }
        }
        return templist;
    }
      public ArrayList<Uber>searchModelNumber (String modelNumber, ArrayList<Uber> result){
        templist = new ArrayList<Uber>();
        for(Uber uber : result){
            if (uber.getModelNumber().equalsIgnoreCase(modelNumber)){
                templist.add(uber);
            }
        }
        return templist;
    }
      public ArrayList<Uber>searchAvailCity (String availCity, ArrayList<Uber> result){
        templist = new ArrayList<Uber>();
        for(Uber uber : result){
            if (uber.getAvailableCity().equalsIgnoreCase(availCity)){
                templist.add(uber);
            }
        }
        return templist;
    }
      public ArrayList<Uber>searchAvailStatus (String availStatus, ArrayList<Uber> result){
        templist = new ArrayList<Uber>();
        for(Uber uber : result){
            if (uber.isAvailable() == Boolean.parseBoolean(availStatus)){
                templist.add(uber);
            }
        }
        return templist;
    }
      public ArrayList<Uber> searchFirstAvailUber (String firstAvailUber, ArrayList<Uber> result){
          templist = new ArrayList<Uber>();
          for (Uber uber : result){
              if (uber.isAvailable() == true){
                  templist.add(uber);
                  break;
              }
          }
          return templist;
      }
      public ArrayList<Uber>searchMainCerti (String mainCerti, ArrayList<Uber> result){
        templist = new ArrayList<Uber>();
        for(Uber uber : result){
            if (uber.isMaintainanceCerti() == Boolean.parseBoolean(mainCerti)){
                templist.add(uber);
            }
        }
        return templist;
    }
      
   }
    
    

