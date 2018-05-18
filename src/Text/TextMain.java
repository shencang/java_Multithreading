package Text;

public class TextMain {
    public  TextMain(){
        Thread speakElephant;
        Thread speakCar;
        SpeakElephant elephhant =new SpeakElephant();
        SpeakCar car= new SpeakCar();
    speakCar =new Thread(car);
    speakElephant= new Thread(elephhant);
    System.out.println("测试线程："+speakCar.isAlive());
        System.out.println("测试线程："+speakElephant.isAlive());

        System.out.println("线程："+speakCar.getName());
        System.out.println("线程："+speakElephant.getName());
        speakCar.setName("飞车");
        speakElephant.setName("象板子");
        speakElephant.setPriority(6);
        System.out.println("线程："+speakElephant.getName()+"优先级是"+speakElephant.getPriority());
        System.out.println("线程："+speakCar.getName()+"优先级是"+speakCar.getPriority());





        Thread.yield();
    speakCar.start();
    speakElephant.start();
    if (Thread.currentThread()== speakElephant){
            System.out.println("开的太快了，睡一会儿！");
            try {
                Thread.sleep(100);
            }catch (InterruptedException w){

            }


    for (int i =0;i<20;i++){
        System.out.print(" 主要"+i);
    }

    System.out.println("测试线程："+speakCar.isAlive());
        System.out.println("测试线程："+speakElephant.isAlive());
        System.out.println("线程："+speakCar.getName());
        System.out.println("线程："+speakElephant.getName());


        }

}
}
