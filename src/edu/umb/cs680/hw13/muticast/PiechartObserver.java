package edu.umb.cs680.hw13.muticast;

public class PiechartObserver implements DJIAQuoteObserver, StockQuoteObserver{

	public void updateStock(StockEvent event) {
		System.out.print(" Piechart :" +
				   		 " Ticker = " + event.getTicker() + " ; " + 
				   		 " Quote = "  + event.getQuote());
		
	}

	public void updateDJIA(DJIAEvent event) {
		System.out.print(" Piechart :" +
				   		 " djia = " + event.getDjia());
		
	}
	
}