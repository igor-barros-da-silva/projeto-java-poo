package pacote.principal;

import pacote.classe.Aluno;

public class App {
	
	/* Main é um método auto executável em Java */
	public static void main(String[] args) {
		
		/* Objeto não está na memória, ele não existe */
		Aluno aluno1;
		
		/* Objeto está na memória, new = cria um novo objeto */
		/* Método construtor */
		Aluno aluno2 = new Aluno(); /* Aqui será Maria */
		
		/* new Aluno(); é uma instância, estamos instanciando o objeto */ 
		/* aluno3 é um referência ao Aluno */
		Aluno aluno3 = new Aluno(); /* Aqui será o José */
		
		Aluno aluno4 = new Aluno("Maria"); // Passando objeto com valor padrão com um paramêtro.
		
		Aluno aluno5 = new Aluno("José", 34); // Há várias tipos de métodos construtores.
	}
}
