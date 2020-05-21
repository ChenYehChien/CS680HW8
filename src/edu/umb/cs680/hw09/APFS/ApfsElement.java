package edu.umb.cs680.hw09.APFS;

import java.time.LocalDateTime;
import edu.umb.cs680.hw09.FSFoundation.FSElement;

public abstract class ApfsElement extends FSElement {
	protected ApfsDirectory parent;
	protected String ownerName;
	protected LocalDateTime lastModified;
	
	public ApfsElement(ApfsDirectory parent, String name, int size, LocalDateTime creationTime) {
		this.parent = parent;
		this.name = name;
		this.size = size;
		this.creationTime = creationTime;
	}
	
	public ApfsDirectory getParent() {
		return this.parent;
	}
	
	public void setParent(ApfsDirectory parent) {
		this.parent = parent;
	}
	
	//new added
	public String getOwnerName() {
		return this.ownerName;
	}
			
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
			
	public LocalDateTime getLastModifiedTime() {
		return this.lastModified;
	}
			
	public void setLastModifiedTime(LocalDateTime lastModified) {
		this.lastModified = lastModified;
	}
	
	public abstract void accept(ApfsFSVisitor v);
	
	public abstract boolean isDirectory();
	
}