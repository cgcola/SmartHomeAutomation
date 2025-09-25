package devices;

public class Thermostat {
    private int temperature = 24;
    public String increaseTemp(){
        return "Temperature increased to " + (++temperature) + "°C";
    }
    public String decreaseTemp(){
        return "Temperature decreased to " + (--temperature) + "°C";
    }
}