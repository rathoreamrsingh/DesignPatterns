/**
 * 
 */
package design.pattern.structural.adapter;

/**
 * @author amar
 *
 */
public class AdapterPatternDemo {
	public static void main(String[] args) {
		ThreePinAdapterIndia threePinAdapterIndia = new ThreePinAdapterIndia();
		threePinAdapterIndia.setPositive(true);
		threePinAdapterIndia.setNegative(true);
		threePinAdapterIndia.setNeutral(true);
		AdapterChargerInIndia adapterChargerInIndia = new AdapterChargerInIndia();
		adapterChargerInIndia.startCharging(threePinAdapterIndia);
		
		
	}
}
