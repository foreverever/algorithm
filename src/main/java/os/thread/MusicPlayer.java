package os.thread;

public class MusicPlayer extends Thread {
    int type;
    MusicBox musicBox;

    public MusicPlayer(int type, MusicBox musicBox) {
        this.type = type;
        this.musicBox = musicBox;
    }

    @Override
    public void run() {
        if (type == 0) {
            musicBox.playPop();
        } else if (type == 1) {
            musicBox.playBallad();
        } else {
            musicBox.playRock();
        }
    }
}
