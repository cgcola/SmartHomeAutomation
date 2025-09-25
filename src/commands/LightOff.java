package commands;

import devices.Light;

public class LightOff implements Command {
    private final Light light;
    public LightOff(Light light) {
        this.light = light;
    }
    @Override
    public String execute() {
        return light.turnOff();
    }
}