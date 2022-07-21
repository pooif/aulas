class Evento {

	final String descricao;
  final int totalIngressos;
  int ingressosVendidos = 0;

	Evento(String descricao, int totalIngressos) {
    validarTotalIngressos(totalIngressos);
    this.descricao = descricao;
    this.totalIngressos = totalIngressos;
  }

  // método interno
  private void validarTotalIngressos(int total) {
    if (total < 10) throw new IllegalArgumentException();
  }

	int ingressosDisponiveis() {
		return this.totalIngressos - this.ingressosVendidos;
	}

	int ingressosVendidos() {
		return this.ingressosVendidos;
  }

  boolean haIngressosDisponiveis() {
    return this.ingressosVendidos < this.totalIngressos;
  }

  // Isto não é sobrecarga, mudar o retorno não muda a assinatura!
  // String haIngressosDisponiveis() {
  //   return this.ingressosVendidos < this.totalIngressos ? "Sim" : "Não";
  // }

	void venderIngresso() {
    if (this.haIngressosDisponiveis()) { // salva-guarda
      this.ingressosVendidos++;
    } else {
      throw new IllegalStateException("Não há mais ingressos");
    }
  }

  void venderIngresso(int qtd) {
    for (int i = 0; i < qtd; i++) this.venderIngresso();
  }

}
