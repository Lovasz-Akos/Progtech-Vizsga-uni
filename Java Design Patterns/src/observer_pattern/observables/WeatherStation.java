package observer_pattern.observables;

import java.util.ArrayList;
import java.util.List;

import observer_pattern.interfaces.IObservable;
import observer_pattern.interfaces.IObserver;

public class WeatherStation implements IObservable{

	List<IObserver> observers = new ArrayList<>();
	int temp = 20;
	
	@Override
	public void Add(IObserver observer) {
		this.observers.add(observer);
		
	}

	@Override
	public void Remove(IObserver observer) {
		this.observers.remove(observer);
		
	}

	@Override
	public void Notify() {
		for (IObserver observer : this.observers) {
			observer.Update();
		}
	}
	
	public int GetTemperature(){
		return this.temp;
	}
}
