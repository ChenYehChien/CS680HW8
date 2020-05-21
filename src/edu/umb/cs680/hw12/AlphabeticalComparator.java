package edu.umb.cs680.hw12;

import java.util.Comparator;

import edu.umb.cs680.hw09.APFS.ApfsElement;

public class AlphabeticalComparator implements Comparator<ApfsElement> {
	public int compare(ApfsElement a1, ApfsElement a2) {
		return a1.getName().charAt(0) - a2.getName().charAt(0);
	}
	
}