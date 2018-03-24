/**
 * 
 */
package design.pattern.creational.builder;

/**
 * @author amar
 *
 */
public abstract class Burger implements Item {
	private String name;
	private Packing packingType;
	private float price;

	/*
	 * (non-Javadoc)
	 * 
	 * @see design.pattern.creational.builder.Item#name()
	 */
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return this.name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see design.pattern.creational.builder.Item#packing()
	 */
	@Override
	public String packing() {
		return this.packingType.packing();
	}

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
