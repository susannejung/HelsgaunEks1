package FilEksempler;

public class Counter1 extends Thread {
    protected int count, inc, delay;
    public Counter1(int init, int inc, int delay) {
        this.count = init; this.inc = inc; this.delay = delay;
    }
    public void run() {
        try {
            for (;;) {
                System.out.print(count + " ");
                count += inc;
                sleep(delay);
            }
        } catch (InterruptedException e) {}
    }
}
