package commands;

import devices.Light;

public class LightOn implements Command {
    private final Light light;
    public LightOn(Light light) {
        this.light = light;
    }
    @Override
    public String execute() {
        return light.turnOn();
    }
}