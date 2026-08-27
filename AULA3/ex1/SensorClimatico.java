package AULA3.ex1;

public class SensorClimatico {

    private String identificador;
    private double temperaturaCelsius;
    private boolean operacional;
    
    public SensorClimatico(String identificador) {
        this.identificador = identificador;
        this.temperaturaCelsius = 20.0;
        this.operacional = true;
    }
    public String getIdentificador() {
        return identificador;
    }
    public double getTemperaturaCelsius() {
        return temperaturaCelsius;
    }
    public boolean isOperacional() {
        return operacional;
    }
    public void setTemperaturaCelsius(double novaTemperatura) {

        if (operacional && novaTemperatura >= -50.0 && novaTemperatura <= 60.0) {
            temperaturaCelsius = novaTemperatura;
        } else {
            System.out.println("Alerta: temperatura inválida ou sensor desativado.");
        }
    }

    public void desativarSensor() {
        operacional = false;
        System.out.println("Sensor desativado.");
    }
    public void ativarSensor() {
        operacional = true;
        System.out.println("Sensor ativado.");
    }
}