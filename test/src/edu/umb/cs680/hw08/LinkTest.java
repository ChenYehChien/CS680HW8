package edu.umb.cs680.hw08;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class LinkTest {
	private static Link x;
	private static Link y;
	
	@BeforeAll
	public static void initialState() {
		Directory root = new Directory(null, "root", 0, LocalDateTime.now());
			
		Directory applications = new Directory(root, "applications", 0, LocalDateTime.now());
		File a = new File(applications, "a", 500, LocalDateTime.now());
		File b = new File(applications, "b", 500, LocalDateTime.now());
		
		Directory home = new Directory(root, "home", 0, LocalDateTime.now());
		x = new Link(home, "x", 0, LocalDateTime.now(), applications);
		File c = new File(home, "c", 500, LocalDateTime.now());
		File d = new File(home, "d", 500, LocalDateTime.now());
		
		Directory code = new Directory(home, "code", 0, LocalDateTime.now());
		y = new Link(code, "y", 0, LocalDateTime.now(), b);
		File e = new File(code, "e", 500, LocalDateTime.now());
		File f = new File(code, "f", 500, LocalDateTime.now());
		
		root.appendChild(applications);
		root.appendChild(home);
		applications.appendChild(a);
		applications.appendChild(b);
		home.appendChild(x);
		home.appendChild(c);
		home.appendChild(d);
		home.appendChild(code);
		code.appendChild(y);
		code.appendChild(e);
		code.appendChild(f);
		
	}
	
	private String[] linkToStringArray(Link l) {
		String[] linkInfo = {
				l.getName(),
				Integer.toString(l.getSize()),
				l.getParent().getName(),
		};
		
		return linkInfo;
	}
	
	@Test
	public void verifyLinkEqualityX() {
		try {
			String[] expected = {"x", "0", "home"};
			Link actual = x;
			assertArrayEquals(expected, linkToStringArray(actual));
		}
		catch (RuntimeException e) {
			fail();
		}
	}
	
	@Test
	public void verifyLinkEqualityY() {
		try {
			String[] expected = {"y", "0", "code"};
			Link actual = y;
			assertArrayEquals(expected, linkToStringArray(actual));
		}
		catch (RuntimeException e) {
			fail();
		}
	}

}
