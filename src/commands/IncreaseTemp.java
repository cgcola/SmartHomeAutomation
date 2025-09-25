package commands;
import devices.Thermostat;

public class IncreaseTemp implements Command {
    private final Thermostat thermostat;
    public IncreaseTemp(Thermostat thermostat) {
        this.thermostat = thermostat;
    }
    @Override
    public String execute() {
        return thermostat.increaseTemp();
    }
}