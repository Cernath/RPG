package monstre;

public class Tigre extends Felin {

	public Tigre(){
		
	}
	public Tigre(String nom, int attaque, int defense, int exp, int life){
		
		this.nom=nom;
		this.attaque=attaque;
		this.defense=defense;
		this.exp=exp;
		this.life=life;
	}
	
	public void crier(){
		
		System.out.println("JE VAIS VOUS REDUIRE EN POULAY !!!");
	}
	
	
}
