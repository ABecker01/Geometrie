package geometry.shapes;

import geometry.Point2D;
import geometry.Shape;

/**
 * Ein Kreis als zweidimensionales Objekt. 
 * 
 * Wir repr�sentieren den Kreis
 * durch den Mittelpunkt und den Radius. Als Referenzpunkt verwenden wir den Mittelpunkt.
 */
public class Circle extends Shape {
	
	/** 
	 * Anfangspunkt der Linie.
	 * 
	 * Default ist der Ursprung
	 */
	Point2D midPoint = new Point2D(0.0, 0.0);
	
	/**
	 * Radius.
	 *  
	 * Default ist Radius 1
	 */
	double radius = 1.0;
	
	/**
	 * Ein Kreis mit Mittelpunkt im Ursprung und Radius 1.
	 */
	public Circle() {
		refPoint = new Point2D(midPoint);
	}
	
	/**
	 * Ein Kreis mit Mittelpunkt und Radius.
	 * Der Referenzpunkt ist der �bergebene Mittelpunkt.
	 * 
	 * \param[in] midPoint Mittelpunkt
	 * \param[in] radius   Radius
	 */
	public Circle(Point2D midPoint, double radius) {
		
		/* 
         * Wir k�nnen ausnahmsweise den Konstruktor der Basisklasse
		 * verwenden, da wir den Referenzpunkt nicht berechnen m�ssen.
		 */
		super(midPoint);
		this.midPoint = midPoint;
		this.radius = radius;
	}
	
	/**
	 * �berschreiben der Funktion toString f�r Konsolenausgaben.
	 * 
	 * \return Ein String, der den Kreis beschreibt.
	 */
	@Override
    public String toString() {
		return "Kreis\nMittelpunkt " + this.midPoint + " \nRadius " + this.radius+ "\nReferenzpunkt " + this.refPoint;
	}
	
    /**
     * Der Referenzpunkt ist durch den Mittelpunkt gegeben.
     * Deshalb ist in dieser Klasse keine Berechnung n�tig.
     * 
     * \return Der Mittelpunkt als Referenzpunkt
     */
	@Override	
    protected Point2D computeRefPoint() {
    	return midPoint;
    }

}
