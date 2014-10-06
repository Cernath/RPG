package monstre;
import java.io.*;

public abstract class Heroes extends Monstre implements Serializable{

	public int niveau;
	public Heroes(){}
	public Heroes(String nom, int attaque, int defense, int exp, int life,int niveau){
		this.nom=nom;
		this.attaque=attaque;
		this.defense=defense;
		this.exp=exp;
		this.life=life;
		this.niveau=niveau;
	}
	public Heroes(Heroes a){
		this.nom=a.nom;
		this.attaque=a.attaque;
		this.defense=a.defense;
		this.exp=a.exp;
		this.life=a.life;
		this.niveau=a.niveau;
	}
	
	void deplacement(){}
	
	void gainLvl(){
		int expe=(int)Math.pow(this.exp,2);
		if (this.exp > expe){
			this.niveau = this.niveau +1;
			System.out.println("Vous avez gagné un niveau !");
			System.out.println("Vous êtes maintenant lvl "+this.niveau+" !");
		}
	}
	void gainExp(Monstre a){
		if (a.mourir()){
			this.exp=this.exp+a.exp;
			System.out.println("Vous avez gagné "+a.exp+" d'exp, votre exp totale est de "+this.exp);
			this.gainLvl();
					}
	}
	
	void finCombat(Monstre a){
		if (a.mourir()){
			this.gainExp(a);
		}
	}

	
}
