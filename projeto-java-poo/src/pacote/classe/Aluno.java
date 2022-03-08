package pacote.classe;

/* Classe Aluno/Objeto nome que representa o Aluno */
public class Aluno {

	/* Esses s�o os atributos do Aluno, representa as caracter�sticas do mundo real */
	// Por padr�o os atributos s�o privados.
	/* Private � para manter o controle de acesso a vari�veis,
	 *  evitando que o programador chame a vari�vel de forma errada,
	 *  alterando o valor dela causando erro no sistema
	 */
	/*public*/ private String nome;
	/*public*/ public int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	/* M�todo construtor - Cria os dados na mem�ria, sendo padr�o do Java */
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
	
	/*M�todos GETTERS E SETTERS do objeto*/
	//SET � para adicionar ou receber dados dos atributos
	//GET � para obter o valores dos atributos
	
	//M�todo SET que recebe dado
	public void setNome(String nome /*nome = param�tro*/) {
		this.nome = nome; //this = operador do Java
	}
	
	//M�todo GET que busca o dado
	public String getNome() {
		return nome;
	}	

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	/* Gerando automaticamente os GETTERS E SETTERS
	 * bot�o direito >> Source >> Generate Getters and Setters
	 */
	public String getDataNascimento() {
		return dataNascimento;
	}

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
}
