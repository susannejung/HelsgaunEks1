package FilEksempler;

public class Main {

    public static void main(String[] args) {
	// write your code here

         //   new Counter1(0, 1, 33).start();
        //    new Counter1(0, -1, 100).start();


            new Thread(new Counter2(0, 1, 33)).start();
            new Thread(new Counter2(0, -1, 100)).start();



    }
}
