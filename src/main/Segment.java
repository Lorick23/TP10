package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Segment extends Figure {

	private Point debut;
	private Point fin;
	private boolean horizontal;

	public Segment(Point point, int longueur, boolean horizontal) {
		this.debut = point;
		this.horizontal = horizontal;
		if (horizontal) {
			this.fin = new Point(point.getX() + longueur, point.getY());
		} else {
			this.fin = new Point(point.getX(), point.getY() + longueur);
		}
	}

	@Override
	public String print() {
		return "Segment [debut=" + debut + ", fin=" + fin + "]";
	}

	@Override
	public Collection<Point> getPoints() {
		List<Point> points = new ArrayList<>();
		points.add(debut);
		points.add(fin);
		return points;
	}

	@Override
	public boolean couvre(Point point) {
		return (horizontal && (point.getY() == debut.getY() && point.getX() >= debut.getX() && point.getX() <= fin.getX())) || 
				(!horizontal && (point.getX() == debut.getX() && point.getY() >= debut.getY() && point.getY() <= fin.getY()));
	}


}
