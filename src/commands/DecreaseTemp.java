package commands;
import devices.Thermostat;

public class DecreaseTemp implements Command {
    private final Thermostat thermostat;
    public DecreaseTemp(Thermostat thermostat) {
        this.thermostat = thermostat;
    }
    @Override
    public String execute() {
        return thermostat.decreaseTemp();
    }
}
