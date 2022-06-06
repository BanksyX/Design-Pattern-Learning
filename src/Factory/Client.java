package Factory;

import java.util.Random;

public class Client {

    public static void main(String[] args) {
//        int screenWidth = 100;
//        System.out.println("Start game!");
//        Random random = new Random();
//        /*
//        * 随机出现这个设置不应该出现在客户端代码内，如果有多个这样的操作，那么代码就会重复出现，冗余严重
//        * 可以把这些实例化逻辑抽离出来作为一个工厂类；
//        * */
//        int x = random.nextInt(screenWidth);
//        Enemy airplane = new Airplane(x, 0);
//        airplane.show();
//
//        x = random.nextInt(screenWidth);
//        Enemy tank = new Tank(x, 0);
//        tank.show();


        // SimpleFactory实现

//        System.out.println("游戏开始");
//        SimpleFactory factory = new SimpleFactory(100);
//        factory.create("Airplane").show();
//        factory.create("Tank").show();

        // Factory实现
        int screenWidth = 100;
        System.out.println("游戏开始");

        Factory factory = new TankFactory();
        for (int i = 0; i < 5; i++)
            factory.create(screenWidth).show();

        factory = new AirplaneFactory();
        for (int i = 0; i < 5; i++)
            factory.create(screenWidth).show();

        // Boss出现
        factory = new BossFactory();
        factory.create(screenWidth).show();

    }
}
