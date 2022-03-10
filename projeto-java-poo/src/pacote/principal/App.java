package pacote.principal;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import pacote.classe.Aluno;
import pacote.classe.Disciplina;
import pacote.constante.StatusAluno;

public class App {

	// Main � um m�todo auto execut�vel em Java.
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		// Lista de alunos aprovados, reprovados e em recupera��o.
		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();

		for (int quantidade = 1; quantidade <= 5; quantidade++) {

			// Entrada de dados com o teclado.
			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + quantidade + "?");
			String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");

			// Objeto est� na mem�ria, new = cria um novo objeto.
			// M�todo construtor.
			Aluno aluno = new Aluno();

			// Nome din�mico atrav�s da entrada de dados com teclado.
			// Convertendo integer para string.
			aluno.setNome(nome);
			aluno.setIdade(Integer.valueOf(idade));

			// Criando a lista din�mica das disciplinas do aluno.
			for (int posicao = 1; posicao <= 1; posicao++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Qual o nome da disciplina " + posicao + "?");
				String notaDisciplina = JOptionPane.showInputDialog("Qual a nota da disciplina " + posicao + "?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno.getDisciplinas().add(disciplina);
			}

			// Removendo disciplinas da lista do aluno.
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

			if (escolha == 0) {
				// Op��o Sim � 0
				int continuarRemover = 0;
				int posicaoLista = 0;
				// Remover disciplinas em repeti��o.
				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina 1, 2, 3, 4?");
					aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicaoLista);
					posicaoLista++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}
			}
			alunos.add(aluno);
		}
		
		// Separando em listas.
		for (Aluno aluno : alunos) {

			if (aluno.getAlunoAprovado1().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);
			} else if (aluno.getAlunoAprovado1().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				alunosRecuperacao.add(aluno);

			} else if (aluno.getAlunoAprovado1().equalsIgnoreCase(StatusAluno.REPROVADO)) {
				alunosReprovados.add(aluno);
			}
		}
		
		System.out.println("-----------------------------------------------");
		
		for (Aluno aluno : alunosAprovados) {
			System.out.println("Nome: " + aluno.getNome() + "Lista de alunos aprovados: " + aluno.getAlunoAprovado1() + "M�dia: " + aluno.getMediaNota());
		}
		
		for (Aluno aluno : alunosRecuperacao) {
			System.out.println("Nome: " + aluno.getNome() + "Lista de alunos em recupera��o: " + aluno.getAlunoAprovado1() + "M�dia: " + aluno.getMediaNota());
		}
		
		for (Aluno aluno : alunosReprovados) {
			System.out.println("Nome: " + aluno.getNome() + "Lista de alunos reprovados: " + aluno.getAlunoAprovado1() + "M�dia: " + aluno.getMediaNota());
		}
	}
}
