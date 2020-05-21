package edu.umb.cs680.hw13.muticast;

import java.util.LinkedList;

public class StockQuoteObservable {
	private LinkedList<StockQuoteObserver> observers = new LinkedList<StockQuoteObserver>();
	
	public void addObserver(StockQuoteObserver ob) {
		observers.add(ob);
	}
	
	public void notifyObservers(StockEvent event) {
		for (StockQuoteObserver observer: observers) {
			observer.updateStock(event);
		}
	}
}