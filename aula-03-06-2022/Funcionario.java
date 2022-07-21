class Funcionario {

	private String nome;
	private int salario;
	private int dependentes;

	Funcionario(String nome, int salario, int dependentes) {
		this.nome = nome;
		this.salario = salario;
		this.dependentes = dependentes;
	}

	public String getNome() {
		return nome;
	}

	public int getSalario() {
		return salario;
	}

	public int getDependentes() {
		return dependentes;
	}
}
