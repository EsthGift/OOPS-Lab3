package evaluations.level1;

public class OverridingThread extends Thread {
    @Override
    public void run() {
        System.out.println("OverridingThread running!");
        super.run();
    }

    @Override
    public synchronized void start() {
        System.out.println("OverridingThread starting!");
        super.start();
    }





}
