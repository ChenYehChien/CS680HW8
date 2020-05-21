package edu.umb.cs680.hw12;

import java.util.Comparator;

import edu.umb.cs680.hw09.APFS.ApfsElement;

public class TimeStampComparator implements Comparator<ApfsElement> {

	public int compare(ApfsElement a1, ApfsElement a2) {
		return a1.getLastModifiedTime().compareTo(a2.getLastModifiedTime());
	}
	
}