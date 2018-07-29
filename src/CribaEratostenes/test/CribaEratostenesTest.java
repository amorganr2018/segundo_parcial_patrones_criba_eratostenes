package CribaEratostenes.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import CribaEratostenes.CribaEratostenes;

public class CribaEratostenesTest {
	
	ArrayList<Integer> lista = new ArrayList<Integer>();
	ArrayList<Integer> listaPruebaCorrecta = new ArrayList<Integer>(){{add(2);add(3);add(5);add(7);}};
	ArrayList<Integer> listaPruebaIncorrecta = new ArrayList<Integer>(){{add(2);add(7);}};		


	@Test
	public void testGeneraCribaPositiva() {		
		lista = CribaEratostenes.generaCriba(10);		
		assertEquals(listaPruebaCorrecta, lista);
	}
	
	@Test
	public void testGeneraCribaNegativa() {		
		lista = CribaEratostenes.generaCriba(10);		
		assertNotEquals(listaPruebaIncorrecta, lista);
	}

}
