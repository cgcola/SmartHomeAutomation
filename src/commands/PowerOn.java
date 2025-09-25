package commands;
import devices.Tv;

public class PowerOn implements Command {
    private final Tv tv;
    public PowerOn(Tv tv) {
        this.tv = tv;
    }
    @Override
    public String execute() {
        return tv.switchOn();
    }
}