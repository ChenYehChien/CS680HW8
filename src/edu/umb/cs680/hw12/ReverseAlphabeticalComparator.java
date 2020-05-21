package edu.umb.cs680.hw12;

import java.util.Comparator;

import edu.umb.cs680.hw09.APFS.ApfsElement;

public class ReverseAlphabeticalComparator implements Comparator<ApfsElement> {
	
	public int compare(ApfsElement a1, ApfsElement a2) {
		return Integer.parseInt(a2.getName()) - Integer.parseInt(a1.getName());
	}
	
}