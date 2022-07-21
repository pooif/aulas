public class ImpostoRenda extends Desconto {

	ImpostoRenda() {
		super("Imposto de Renda");
	}

	@Override
	int calcular(Funcionario f) {
		return (int) (f.getSalario() * 0.275);
	}
}
