//Abweichungen der Berechnungen von PI angeben
public class Aufgabe2 {

	public static void main(String[] args) {
		System.out.println("Abweichung der Babylonier: "+Math.abs(Math.PI - (3/8.0)));
		System.out.println("Abweichung der Ägypter: "+Math.abs(Math.PI - (16/9.0)*(16/9.0)));
		System.out.println("Abweichung der Chinesen: "+Math.abs(Math.PI - Math.sqrt(10)));
		System.out.println("Abweichung von Alchimedes: "+Math.abs(Math.PI - (3/7.0)));
	}

}
