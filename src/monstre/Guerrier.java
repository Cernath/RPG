package monstre;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Guerrier extends Heroes implements Serializable {

	
	public Guerrier(){super();}
	public Guerrier(String nom, int attaque, int defense, int exp, int life,int niveau){
		super(nom,attaque,defense,exp,life,niveau);
	}
	
	
	public void crier(){
		
		System.out.println("JE VAIS VOUS REDUIRE EN POULAY !!!");
	}
	
	public void sauvegarder(String File){
	    ObjectOutputStream oos;
	    
	    try {
	        oos = new ObjectOutputStream(
	                new BufferedOutputStream(
	                  new FileOutputStream(
	                    new File(""+File))));
	          
	        oos.writeObject(this);
	        oos.close();
	    }
	    catch (IOException e) {
	        e.printStackTrace();
	      }     
	}
	
	 public Guerrier test(){
		    return new Guerrier (this.nom,this.attaque,this.defense,this.exp,this.life,this.niveau); }	

	public Guerrier charger(Guerrier a,String File){
		ObjectInputStream ois;
		
		try {
			ois = new ObjectInputStream(
			          new BufferedInputStream(
			            new FileInputStream(
			              new File(""+File))));
		
	            
	      try {
	        System.out.println("Affichage des jeux :");
	        System.out.println("*************************\n");
	        a = ((Guerrier) ois.readObject()).test();
	        return a;
	      } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	        
	      }
		
	      ois.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return a;
	     	 	
	}
	
}
