package Model;

import java.util.ArrayList;

public class Community {
    private String community;
    private ArrayList<House> house;

    public ArrayList<House> getHouse() {
        return house;
    }

    public void setHouse(ArrayList<House> house) {
        this.house = house;
    }
    
    public Community(String comm){
        community = comm;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }
    
    
}
