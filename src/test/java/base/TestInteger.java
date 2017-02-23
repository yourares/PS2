package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestInteger {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestiValue() {
		MyInteger i0 = new MyInteger(5);
		i0.setiValue(5);
		assertTrue(i0.getiValue() == 5);
	}

	@Test
	public void TestisEven() {
		MyInteger i1 = new MyInteger(4);
		MyInteger i2 = new MyInteger(3);

		assertTrue(i1.isEven());
		assertFalse(i2.isEven());

		assertTrue(MyInteger.isEven(4));
		assertFalse(MyInteger.isEven(3));

		assertTrue(MyInteger.isEven(i1));
		assertFalse(MyInteger.isEven(i2));

	}

	@Test
	public void TestisOdd() {
		MyInteger i3 = new MyInteger(3);
		MyInteger i4 = new MyInteger(6);

		assertTrue(i3.isOdd());
		assertFalse(i4.isOdd());

		assertTrue(MyInteger.isOdd(3));
		assertFalse(MyInteger.isOdd(6));

		assertTrue(MyInteger.isOdd(i3));
		assertFalse(MyInteger.isOdd(i4));

	}

	@Test
	public void TestisPrime() {
		MyInteger i5 = new MyInteger(5);
		MyInteger i6 = new MyInteger(2);

		assertTrue(i5.isPrime());
		assertFalse(i6.isPrime());

		assertTrue(MyInteger.isPrime(5));
		assertFalse(MyInteger.isPrime(2));

		assertTrue(MyInteger.isPrime(i5));
		assertFalse(MyInteger.isPrime(i6));
	}

	// Test static method:passing in integers and objects
	@Test
	public void TestEquals() {
		MyInteger i7 = new MyInteger(5);
		MyInteger i8 = new MyInteger(5);
		MyInteger i9 = new MyInteger(6);

		// number 5 goes to the iValue
		assertTrue(i7.equals(5));
		assertFalse(i7.equals(3));

		assertTrue(i7.equals(i8));
		assertFalse(i7.equals(i9));
	}

}
