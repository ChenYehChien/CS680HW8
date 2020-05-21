package edu.umb.cs680.hw15;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.LinkedList;

import edu.umb.cs680.hw09.APFS.ApfsDirectory;
import edu.umb.cs680.hw09.APFS.ApfsFile;
import edu.umb.cs680.hw09.APFS.ApfsElement;

public class hw15 {
	private static ApfsDirectory root;
	private static ApfsDirectory applications;
	private static ApfsDirectory home;
	private static ApfsDirectory code;
	
	private static void apfsDirectoriesInstantiation () {
		root = new ApfsDirectory(null, "root", 0, LocalDateTime.now());
		
		applications = new ApfsDirectory(root, "applications", 0, LocalDateTime.now());
		ApfsFile a = new ApfsFile(applications, "a", 500, LocalDateTime.now());
		ApfsFile b = new ApfsFile(applications, "b", 500, LocalDateTime.now());
		
		home = new ApfsDirectory(root, "home", 0, LocalDateTime.now());
		ApfsFile c = new ApfsFile(home, "c", 500, LocalDateTime.now());
		ApfsFile d = new ApfsFile(home, "d", 500, LocalDateTime.now());
		
		code = new ApfsDirectory(home, "code", 0, LocalDateTime.now());
		ApfsFile e = new ApfsFile(code, "e", 500, LocalDateTime.now());
		ApfsFile f = new ApfsFile(code, "f", 500, LocalDateTime.now());
		
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
	
	public static void main (String[] args) {
		apfsDirectoriesInstantiation ();
		LinkedList<ApfsElement> children = new LinkedList<ApfsElement>();
		LinkedList<ApfsDirectory> subdirectories = new LinkedList<ApfsDirectory>();
		LinkedList<ApfsFile> files = new LinkedList<ApfsFile>();
		
		//root - getChildren - Alphabetical
		children = root.getChildren(Comparator.comparing((ApfsElement a) -> a.getName().charAt(0)));
		System.out.println("root - getChildren - Alphabetical");
		System.out.println("---------------------------------");
		for (ApfsElement a: children) {
			System.out.println(a.getName());
		}
		System.out.println();
		//root - getChildren - ReverseAlphabetical
		children = root.getChildren(Comparator.comparing((ApfsElement a) -> a.getName().charAt(0), Comparator.reverseOrder()));
		System.out.println("root - getChildren - ReverseAlphabetical");
		System.out.println("----------------------------------------");
		for (ApfsElement a: children) {
			System.out.println(a.getName());
		}
		System.out.println();
		//root - getSubDirectories - Alphabetical
		subdirectories = root.getSubDirectories(Comparator.comparing((ApfsElement a) -> a.getName().charAt(0)));
		System.out.println("root - getSubDirectories - Alphabetical");
		System.out.println("---------------------------------");
		for (ApfsDirectory a: subdirectories) {
			System.out.println(a.getName());
		}
		System.out.println();
		//root - getSubDirectories - ReverseAlphabetical
		subdirectories = root.getSubDirectories(Comparator.comparing((ApfsElement a) -> a.getName().charAt(0), Comparator.reverseOrder()));
		System.out.println("root - getSubDirectories - ReverseAlphabetical");
		System.out.println("---------------------------------");
		for (ApfsDirectory a: subdirectories) {
			System.out.println(a.getName());
		}
		System.out.println();
		//root - getFiles - Alphabetical
		files = root.getFiles(Comparator.comparing((ApfsElement a) -> a.getName().charAt(0)));
		System.out.println("root - getFiles - Alphabetical");
		System.out.println("------------------------------");
		for (ApfsFile a: files) {
			System.out.println(a.getName());
		}
		//root - getFiles - ReverseAlphabetical
		files = root.getFiles(Comparator.comparing((ApfsElement a) -> a.getName().charAt(0), Comparator.reverseOrder()));
		System.out.println("root - getFiles - ReverseAlphabetical");
		System.out.println("-------------------------------------");
		for (ApfsFile a: files) {
			System.out.println(a.getName());
		}
		System.out.println();
		
		
		
	}
}