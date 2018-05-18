package TrafficControl;

public class Bus implements Runnable{
    private int number;
    public Bus(int number){
        this.number= number;

    }
    @Override
    public void run() {
        for (int i= 0;i<number;i++){
            System.out.print(" 公交车"+i+"通过");
            try {
                Thread.sleep(400);

            }catch (InterruptedException s){
                System.out.println("公交车通过出现问题");

            }


        }
    }
}
