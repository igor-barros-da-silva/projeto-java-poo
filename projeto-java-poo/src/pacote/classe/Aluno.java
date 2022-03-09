package pacote.classe;

import java.util.ArrayList;
import java.util.List;

/* Classe Aluno/Objeto nome que representa o Aluno. */
public class Aluno {

	/*
	 * Esses s�o os atributos do Aluno, representa as caracter�sticas do mundo real.
	 */
	// Por padr�o os atributos s�o privados.
	/*
	 * Private � para manter o controle de acesso a vari�veis, evitando que o
	 * programador chame a vari�vel de forma errada, alterando o valor dela causando
	 * erro no sistema.
	 */
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;

	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	/* M�todo construtor - Cria os dados na mem�ria, sendo padr�o do Java. */
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

	/* M�todos GETTERS E SETTERS do objeto. */
	// SET � para adicionar ou receber dados dos atributos.
	// GET � para obter o valores dos atributos.

	// M�todo SET que recebe dado
	public void setNome(String nome /* nome = param�tro */) {
		this.nome = nome; // this = operador do Java
	}

	// M�todo GET que busca o dado
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	/*
	 * Gerando automaticamente os GETTERS E SETTERS. bot�o direito >> Source >>
	 * Generate Getters and Setters.
	 */
	public String getDataNascimento() {
		return dataNascimento;
	}

	// void recebe.
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	/* ====================================================================== */

	// M�todo que retorna a m�dia da nota.
	public double getMediaNota() {		
		double somaNotas = 0.0;		
		for(Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		return somaNotas / disciplinas.size();
	}

	// M�todo que retorna a aprova��o ou reprova��o.
	public boolean getAlunoAprovado() {
		// Aproveitando o c�digo
		double media = this.getMediaNota();
		if (media >= 60) {
			return true;
		} else
			return false;
	}

	/*
	 * public String getAlunoAprovado() { if(media >= 60) { return
	 * "Aluno est� aprovado!"; }else return "Aluno est� reprovado!"; }
	 */

	/* ====================================================================== */

	// Equals e Hashcode - Diferenciar e comparar objetos.
	// Subscrita - Diferenciar pelo nome o objeto Java.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + "]";
	}
}
