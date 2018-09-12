package volo;

public class Compagnia {
    private String nome;
    private int password;
    private String dataIscrizione;
    private String nazione;
    private double valoreAzionario;
    private String[] partner;
    public Compagnia(String nome, int password, String dataIscrizione, String nazione, double valoreAzionario, String[] partner){
        this.nome=nome;
        this.password=password;
        this.dataIscrizione=dataIscrizione;
        this.nazione=nazione;
        this.valoreAzionario=valoreAzionario;
        this.partner=partner;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getDataIscrizione() {
        return dataIscrizione;
    }

    public void setDataIscrizione(String dataIscrizione) {
        this.dataIscrizione = dataIscrizione;
    }

    public String getNazione() {
        return nazione;
    }

    public void setNazione(String nazione) {
        this.nazione = nazione;
    }

    public double getValoreAzionario() {
        return valoreAzionario;
    }

    public void setValoreAzionario(double valoreAzionario) {
        this.valoreAzionario = valoreAzionario;
    }

    public String[] getPartner() {
        return partner;
    }

    public void setPartner(String[] partner) {
        this.partner = partner;
    }
}
