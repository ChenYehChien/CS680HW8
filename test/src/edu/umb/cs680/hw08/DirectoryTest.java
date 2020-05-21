package edu.umb.cs680.hw08;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class DirectoryTest {
	private static Directory root;
	private static Directory applications;
	private static Directory home;
	private static Directory code;
	
	
	@BeforeAll
	public static void initialState() {
		root = new Directory(null, "root", 0, LocalDateTime.now());
			
		applications = new Directory(root, "applications", 0, LocalDateTime.now());
		File a = new File(applications, "a", 500, LocalDateTime.now());
		File b = new File(applications, "b", 500, LocalDateTime.now());
		
		home = new Directory(root, "home", 0, LocalDateTime.now());
		Link x = new Link(home, "x", 0, LocalDateTime.now(), applications);
		File c = new File(home, "c", 500, LocalDateTime.now());
		File d = new File(home, "d", 500, LocalDateTime.now());
		
		code = new Directory(home, "code", 0, LocalDateTime.now());
		Link y = new Link(code, "y", 0, LocalDateTime.now(), b);
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
	
	private String[] dirToStringArray(Directory d) {
		if (d.getParent() == null) {
			String[] dirInfo = {
					d.getName(), Integer.toString(d.getSize()),
					"null",
					Integer.toString(d.countChildren()), 
					Integer.toString(d.getTotalSize()), 
			};
			return dirInfo;
		}
		else {
			String[] dirInfo = {
					d.getName(), Integer.toString(d.getSize()),
					d.getParent().getName(),
					Integer.toString(d.countChildren()), 
					Integer.toString(d.getTotalSize()), 
			};
			return dirInfo;
		}
	}
	
	@Test
	public void verifyDirectoryEqualityRoot() {
		try {
			String[] expected = {"root", "0", "null", "2", "3000"};
			Directory actual = root;
			assertArrayEquals(expected, dirToStringArray(actual));
		}
		catch (RuntimeException e) {
			fail();
		}
		
	}
	
	@Test
	public void verifyDirectoryEqualityHome() {
		try {
			String[] expected = {"home", "0", "root", "4", "2000"};
			Directory actual = home;
			assertArrayEquals(expected, dirToStringArray(actual));
		}
		catch (RuntimeException e) {
			fail();
		}
	}
	
	@Test
	public void verifyDirectoryEqualityApplications() {
		try {
			String[] expected = {"applications", "0", "root", "2", "2000"};
			Directory actual = applications;
			assertArrayEquals(expected, dirToStringArray(actual));
		}
		catch (RuntimeException e) {
			fail();
		}
	}
	
	@Test
	public void verifyDirectoryEqualityCode() {
		try {
			String[] expected = {"code", "0", "home", "3", "1000"};
			Directory actual = code;
			assertArrayEquals(expected, dirToStringArray(actual));
		}
		catch (RuntimeException e) {
			fail();
		}
	}
	
	
	
	
	
	
	
	
	
	

}
