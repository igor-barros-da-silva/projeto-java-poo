package pacote.classe;

/* Classe Aluno/Objeto nome que representa o Aluno */
public class Aluno {

	/* Esses são os atributos do Aluno, representa as características do mundo real */
	String nome;
	int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	
	/* Método construtor - Cria os dados na memória, sendo padrão do Java */
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
}
