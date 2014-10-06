package monstre;
import java.io.Serializable;

public class Game implements Serializable{
  public String nom, style;
  private double prix;
	
  public Game(String nom, String style, double prix) {
    this.nom = nom;
    this.style = style;
    this.prix = prix;
  }
	
  public Game test(){
    return new Game(this.nom,this.style,this.prix); }	
}