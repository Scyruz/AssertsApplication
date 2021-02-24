package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OtherClassTest {
OtherClass other = new OtherClass();

	@Test
	public void testMultiply() {
		int expected = 6;
		int actual = other.multiply(2, 3);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMultiply_ExceptionIsThrown() {
		throw new UnsupportedOperationException("Numbers are greater than 1000");
	}

}
