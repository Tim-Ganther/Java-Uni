//3 Eingaben die addiert werden
public class Aufgabe1 {

	public static void main(String[] args) {
		int a = 0;
		for(int i=0; i<3;i++){
			System.out.print("Zahl "+(i+1)+" eingeben: ");
			a += Tools.intEingabe();
		}
		System.out.println("Summe: "+a);

	}

}
