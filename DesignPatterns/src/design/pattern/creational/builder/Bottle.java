/**
 * 
 */
package design.pattern.creational.builder;

/**
 * @author amar
 *
 */
public class Bottle implements Packing{
	private String packing_type = "";
	
	public Bottle() {
		this.packing_type = "Bottle";
	}
	/* (non-Javadoc)
	 * @see design.pattern.creational.builder.Packing#packing()
	 */
	@Override
	public String packing() {
		return this.packing_type;
	} 
}
