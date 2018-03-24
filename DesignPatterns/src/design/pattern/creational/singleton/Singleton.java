/**
 * 
 */
package design.pattern.creational.singleton;

import java.util.Date;

/**
 * @author amar
 *
 */
public class Singleton {
	private Date creationDateTime;
	private static Singleton instance;
	private Singleton() {
		creationDateTime = new Date();
	}
	
	public void printCreateDateTime() {
		System.out.println("Creational date time is : " + this.creationDateTime.getTime());
	}
	
	public static Singleton getInstance() {
		if(instance != null) {
			return instance;
		} else { 
			synchronized (Singleton.class) {
				if(instance != null) {
					return instance;
				} else {
					instance = new Singleton();
					return instance;
				}
			}
		}
	}
}
