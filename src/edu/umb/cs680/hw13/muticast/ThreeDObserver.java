package edu.umb.cs680.hw13.muticast;

public class ThreeDObserver implements DJIAQuoteObserver, StockQuoteObserver{

	public void updateStock(StockEvent event) {
		System.out.print(" 3D :" +
		   		 		 " Ticker = " + event.getTicker() + " ; " + 
		   		 		 " Quote = "  + event.getQuote());
	}

	public void updateDJIA(DJIAEvent event) {
		System.out.print(" 3D :" +
		   		 		 " djia = " + event.getDjia());
	}
	
}