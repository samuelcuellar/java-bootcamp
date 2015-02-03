package globant.benja;

import org.junit.Assert;
import org.junit.Test;

public class ConversorNrosRomanosTest {
	@Test
	public void test1() {
		String romano = ConversorNrosRomanos.convertir(1);
		Assert.assertEquals(romano, "I");
	}
	@Test
	public void test2() {
		String romano = ConversorNrosRomanos.convertir(2);
		Assert.assertEquals(romano, "II");
	}
	@Test
	public void test4() {
		String romano = ConversorNrosRomanos.convertir(4);
		Assert.assertEquals(romano, "IV");
	}
	@Test
	public void test9() {
		String romano = ConversorNrosRomanos.convertir(9);
		Assert.assertEquals(romano, "IX");
	}
	@Test
	public void test12() {
		String romano = ConversorNrosRomanos.convertir(12);
		Assert.assertEquals(romano, "XII");
	}
	@Test
	public void test125() {
		String romano = ConversorNrosRomanos.convertir(125);
		Assert.assertEquals(romano, "CXXV");
	}
	@Test
	public void test1425() {
		String romano = ConversorNrosRomanos.convertir(1425);
		Assert.assertEquals(romano, "MCDXXV");
	}
	@Test
	public void testIII() {
		int numero = ConversorNrosRomanos.convertir("III");
		Assert.assertEquals(numero, 3);
	}
	@Test
	public void testIV() {
		int numero = ConversorNrosRomanos.convertir("IV");
		Assert.assertEquals(numero, 4);
	}
	@Test
	public void testVII() {
		int numero = ConversorNrosRomanos.convertir("VII");
		Assert.assertEquals(numero, 7);
	}
	@Test
	public void testIX() {
		int numero = ConversorNrosRomanos.convertir("IX");
		Assert.assertEquals(numero, 9);
	}
	@Test
	public void testXVII() {
		int numero = ConversorNrosRomanos.convertir("XVII");
		Assert.assertEquals(numero, 17);
	}
	@Test
	public void testLXII() {
		int numero = ConversorNrosRomanos.convertir("LXII");
		Assert.assertEquals(numero, 62);
	}
	@Test
	public void testXLII() {
		int numero = ConversorNrosRomanos.convertir("XLII");
		Assert.assertEquals(numero, 42);
	}
	@Test
	public void testCXLII() {
		int numero = ConversorNrosRomanos.convertir("CXLII");
		Assert.assertEquals(numero, 142);
	}
	@Test
	public void testCMXLII() {
		int numero = ConversorNrosRomanos.convertir("CMXLII");
		Assert.assertEquals(numero, 942);
	}
	@Test
	public void testDXLII() {
		int numero = ConversorNrosRomanos.convertir("DXLII");
		Assert.assertEquals(numero, 542);
	}
	@Test
	public void testCDXLII() {
		int numero = ConversorNrosRomanos.convertir("CDXLII");
		Assert.assertEquals(numero, 442);
	}
	
}
