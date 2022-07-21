class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Funcionario maicon = new Funcionario("Maicon", 18000, 5);
		Funcionario marcel = new Funcionario("Marcel", 15000, 0);

		ContraCheque contraChequeMaicon = new ContraCheque(maicon);

		ContraCheque contraCheque = new ContraCheque(marcel);

		Inss inss = new Inss();

		contraCheque.adicionarDesconto(inss);

		int liquido = contraCheque.getSalarioLiquido();

		System.out.println("Líquido: " + liquido);

		contraCheque.adicionarDesconto(new ImpostoRenda());
		contraCheque.adicionarDesconto(new ImpostoRenda());
		contraCheque.adicionarDesconto(new ImpostoRenda());
		contraCheque.adicionarDesconto(new AuxilioCreche());

		contraCheque.imprime();

		Desconto vt = new ValeTransporte();

		contraCheque.adicionarDesconto(vt);

		contraCheque.imprime();

		contraCheque.adicionarDesconto(vt);
		contraCheque.adicionarDesconto(new AuxilioCreche());

		// classe anônima
		contraCheque.adicionarDesconto(new Desconto("- 1 real") {
			@Override
			int calcular(Funcionario func) {
				return 1;
			}
		});
	}
}
