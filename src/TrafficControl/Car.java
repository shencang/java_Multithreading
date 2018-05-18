package TrafficControl;

public class Car implements Runnable {
    private int number;
    public Car(int number){
        this.number= number;

    }
    @Override
    public void run() {
        for (int i= 0;i<number;i++){
            System.out.print(" 轿车"+i+"通过");
            try {
                Thread.sleep(100);

            }catch (InterruptedException s){
                System.out.println("轿车通过出现问题");

            }


        }
    }
}
