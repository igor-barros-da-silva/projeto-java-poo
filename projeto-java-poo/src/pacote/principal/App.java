package pacote.principal;

import javax.swing.JOptionPane;

import pacote.classe.Aluno;

public class App {
	
	/* Main é um método auto executável em Java */
	public static void main(String[] args) {
		
		/* Objeto não está na memória, ele não existe */
		Aluno aluno1;
		
		/*======================================================================*/
		/*
		// Entrada de dados com o teclado.
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno?");
		String registroGeral = JOptionPane.showInputDialog("Qual o RG do aluno?");
		String numeroCpf = JOptionPane.showInputDialog("Qual o CPF do aluno?");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai?");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da matrícula?");
		String serieMatriculado = JOptionPane.showInputDialog("Qual a série do aluno?");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola?");
		String nota1 = JOptionPane.showInputDialog("Nota 1: ");
		String nota2 = JOptionPane.showInputDialog("Nota 2: ");
		String nota3 = JOptionPane.showInputDialog("Nota 3: ");
		String nota4 = JOptionPane.showInputDialog("Nota 4: ");
		*/
		/* Objeto está na memória, new = cria um novo objeto */
		/* Método construtor */
		Aluno aluno2 = new Aluno(); /* Aqui será Maria */
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
		//aluno2.setNomeEscola("Colégio o Santuário Java");
		
		//aluno2.setNota1(99);
		//aluno2.setNota2(78);
		//aluno2.setNota3(80);
		//aluno2.setNota4(79);
		/*
		aluno2.setNome(nome); // Nome dinâmico através da entrada de dados com teclado.
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
		
		// + = Concatenação
		System.out.println("Nome da Aluna 2 é: " + aluno2.getNome());
		System.out.println("A idade da Aluna 2 é: " + aluno2.idade);
		System.out.println("Nascimento: " + aluno2.getDataNascimento());
		System.out.println("Média do Aluno: " + aluno2.getMediaNota()); // chamando o método getMediaNota
		System.out.println("Resultado: " + aluno2.getAlunoAprovado());
		// ? = Operador ternário.
		System.out.println("Resultado: " + (aluno2.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("--------");
		
		// Descrição do objeto na memória
		System.out.println(aluno2.toString());		
		*/
		/*======================================================================*/
		
		//new Aluno(); é uma instância, estamos instanciando o objeto
		// aluno3 é um referência ao Aluno
		Aluno aluno3 = new Aluno(); /* Aqui será o José */
		
		aluno3.setNome("José");
		aluno3.idade = 17;
		aluno3.setDataNascimento("09/09/2005");
		
		System.out.println("Nome do Aluno 3 é: " + aluno3.getNome());
		System.out.println("A idade do Aluno 3 é: " + aluno3.idade);
		System.out.println("Nascimento: " + aluno3.getDataNascimento());
		
		/*======================================================================*/
		
		// Passando objeto com valor padrão com um paramêtro.
		Aluno aluno4 = new Aluno("Maria");
		
		/*======================================================================*/
		
		// Há várias tipos de métodos construtores.
		Aluno aluno5 = new Aluno("José", 34);
		
		/*======================================================================*/
		
		// Equals e Hashcode - Diferenciar e comparar objetos.
		Aluno aluno6 = new Aluno();
		aluno6.setNome("Igor");
		
		Aluno aluno7 = new Aluno();
		aluno7.setNome("Igor");
		
		// O Java diferencia os objetos com o código em memória.
		if(aluno6.equals(aluno7)) {
			System.out.println("Os alunos são iguais!");
		}else
			System.out.println("Os alunos não são iguais!");
	}
}
