package edu.umb.cs680.hw07;

import java.util.LinkedList;

//singleton
public class FileSystem {
	private FileSystem() {}
	private static FileSystem instance = null;
	
	private LinkedList<Directory> rootDirs = new LinkedList<Directory>();
	
	public static FileSystem getFileSystem() {
		if (instance == null)
			instance = new FileSystem();
		return instance;
	}
	
	//new added
	//static?
	public void addRootDir(Directory root) {
		rootDirs.add(root);
	}
	
	public LinkedList<Directory> getRootDirs() {
		return this.rootDirs;
	}
}