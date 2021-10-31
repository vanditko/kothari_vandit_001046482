package Data;

import Model.Encounter;
import Model.Person;

import java.util.ArrayList;

public class EncounterHistory {

    private ArrayList<Encounter> encounterHistory;

    public EncounterHistory() {
        encounterHistory = new ArrayList<>();
    }

    public void addEncounter(Encounter encounter) {
        encounterHistory.add(encounter);
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

}
