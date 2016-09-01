package Tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Calculatrice.Calculatrice;

public class CalculatriceTest {

	private Calculatrice calc1;
	//instanciation d'un NOUVEL objet avant chaque test
	@Before
	public void avantchaquetest () {
	calc1 = new Calculatrice();
	}
	//déclaration du résultat
	double result;
	
	
	//batterie de tests
	@Test
	public void testAddition() {
		result = calc1.addition(2.3, 2.2);
		Assert.assertEquals(result, 4.5, 0.00000000001);
	}
	@Test
	public void testAddition2() {
		result = calc1.addition(2.3, 2.2);
		Assert.assertNotNull(result);
	}

	@Test
	public void testSoustraction() {
		result = calc1.soustraction(10.1, 3.4);
		Assert.assertEquals(result, 6.7, 0.00000000001);
	}
	@Test
	public void testSoustraction2() {
		result = calc1.soustraction(10.1, 3.4);
		Assert.assertTrue(result > 4);
	}

	@Test
	public void testMultiplication() {
		result = calc1.multiplication(3.2, 10);
		Assert.assertEquals(result, 32, 0.00000000001);
	}

	@Test
	public void testDivision() {
		result = calc1.division(53, 53);
		Assert.assertEquals(result, 1, 0.00000000001);
	}

}
