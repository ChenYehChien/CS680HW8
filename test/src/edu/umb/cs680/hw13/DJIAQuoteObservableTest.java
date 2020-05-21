package edu.umb.cs680.hw13;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class DJIAQuoteObservableTest {

	@Test
	public void verifyPiechartObserverWith100L() {
		DJIAQuoteObservable dObservable = new DJIAQuoteObservable();
		PiechartObserver pObserver = new PiechartObserver();
		dObservable.addObserver(pObserver);
		
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(stream);
			System.setOut(printStream);
			
			dObservable.changeQuote(100L);
			String expected = " Piechart : djia = 100.0";
			assertEquals(expected, stream.toString()); 
			
			
		}
		catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void verifyPiechartObserverWith200L() {
		DJIAQuoteObservable dObservable = new DJIAQuoteObservable();
		PiechartObserver pObserver = new PiechartObserver();
		dObservable.addObserver(pObserver);
		
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(stream);
			System.setOut(printStream);
			
			dObservable.changeQuote(200L);
			String expected = " Piechart : djia = 200.0";
			assertEquals(expected, stream.toString()); 
			
			
		}
		catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void verifyTableObserverWith100L() {
		DJIAQuoteObservable dObservable = new DJIAQuoteObservable();
		TableObserver tObserver = new TableObserver();
		dObservable.addObserver(tObserver);
		
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(stream);
			System.setOut(printStream);
			
			dObservable.changeQuote(100L);
			String expected = " Table : djia = 100.0";
			assertEquals(expected, stream.toString()); 
			
			
		}
		catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void verifyTableObserverWith200L() {
		DJIAQuoteObservable dObservable = new DJIAQuoteObservable();
		TableObserver tObserver = new TableObserver();
		dObservable.addObserver(tObserver);
		
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(stream);
			System.setOut(printStream);
			
			dObservable.changeQuote(200L);
			String expected = " Table : djia = 200.0";
			assertEquals(expected, stream.toString()); 
			
			
		}
		catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void verifyThreeDObserverWith100L() {
		DJIAQuoteObservable dObservable = new DJIAQuoteObservable();
		ThreeDObserver tObserver = new ThreeDObserver();
		dObservable.addObserver(tObserver);
		
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(stream);
			System.setOut(printStream);
			
			dObservable.changeQuote(100L);
			String expected = " 3D : djia = 100.0";
			assertEquals(expected, stream.toString()); 
			
			
		}
		catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void verifyThreeDObserverWith200L() {
		DJIAQuoteObservable dObservable = new DJIAQuoteObservable();
		ThreeDObserver tObserver = new ThreeDObserver();
		dObservable.addObserver(tObserver);
		
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintStream printStream = new PrintStream(stream);
			System.setOut(printStream);
			
			dObservable.changeQuote(200L);
			String expected = " 3D : djia = 200.0";
			assertEquals(expected, stream.toString()); 
			
			
		}
		catch (Exception e) {
			fail();
		}
	}

}
