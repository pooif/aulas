class Desc {
	private String nome;

	Desc(String nome) {
		this.nome = nome;
	}

	int calcular(Funcionario f) {
		switch (nome) {
			case "Vale Transporte":
				return (int) (f.getSalario() * 0.06);
			case "INSS":
				return (int) (f.getSalario() * 0.09);
			default:
				return 0;
		}
	}
}
