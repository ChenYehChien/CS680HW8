package edu.umb.cs680.hw07;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FileTest {
	private static File a;
	private static File b;
	private static File c;
	private static File d;
	private static File e;
	private static File f;
	
	
	@BeforeAll
	public static void initialState() {
		Directory root = new Directory(null, "root", 0, LocalDateTime.now());
			
		Directory applications = new Directory(root, "applications", 0, LocalDateTime.now());
		a = new File(applications, "a", 500, LocalDateTime.now());
		b = new File(applications, "b", 500, LocalDateTime.now());
		
		Directory home = new Directory(root, "home", 0, LocalDateTime.now());
		c = new File(home, "c", 500, LocalDateTime.now());
		d = new File(home, "d", 500, LocalDateTime.now());
		
		Directory code = new Directory(home, "code", 0, LocalDateTime.now());
		e = new File(code, "e", 500, LocalDateTime.now());
		f = new File(code, "f", 500, LocalDateTime.now());
		
		root.appendChild(applications);
		root.appendChild(home);
		applications.appendChild(a);
		applications.appendChild(b);
		home.appendChild(c);
		home.appendChild(d);
		home.appendChild(code);
		code.appendChild(e);
		code.appendChild(f);
		
	}
	
	private String[] fileToStringArray(File f) {
		String[] fileInfo = {
				f.getName(),
				Integer.toString(f.getSize()),
				f.getParent().getName(),
		};
		
		return fileInfo;
	}
	
	@Test
	public void verifyFileEqualityA() {
		try {
			String[] expected = {"a", "500", "applications"};
			File actual = a;
			assertArrayEquals(expected, fileToStringArray(actual));
		}
		catch (RuntimeException e) {
			fail();
		}
	}
	
	@Test
	public void verifyFileEqualityB() {
		try {
			String[] expected = {"b", "500", "applications"};
			File actual = b;
			assertArrayEquals(expected, fileToStringArray(actual));
		}
		catch (RuntimeException e) {
			fail();
		}
	}
	
	@Test
	public void verifyFileEqualityC() {
		try {
			String[] expected = {"c", "500", "home"};
			File actual = c;
			assertArrayEquals(expected, fileToStringArray(actual));
		}
		catch (RuntimeException e) {
			fail();
		}
	}
	
	@Test
	public void verifyFileEqualityD() {
		try {
			String[] expected = {"d", "500", "home"};
			File actual = d;
			assertArrayEquals(expected, fileToStringArray(actual));
		}
		catch (RuntimeException e) {
			fail();
		}
	}
	
	@Test
	public void verifyFileEqualityE() {
		try {
			String[] expected = {"e", "500", "code"};
			File actual = e;
			assertArrayEquals(expected, fileToStringArray(actual));
		}
		catch (RuntimeException e) {
			fail();
		}
	}
	
	@Test
	public void verifyFileEqualityF() {
		try {
			String[] expected = {"f", "500", "code"};
			File actual = f;
			assertArrayEquals(expected, fileToStringArray(actual));
		}
		catch (RuntimeException e) {
			fail();
		}
	}

}
