package HomeWork7.NewSensor;

public interface SensorTemperature {
  int identifier(); // идентификатор датчика

  double temperature(); // температура датчика

  double humidity(); // влажность

  double pressure(); // давление

  int year(); // Год

  int day(); // День года

  int second(); // Секунда дня
}
