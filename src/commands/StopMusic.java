package commands;
import devices.MusicPlayer;

public class StopMusic implements Command {
    private final MusicPlayer player;
    public StopMusic(MusicPlayer player) {
        this.player = player;
    }
    @Override
    public String execute() {
        return player.stop();
    }
}
