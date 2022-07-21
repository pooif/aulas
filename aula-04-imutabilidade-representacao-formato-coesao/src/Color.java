import java.util.HashMap;
import java.util.Map;
import static java.lang.Integer.parseInt;

// Tornando um objeto de valor
// 1. Tornar os atributos constantes (final)
// 2. Adicionar um construtor que inicialize as constantes
// 3. Sobrescrever o equals comparando todos os atributos
// 4. Adicionar comandos, se for necessário, que retornam uma nova instância
// 5. Sugere-se sobrescrever o método toString
public class Color {
  // constantes de classe
  public static Color BLACK = new Color(0, 0, 0);
  public static Color WHITE = new Color(255, 255, 255);


  // atributos constantes
  public final int red;
  public final int green;
  public final int blue;

  Color() {
    this(0, 0, 0);
  }

  // construtor que inicializa os atributos
  Color(int red, int green, int blue) {
    if (red < 0 || green < 0 || blue < 0) {
      throw new IllegalArgumentException("color < 0");
    }
    if (red > 255 || green > 255 || blue > 255) {
      throw new IllegalArgumentException("color > 255");
    }
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  Color(int[] array) {
    this(array[0], array[1], array[2]);
  }

  // comandos em objetos imutáveis retornam o tipo do objeto
  public Color redder() {
    return new Color(this.red + 1, this.green, this.blue);
  }

  // convenção de métodos toTipo e fromTipo
  public int[] toArray() { // var.toArray
    return new int[] {this.red, this.green, this.blue};
  }

  // Os métodos from tipicamente são codados como métodos fábrica estáticos!
  // Color.fromArray
  public static Color fromArray(int[] array) {
    return new Color(array[0], array[1], array[2]);
  }
                                                  // 0123456
  public static Color fromHexString(String str) { // #CD5C5C
    String r = str.substring(1, 3);
    String g = str.substring(3, 5);
    String b = str.substring(5, 7);
    return new Color(parseInt(r, 16), parseInt(g, 16), parseInt(b, 16));
  }

  public static Color fromName(String name) {
    switch (name.toLowerCase()) {
      case "indigo": return new Color(75, 0, 130);
      case "palevioletred": return new Color(219, 112, 147);
    }
    return null;
  }

  public Map<String, Integer> toMap() {
    Map<String,Integer> mapa = new HashMap<>();
    mapa.put("red", this.red);
    mapa.put("green", this.green);
    mapa.put("blue", this.blue);
    return mapa;
  }

  // equals
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Color) {
      Color other = (Color) obj;
      return this.red   == other.red   &&
             this.green == other.green &&
             this.blue  == other.blue;
    }
    return false;
  }

  @Override
  public String toString() {
    return this.toSimpleString();
  }

  public String toSimpleString() {
    return this.red + ", " + this.green + ", " + this.blue; // int, int, int
  }

  public String toRGBString() {
    return String.format("rgb(%d, %d, %d)", this.red, this.green, this.blue);
  }

  public String toHexString() {
    return String.format("#%02X%02X%02X", this.red, this.green, this.blue);
  }

  @Override
  public int hashCode() {
    return this.red * 7 + this.green * 13 + this.blue * 17;
  }
}
