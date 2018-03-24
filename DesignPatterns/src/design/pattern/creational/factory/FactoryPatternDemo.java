/**
 * 
 */
package design.pattern.creational.factory;

/**
 * @author amar
 *
 */
public class FactoryPatternDemo {
	public static void main(String[] args) {
		Person stive = PersonFactory.getPerson("Stive", "M", 23);
		Person catlina = PersonFactory.getPerson("Catalina", "f", 23);
		System.out.println(stive.toString());
		System.out.println(catlina.toString());
	}
}
