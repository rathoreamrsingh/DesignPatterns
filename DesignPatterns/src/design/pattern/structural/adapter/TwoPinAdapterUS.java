/**
 * 
 */
package design.pattern.structural.adapter;

/**
 * @author amar
 *
 */
public class TwoPinAdapterUS {
	private boolean positive;
	private boolean negative;

	public boolean isPositive() {
		return positive;
	}

	public void setPositive(boolean positive) {
		this.positive = positive;
	}

	public boolean isNegative() {
		return negative;
	}

	public void setNegative(boolean negative) {
		this.negative = negative;
	}

}
