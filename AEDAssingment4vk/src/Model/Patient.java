package Model;

import Data.EncounterHistory;
import java.util.Date;

public class Patient extends Person{
    
    private EncounterHistory encounterHistory;

    public Patient(String fullName, House residence, String gender, Date dob, int id, Encounter en) {
        super(fullName, residence, gender, dob, id);
        
        this.encounterHistory = new EncounterHistory();
        this.encounterHistory.addEncounter(en);
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory eh) {
        this.encounterHistory = eh;
    }
    
    


}
