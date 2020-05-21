package edu.umb.cs680.hw13.muticast;

import java.util.LinkedList;

public class DJIAQuoteObservable {
	//collection of DJIAQuoteObservers
	private LinkedList<DJIAQuoteObserver> observers = new LinkedList<DJIAQuoteObserver>();
	
	public void addObserver(DJIAQuoteObserver ob) {
		observers.add(ob);
	}
	
	public void notifyObservers(DJIAEvent event) {
		for (DJIAQuoteObserver observer: observers) {
			observer.updateDJIA(event);
		}
	}
}