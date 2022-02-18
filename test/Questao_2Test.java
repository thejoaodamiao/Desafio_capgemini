import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author João Damião
 *
 */

class Questao_2Test {

	@Test
	void test() {

		Questao_2 Senha = new Questao_2();
		int result = Senha.verifyPassword("Yab");
		assertEquals(3, result);
	}

}
