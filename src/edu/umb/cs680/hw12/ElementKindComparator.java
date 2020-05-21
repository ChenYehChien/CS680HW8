package edu.umb.cs680.hw12;

import java.util.Comparator;

import edu.umb.cs680.hw09.APFS.ApfsElement;

public class ElementKindComparator implements Comparator<ApfsElement> {

	public int compare(ApfsElement a1, ApfsElement a2) {
		//use the method "isDirectory() to identify the corresponding element whether 
		//or not a directory and use the method getSize() to identify the residual element
		// whether or not a file or a link
		if (a1.isDirectory()) {
			//a1 is a directory
			if (a2.isDirectory()) 
				return 0;
			else if (!a2.isDirectory() && a2.getSize() == 500)
				return 1;
			else
				return 2;
		}
		else if (!a1.isDirectory() && a1.getSize() == 500) {
			//a1 is a file
			if (a2.isDirectory())
				return -1;
			else if (!a2.isDirectory() && a2.getSize() == 500)
				return 0;
			else
				return 1;
		}
		else {
			//a1 is a link
			if (a2.isDirectory())
				return -2;
			else if (!a2.isDirectory() && a2.getSize() == 500)
				return -1;
			else
				return 0;
		}
	}
	
}