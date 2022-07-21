import java.util.Arrays;

class App {
  public static void main(String[] args) {
    // imutabilidade();

    // VALUE OBJECTS:
    // data class em Kotlin: https://repl.it/join/rnewhozs-marcio_torres
    // value type, struct em C#: https://repl.it/join/vhnteyzr-marcio_torres
    // https://en.wikipedia.org/wiki/Value_object
    // https://martinfowler.com/bliki/ValueObject.html

    Color cinza1 = new Color(215, 215, 215);
    Color cinza2 = new Color(35, 35, 35);
    Color cinza3 = new Color(215, 215, 215);
    System.out.println(cinza1.equals(cinza2));
    System.out.println(cinza2.equals(cinza3));
    System.out.println(cinza1.equals(cinza3));
    Color teste = new Color(100, 50, 50);
    System.out.println(teste.red); // 100
    Color outra = teste.redder();
    System.out.println(teste.red); // 100
    System.out.println(outra.red); // 101
    outra = outra.redder();
    System.out.println(outra.red); // 101

    int[] outraCorEmArray = outra.toArray();
    System.out.println(Arrays.toString(outraCorEmArray));
    System.out.println(teste.toMap());

    int[] a = {120, 67, 13};
    Color c2 = Color.fromArray(a);
    System.out.println(c2.red);
    System.out.println(Color.fromArray(new int[]{12,65,78}).blue);

    Color nova = Color.fromHexString("#F0E68C");
    System.out.println(nova.blue);
    System.out.println(Color.fromName("indigo").red + "," + Color.fromName("indigo").green + "," + Color.fromName("indigo").blue);
    System.out.println(Color.fromName("naoexiste"));

    System.out.println(Color.BLACK);

    Color c3 = new Color(155, 10, 0);
    System.out.println(c3.toString());
    System.out.println(c3);
    System.out.println(c3.toRGBString());
    System.out.println(c3.toHexString());

    System.out.println("Coesão ---------------------");
    ArCondicionado ar = new ArCondicionado("Stringer X11");
    System.out.println(ar); // toString
    ar.aumentarTemperatura();
    System.out.println(ar);
    ar.mudarModo();
    System.out.println(ar);


  }

  static void imutabilidade() {
    System.out.println("Olá mundo!");
    // primitivos
    int i = 2;
    double d = 2.2;
    boolean b = true;
    final float f = 3.5F;
    i = 5;
    // f = 78; // símbolo f não pode ser reatribuído, é constante
    // arrays em Java são objetos mutáveis
    final int[] idades = new int[3];
    // o final torna o símbolo idades não reatribuível,
    // mas não torna o array imutável!
    System.out.println(Arrays.toString(idades));
    idades[0] = 15;
    idades[1] = 25;
    idades[2] = 35;
    System.out.println(Arrays.toString(idades));
    idades[2] = 55;
    System.out.println(Arrays.toString(idades));
    // = new int[10];
    // Strings em Java (e em muitas outras linguagem) é imutável!
    final String nome = "Marcio";
    System.out.println(nome);
    String nova = nome.toUpperCase();
    System.out.println(nova);
    System.out.println(nome);
    zeraArray(idades);
    System.out.println(Arrays.toString(idades));
    maiusculas(nome);
    System.out.println(nome);
  }

  static void zeraArray(int[] array) {
    for (int i = 0; i < array.length; i++) array[i] = 0;
  }

  static void maiusculas(String s) {
    s.toUpperCase();
  }

}
