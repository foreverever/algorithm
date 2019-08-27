package os.thread;

public class Main {
    public static void main(String[] args) {
        MusicBox musicBox = new MusicBox();

        MusicPlayer kim = new MusicPlayer(0, musicBox);
        MusicPlayer forever = new MusicPlayer(1, musicBox);
        MusicPlayer park = new MusicPlayer(2, musicBox);

        kim.start();    //스레드 1 생성
        forever.start();    //스레드 2 생성
        park.start();   //스레드 3 생성
    }
}
