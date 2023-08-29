package HomeWork7.DataBase;

import HomeWork7.OldSensor.MeteoSensor;

public class MeteoStore {
  // сохранение данных в базу
  public boolean save(MeteoSensor meteoSensor) {
    System.out.format("Сохранение данных от датчика [%d] в %s%n температура - %f ; влажность - %f ; давление - %f \n\r",
        meteoSensor.getId(),
        meteoSensor.getDateTime(),
        meteoSensor.getTemperature(),
        meteoSensor.getHumidity(),
        meteoSensor.getPressure());
    return true;
  }
}
