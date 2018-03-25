/**
 * 
 */
package design.pattern.structural.adapter;

/**
 * @author amar
 *
 */
public class ThreePinAdapterIndia {
	private boolean positive;
	private boolean negative;
	private boolean neutral;

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

	public boolean isNeutral() {
		return neutral;
	}

	public void setNeutral(boolean neutral) {
		this.neutral = neutral;
	}

}
