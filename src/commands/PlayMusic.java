package commands;
import devices.MusicPlayer;

public class PlayMusic implements Command {
    private final MusicPlayer player;
    public PlayMusic(MusicPlayer player) {
        this.player = player;
    }
    @Override
    public String execute() {
        return player.play();
    }
}