package principio.responsabilidade;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao("Conta bancaria");
		
		System.out.println(bancaria);
		
		bancaria.diminui100Reais();
		System.out.println(bancaria);
		
		bancaria.saqueDinheiro(500);
		System.out.println(bancaria);
		
		bancaria.depositoDinheiro(600);
		System.out.println(bancaria);
		
		// Responsabilidade - � o princip�o de criar um m�todo interno.
		// O objeto tem que fazer o processamento dentro dele pr�prio desde
		// que tudo o que necessite esteja dentro dele e nunca externamente.
		
		// String...
	}

}
