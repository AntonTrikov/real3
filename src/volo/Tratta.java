package volo;

public class Tratta {
    private int id;
    private String name;
    private String type;
    private String partenza;
    private String arrivo;
    public Tratta(int id, String name, String type, String partenza, String arrivo){
        this.id=id;
        this.name=name;
        this.type=type;
        this.partenza=partenza;
        this.arrivo=arrivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPartenza() {
        return partenza;
    }

    public void setPartenza(String partenza) {
        this.partenza = partenza;
    }

    public String getArrivo() {
        return arrivo;
    }

    public void setArrivo(String arrivo) {
        this.arrivo = arrivo;
    }
}
