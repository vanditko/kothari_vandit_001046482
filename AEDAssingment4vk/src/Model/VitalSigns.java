package Model;

public class VitalSigns {

    private int bodyTemp;
    private int pulseRate;
    private int respRate;
    private int bloodPressure;

    public VitalSigns(int bodyTemp,
                      int pulseRate,
                      int bloodPressure) {

        this.bodyTemp = bodyTemp;
        this.pulseRate = pulseRate;
        this.bloodPressure = bloodPressure;
    }

    public int getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(int bodyTemp) {
        this.bodyTemp = bodyTemp;
    }

    public int getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(int pulseRate) {
        this.pulseRate = pulseRate;
    }

    public int getRespRate() {
        return respRate;
    }

    public void setRespRate(int respRate) {
        this.respRate = respRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }
}
