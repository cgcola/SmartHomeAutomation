package commands;
import devices.SmartFan;

public class ToggleOscillation implements Command {
    private final SmartFan fan;

    public ToggleOscillation(SmartFan fan) {
        this.fan = fan;
    }

    @Override
    public String execute() {
        return fan.toggleOscillation();
    }
}
