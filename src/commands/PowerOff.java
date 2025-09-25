package commands;
import devices.Tv;

public class PowerOff implements Command {
    private final Tv tv;
    public PowerOff(Tv tv) {
        this.tv = tv;
    }
    @Override
    public String execute() {
        return tv.switchOff();
    }
}