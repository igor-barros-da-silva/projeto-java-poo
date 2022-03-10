package pacote.principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import pacote.classe.Aluno;
import pacote.classe.Disciplina;

public class App {

	// Main é um método auto executável em Java.
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int quantidade = 1; quantidade <= 2; quantidade++) {

			// Entrada de dados com o teclado.
			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + quantidade + "?");
			String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");

			// Objeto está na memória, new = cria um novo objeto.
			// Método construtor.
			Aluno aluno = new Aluno();

			// Nome dinâmico através da entrada de dados com teclado.
			// Convertendo integer para string.
			aluno.setNome(nome);
			aluno.setIdade(Integer.valueOf(idade));

			// Criando a lista dinâmica das disciplinas do aluno.
			for (int posicao = 1; posicao <= 4; posicao++) {
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
				// Opção Sim é 0
				int continuarRemover = 0;
				int posicaoLista = 0;
				// Remover disciplinas em repetição.
				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina 1, 2, 3, 4?");
					aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicaoLista);
					posicaoLista++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}
			}
			alunos.add(aluno);
		}

		// Percorrendo lista por posições.
		for (int posicao = 0; posicao < alunos.size(); posicao++) {

			Aluno aluno = alunos.get(posicao);

			//Substituindo um aluno na lista.
			if (aluno.getNome().equalsIgnoreCase("Igor")) {
				Aluno trocar = new Aluno();
				trocar.setNome("Aluno trocado");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina("Banco de Dados");
				disciplina.setNota(90);
				
				trocar.getDisciplinas().add(disciplina);
				
				alunos.set(posicao, trocar);
				aluno = alunos.get(posicao);
			}

			System.out.println("Aluno: " + aluno.getNome());
			System.out.println("Média do aluno: " + aluno.getMediaNota());
			System.out.println("Resultado: " + aluno.getAlunoAprovado1());
			System.out.println("--------------------------------------");

			for (int posicaoDisciplina = 0; posicaoDisciplina < aluno.getDisciplinas().size(); posicaoDisciplina++) {

				Disciplina disciplina = aluno.getDisciplinas().get(posicaoDisciplina);
				System.out
						.println("Disciplina: " + disciplina.getDisciplina() + "-" + " Nota: " + disciplina.getNota());
			}
		}
	}
}
