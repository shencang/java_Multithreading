package TrafficControl;

public class Bike implements Runnable {
    private int number;
    public Bike(int number){
        this.number= number;

    }
    @Override
    public void run() {

        for (int i= 0;i<number;i++){
            System.out.print(" 自行车"+i+"通过");
            try {
                Thread.sleep(200);

            }catch (InterruptedException s){
                System.out.println("自行车通过出现问题");

            }


        }
    }
}
