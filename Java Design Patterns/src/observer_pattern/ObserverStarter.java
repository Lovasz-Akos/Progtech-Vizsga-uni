package observer_pattern;

import observer_pattern.observables.WeatherStation;
import observer_pattern.observers.PhoneDisplay;

public class ObserverStarter {

	public static void main(String[] args) {

		WeatherStation station = new WeatherStation();
		PhoneDisplay phone = new PhoneDisplay(station);
		
		station.Add(phone);
		
		phone.Display();
				
		station.Notify();
		
		phone.Display();
		

	}

}
