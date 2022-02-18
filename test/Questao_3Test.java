import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author João Damião
 *
 */

class Questao_3Test {

	@Test
	void test() {
		Questao_3 Anagram = new Questao_3();
		int result = Anagram.numOfAnagram("ifailuhkqq");
		assertEquals(3, result);
	}

}
