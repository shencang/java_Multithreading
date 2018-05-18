package TrafficControl;

public class TrafficControlMain {
    public void TrafficControl(){
        Car  car  = new Car(4);
        Bike bike = new Bike(4);
        Bus  bus  = new Bus(10);
       Thread carControl= new Thread(car);
       Thread busControl= new Thread(bus);
       Thread bikeControl= new Thread(bike);

        System.out.println("测试交通线："+carControl.isAlive());
        System.out.println("测试交通线："+busControl.isAlive());
        System.out.println("测试交通线："+bikeControl.isAlive());

        carControl.start();
        bikeControl.start();
        busControl.start();



        System.out.println("\n测试交通线："+carControl.isAlive());
        System.out.println("测试交通线："+busControl.isAlive());
        System.out.println("测试交通线："+bikeControl.isAlive());
        try {
            busControl.join();

        }catch (InterruptedException e){
            System.out.println("交通异常");
        }

        System.out.println("\n测试交通线："+carControl.isAlive());
        System.out.println("测试交通线："+busControl.isAlive());
        System.out.println("测试交通线："+bikeControl.isAlive());





    }

}
