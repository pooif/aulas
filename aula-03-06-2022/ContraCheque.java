import java.util.ArrayList;
import java.util.List;

class ContraCheque {
	private final Funcionario funcionario;
	// nunca referenciar a classe concreta (não usar inss, ir, aux, etc)
	// usar a classe abstrata: nos dá flexibilidade para adicionar novos
	// descontos (novas concretos)
	// POLIMORFISMO
	private List<Desconto> descontos = new ArrayList<>();
	// private Set<Desconto> descontos = new HashSet<>(); // sem duplicados

	ContraCheque(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	Funcionario getFuncionario() {
		return funcionario;
	}

	int getSalarioLiquido() {
		int liquido = funcionario.getSalario();
		for (Desconto desc : this.descontos) {
			int valor = desc.calcular(funcionario);
			liquido -= valor;
		}
		return liquido;
	}

	void imprime() {
		System.out.println("Funcionário " + funcionario.getNome());
		System.out.println("Salário base " + funcionario.getSalario());
		//int valorDescontos = 0;
		// for (Desconto desc : this.descontos) {
		for (int i = 0; i < descontos.size(); i++) {
			Desconto desc = descontos.get(i);
			System.out.println("Desconto " + desc
				+ " valor " + desc.calcular(funcionario));
			//valorDescontos += desc.calcular(funcionario);
		}
		System.out.println("Líquido " + getSalarioLiquido());
	}

	void adicionarDesconto(Desconto desc) {
		this.descontos.add(desc);
	}
	// ... varargs -> variable arguments
	// adicionarDescontos(d1, d2, d3)
	void adicionarDescontos(Desconto... variosDescontos) {
		for (Desconto d : variosDescontos) this.descontos.add(d);
	}
}
