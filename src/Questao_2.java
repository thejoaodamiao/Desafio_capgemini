import java.util.Scanner;
/**
 * Classe 
 * 
 * @author João Damião
 *
 */
public class Questao_2 {

	Scanner sc = new Scanner(System.in);
	String password;

	Questao_2() {

	}

	Questao_2(String password) {
		this.password = password;
	}

	/**
	 * Metodo que pede para o usuario a senha
	 */
	public void insertPassword() {
		if (password.isEmpty()) {
			System.out.println("Senha: ");
			password = sc.nextLine();
		}
		/**
		 * Metodo que verficar a senha
		 */
		verifyPassword(password);
	}
	
	/**
	 * Metodo que verifica a senha que o usuario digitou
	 * 
	 * @param password
	 * @return out
	 */
	int verifyPassword(String password) {

		if (password.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$")) {
			System.out.println("forte");
			return 0;
		}

		else {
			
			if (password.matches("(?=.*?[A-Z])")) {
				System.out.println("falta 1 letra maiscula");
			}
			if (password.matches("(?=.*?[a-z])")) {
				System.out.println("falta 1 letra maiscula");
			}
			if (password.matches("(?=.*?[0-9])")) {
				System.out.println("falta 1 numero");
			}
			if (password.matches("(?=.*?[#?!@$%^&*-])")) {
				System.out.println("falta 1 simbolo");
			}
			int out = 6 - password.length();

			if (out > 0) {
				System.out.println(out);
			}
			return out;
		}
	}//fim Metodo verifyPassword()

}//fim de class
