
public abstract class Forme {
	
private int X,Y, hauteur, largeur;
private double orientation;

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

public void dessine() {
	
}
}
