/**
 * 
 */
package design.pattern.creational.builder;

/**
 * @author amar
 *
 */
public class NonVegBurger extends Burger{

	/* (non-Javadoc)
	 * @see design.pattern.creational.builder.Burger#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 13;
	}
	
	@Override
	public String name() {
		return "This is Non-Veg Burger";
	}

}
