package commands;

import devices.Light;

public class SetBrightness implements Command {
    private final Light light;
    private final int level;

    public SetBrightness(Light light, int level) {
        this.light = light;
        this.level = level;
    }

    @Override
    public String execute() {
        return light.setBrightness(level);
    }
}
