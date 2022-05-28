package observer_pattern.observers;

import observer_pattern.interfaces.IDisplay;
import observer_pattern.interfaces.IObserver;
import observer_pattern.observables.WeatherStation;

public class PhoneDisplay implements IObserver, IDisplay{
	
	WeatherStation wStation;
	int temp;
	
	@Override
	public void Update() {
		temp = this.wStation.GetTemperature();
	}

	@Override
	public void Display() {
		System.out.println(Integer.toString(temp));
		
	}
	
	public PhoneDisplay(WeatherStation station) {
		this.wStation = station;
	}
}