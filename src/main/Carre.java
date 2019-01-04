package main;

public class Carre extends Rectangle {

	public Carre(Point point, int width) {
		super(point, width, width);

	}

	public String print() {
		return "Carre [pointBasGauche=" + pointBasGauche + ", pointBasDroit=" + pointBasDroit + ", pointHautGauche="
				+ pointHautGauche + ", pointHautDroit=" + pointHautDroit + "]";
	}
}
