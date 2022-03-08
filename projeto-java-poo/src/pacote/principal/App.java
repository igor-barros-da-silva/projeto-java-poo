package pacote.principal;

import pacote.classe.Aluno;

public class App {
	
	/* Main é um método auto executável em Java */
	public static void main(String[] args) {
		
		/* Objeto não está na memória, ele não existe */
		Aluno aluno1;
		
		/*======================================================================*/
		
		/* Objeto está na memória, new = cria um novo objeto */
		/* Método construtor */
		Aluno aluno2 = new Aluno(); /* Aqui será Maria */
		// Declarando o nome
		aluno2.setNome("Maria");
		aluno2.idade = 16;
		aluno2.setDataNascimento("30/11/2006");
		aluno2.setRegistroGeral("85215412");
		aluno2.setNumeroCpf("155.055.152-56");
		aluno2.setNomeMae("Joana");
		aluno2.setNomePai("Carlos");
		aluno2.setDataMatricula("10/02/2002");
		aluno2.setSerieMatriculado("9");
		aluno2.setNomeEscola("Colégio o Santuário Java");
		
		// + = Concatenação
		System.out.println("Nome da Aluna 2 é: " + aluno2.getNome());
		System.out.println("A idade da Aluna 2 é: " + aluno2.idade);
		System.out.println("Nascimento: " + aluno2.getDataNascimento());
		
		/*======================================================================*/
		
		/* new Aluno(); é uma instância, estamos instanciando o objeto */ 
		/* aluno3 é um referência ao Aluno */
		Aluno aluno3 = new Aluno(); /* Aqui será o José */
		
		aluno3.setNome("José");
		aluno3.idade = 17;
		aluno3.setDataNascimento("09/09/2005");
		
		System.out.println("Nome do Aluno 3 é: " + aluno3.getNome());
		System.out.println("A idade do Aluno 3 é: " + aluno3.idade);
		System.out.println("Nascimento: " + aluno3.getDataNascimento());
		
		/*======================================================================*/
		
		Aluno aluno4 = new Aluno("Maria"); // Passando objeto com valor padrão com um paramêtro.
		
		/*======================================================================*/
		
		Aluno aluno5 = new Aluno("José", 34); // Há várias tipos de métodos construtores.
	}
}
