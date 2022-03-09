package pacote.principal;

import javax.swing.JOptionPane;

import pacote.classe.Aluno;
import pacote.classe.Disciplina;

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
		
		// Objeto est� na mem�ria, new = cria um novo objeto.
		// M�todo construtor.
		Aluno aluno2 = new Aluno();		
		
		// Nome din�mico atrav�s da entrada de dados com teclado.
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
		
		//  Criando a lista din�mica das disciplinas do aluno.
		for(int posicao = 1; posicao <= 4; posicao ++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Qual o nome da disciplina "+posicao+"?");
			String notaDisciplina = JOptionPane.showInputDialog("Qual a nota da disciplina "+posicao+"?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno2.getDisciplinas().add(disciplina);
		}
		
		// Removendo disciplinas da lista do aluno
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		if(escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina 1, 2, 3, 4?");
			
			aluno2.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
		}
				
		// + = Concatena��o
		System.out.println("Nome da Aluna 2 �: " + aluno2.getNome());
		System.out.println("A idade da Aluna 2 �: " + aluno2.getIdade());
		System.out.println("Nascimento: " + aluno2.getDataNascimento());
		System.out.println("M�dia do Aluno: " + aluno2.getMediaNota()); // chamando o m�todo getMediaNota
		System.out.println("Resultado: " + aluno2.getAlunoAprovado());
		// ? = Operador tern�rio.
		System.out.println("Resultado: " + (aluno2.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("--------");
		
		// Descri��o do objeto na mem�ria
		System.out.println(aluno2.toString());		
	}
}
