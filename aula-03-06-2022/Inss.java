// Inss é um Desconto concreto, classe concreta

class Inss extends Desconto {

	Inss() { // new Inss() -> new Desconto("INSS")
		super("INSS");
	}

	@Override
	int calcular(Funcionario func) {
		return (int) (func.getSalario() * 0.09);
	}
}
