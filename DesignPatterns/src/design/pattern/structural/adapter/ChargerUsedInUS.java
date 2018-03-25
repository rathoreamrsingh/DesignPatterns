/**
 * 
 */
package design.pattern.structural.adapter;

/**
 * @author amar
 *
 */
public class ChargerUsedInUS {
	public void startCharging(TwoPinAdapterUS twoPinAdapter) {
		if(twoPinAdapter.isPositive() && twoPinAdapter.isNegative()) {
			System.out.println("Charger is charging in us mode");
		} else {
			System.out.println("Charger is not charging :( ");
		}
	}
}
