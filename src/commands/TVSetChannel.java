package commands;
import devices.Tv;

public class TVSetChannel implements Command {
    private final Tv tv;
    private final int channel;

    public TVSetChannel(Tv tv, int channel) {
        this.tv = tv;
        this.channel = channel;
    }

    @Override
    public String execute() {
        return tv.setChannel(channel);
    }
}
