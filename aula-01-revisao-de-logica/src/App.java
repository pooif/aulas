class App {
  public static void main(String[] args) {
    // instruções/declarações
    System.out.println("Olá mundo!");
    System.out.println("Ok");

    // declaração de variáveis
    int x; // integer [int, long, float, double, boolean, char] <- são todos primitivos
    x = 3; // atribuição
    int y = 5; // declaração e atribuição em uma só instrução.
    double z = 3.5; // números com . são constantes literais double, ex: 2.2, 4.5, etc
    int q = (int) z; // coerção de z para inteiro (perde os decimais)
    char letra = 'w'; // caracteres (char) usam aspas simples ''
    System.out.println(letra);
    System.out.println((int) letra); // char é um int na verdade, na verdade tudo são bits
    String texto = "texto"; // Strings são cadeias de caracteres (um array de char's)
    System.out.println(texto.toUpperCase()); // Strings são objetos (tipos complexos e não primitivos) e têm métodos
    System.out.println(x + y); // operador de soma
    System.out.println(x + y + z + letra + texto); // soma e concatena se há uma String
    System.out.println(texto + x + y + z + letra); // concatena todos porque inicia com String textual
    System.out.println(y / x); // operador divide
    System.out.println(y % x); // resto da divisão (operador módulo)

    if (x > 3) { // if condição/expressão booleana
      System.out.println("X é maior que 3");
    } else if (x == 3) { // else if não é obrigagório, mas se vier, fica no meio
      System.out.println("X é 3");
    } else { // else não é obrigatório, mas se vier, fica no fim
      System.out.println("X é menor que 3");
    }

    switch(x) { // evite os switchs, mas se tiver que usá-lo saiba do fallthrough
      case 1: System.out.println("x é 1"); break; // por isso deve haver um break
      case 2: System.out.println("x é 2"); break; // senão todas as instruções
      case 3: System.out.println("x é 3"); break; // executam a partir do ponto de entrada
      case 4: System.out.println("x é 4"); break;
      case 5: System.out.println("x é 5"); break;
    }
    // expressão booleana
    boolean pergunta = ! (x > 2 || y < 5 || z != 3.5); // operadores lógicos: lembre da tabela verdade!
    System.out.println(pergunta); // sempre true ou false, apenas.

    while (x < 10) { // laços ou loops com enquanto/while verdadeiro
      System.out.println("X é " + x);
      x = x + 1;
    }

    for ( ; y < 10; y = y + 1) { // "while" pode ser um "for" e "for" pode ser um "while"
      System.out.println("Y é " + y);
    }
    // for (inicialização; enquanto condição; atualização)
    for (int i = 0; i < 8; i++) { // for com variável temporária "i"
      System.out.println("i = " + i);
    }
    // arrays também são chamados arranjos ou vetores
    int[] numeros = new int[5]; // array com 5 posições zeradas: [0, 0, 0, 0, 0]
    int[] numeros2 = {3, 5, 78, 311, 343}; // array inicializado com 5 itens
                  //  0  1  2   3    4   // índices, o último é sempre length - 1
    numeros[2] = 57; // alterando o terceiro item (índice 2)
    numeros2[2] = 57;

    // laço para iterar/percorrer um array
    for (int i = 0; i < numeros.length; i++) {
      System.out.println(numeros[i]);
    }

    // O que um programador baiano falou pro outro?
    // "Ó meu array!"
  }
}
