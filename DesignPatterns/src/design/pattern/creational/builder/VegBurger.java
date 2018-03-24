/**
 * 
 */
package design.pattern.creational.builder;

/**
 * @author amar
 *
 */
public class VegBurger extends Burger{

	public VegBurger() {
		this.setName("This is Veg Burger");
	}
	/* (non-Javadoc)
	 * @see design.pattern.creational.builder.Burger#price()
	 */
	@Override
	public float price() {
		return 13;
	}
	
	@Override
	public String name() {
		return super.name();
	}

}
