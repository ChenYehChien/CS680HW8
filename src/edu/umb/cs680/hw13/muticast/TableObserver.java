package edu.umb.cs680.hw13.muticast;

public class TableObserver implements DJIAQuoteObserver, StockQuoteObserver{

	public void updateStock(StockEvent event) {
		System.out.print(" Table :" +
		   		 		 " Ticker = " + event.getTicker() + " ; " + 
		   		 		 " Quote = "  + event.getQuote());
	}

	public void updateDJIA(DJIAEvent event) {
		System.out.print(" Table :" +
		   		 		 " djia = " + event.getDjia());
	}
	
}