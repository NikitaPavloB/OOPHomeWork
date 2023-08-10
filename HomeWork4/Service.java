package HomeWork4;

public interface Service<T, S> {
  T restock(T automat, S product);

}