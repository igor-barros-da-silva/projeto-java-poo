package pacote.principal;

import javax.swing.JOptionPane;

import pacote.classe.Aluno;
import pacote.classe.Disciplina;

public class App {

	/* Main é um método auto executável em Java */
	public static void main(String[] args) {

		// Entrada de dados com o teclado.
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");

		// Objeto está na memória, new = cria um novo objeto.
		// Método construtor.
		Aluno aluno2 = new Aluno();

		// Nome dinâmico através da entrada de dados com teclado.
		// Convertendo integer para string.
		aluno2.setNome(nome);
		aluno2.setIdade(Integer.valueOf(idade));

		// Criando a lista dinâmica das disciplinas do aluno.
		for (int posicao = 1; posicao <= 4; posicao++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Qual o nome da disciplina " + posicao + "?");
			String notaDisciplina = JOptionPane.showInputDialog("Qual a nota da disciplina " + posicao + "?");

			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));

			aluno2.getDisciplinas().add(disciplina);
		}

		// Removendo disciplinas da lista do aluno
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

		if (escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina 1, 2, 3, 4?");

			aluno2.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
		}

		// + = Concatenação
		System.out.println("Nome da Aluna 2 é: " + aluno2.getNome());
		System.out.println("A idade da Aluna 2 é: " + aluno2.getIdade());
		System.out.println("Média do Aluno: " + aluno2.getMediaNota()); // chamando o método getMediaNota
		System.out.println("Resultado: " + aluno2.getAlunoAprovado1());
		// ? = Operador ternário.
		//System.out.println("Resultado: " + (aluno2.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("--------");

		// Descrição do objeto na memória
		System.out.println(aluno2.toString());
	}
}
