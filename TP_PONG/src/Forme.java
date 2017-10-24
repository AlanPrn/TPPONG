import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;



@SuppressWarnings("serial")
public class Forme extends JPanel {

	private int X,Y, hauteur, largeur;
	String type="circle";
	private double orientation;
	
	public Forme() {};
	
	
	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}

	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public double getOrientation() {
		return orientation;
	}

	public void setOrientation(double orientation) {
		this.orientation = orientation;
	}

	public void paintComponent(Graphics g) {
		if (this.type=="circle") {
			System.out.println("Catch");
			Cercle c = new Cercle();
			g.setColor(Color.CYAN);
			g.fillOval(20, 20, 75, 75);
			
		}

	}
}
