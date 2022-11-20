package Kubus;

public class Main {

	public static void main(String[] args) {
		Kubus kubus = new Kubus(6, 10, 5);
		kubus.calcVolume();
		kubus.calcLuasPermukaan();
		System.out.println("Volume kubus: " + kubus.getVolume());
		System.out.println("Luas permukaan kubus: " + kubus.getLuasPermukaan());
	}

}
