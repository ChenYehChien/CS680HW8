package edu.umb.cs680.hw03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {
	
	//In-State Student
	@Test
	public void testCreateInState() {
		try {
			Student s1 = Student.createInStateStudent("Sam", "MA");
			String[] expected = {"Sam", "MA"};
			String[] actual = {s1.getName(), s1.getUsAddr()};
			assertArrayEquals(expected, actual);
		}
		catch (RuntimeException e) {
			fail();
		}
	}
	
	@Test
	public void testCreateInStateWithNameNullFail() {
		try {
			Student s1 = Student.createInStateStudent(null, "MA");
			fail();
		}
		catch (RuntimeException e) {
			assertEquals("invalid name or usAddr", e.getMessage());
		}
	}
	
	@Test
	public void testCreateInStateWithUsAddrNullFail() {
		try {
			Student s1 = Student.createInStateStudent("Sam", null);
			fail();
		}
		catch (RuntimeException e) {
			assertEquals("invalid name or usAddr", e.getMessage());
		}
	}
	
	@Test
	public void testCreateInStateTuitionMatch() {
		try {
			Student s1 = Student.createInStateStudent("Sam", "MA");
			float expected = 10000L;
			float actual = s1.getTuition();
			assertEquals(expected, actual);
		}
		catch (RuntimeException e) {
			fail();
		}
	}
	
	@Test
	public void testCreateInStateTuition() {
		try {
			Student s1 = Student.createInStateStudent("Sam", "MA");
			Student s2 = Student.createInStateStudent("Jeff", "LA");
			assertEquals(s1.getTuition(), s2.getTuition());
		}
		catch (RuntimeException e) {
			fail();
		}
	}
	
	//Out-State Student
	@Test
	public void testCreateOutState() {
		try {
			Student s1 = Student.createOutStateStudent("Sam", "MA", 1);
			String[] expected = {"Sam", "MA"};
			String[] actual = {s1.getName(), s1.getUsAddr()};
			assertArrayEquals(expected, actual);
			assertEquals(1, s1.getYrsInState());
		}
		catch (RuntimeException e) {
			fail();
		}
	}
	
	@Test
	public void testCreateOutStateWithNameNullFail() {
		try {
			Student s1 = Student.createOutStateStudent(null, "MA", 1);
			fail();
		}
		catch (RuntimeException e) {
			assertEquals("invalid name, usAddr or yrsInState", e.getMessage());
		}
	}
	
	@Test
	public void testCreateOutStateWithUsAddrNullFail() {
		try {
			Student s1 = Student.createOutStateStudent("Sam", null, 1);
			fail();
		}
		catch (RuntimeException e) {
			assertEquals("invalid name, usAddr or yrsInState", e.getMessage());
		}
	}
	
	@Test
	public void testCreateOutStateWithNegativeYrsInStateFail() {
		try {
			Student s1 = Student.createOutStateStudent("Sam", "MA", -1);
			fail();
		}
		catch (RuntimeException e) {
			assertEquals("invalid name, usAddr or yrsInState", e.getMessage());
		}
	}
	
	@Test
	public void testCreateOutStateTuitionMatch() {
		try {
			Student s1 = Student.createOutStateStudent("Sam", "MA", 1);
			float expected = 20000L;
			float actual = s1.getTuition();
			assertEquals(expected, actual);
		}
		catch (RuntimeException e) {
			fail();
		}
	}
	
	@Test
	public void testCreateOutStateTuition() {
		try {
			Student s1 = Student.createOutStateStudent("Sam", "MA", 1);
			Student s2 = Student.createOutStateStudent("Jeff", "LA", 1);
			assertEquals(s1.getTuition(), s2.getTuition());
		}
		catch (RuntimeException e) {
			fail();
		}
	}
	
	//International Student
	@Test
	public void testCreateIntl() {
		try {
			Student s1 = Student.createIntlStudent("Sam", "MA", 1, "TAIWAN");
			String[] expected = {"Sam", "MA", "TAIWAN"};
			String[] actual = {s1.getName(), s1.getUsAddr(), s1.getForeignAddr()};
			assertArrayEquals(expected, actual);
			assertEquals(1, s1.getI20num());
		}
		catch (RuntimeException e) {
			fail();
		}
	}
	
	@Test
	public void testCreateIntlWithNameNullFail() {
		try {
			Student s1 = Student.createIntlStudent(null, "MA", 1, "TAIWAN");
			fail();
		}
		catch (RuntimeException e) {
			assertEquals("invalid name, usAddr, i20num or foreignAddr", e.getMessage());
		}
	}
	
	@Test
	public void testCreateIntlWithUsAddrNullFail() {
		try {
			Student s1 = Student.createIntlStudent("Sam", null, 1, "TAIWAN");
			fail();
		}
		catch (RuntimeException e) {
			assertEquals("invalid name, usAddr, i20num or foreignAddr", e.getMessage());
		}
	}
	
	@Test
	public void testCreateIntlWithNegativeI20numFail() {
		try {
			Student s1 = Student.createIntlStudent("Sam", "MA", -1, "TAIWAN");
			fail();
		}
		catch (RuntimeException e) {
			assertEquals("invalid name, usAddr, i20num or foreignAddr", e.getMessage());
		}
	}
	
	@Test
	public void testCreateIntlWithForeignAddrNullFail() {
		try {
			Student s1 = Student.createIntlStudent("Sam", "MA", 1, null);
			fail();
		}
		catch (RuntimeException e) {
			assertEquals("invalid name, usAddr, i20num or foreignAddr", e.getMessage());
		}
	}
	
	@Test
	public void testCreateIntlTuitionMatch() {
		try {
			Student s1 = Student.createIntlStudent("Sam", "MA", 1, "TAIWAN");
			float expected = 30000L;
			float actual = s1.getTuition();
			assertEquals(expected, actual);
		}
		catch (RuntimeException e) {
			fail();
		}
	}
	
	@Test
	public void testCreateIntlTuition() {
		try {
			Student s1 = Student.createIntlStudent("Sam", "MA", 1, "TAIWAN");
			Student s2 = Student.createIntlStudent("Jeff", "LA", 1, "TAIWAN");
			assertEquals(s1.getTuition(), s2.getTuition());
		}
		catch (RuntimeException e) {
			fail();
		}
	}
	

}
