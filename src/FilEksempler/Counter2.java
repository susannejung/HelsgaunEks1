package FilEksempler;

public class Counter2 implements Runnable {
    protected int count, inc, delay;
    public Counter2(int init, int inc, int delay) {
        this.count = init; this.inc = inc; this.delay = delay;
    }
    public void run() {
        try {
            for (;;) {
                System.out.print(count + " ");
                count += inc;
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {}
    }
}
