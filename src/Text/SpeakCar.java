package Text;

public class SpeakCar implements Runnable {
    int number;
    @Override

    public void run() {
        for (int i=0;i<20;i++){
         System.out.print("  车"+i);
         try {
             Thread.sleep(120);
         }

         catch (InterruptedException e) {
             System.out.println(e+"err");
         }
        }
    }
}
