/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author harshaljaiswal
 */
public class Analytic {
    
    public String Community;
    public int[] arr;
    
    public Analytic(String comm, int ii){
        Community = comm;
        arr = new int[4];
        for(int i=0;i <4 ; i++){
            if( ii == i)
                arr[i] = 1;
            arr[i] = 0;
        }
    }

    public String getCommunity() {
        return Community;
    }

    public void setCommunity(String Community) {
        this.Community = Community;
    }

    public Analytic() {
        arr = new int[4];
        for(int i=0;i <4 ; i++){
            arr[i] = 0;
        }
    }
    
    
    public void addAgeAnalytics(int i, int count){
        arr[i] = count;
    }
    
    public int getAgeCount(int i){
        return arr[i];
    }
    
}
