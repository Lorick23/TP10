package main;

import java.util.Collection;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p = new Point(1, 1);
		Rectangle r = new Rectangle(p, 2, 3);
		System.out.println(p.toString());
		r.affiche();

		Rond rond = FigureUtil.getRandomRond();
		rond.affiche();
		Rectangle rect = FigureUtil.getRandomRectangle();
		rect.affiche();

		Carre c = new Carre(p, 2);
		c.affiche();

		System.out.println(p.equals(p));
		System.out.println(p.equals(new Point()));

		FigureUtil.getRandomFigure().affiche();

		System.out.println(FigureUtil.getPoints(FigureUtil.getRandomFigure(), FigureUtil.getRandomFigure(),
				FigureUtil.getRandomFigure(), FigureUtil.getRandomFigure(), FigureUtil.getRandomFigure(),
				FigureUtil.getRandomFigure(), FigureUtil.getRandomFigure()).size());

		System.out.println("N figures Aleatoire : ");
		System.out.println(FigureUtil.genere(10));

		Dessin d = new Dessin();
		Collection<Figure> figures = FigureUtil.genere(100);
		for (Figure f : figures) {
			d.add(f);
		}
		System.out.println("Figure en : ");
		Figure figure = FigureUtil.getFigureEn(new Point(50, 50), d);
		if (figure != null) {
			figure.affiche();
		} else {
			System.out.println("pas trouvé");
		}

		Collection<Figure> fs = FigureUtil.trieProcheOrigine(d);
		for (Figure ft : fs) {
			System.out.println("distance origine : " + ft.distanceOrigine());
		}

		Collection<Figure> fs1 = FigureUtil.trieSurface(d);
		for (Figure ft : fs1) {
			System.out.println("surface : " + ((Surfacable) ft).surface());
		}
	}

}
