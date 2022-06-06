package Factory;

import java.util.Random;

public class SimpleFactory {
    private int screenWidth;
    private Random random;

    public SimpleFactory(int screenWidth){
        this.screenWidth = screenWidth;
        this.random = new Random();
    }

    // 通过下面这个create方法，根据传入的敌机种类就可以生产出相应的对象实例；
    // 这样，制造敌人这个任务就全部交给了简单工厂来负责了，客户端就可直接从简单工厂取敌人了；
    public Enemy create(String type){
        int x = random.nextInt(screenWidth); // 生成敌人横坐标随机数
        Enemy enemy = null;
        switch (type){
            case "Airplane":
                enemy = new Airplane(x, 0);
                break;
            case "Tank":
                enemy = new Tank(x, 0);
                break;
        }
        return enemy;
    }
}
