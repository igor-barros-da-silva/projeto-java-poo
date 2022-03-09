package pacote.classe;

import java.util.ArrayList;
import java.util.List;

/* Classe Aluno/Objeto nome que representa o Aluno. */
public class Aluno {

	/*
	 * Esses são os atributos do Aluno, representa as características do mundo real.
	 */
	// Por padrão os atributos são privados.
	/*
	 * Private é para manter o controle de acesso a variáveis, evitando que o
	 * programador chame a variável de forma errada, alterando o valor dela causando
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

	/* Método construtor - Cria os dados na memória, sendo padrão do Java. */
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

	/* Métodos GETTERS E SETTERS do objeto. */
	// SET é para adicionar ou receber dados dos atributos.
	// GET é para obter o valores dos atributos.

	// Método SET que recebe dado
	public void setNome(String nome /* nome = paramêtro */) {
		this.nome = nome; // this = operador do Java
	}

	// Método GET que busca o dado
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
	 * Gerando automaticamente os GETTERS E SETTERS. botão direito >> Source >>
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

	// Método que retorna a média da nota.
	public double getMediaNota() {
		return 0;
	}

	// Método que retorna a aprovação ou reprovação.
	public boolean getAlunoAprovado() {
		// Aproveitando o código
		double media = this.getMediaNota();
		if (media >= 60) {
			return true;
		} else
			return false;
	}

	/*
	 * public String getAlunoAprovado() { if(media >= 60) { return
	 * "Aluno está aprovado!"; }else return "Aluno está reprovado!"; }
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
