/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.Date;

/**
 *
 * @author dongyueli
 */
public class Record {
    private float respiratoryRate;
    private float heartRate;
    private float systolicBloodPressure;
    private float weightInPounds;
    private Date date;
    private String normalOrNot;
    
    
    private int standTime;
    private int moveTime;
    private int excerciseTime;
    private int totalTime;
    private String needMoreExcerciseOrNot;
    
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    

    public float getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(float respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public float getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(float heartRate) {
        this.heartRate = heartRate;
    }

    public float getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    public void setSystolicBloodPressure(float systolicBloodPressure) {
        this.systolicBloodPressure = systolicBloodPressure;
    }

    public float getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(float weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public String getNormalOrNot() {
        return normalOrNot;
    }

    public void setNormalOrNot(String normalOrNot) {
        this.normalOrNot = normalOrNot;
    }
    
    
    public int getStandTime() {
        return standTime;
    }

    public void setStandTime(int standTime) {
        this.standTime = standTime;
    }

    public int getMoveTime() {
        return moveTime;
    }

    public void setMoveTime(int moveTime) {
        this.moveTime = moveTime;
    }

    public int getExcerciseTime() {
        return excerciseTime;
    }

    public void setExcerciseTime(int excerciseTime) {
        this.excerciseTime = excerciseTime;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = standTime + moveTime + excerciseTime;
    }

    public String getNeedMoreExcerciseOrNot() {
        return needMoreExcerciseOrNot;
    }

    public void setNeedMoreExcerciseOrNot(String needMoreExcerciseOrNot) {
        this.needMoreExcerciseOrNot = needMoreExcerciseOrNot;
    }

    
    
    
    
    
    
    @Override
    public String toString() {
        return date.toString();
    }

    public void setbreatheRate(float breatheRate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setheartrate(float heartrate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setsystalicBP(float systalicBP) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setweight(float weight) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setmovementClock(int movementClock) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setworkoutTime(int workoutTimet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void settotTime(int totTime) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setisNormal(String normal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setneedsToWorkout(String need_More_Excercise) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getisNormal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object gettotTime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getneedsToWorkout() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Number getmovementClock() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Number getworkoutTime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getbreatheRate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getheartrate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getsystalicBP() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getweight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
