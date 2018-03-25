/**
 * 
 */
package design.pattern.structural.bridge;

/**
 * @author amar
 *
 */
public class BridgeDemoPattern {
	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 199, 12, new RedCircle());
		Shape greenCircle = new Circle(100, 199, 12, new GreenCircle());
		
		
		redCircle.draw();
		greenCircle.draw();
	}
}
