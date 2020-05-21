package edu.umb.cs680.hw08;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class Directory extends FSElement {
	private LinkedList<FSElement> children = new LinkedList<FSElement>();
	private FileSystem fileSystem = FileSystem.getFileSystem();
	private int totalSize = 0;
	
	public Directory (Directory parent, String name, int size, LocalDateTime creationTime) {
		super(parent, name, size, creationTime);
	}
	
	public LinkedList<FSElement> getChildren() {
		return this.children;
	}
	
	public void appendChild(FSElement child) {
		this.children.add(child);
		child.setParent(this);
	}
	
	public int countChildren() {
		return children.size();
	}
	
	public LinkedList<Directory> getSubDirectories() {
		LinkedList<Directory> directoryList = new LinkedList<Directory>();
		
		for (FSElement child: children) {
			if (child.isDirectory())
				directoryList.add((Directory) child);
		}
		
		return directoryList;
	}
	
	public LinkedList<File> getFiles() {
		LinkedList<File> fileList = new LinkedList<File>();
		
		for (FSElement child: children) {
			if (!child.isDirectory())
				fileList.add((File) child);
		}
		
		return fileList;
	}
	
	public int getTotalSize() {
		for (FSElement child: children) {
			if (child.isDirectory()) {
				//recursively call when it is a directory
				Directory childD = (Directory) child;
				totalSize = childD.getTotalSize();
			}
			else {
				totalSize += child.getSize();
			}
		}
		
		return totalSize;
	}
	
	public FileSystem getFileSystem() {
		return this.fileSystem;
	}
	
	
	
	
	
	
	public boolean isDirectory() {
		return true;
	}
}