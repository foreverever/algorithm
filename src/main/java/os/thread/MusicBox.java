package os.thread;

public class MusicBox {
    public void playPop() {
        for (int i = 0; i < 10; i++) {
            System.out.println("팝 음악!");

            try {
                Thread.sleep((int)(Math.random()*100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void playBallad() {
        for (int i = 0; i < 10; i++) {
            System.out.println("발라드 음악!!");

            try {
                Thread.sleep((int)(Math.random()*100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void playRock() {
        for (int i = 0; i < 10; i++) {
            System.out.println("락 음악!!!");

            try {
                Thread.sleep((int)(Math.random()*100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
