package northpole.observer.weather;

import northpole.observer.WeatherData;
import northpole.observer.displayelements.CurrentConditionsDisplay;
import northpole.observer.displayelements.ForecastDisplay;
import northpole.observer.displayelements.StatisticsDisplay;

public class WeatherStation
{
    public static void main(String[] args)
    {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}