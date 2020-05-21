package edu.umb.cs680.hw03;

public class Student {
	private int i20num;
	private int yrsInState;
	private float tuition; //from enum
	private String name;
	private String usAddr;
	private String foreignAddr;
	private StudentStatus status;
	
	private Student(String name, String usAddr, int yrsInState, int i20num, String foreignAddr, StudentStatus status) {
		this.name = name;
		this.usAddr = usAddr;
		this.yrsInState = yrsInState;
		this.i20num = i20num;
		this.foreignAddr = foreignAddr;
		this.status = status;
	}
	
	public static Student createInStateStudent(String name, String usAddr) {
		if (name == null || usAddr == null)
			throw new RuntimeException("invalid name or usAddr");
		else
			return new Student(name, usAddr, -1, -1, null, StudentStatus.INSTATE);
	}
	public static Student createOutStateStudent(String name, String usAddr, int yrsInState) {
		if (name == null || usAddr == null || yrsInState < 0) 
			throw new RuntimeException("invalid name, usAddr or yrsInState");
		else
			return new Student(name, usAddr, yrsInState, -1, null, StudentStatus.OUTSTATE);
	}
	public static Student createIntlStudent(String name, String usAddr, int i20num, String foreignAddr) {
		if (name == null || usAddr == null || i20num < 0 || foreignAddr == null)
			throw new RuntimeException("invalid name, usAddr, i20num or foreignAddr");
		else
			return new Student(name, usAddr, -1, i20num, foreignAddr, StudentStatus.INTL);
	}
	
	public int getI20num() {
		return this.i20num;
	}
	public int getYrsInState() {
		return this.yrsInState;
	}
	public float getTuition() {
		tuition = status.getTuition();
		return tuition; //different
	}
	public String getName() {
		return this.name;
	}
	public String getUsAddr() {
		return this.usAddr;
	}
	public String getForeignAddr() {
		return this.foreignAddr;
	}
	public StudentStatus getStatus() {
		return this.status;
	}

	
	
	
	
	
	
	
	
}