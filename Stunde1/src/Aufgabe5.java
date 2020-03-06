
public class Aufgabe5 {

	public static void main(String[] args) {
		int status = 0;
		int bier = 0;
		int cola = 0;
		int fanta = 0;
		int sprite = 0;
		int mm = 0;
		int colaz = 0;
		int colal = 0;
		String nachricht = "";
		do{
			System.out.print("Getränkeauswahl:\n(1) Bier\n(2) Cola\n(3) Fanta\n(4) Sprite\n(5) Mezzo Mix\n(6) Cola Zero\n(7) Cola Light\n(10) Ende\n Deine Auswahl:");
			status = Tools.intEingabe();
			switch(status){
			case 1: nachricht = "Bier"; bier++;
			break;
			case 2: nachricht = "Cola"; cola++;
			break;
			case 3: nachricht = "Fanta";fanta++;
			break;
			case 4: nachricht = "Sprite";sprite++;
			break;
			case 5: nachricht = "Mezzo Mix";mm++;
			break;
			case 6: nachricht = "Cola Zero";colaz++;
			break;
			case 7: nachricht = "Cola Light";colal++;
			break;
			}
			System.out.println("Du hast dich für "+ nachricht + " entschieden!");
		}while(status != 10);
		
		int sum = bier+cola+fanta+sprite+mm+colaz+colal;
		
		System.out.println("Es wurden insgesamt "+ sum + " Getränke bestellt!");
		System.out.println("Davon "+bier+" mal Bier");
		System.out.println("Davon "+cola+" mal Cola");
		System.out.println("Davon "+fanta+" mal Fanta");
		System.out.println("Davon "+sprite+" mal Sprite");
		System.out.println("Davon "+mm+" mal Mezzo Mix");
		System.out.println("Davon "+colaz+" mal Cola Zero");
		System.out.println("Davon "+colal+" mal Cola Light");
	}

}
