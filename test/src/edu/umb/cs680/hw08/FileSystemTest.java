package edu.umb.cs680.hw08;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FileSystemTest {
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
		Link x = new Link(root, "x", 0, LocalDateTime.now(), applications);
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
	
	//Two getInstance method are the same without any parameter as input
	@Test
	public void testFileSystemSingleton() {
		try {
			FileSystem f1 = FileSystem.getFileSystem();
			FileSystem f2 = FileSystem.getFileSystem();
			assertSame(f1, f2);
		}
		catch (RuntimeException e) {
			fail();
		}
	}

}

