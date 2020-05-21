package edu.umb.cs680.hw09.FSFoundation;

import java.time.LocalDateTime;

public abstract class FSElement {
	
	protected String name;
	protected int size;
	protected LocalDateTime creationTime;

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public LocalDateTime getCreationTime() {
		return this.creationTime;
	}
	
	public void setCreationTime(LocalDateTime creationTime) {
		this.creationTime = creationTime;
	}
	//abstract method
	public abstract boolean isDirectory();
	
}