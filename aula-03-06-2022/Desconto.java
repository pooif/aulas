// abstract/incompleta/faltam os detalhes
abstract class Desconto {  // new Desconto() <- não
	private String nome;

	Desconto(String nome) {
		this.nome = nome;
	}

	String getNome() {
		return nome;
	}
	// assinatura do método
	abstract int calcular(Funcionario func); // não tem corpo

	@Override
	public String toString() {
		return this.getNome();
	}
}