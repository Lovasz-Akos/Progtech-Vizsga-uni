package observer_pattern.interfaces;

public interface IObservable {
	
	void Add(IObserver observer);
	
	void Remove(IObserver observer);
	
	void Notify();

}
