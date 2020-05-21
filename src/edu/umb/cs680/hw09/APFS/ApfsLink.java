package edu.umb.cs680.hw09.APFS;

import java.time.LocalDateTime;

public class ApfsLink extends ApfsElement {
	private ApfsElement target;
	
	public ApfsLink (ApfsDirectory parent, String name, int size, LocalDateTime creationTime, ApfsElement target) {
		super(parent, name, size, creationTime);
		this.target = target;
	}
	
	public void setTarget(ApfsElement target) {
		this.target = target;
	}
	
	public ApfsElement getTarget() {
		return this.target;
	}
	
	public boolean isDirectory() {
		return false;
	}

	//hw10
	public void accept(ApfsFSVisitor v) {
		v.visit(this);
		
	}
	
}