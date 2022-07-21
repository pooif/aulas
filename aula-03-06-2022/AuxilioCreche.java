class AuxilioCreche extends Desconto {

	AuxilioCreche() {
		super("Auxílio Creche");
	}

	@Override
	int calcular(Funcionario func) {
		return 5 * func.getDependentes();
	}
}
