/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author hp
 */
public class Uber {
    private boolean available;
    private String brand;
    private int manufacturedYear;
    private int maxSeats;
    private int minSeats;
    private int serialNumber;
    private String modelNumber;
    private String availableCity;
    private boolean maintainanceCerti;
    
     public Uber( String brand, int manufacturedYear, int minSeats, int maxSeats, int serialNumber, String modelNumber, String availableCity, boolean available, boolean maintenanceCerti) {
        this.available = available;
        this.brand = brand;
        this.manufacturedYear = manufacturedYear;
        this.minSeats = minSeats;
        this.maxSeats = maxSeats;
        this.serialNumber = serialNumber;
        this.modelNumber = modelNumber;
        this.availableCity = availableCity;
        this.maintainanceCerti = maintainanceCerti;
        
      
    }
     
     Uber ()
     {
         
     }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getManufacturedYear() {
        return manufacturedYear;
    }

    public void setManufacturedYear(int manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public int getMinSeats() {
        return minSeats;
    }

    public void setMinSeats(int minSeats) {
        this.minSeats = minSeats;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getAvailableCity() {
        return availableCity;
    }

    public void setAvailableCity(String availableCity) {
        this.availableCity = availableCity;
    }

    public boolean isMaintainanceCerti() {
        return maintainanceCerti;
    }

    public void setMaintainanceCerti(boolean maintainanceCerti) {
        this.maintainanceCerti = maintainanceCerti;
    }
    
    @Override
    public String toString(){
        return brand;
        
    }
    
    
    
}
