package pacote.principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import pacote.classe.Aluno;
import pacote.classe.Disciplina;

public class App {

	// Main � um m�todo auto execut�vel em Java.
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int quantidade = 1; quantidade <= 2; quantidade++) {

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

		for (Aluno aluno : alunos) {
			// Criando e Percorrendo a lista de alunos.
			if (aluno.getNome().equalsIgnoreCase("Igor")) {
				// Procurando e removendo um aluno da lista.
				alunos.remove(aluno);
				break;
			} else {
				System.out.println("Nome do Aluno �: " + aluno.getNome());
				System.out.println("A idade do Aluno �: " + aluno.getIdade());
				System.out.println("M�dia do Aluno: " + aluno.getMediaNota()); // chamando o m�todo getMediaNota
				System.out.println("Resultado: " + aluno.getAlunoAprovado1());
				// ? = Operador tern�rio.
				// System.out.println("Resultado: " + (aluno2.getAlunoAprovado() ? "Aprovado" :
				// "Reprovado"));
				// Descri��o do objeto na mem�ria.
				System.out.println(aluno.toString());
				System.out.println("--------");
			}
		}

		for (Aluno aluno : alunos) {
			System.out.println("Aluno que est� na lista:");
			System.out.println(aluno.getNome());
			System.out.println("Suas disciplinas s�o:");

			for (Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina.getDisciplina());
			}

		}
	}
}
