
public class Tier {
	String art;
	String gattung;
	String name;
	int alter;
	double height;
	int bewegungsdrang;
	
	void statusAnzeigen(){
		System.out.println(
			"Art: "+art+
			"\nGattung: "+gattung+
			"\nAlter: "+alter+" Jahre"+
			"\nName: "+name+
			"\nHöhe: "+height+"m"+
			"\nBewegungsdrang(1-10): "+bewegungsdrang
		);
	}
	
	void platzBedarfBerechnen(){
		double bedarf = Math.pow((height/2)*bewegungsdrang,2)+5;
		System.out.println("Platzbedarf beträgt: "+bedarf+" Quadratmeter");
	}
	
	public static void main(String args []){
		Tier cat = new Tier();
		cat.art = "Hauskatze";
		cat.gattung = "Katzen";
		cat.name = "Kitty";
		cat.alter = 4;
		cat.height = 0.3;
		cat.bewegungsdrang = 3;
		
		cat.statusAnzeigen();
		cat.platzBedarfBerechnen();
		
	}
}
