/**
 * 
 */
package design.pattern.creational.factory;

/**
 * @author amar
 *
 */
public class PersonFactory {
	public static Person getPerson(String name, String gender, int age) {
		Person result = null;

		switch (gender.toUpperCase()) {
		case "M":
		case "MALE":
			result = new Man(name, gender, age);
			break;

		case "F":
		case "FEMALE":
		case "Woman":
			result = new Women(name, gender, age);
			break;
		}
		return result;
	}
}
