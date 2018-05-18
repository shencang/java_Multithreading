package Text;

public class SpeakElephant implements Runnable{

    @Override
    public void run() {
        for (int i= 0;i<20;i++){
            System.out.print(" 大象"+i);
            try {
                Thread.sleep(100);

            }catch (InterruptedException s){

            }


        }
    }
}
