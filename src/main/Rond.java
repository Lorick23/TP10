package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Rond extends Figure implements Surfacable {

	private Point point;
	private int r;

	public Rond(Point point, int r) {
		super();
		this.point = point;
		this.r = r;
	}

	public String print() {
		return "Rond [point=" + point.toString() + ", r=" + r + "]";
	}

	@Override
	public double surface() {
		return Math.PI * Math.pow(r, 2);
	}

	@Override
	public Collection<Point> getPoints() {
		List<Point> points = new ArrayList<>();
		points.add(point);
		return points;
	}

	@Override
	public boolean couvre(Point point) {
		// return this.point.distance(point) <= (double) r;
		return Math.sqrt(
				Math.pow(point.getX() - this.point.getX(), 2) + Math.pow(point.getY() - this.point.getY(), 2)) <= r;
	}

}
