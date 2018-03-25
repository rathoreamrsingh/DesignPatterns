/**
 * 
 */
package design.pattern.behavioral.observer;

/**
 * @author amar
 *
 */
public class ObserverPatternDemo {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		weatherData.setMeasurements(12, 2, 23);
		ForecastDisplay forecastDisplay = new ForecastDisplay();
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
		CurrentConditions currentConditions = new CurrentConditions();
		weatherData.registerObserver(forecastDisplay);
		weatherData.registerObserver(statisticsDisplay);
		weatherData.registerObserver(currentConditions);
		
		weatherData.setMeasurements(12, 13, 14);
	}
}
