/**
 * 
 */
package design.pattern.behavioral.observer;

/**
 * @author amar
 *
 */
public class CurrentConditions implements Observer, DisplayElement {
	private float temp;
	private float humidity;
	private float pressure;
	/*
	 * (non-Javadoc)
	 * 
	 * @see design.pattern.behavioral.observer.DisplayElement#display()
	 */
	@Override
	public void display() {
		System.out.println("Current Condition Display :");
		System.out.println("Current Temp : " + this.temp);
		System.out.println("Current Humidity : " + this.humidity);
		System.out.println("Current Pressure : " + this.pressure);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see design.pattern.behavioral.observer.Observer#update()
	 */
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		this.display();
	}

}
