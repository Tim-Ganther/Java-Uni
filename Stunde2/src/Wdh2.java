
public class Wdh2 {

	public static void main(String[] args) {
		int i = 0;
		boolean richtig = false;
		int guess;
		int correct = Tools.random(50);
		String msg = "";
		System.out.print("Nutzername: ");
		String name = Tools.stringEingabe();
		System.out.println("\nHey "+name+", Willkommen im \"Rate eine Zahl zwischen 1 und 50 Spiel\"\n\n");
		do{
			System.out.print("Rate eine Zahl zwischen 1 und 50: ");
			guess = Tools.intEingabe();
			if(guess<correct){
				msg = "Zahl zu klein, versuche es doch nochmal!";
			}
			if(guess>correct){
				msg = "Zahl zu groﬂ, versuche es doch nochmal!";
			}
			if(guess == correct){
				msg = "Richtig geraten!";
				richtig = true;
			}
			System.out.println(msg);
			i++;
		}while(i<10 && richtig == false);

		if(richtig == false){
			msg = "\n"+name+", du hast leider zu viele Versuche gebraucht!";
			System.out.println(msg);
		}
		switch(i){
		case 1: msg = "\n\n"+i+" Versuch - Super gemacht, "+name+" !";break;
		case 2: msg = "\n\n"+i+" Versuche - Super gemacht, "+name+" !";break;
		case 3:
		case 4:
		case 5: msg = "\n\n"+i+" Versuche - Ganz okay, "+name+"!";break;
		case 6:
		case 7:
		case 8: msg = "\n\n"+i+" Versuche - Besser ging es nicht, "+name+" ?";break;
		case 9:
		case 10: msg = "\n\n"+i+" Versuche - ‹ben w‰re gut, "+name+" !";break;
		}
		System.out.println(msg);
	}

}
