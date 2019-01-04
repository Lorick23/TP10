package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Rectangle extends Figure implements Surfacable {

	protected Point pointBasGauche;
	protected Point pointBasDroit;
	protected Point pointHautGauche;
	protected Point pointHautDroit;

	public Rectangle(Point point, int width, int height) {
		pointBasGauche = point;
		pointBasDroit = new Point(point.getX() + width, point.getY());
		pointHautGauche = new Point(point.getX(), point.getY() + height);
		pointHautDroit = new Point(point.getX() + width, point.getY() + height);
	}

	public Point getPointBasGauche() {
		return pointBasGauche;
	}

	public Point getPointBasDroit() {
		return pointBasDroit;
	}

	public Point getPointHautGauche() {
		return pointHautGauche;
	}

	public Point getPointHautDroit() {
		return pointHautDroit;
	}

	public String print() {
		return "Rectangle [pointBasGauche=" + pointBasGauche + ", pointBasDroit=" + pointBasDroit + ", pointHautGauche="
				+ pointHautGauche + ", pointHautDroit=" + pointHautDroit + "]";
	}

	@Override
	public double surface() {
		int a = Math.abs(pointHautDroit.getX() - pointBasGauche.getX())
				* Math.abs(pointHautDroit.getY() - pointBasGauche.getY());
		return a;

	}

	@Override
	public Collection<Point> getPoints() {
		List<Point> points = new ArrayList<>();
		points.add(pointBasGauche);
		points.add(pointBasDroit);
		points.add(pointHautDroit);
		points.add(pointHautGauche);
		return points;
	}

	@Override
	public boolean couvre(Point point) {
		return (point.getX() >= pointBasGauche.getX() && point.getX() <= pointHautDroit.getX())
				&& (point.getY() >= pointBasGauche.getY() && point.getY() <= pointHautDroit.getY());
	}

}
