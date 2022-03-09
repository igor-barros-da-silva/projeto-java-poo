package pacote.principal;

import javax.swing.JOptionPane;

import pacote.classe.Aluno;
import pacote.classe.Disciplina;

public class App {
	
	/* Main é um método auto executável em Java */
	public static void main(String[] args) {
		
		/* Objeto não está na memória, ele não existe */
		Aluno aluno1;
		
		/*======================================================================*/
		
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
		
		// Objeto está na memória, new = cria um novo objeto.
		// Método construtor.
		Aluno aluno2 = new Aluno();		
		
		// Nome dinâmico através da entrada de dados com teclado.
		// Convertendo integer para string.
		aluno2.setNome(nome); 
		aluno2.setIdade(Integer.valueOf(idade)); 
		aluno2.setDataNascimento(dataNascimento);
		aluno2.setRegistroGeral(registroGeral);
		aluno2.setRegistroGeral(registroGeral);
		aluno2.setNumeroCpf(numeroCpf);
		aluno2.setNomeMae(nomeMae);
		aluno2.setNomePai(nomePai);
		aluno2.setDataMatricula(dataMatricula);
		aluno2.setSerieMatriculado(serieMatriculado);
		aluno2.setNomeEscola(nomeEscola);
		
		//  Criando a lista dinâmica das disciplinas do aluno.
		for(int posicao = 1; posicao <= 4; posicao ++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Qual o nome da disciplina "+posicao+"?");
			String notaDisciplina = JOptionPane.showInputDialog("Qual a nota da disciplina "+posicao+"?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno2.getDisciplinas().add(disciplina);
		}
				
		// + = Concatenação
		System.out.println("Nome da Aluna 2 é: " + aluno2.getNome());
		System.out.println("A idade da Aluna 2 é: " + aluno2.getIdade());
		System.out.println("Nascimento: " + aluno2.getDataNascimento());
		System.out.println("Média do Aluno: " + aluno2.getMediaNota()); // chamando o método getMediaNota
		System.out.println("Resultado: " + aluno2.getAlunoAprovado());
		// ? = Operador ternário.
		System.out.println("Resultado: " + (aluno2.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("--------");
		
		// Descrição do objeto na memória
		System.out.println(aluno2.toString());		
	}
}
