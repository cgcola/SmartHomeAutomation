package commands;
import devices.SmartFan;

public class FanOff implements Command {
    private final SmartFan fan;
    public FanOff(SmartFan fan) {
        this.fan = fan;
    }
    @Override
    public String execute() {
        return fan.turnOff();
    }
}
