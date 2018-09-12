package volo;

public class Slot {
    private int id;
    private int slots;
    private String day;
    private String inizio;
    private String fine;
    private int[] aereiAccettati;
    public Slot(int id, int slots, String day, String inizio, String fine,int[] aereiAccettati){
        this.id=id;
        this.slots=slots;
        this.day=day;
        this.inizio=inizio;
        this.fine=fine;
        this.aereiAccettati=aereiAccettati;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSlots() {
        return slots;
    }

    public void setSlots(int slots) {
        this.slots = slots;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getInizio() {
        return inizio;
    }

    public void setInizio(String inizio) {
        this.inizio = inizio;
    }

    public String getFine() {
        return fine;
    }

    public void setFine(String fine) {
        this.fine = fine;
    }

    public int[] getAereiAccettati() {
        return aereiAccettati;
    }

    public void setAereiAccettati(int[] aereiAccettati) {
        this.aereiAccettati = aereiAccettati;
    }
}
