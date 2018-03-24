/**
 * 
 */
package design.pattern.creational.singleton;

/**
 * @author amar
 *
 */
public class SingletonPatternDemo {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		singleton1.printCreateDateTime();
		singleton2.printCreateDateTime();
	}
}
