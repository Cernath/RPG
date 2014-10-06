package monstre;
import javax.swing.JFrame;

public class Fenetre extends JFrame{
	
	public String titre;
	public int sizeh;
	public int sizel;
	public Fenetre(){}
	public Fenetre(String titre,int sizeh,int sizel){
		
		this.titre=titre;
		this.sizeh=sizeh;
		this.sizel=sizel;
		this.setTitle(titre);
		this.setSize(sizeh,sizel);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}
