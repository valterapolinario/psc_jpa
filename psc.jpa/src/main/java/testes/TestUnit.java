package testes;

import junit.framework.TestCase;
import model.Calculo;

public class TestUnit extends TestCase {
public void testParImpar() {
	float valor = 15;
	boolean retornoEsperado = true;
	boolean retornoFeito = Calculo.testaParImpar(valor);
	assertEquals(retornoEsperado,retornoFeito);
}
}
