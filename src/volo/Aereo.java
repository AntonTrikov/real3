package volo;

public class Aereo {
	private int id;
	private String name;
	private double lunghezza;
	private double aperturaAlare;
	private double superficieAlare;
	private int vel;
	private int velMax;
	private int pesoVuoto;
	private int pesoMax;
	private double capacitaCombustibile;
	private String motore;
	private int passeggeri[];
	
	public Aereo(int id, String name, double lunghezza, double aperturaAlare,int vel,
			int velMax,double superficieAlare, int pesoVuoto, int pesoMax, double capacitaCombustibile,
			String motore, int passeggeri[]) {
		this.id=id;
		this.name=name;
		this.lunghezza=lunghezza;
		this.aperturaAlare = aperturaAlare;
		this.superficieAlare = superficieAlare;
		this.vel = vel;
		this.velMax = velMax;
		this.pesoVuoto = pesoVuoto;
		this.pesoMax = pesoMax;
		this.capacitaCombustibile = capacitaCombustibile;
		this.motore = motore;
		this.passeggeri = passeggeri;
	}
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public double getLunghezza() {
		return this.lunghezza;
	}
	public double getAperturaAlare() {
		return this.aperturaAlare;
	}
	public int getVel() {
		return this.vel;
	}
	public int getVelMax() {
		return this.velMax;
	}
	public double getSuperficieAlare() {
		return this.superficieAlare;
	}
	public int getPesoVuoto() {
		return this.pesoVuoto;
	}
	public int getPesoMax() {
		return this.pesoMax;
	}
	public int[] getPasseggeri() {
		return this.passeggeri;
	}
	public double getCapacitaCombustibile() {
		return this.capacitaCombustibile;
	}
	public String getMotore() {
		return this.motore;
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setLunghezza(double lunghezza) {
		this.lunghezza=lunghezza;
	}
	public void setAperturaAlare(double aperturaAlare) {
		this.aperturaAlare=aperturaAlare;
	}
	public void setVel(int vel) {
		this.vel=vel;
	}
	public void setVelMax(int velMax) {
		this.velMax=velMax;
	}
	public void setSuperficieAlare(double superficieAlare) {
		this.superficieAlare=superficieAlare;
	}
	public void setPesoVuoto(int pesoVuoto) {
		this.pesoVuoto=pesoVuoto;
	}
	public void setPesoMax(int pesoMax) {
		this.pesoMax=pesoMax;
	}
	public void setPasseggeri(int[] passeggeri) {
		this.passeggeri=passeggeri;
	}
	public void setCapacitaCombustibile(double capCombustibile) {
		this.capacitaCombustibile=capCombustibile;
	}
	public void setMotore(String motore) {
		this.motore = motore;
	}
}
