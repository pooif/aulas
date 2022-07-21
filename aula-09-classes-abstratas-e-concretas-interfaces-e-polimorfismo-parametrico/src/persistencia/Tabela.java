package persistencia;

public interface Tabela<T extends Persistivel> {

  void insert(T o);

  void delete(T o);

  void update(T o);

  T[] selectAll();

  T[] selectWhere(String where);

}
