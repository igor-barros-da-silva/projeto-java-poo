package pacote.principal;

import pacote.classe.Aluno;

public class App {
	
	/* Main � um m�todo auto execut�vel em Java */
	public static void main(String[] args) {
		
		/* Objeto n�o est� na mem�ria, ele n�o existe */
		Aluno aluno1;
		
		/*======================================================================*/
		
		/* Objeto est� na mem�ria, new = cria um novo objeto */
		/* M�todo construtor */
		Aluno aluno2 = new Aluno(); /* Aqui ser� Maria */
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
		aluno2.setNomeEscola("Col�gio o Santu�rio Java");
		
		aluno2.setNota1(99);
		aluno2.setNota2(78);
		aluno2.setNota3(80);
		aluno2.setNota4(79);
		
		// + = Concatena��o
		System.out.println("Nome da Aluna 2 �: " + aluno2.getNome());
		System.out.println("A idade da Aluna 2 �: " + aluno2.idade);
		System.out.println("Nascimento: " + aluno2.getDataNascimento());
		System.out.println("M�dia do Aluno: " + aluno2.getMediaNota()); // chamando o m�todo getMediaNota
		System.out.println("Resultado: " + aluno2.getAlunoAprovado());
		// ? = Operador tern�rio.
		System.out.println("Resultado: " + (aluno2.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("--------");
		
		/*======================================================================*/
		
		/* new Aluno(); � uma inst�ncia, estamos instanciando o objeto */ 
		/* aluno3 � um refer�ncia ao Aluno */
		Aluno aluno3 = new Aluno(); /* Aqui ser� o Jos� */
		
		aluno3.setNome("Jos�");
		aluno3.idade = 17;
		aluno3.setDataNascimento("09/09/2005");
		
		System.out.println("Nome do Aluno 3 �: " + aluno3.getNome());
		System.out.println("A idade do Aluno 3 �: " + aluno3.idade);
		System.out.println("Nascimento: " + aluno3.getDataNascimento());
		
		/*======================================================================*/
		
		Aluno aluno4 = new Aluno("Maria"); // Passando objeto com valor padr�o com um param�tro.
		
		/*======================================================================*/
		
		Aluno aluno5 = new Aluno("Jos�", 34); // H� v�rias tipos de m�todos construtores.
	}
}
