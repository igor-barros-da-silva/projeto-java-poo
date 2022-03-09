package pacote.principal;

import java.util.ArrayList;
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

		for (Aluno aluno : alunos) {
			// + = Concatenação
			System.out.println("Nome do Aluno é: " + aluno.getNome());
			System.out.println("A idade do Aluno é: " + aluno.getIdade());
			System.out.println("Média do Aluno: " + aluno.getMediaNota()); // chamando o método getMediaNota
			System.out.println("Resultado: " + aluno.getAlunoAprovado1());
			// ? = Operador ternário.
			// System.out.println("Resultado: " + (aluno2.getAlunoAprovado() ? "Aprovado" :
			// "Reprovado"));
			// Descrição do objeto na memória.
			System.out.println(aluno.toString());
			System.out.println("--------");
		}
	}
}
