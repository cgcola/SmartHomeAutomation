package commands;
import devices.SmartFan;

public class FanOn implements Command {
    private final SmartFan fan;
    public FanOn(SmartFan fan) {
        this.fan = fan;
    }
    @Override
    public String execute() {
        return fan.turnOn();
    }
}
