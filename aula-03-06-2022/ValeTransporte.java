class ValeTransporte extends Desconto {
	ValeTransporte() {
		super("Vale Transporte");
	}

	@Override
	int calcular(Funcionario func) {
		return (int) (func.getSalario() * 0.06);
	}
}
