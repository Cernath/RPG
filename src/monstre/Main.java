package monstre;

public class Main {

	public static void main(String[] args) {
		Fenetre f=new Fenetre("RPG",400,100);
		Tigre t = new Tigre("POULAY",10,10,100,99);
		Guerrier g = new Guerrier("lol",11,3,3,300,3);
		
		g=g.charger(g, "aaa.txt");
		int a =1;
		while( a != 10){
		a++;
		g.attaquer(t);
		t.attaquer(g);
		g.finCombat(t);
		}
		g.sauvegarder("aaa.txt");
		
	}
	
}

