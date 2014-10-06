package monstre;
import java.io.*;
public class CopyOfMain {

	public static void main(String[] args) {
		Tigre t = new Tigre("POULAY",10,10,100,99);
		Guerrier g = new Guerrier("jjaaaaaaaaaaaaaaaaaaaa",11,11,2,11,1);
		int a =1;
		while( a != 10){
		a++;
		g.attaquer(t);
		t.attaquer(g);
		g.finCombat(t);
		}
	    ObjectInputStream ois;
	    ObjectOutputStream oos;
	    Guerrier b;
	    try {
	      oos = new ObjectOutputStream(
	              new BufferedOutputStream(
	                new FileOutputStream(
	                  new File("test2.txt"))));
	        	
	      //Nous allons écrire chaque objet Game dans le fichier
	      oos.writeObject(new Guerrier("jjaaaaaaaaaaaaaaaaaaaa",11,11,2,11,1));
	      //Ne pas oublier de fermer le flux !
	      oos.close();
	        	
	      //On récupère maintenant les données !
	      ois = new ObjectInputStream(
	              new BufferedInputStream(
	                new FileInputStream(
	                  new File("test2.txt"))));
	            
	      try {
	    	  System.out.println(((Guerrier)ois.readObject()).toString());
	        

	      } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	      }
		
	      ois.close();
	        	
	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }     	
	  }
	}

