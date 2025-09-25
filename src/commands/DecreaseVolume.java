package commands;
import devices.MusicPlayer;

public class DecreaseVolume implements Command {
    private final MusicPlayer player;
    public DecreaseVolume(MusicPlayer player) {
        this.player = player;
    }
    @Override
    public String execute() {
        return player.decreaseVolume();
    }
}
