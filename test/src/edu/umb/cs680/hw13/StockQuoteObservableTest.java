package edu.umb.cs680.hw13;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class StockQuoteObservableTest {

	@Test
	public void verifyPiechartObserverWith100L() {
		StockQuoteObservable sObservable = new StockQuoteObservable();
		PiechartObserver pObserver = new PiechartObserver();
		sObservable.addObserver(pObserver);
		
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(stream);
			System.setOut(printStream);
			
			sObservable.changeQuote("NYSE", 100L);
			String expected = " Piechart : Ticker = NYSE ;  Quote = 100.0";
			assertEquals(expected, stream.toString()); 
			
			
		}
		catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void verifyPiechartObserverWith200L() {
		StockQuoteObservable sObservable = new StockQuoteObservable();
		PiechartObserver pObserver = new PiechartObserver();
		sObservable.addObserver(pObserver);
		
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(stream);
			System.setOut(printStream);
			
			sObservable.changeQuote("NYSE", 200L);
			String expected = " Piechart : Ticker = NYSE ;  Quote = 200.0";
			assertEquals(expected, stream.toString()); 
			
			
		}
		catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void verifyTableObserverWith100L() {
		StockQuoteObservable sObservable = new StockQuoteObservable();
		TableObserver tObserver = new TableObserver();
		sObservable.addObserver(tObserver);
		
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(stream);
			System.setOut(printStream);
			
			sObservable.changeQuote("NYSE", 100L);
			String expected = " Table : Ticker = NYSE ;  Quote = 100.0";
			assertEquals(expected, stream.toString()); 
			
			
		}
		catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void verifyTableObserverWith200L() {
		StockQuoteObservable sObservable = new StockQuoteObservable();
		TableObserver tObserver = new TableObserver();
		sObservable.addObserver(tObserver);
		
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(stream);
			System.setOut(printStream);
			
			sObservable.changeQuote("NYSE", 200L);
			String expected = " Table : Ticker = NYSE ;  Quote = 200.0";
			assertEquals(expected, stream.toString()); 
			
			
		}
		catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void verifyThreeDObserverWith100L() {
		StockQuoteObservable sObservable = new StockQuoteObservable();
		ThreeDObserver tObserver = new ThreeDObserver();
		sObservable.addObserver(tObserver);
		
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(stream);
			System.setOut(printStream);
			
			sObservable.changeQuote("NYSE", 100L);
			String expected = " 3D : Ticker = NYSE ;  Quote = 100.0";
			assertEquals(expected, stream.toString()); 
			
			
		}
		catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void verifyThreeDObserverWith200L() {
		StockQuoteObservable sObservable = new StockQuoteObservable();
		ThreeDObserver tObserver = new ThreeDObserver();
		sObservable.addObserver(tObserver);
		
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(stream);
			System.setOut(printStream);
			
			sObservable.changeQuote("NYSE", 200L);
			String expected = " 3D : Ticker = NYSE ;  Quote = 200.0";
			assertEquals(expected, stream.toString()); 
			
			
		}
		catch (Exception e) {
			fail();
		}
	}

}
