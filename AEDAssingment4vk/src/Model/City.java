package Model;

import java.util.ArrayList;

public class City {
    private String cityName;
    private ArrayList<Community> comm;

    public ArrayList<Community> getComm() {
        return comm;
    }

    public void setComm(ArrayList<Community> comm) {
        this.comm = comm;
    }
    
    public City(String c ){
        cityName = c;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
