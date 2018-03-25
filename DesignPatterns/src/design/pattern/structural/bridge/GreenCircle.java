/**
 * 
 */
package design.pattern.structural.bridge;

/**
 * @author amar
 *
 */
public class GreenCircle implements DrawAPI{

	/* (non-Javadoc)
	 * @see design.pattern.structural.bridge.DrawAPI#drawCircle(int, int, int)
	 */
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing cirle with color : Greenm,, " + radius + ", x: " + x + ", y: " + y);
	}

}
