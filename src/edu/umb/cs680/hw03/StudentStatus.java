package edu.umb.cs680.hw03;

public enum StudentStatus {
	INSTATE(10000L),
	OUTSTATE(20000L),
	INTL(30000L);
	
	private float tuition;
	
	private StudentStatus(float tuition) {
		//the element construct this object
		this.tuition = tuition;
	}
	
	public float getTuition() {
		return tuition;
	}
}
