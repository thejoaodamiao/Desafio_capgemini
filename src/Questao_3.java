
import java.util.*;

/**
 * Classe que conta os anagramas de uma string
 * 
 * @author João Damião
 *
 */
public class Questao_3 {
	Scanner sc = new Scanner(System.in);
	String anagram;

	Questao_3() {

	}

	Questao_3(String anagram) {
		this.anagram = anagram;

	}

	/**
	 * Metodo que verifica se tem anagrama e pede para o usuario
	 */

	public void countAnagram() {

		if (anagram.isEmpty()) {
			anagram = sc.next().trim();
			System.out.println(numOfAnagram(anagram));
		}

	}// fim de Metodo countAnagram()

	/**
	 * Metodo que retorna o munero de anagramas
	 * 
	 * @param str
	 * @return total
	 */
	public int numOfAnagram(String str) {
		int total = 0;
		for (int i = 1; i < str.length(); ++i) {
			int[] tmpstr = new int[26];

			for (int j = i; j >= 0; --j) {
				tmpstr[str.charAt(j) - 'a']++;

				for (int k = 0; k < j; ++k) {
					int[] chars = new int[26];
					int x = k;
					int count = 0;
					while (count <= i - j) {
						++chars[str.charAt(x) - 'a'];
						++x;
						++count;
					}
					boolean flag = true;
					for (x = 0; x < 26; ++x) {
						if (tmpstr[x] != chars[x]) {
							flag = false;
							break;
						}
					}
					if (flag) {
						++total;
					}

				}

			}
		}
		return total;
	}// fim de Metodo numOfAnagram(str)
}// fim de class