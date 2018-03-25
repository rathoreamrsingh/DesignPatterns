/**
 * 
 */
package design.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author amar
 *
 */
public class WeatherData implements Subject {
	private List<Observer> listOfObservers = null;
	private float temp;
	private float humidity;
	private float pressure;

	/*
	 * (non-Javadoc)
	 * 
	 * @see design.pattern.behavioral.observer.Subject#registerObserver()
	 */
	@Override
	public void registerObserver(Observer ob) {
		if (this.listOfObservers == null) {
			this.listOfObservers = new ArrayList<Observer>();
		}

		this.listOfObservers.add(ob);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see design.pattern.behavioral.observer.Subject#removeObserver()
	 */
	@Override
	public void removeObserver(Observer ob) {
		if (this.listOfObservers != null) {
			this.listOfObservers.remove(ob);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see design.pattern.behavioral.observer.Subject#notifyObservers()
	 */
	@Override
	public void notifyObservers() {
		if (this.listOfObservers != null) {
			System.out.println("Notifying Observers... :)");
			for (Observer ob : this.listOfObservers) {
				ob.update(this.temp, this.humidity, this.pressure);
			}
		} else {
			System.out.println("No Observer to notify... :(");
		}
	}

	public void measurementChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}

}
