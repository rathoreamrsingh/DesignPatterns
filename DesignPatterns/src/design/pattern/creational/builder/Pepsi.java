/**
 * 
 */
package design.pattern.creational.builder;

/**
 * @author amar
 *
 */
public class Pepsi extends ColdDrink {

	public Pepsi() {
		this.setName("Pepsi");
		this.setPrice(10);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see design.pattern.creational.builder.ColdDrink#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return this.getPrice();
	}
}
