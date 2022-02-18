import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * Classe que desenha a escada de asteriscos
 * 
 * @author João Damião
 *
 */
public class Questao_1 {

	Scanner sc = new Scanner(System.in);
	int numStairs = 0;
	String d;

	Questao_1() {

	}

	Questao_1(int stairs) {
		this.numStairs = stairs;
	}
	
	/**
	 * Metodo que pede o input(numero de degraus)
	 */
	
	public void insertStairs() {
		if (numStairs == 0) {
			System.out.print("Digite a quantidade de vezes: ");
			numStairs = sc.nextInt();

		}
		
		/**
		 * Metodo que cria a escada
		 */
		createLadder(numStairs);
	}//fim Metodo insertStairs()
	
	/**
	 * Metodo recebe o numero de degraus e os desenha
	 * 
	 * @param numStairs
	 */

	public void createLadder(int numStairs) {
		List<String> stairs = new ArrayList<>();

		for (int i = 0; i < numStairs; i++) {
			stairs.add(" ".repeat(numStairs - i) + "*".repeat(i + 1));
		}//fim for

		for ( String d : stairs) {
			System.out.println(d);
		}//fim for
	}//fim Metodo createLadder()
}//fim de class
