package edu.umb.cs680.hw04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeGeneratorTest {

	@Test
	public void primeGenerateConstructorWith1Land10L() {
		try {
			PrimeGenerator prime = new PrimeGenerator(1L, 10L);
		}
		catch (RuntimeException ex) {
			fail(ex);
		}
	}
	
	@Test
	public void primeGenerateConstructorWith1Land100L() {
		try {
			PrimeGenerator prime = new PrimeGenerator(1L, 100L);
		}
		catch (RuntimeException ex) {
			fail(ex);
		}
	}
	
	@Test
	public void primeGenerateConstructorWithNegative10Land10LRunTimeException() {
		try {
			PrimeGenerator prime = new PrimeGenerator(-10L, 10L);
			fail();
		}
		catch (RuntimeException ex) {
			assertEquals("Wrong input values: from=-10 to=10", ex.getMessage());
		}
	}
	
	@Test
	public void primeGenerateConstructorWith100Land1LRunTimeException() {
		try {
			PrimeGenerator prime = new PrimeGenerator(100L, 1L);
			fail();
		}
		catch (RuntimeException ex) {
			assertEquals("Wrong input values: from=100 to=1", ex.getMessage());
		}
	}
	
	@Test
	public void primeGenerateConstructorWith10LandNegative10LRunTimeException() {
		try {
			PrimeGenerator prime = new PrimeGenerator(10L, -10L);
			fail();
		}
		catch (RuntimeException ex) {
			assertEquals("Wrong input values: from=10 to=-10", ex.getMessage());
		}
	}
	
	@Test
	public void generatePrimesWith1Land10L() {
		PrimeGenerator prime = new PrimeGenerator(1L, 10L);
		prime.generatePrimes();
		Long[] expected = {2L, 3L, 5L ,7L};
		assertArrayEquals(expected, prime.getPrimes().toArray());
	}
	
	@Test
	public void generatePrimesWith1Land100L() {
		PrimeGenerator prime = new PrimeGenerator(1L, 100L);
		prime.generatePrimes();
		Long[] expected = {2L, 3L, 5L ,7L, 11L, 13L, 17L, 19L, 23L, 29L, 31L, 37L, 41L, 43L, 47L, 53L, 59L,
						61L, 67L, 71L, 73L, 79L, 83L, 89L, 97L};
		assertArrayEquals(expected, prime.getPrimes().toArray());
	}
	
	//If below really need to test or not?
	@Test
	public void generatePrimesWithNegative10Land10LRunTimeException() {
		try {
			PrimeGenerator prime = new PrimeGenerator(-10L, 10L);
			prime.generatePrimes();
			fail("from < 1");
		}
		catch (RuntimeException ex) {
			assertEquals("Wrong input values: from=-10 to=10", ex.getMessage());
		}
	}
	
	@Test
	public void generatePrimesWith100Land1LRunTimeException() {
		try {
			PrimeGenerator prime = new PrimeGenerator(100L, 1L);
			prime.generatePrimes();
			fail("from > to");
		}
		catch (RuntimeException ex) {
			assertEquals("Wrong input values: from=100 to=1", ex.getMessage());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
