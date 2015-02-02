package globant.cristian;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class TestNumbers{

	@Test
	public void testRomanToInt_1() {

		Roman roman = new Roman("I");
		int number_int = roman.toInt();
		assertEquals(number_int, 1);
	}

	@Test
	public void testRomanToInt_2() {

		Roman roman = new Roman("II");
		int number_int = roman.toInt();
		assertEquals(number_int, 2);
	}

	@Test
	public void testRomanToInt_3() {

		Roman roman = new Roman("III");
		int number_int = roman.toInt();
		assertEquals(number_int, 3);
	}

	@Test
	public void testRomanToInt_4() {

		Roman roman = new Roman("IV");
		int number_int = roman.toInt();
		assertEquals(number_int, 4);
	}

	@Test
	public void testRomanToInt_5() {

		Roman roman = new Roman("V");
		int number_int = roman.toInt();
		assertEquals(number_int, 5);
	}

	@Test
	public void testRomanToInt_6() {

		Roman roman = new Roman("VI");
		int number_int = roman.toInt();
		assertEquals(number_int, 6);
	}

	@Test
	public void testRomanToInt_7() {

		Roman roman = new Roman("VII");
		int number_int = roman.toInt();
		assertEquals(number_int, 7);
	}

	@Test
	public void testRomanToInt_8() {

		Roman roman = new Roman("VIII");
		int number_int = roman.toInt();
		assertEquals(number_int, 8);
	}

	@Test
	public void testRomanToInt_9() {

		Roman roman = new Roman("IX");
		int number_int = roman.toInt();
		assertEquals(number_int, 9);
	}

	@Test
	public void testRomanToInt_10() {

		Roman roman = new Roman("X");
		int number_int = roman.toInt();
		assertEquals(number_int, 10);
	}

	@Test
	public void testRomanToInt_50() {

		Roman roman = new Roman("L");
		int number_int = roman.toInt();
		assertEquals(number_int, 50);
	}

	@Test
	public void testRomanToInt_100() {

		Roman roman = new Roman("C");
		int number_int = roman.toInt();
		assertEquals(number_int, 100);
	}

	@Test
	public void testRomanToInt_500() {

		Roman roman = new Roman("D");
		int number_int = roman.toInt();
		assertEquals(number_int, 500);
	}

	@Test
	public void testRomanToInt_1000() {

		Roman roman = new Roman("M");
		int number_int = roman.toInt();
		assertEquals(number_int, 1000);
	}

}