package commands;
import devices.MusicPlayer;

public class IncreaseVolume implements Command {
    private final MusicPlayer player;
    public IncreaseVolume(MusicPlayer player) {
        this.player = player;
    }
    @Override
    public String execute() {
        return player.increaseVolume();
    }
}
