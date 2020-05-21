package edu.umb.cs680.hw13.muticast;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class StockQuoteObservableTest {

	@Test
	public void verifyPiechartObserverWith100L() {
		StockQuoteObservable sObservable = new StockQuoteObservable();
		PiechartObserver piechartObserver = new PiechartObserver();
		sObservable.addObserver(piechartObserver);
		
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(stream);
			System.setOut(printStream);

			StockEvent sEvent = new StockEvent("NYSE", 100L);
			sObservable.notifyObservers(sEvent);
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
		PiechartObserver piechartObserver = new PiechartObserver();
		sObservable.addObserver(piechartObserver);
		
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(stream);
			System.setOut(printStream);

			StockEvent sEvent = new StockEvent("NYSE", 200L);
			sObservable.notifyObservers(sEvent);
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
		TableObserver tableObserver = new TableObserver();
		sObservable.addObserver(tableObserver);
		
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(stream);
			System.setOut(printStream);

			StockEvent sEvent = new StockEvent("NYSE", 100L);
			sObservable.notifyObservers(sEvent);
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
		TableObserver tableObserver = new TableObserver();
		sObservable.addObserver(tableObserver);
		
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(stream);
			System.setOut(printStream);

			StockEvent sEvent = new StockEvent("NYSE", 200L);
			sObservable.notifyObservers(sEvent);
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
		ThreeDObserver threeDObserver = new ThreeDObserver();
		sObservable.addObserver(threeDObserver);
		
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(stream);
			System.setOut(printStream);

			StockEvent sEvent = new StockEvent("NYSE", 100L);
			sObservable.notifyObservers(sEvent);
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
		ThreeDObserver threeDObserver = new ThreeDObserver();
		sObservable.addObserver(threeDObserver);
		
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(stream);
			System.setOut(printStream);

			StockEvent sEvent = new StockEvent("NYSE", 200L);
			sObservable.notifyObservers(sEvent);
			String expected = " 3D : Ticker = NYSE ;  Quote = 200.0";
			assertEquals(expected, stream.toString());
			
		}
		catch (Exception e) {
			fail();
		}
	}

}
