package globant.cristian;

import static org.junit.Assert.*;

import org.junit.Test;

public class testEjercicio1 {

	@Test
	public void testConvertToText_1() {
		Check number = new Check(1);
		String word = number.toText();
		assertEquals(word, "Uno");
	}

	@Test
	public void testConvertToText_2() {
		Check number = new Check(2);
		String word = number.toText();
		assertEquals(word, "Dos");
	}

	@Test
	public void testConvertToText_3() {
		Check number = new Check(3);
		String word = number.toText();
		assertEquals(word, "Tres");
	}

	@Test
	public void testConvertToText_4() {
		Check number = new Check(1);
		String word = number.toText();
		assertEquals(word, "Cuatro");
	}

	@Test
	public void testConvertToText_5() {
		Check number = new Check(5);
		String word = number.toText();
		assertEquals(word, "Cinco");
	}

	@Test
	public void testConvertToText_6() {
		Check number = new Check(6);
		String word = number.toText();
		assertEquals(word, "Seis");
	}

	@Test
	public void testConvertToText_7() {
		Check number = new Check(7);
		String word = number.toText();
		assertEquals(word, "Siete");
	}

	@Test
	public void testConvertToText_8() {
		Check number = new Check(8);
		String word = number.toText();
		assertEquals(word, "Ocho");
	}

	@Test
	public void testConvertToText_9() {
		Check number = new Check(9);
		String word = number.toText();
		assertEquals(word, "Nueve");
	}

	@Test
	public void testConvertToText_10() {
		Check number = new Check(10);
		String word = number.toText();
		assertEquals(word, "Diez");
	}

}
