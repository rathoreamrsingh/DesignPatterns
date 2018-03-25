/**
 * 
 */
package design.pattern.structural.adapter;

/**
 * @author amar
 *
 */
public class AdapterChargerInIndia {
	private ChargerUsedInUS chargerUsedInUs;
	public AdapterChargerInIndia() {
		this.chargerUsedInUs = new ChargerUsedInUS();
	}
	public void startCharging(ThreePinAdapterIndia threePinAdapterIndia) {
		System.out.println("Trying to charge using Indian adapter for US machine");
		TwoPinAdapterUS twoPinAdapterUS = new TwoPinAdapterUS();
		twoPinAdapterUS.setNegative(threePinAdapterIndia.isNegative());
		twoPinAdapterUS.setPositive(threePinAdapterIndia.isPositive());
		this.chargerUsedInUs.startCharging(twoPinAdapterUS);
	}
}
