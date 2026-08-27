package AULA3.ex1;

public class TesteSensor {
    public static void main(String[] args) {

        SensorClimatico sensor = new SensorClimatico("SENSOR-001");
        System.out.println("Identificador: " + sensor.getIdentificador());
        System.out.println("Temperatura: " + sensor.getTemperaturaCelsius());
        System.out.println("Operacional: " + sensor.isOperacional());
        sensor.setTemperaturaCelsius(25.5);
        System.out.println("Nova temperatura: " + sensor.getTemperaturaCelsius());

        sensor.setTemperaturaCelsius(80.0);
        sensor.desativarSensor();
        sensor.setTemperaturaCelsius(30.0);
        sensor.ativarSensor();

        sensor.setTemperaturaCelsius(30.0);
        System.out.println("Temperatura final: " + sensor.getTemperaturaCelsius());
    }
}