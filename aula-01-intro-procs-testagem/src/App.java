class App {
  public static void main(String[] args) {

    int x = 19;
    int y = 5;
    int mmc = Numeros.mmc(x, y);
    System.out.println(mmc);

    System.out.println(Numeros.mmc(8, 9));
    System.out.println(Numeros.maior(5455, 78989));

    System.out.println(Textos.inverter("teste"));
    // palindromo
    System.out.println(Textos.ehPalindromo("teste")); // false
    System.out.println(Textos.ehPalindromo("tenet")); // true

    // Caso de Teste:
    System.out.println("Casos de Teste:\n-----------------");
    System.out.println(Numeros.mmc(3, 5) == 15); // TRUE!
    System.out.println(Numeros.mmc(3, 5)); //
    System.out.println(Numeros.maior(9, 8) == 9);
    System.out.println(Numeros.maior(9, 9) == 9);
    System.out.println(Numeros.maior(8, 9) == 9);

    System.out.println(Textos.inverter("Nada").equals("adaN"));

    System.out.println(Textos.ehPalindromo("Salas") == true);

  }
}
