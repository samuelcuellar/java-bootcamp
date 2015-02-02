package globant.cristian;

import org.junit.Assert;
import org.junit.Test;

public class TestWordWrapping {

	@Test
	public void testRowLength_60() {
		String sCadena = "Hello World!";
		String sSubCadena = sCadena.substring(0, 30);

		Assert.assertEquals(sSubCadena, 30);
	}

	@Test
	public void testRowLength_7() {
		String sCadena = "Hello World!";
		String sSubCadena = sCadena.substring(0, 7);
		String sSubCadena2 = sCadena.substring(8, 60);

		Assert.assertEquals(sSubCadena, 7);
	}

	@Test
	public void testRowLength_3() {
		String sCadena = "Hello World!";
		String sSubCadena = sCadena.substring(0, 3);
		String sSubCadena2 = sCadena.substring(3, 60);
		Assert.assertEquals(sSubCadena, 3);
	}

	@Test
	public void testRowLength_5() {
		String sCadena = "Hello World!";
		String sSubCadena = sCadena.substring(0, 5);
		String sSubCadena2 = sCadena.substring(5, 60);
		Assert.assertEquals(sSubCadena, 5);
	}
}
