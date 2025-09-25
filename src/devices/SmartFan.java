package devices;

public class SmartFan {
    private boolean isOn = false;
    private int speed = 0;

    public String turnOn(){
        isOn = true;
        speed = 1;
        return "Smart Fan is ON at speed " + speed;
    }

    public String turnOff(){
        isOn = false;
        speed = 0;
        return "Smart Fan is OFF";
    }

    public String setSpeed(int level){
        if (!isOn) return "Smart Fan is OFF. Turn it on first.";
        speed = level;
        return "Smart Fan speed set to " + speed;
    }
}