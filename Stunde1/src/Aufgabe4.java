
public class Aufgabe4 {

	public static void main(String[] args) {
		int randomz = Tools.random(100);
		String nachricht = "";
		if((randomz%2) == 0){
			nachricht = "Du hast gebonnen!";
			if(randomz < 50){
				nachricht = "Du hast einen Gl�ckspilz gebonnen!";
				if(randomz <10){
					nachricht = "Du hast das Gl�ck der ganzen Welt gebonnen!";
				}
			}
		}else{
			nachricht = "Du hast nicht gebonnen!";
		}
		System.out.println(nachricht);
	}

}
