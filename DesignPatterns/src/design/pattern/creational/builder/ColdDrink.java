/**
 * 
 */
package design.pattern.creational.builder;

/**
 * @author amar
 *
 */
public abstract class ColdDrink implements Item{
	private String name;
	private Wrapper wrapper;
	private float price;
	/* (non-Javadoc)
	 * @see design.pattern.creational.builder.Item#name()
	 */
	@Override
	public String name() {
		return this.name;
	}

	/* (non-Javadoc)
	 * @see design.pattern.creational.builder.Item#packing()
	 */
	@Override
	public String packing() {
		// TODO Auto-generated method stub
		return wrapper.packing();
	}

	/* (non-Javadoc)
	 * @see design.pattern.creational.builder.Item#price()
	 */
	@Override
	abstract public float price();
	
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}
}
