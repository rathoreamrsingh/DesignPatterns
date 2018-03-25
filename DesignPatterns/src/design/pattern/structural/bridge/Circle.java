/**
 * 
 */
package design.pattern.structural.bridge;

/**
 * @author amar
 *
 */
public class Circle extends Shape {
	private int x, y, radius;

	/**
	 * @param drawAPI
	 */
	protected Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.drawAPI = drawAPI;
	}
	
	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}
}
