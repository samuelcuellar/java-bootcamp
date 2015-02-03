package globant.benja;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class WordWrappingTest {
	
	@Test
	public void test1() {
		String[] arreglo = WordWrapping.wrapping("Benjamin",2);
		String[] resultado = {"Be","nj","am","in"};
		Assert.assertArrayEquals(arreglo, resultado);
	}
	
	@Test
	public void test2() {
		String[] arreglo = WordWrapping.wrapping("Benjamin",4);
		String[] resultado = {"Benj","amin"};
		Assert.assertArrayEquals(arreglo, resultado);
	}	
	@Test
	public void test3() {
		String[] arreglo = WordWrapping.wrapping("Benjamin",36);
		String[] resultado = {"Benjamin"};
		Assert.assertArrayEquals(arreglo, resultado);
	}	
	
	@Test
	public void test4() {
		String[] arreglo = WordWrapping.wrapping("Benjamin",6);
		String[] resultado = {"Benjam","in"};
		Assert.assertArrayEquals(arreglo, resultado);
	}
}
