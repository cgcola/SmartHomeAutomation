package devices;

public class MusicPlayer implements VolumeControl {
    private int volume = 75;
    private boolean isPlaying = false;

    public String play() {
        isPlaying = true;
        return "Music is playing";
    }

    public String stop() {
        isPlaying = false;
        return "Music stopped";
    }

    @Override
    public String increaseVolume() {
        if (volume < 100) volume++;
        return "Music volume increased to " + volume;
    }

    @Override
    public String decreaseVolume() {
        if (volume > 0) volume--;
        return "Music volume decreased to " + volume;
    }
}
