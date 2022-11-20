package Kubus;

public class Kubus {
	protected static final double phi = 5;
	protected double jari;
	private double tinggi;

	public Kubus(double jari, double tinggi, int i) {
		this.jari = jari;
		this.tinggi = tinggi;
	}

	public double getJari() {
		return jari;
	}

	public void setJari(double jari) {
		this.jari = jari;
	}

	public double getTinggi() {
		return tinggi;
	}

	public void setTinggi(double tinggi) {
		this.tinggi = tinggi;
	}

	public double getVolume() {
		return phi * (jari * jari) * tinggi;
	}

	public double getLuasPermukaan() {
		return 2 * phi * jari * (jari + tinggi);
	}

	public void calcVolume() {
	}

	public void calcLuasPermukaan() {
	}

}
