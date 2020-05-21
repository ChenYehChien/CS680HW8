package edu.umb.cs680.hw13;

import java.util.Observable;
import java.util.Observer;

public class PiechartObserver implements Observer {

	public void update(Observable o, Object arg) {
		if (arg instanceof StockEvent) {
			StockEvent stockEvent = (StockEvent)arg;
			System.out.print(" Piechart :" +
							 " Ticker = " + stockEvent.getTicker() + " ; " + 
							 " Quote = "  + stockEvent.getQuote());
		}
		else if (arg instanceof DJIAEvent) {
			DJIAEvent djiaEvent = (DJIAEvent)arg;
			System.out.print(" Piechart :" +
							   " djia = " + djiaEvent.getDjia());
		}
	}
	
}