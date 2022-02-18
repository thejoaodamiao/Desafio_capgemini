
/**
 * Classe main
 * 
 * @author João Damião
 *
 */
public class Main {

	public static void main(String[] args) {
		Questao_1 Escada = new Questao_1();
		Questao_2 Senha = new Questao_2();
		Questao_3 Anagrama = new Questao_3();

		Senha.insertPassword();
		Anagrama.countAnagram();
		Escada.insertStairs();

	}
}
