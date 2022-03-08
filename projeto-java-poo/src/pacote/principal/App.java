package pacote.principal;

import javax.swing.JOptionPane;

import pacote.classe.Aluno;

public class App {
	
	/* Main � um m�todo auto execut�vel em Java */
	public static void main(String[] args) {
		
		/* Objeto n�o est� na mem�ria, ele n�o existe */
		Aluno aluno1;
		
		/*======================================================================*/
		
		// Entrada de dados com o teclado.
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno?");
		String registroGeral = JOptionPane.showInputDialog("Qual o RG do aluno?");
		String numeroCpf = JOptionPane.showInputDialog("Qual o CPF do aluno?");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da m�e?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai?");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da matr�cula?");
		String serieMatriculado = JOptionPane.showInputDialog("Qual a s�rie do aluno?");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola?");
		String nota1 = JOptionPane.showInputDialog("Nota 1: ");
		String nota2 = JOptionPane.showInputDialog("Nota 2: ");
		String nota3 = JOptionPane.showInputDialog("Nota 3: ");
		String nota4 = JOptionPane.showInputDialog("Nota 4: ");
		
		/* Objeto est� na mem�ria, new = cria um novo objeto */
		/* M�todo construtor */
		Aluno aluno2 = new Aluno(); /* Aqui ser� Maria */
		// Declarando o nome
		//aluno2.setNome("Maria");		
		//aluno2.idade = 16;
		//aluno2.setDataNascimento("30/11/2006");
		//aluno2.setRegistroGeral("85215412");
		//aluno2.setNumeroCpf("155.055.152-56");
		//aluno2.setNomeMae("Joana");
		//aluno2.setNomePai("Carlos");
		//aluno2.setDataMatricula("10/02/2002");
		//aluno2.setSerieMatriculado("9");
		//aluno2.setNomeEscola("Col�gio o Santu�rio Java");
		
		//aluno2.setNota1(99);
		//aluno2.setNota2(78);
		//aluno2.setNota3(80);
		//aluno2.setNota4(79);
		
		aluno2.setNome(nome); // Nome din�mico atrav�s da entrada de dados com teclado.
		aluno2.setIdade(Integer.valueOf(idade)); // Convertendo integer para string.
		aluno2.setDataNascimento(dataNascimento);
		aluno2.setRegistroGeral(registroGeral);
		aluno2.setRegistroGeral(registroGeral);
		aluno2.setNomeMae(nomeMae);
		aluno2.setNomePai(nomePai);
		aluno2.setDataMatricula(dataMatricula);
		aluno2.setSerieMatriculado(serieMatriculado);
		aluno2.setNomeEscola(nomeEscola);
		
		aluno2.setNota1(Double.parseDouble(nota1));// Convertendo double para string.
		aluno2.setNota2(Double.parseDouble(nota2));
		aluno2.setNota3(Double.parseDouble(nota3));
		aluno2.setNota4(Double.parseDouble(nota4));
		
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
