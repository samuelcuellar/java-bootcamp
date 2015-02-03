package globant.benja;

import org.junit.Assert;
import org.junit.Test;

public class ConversorNumericoLiteralTest {
	
	@Test
	public void testUnidadToPalabra() {
		String numeroEnLiteral = ConversorNumericoLiteral.conversor(3);
		Assert.assertEquals(numeroEnLiteral, "tres");
	}

	@Test
	public void test0() {
		String numero = ConversorNumericoLiteral.conversor(0);
		Assert.assertEquals(numero, "cero");
	}

	@Test
	public void test9() {
		String numero = ConversorNumericoLiteral.conversor(9);
		Assert.assertEquals(numero, "nueve");
	}

	@Test
	public void test18() {
		String numero = ConversorNumericoLiteral.conversor(18);
		Assert.assertEquals(numero, "dieciocho");
	}

	@Test
	public void test25() {
		String numero = ConversorNumericoLiteral.conversor(25);
		Assert.assertEquals(numero, "veinticinco");
	}

	@Test
	public void test20() {
		String numero = ConversorNumericoLiteral.conversor(20);
		Assert.assertEquals(numero, "veinte");
	}

	@Test
	public void test34() {
		String numero = ConversorNumericoLiteral.conversor(34);
		Assert.assertEquals(numero, "treinta y cuatro");
	}

	@Test
	public void test30() {
		String numero = ConversorNumericoLiteral.conversor(30);
		Assert.assertEquals(numero, "treinta");
	}

	@Test
	public void test95() {
		String numero = ConversorNumericoLiteral.conversor(95);
		Assert.assertEquals(numero, "noventa y cinco");
	}

	@Test
	public void test100() {
		String numero = ConversorNumericoLiteral.conversor(100);
		Assert.assertEquals(numero, "cien");
	}

	@Test
	public void test125() {
		String numero = ConversorNumericoLiteral.conversor(125);
		Assert.assertEquals(numero, "ciento veinticinco");
	}

	@Test
	public void test225() {
		String numero = ConversorNumericoLiteral.conversor(225);
		Assert.assertEquals(numero, "doscientos veinticinco");
	}

	@Test
	public void test200() {
		String numero = ConversorNumericoLiteral.conversor(200);
		Assert.assertEquals(numero, "doscientos");
	}

	@Test
	public void test800() {
		String numero = ConversorNumericoLiteral.conversor(800);
		Assert.assertEquals(numero, "ochocientos");
	}

	@Test
	public void test950() {
		String numero = ConversorNumericoLiteral.conversor(950);
		Assert.assertEquals(numero, "novecientos cincuenta");
	}

	@Test
	public void test1000() {
		String numero = ConversorNumericoLiteral.conversor(1000);
		Assert.assertEquals(numero, "mil");
	}

	@Test
	public void test2352() {
		String numero = ConversorNumericoLiteral.conversor(2352);
		Assert.assertEquals(numero, "dos mil trescientos cincuenta y dos");
	}

	@Test
	public void test1749() {
		String numero = ConversorNumericoLiteral.conversor(1749);
		Assert.assertEquals(numero, "mil setecientos cuarenta y nueve");
	}

	@Test
	public void test100345() {
		String numero = ConversorNumericoLiteral.conversor(100345);
		Assert.assertEquals(numero, "cien mil trescientos cuarenta y cinco");
	}

	@Test
	public void test2352con25() {
		String numero = ConversorNumericoLiteral.conversor(2352.25);
		Assert.assertEquals(numero, "dos mil trescientos cincuenta y dos con 25/100");
	}
}
