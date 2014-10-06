package monstre;

import java.io.Serializable;

abstract class Monstre implements Serializable {
	
	protected String nom;
	protected int attaque;
	protected int defense;
	protected int exp;
	protected int life;
	
	abstract void deplacement();
	abstract void crier();
	
	
	public String toString(){
		String str="Je suis un "+this.getClass()+" je possède "+this.attaque+" d'attaque et "+this.defense+" de défense";
		return str;
	}
	boolean mourir(){
		if (this.life <= 0){
			return true;
		}
		else return false;
	}
	public void attaquer(Monstre b){
		if(this.life > 0){
			
			if(this.attaque > b.defense){
				this.crier();
				b.life=b.life-this.attaque;
				if (!b.mourir()){
					System.out.println(b.nom+" dit : Il me reste "+b.life+" point de vie biatch");
				}
				else {
					System.out.println(b.nom+" dit : TU MA TOUÉ BIATCH");
				}
			}
			else{
				System.out.println(this.nom+" dit : Ta défense est trop importante !");
			}
		
		}
		else {
			System.out.println(this.nom+" dit : Tu m'as vaincu");
		}
		
	}
	
}
