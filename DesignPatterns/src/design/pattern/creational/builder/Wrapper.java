/**
 * 
 */
package design.pattern.creational.builder;

/**
 * @author amar
 *
 */
public class Wrapper implements Packing {
	private String packing_type = "";

	public Wrapper() {
		this.packing_type = "Wrapper";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see design.pattern.creational.builder.Packing#packing()
	 */
	@Override
	public String packing() {
		return this.packing_type;
	}

}
