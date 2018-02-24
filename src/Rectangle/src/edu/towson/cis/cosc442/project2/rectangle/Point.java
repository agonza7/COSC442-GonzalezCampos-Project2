package Rectangle.src.edu.towson.cis.cosc442.project2.rectangle;

/**
 * The Point Class.
 */
public class Point {

	/** x and y coordinates. */
	public Double x, y;

	/**
	 * Instantiates a new point.
	 *
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 */

	// This was fixed as X was previously assigned to Y
	Point(Double x, Double y) {
		this.x = x;
		this.y = y;
	}
}
