package Prototype;

public class EnemyPlaneFactory {

    // 此处仅用单例饿汉模式造一个敌机模型；
    private static EnemyPlane protoType = new EnemyPlane(200);

    // 获取敌机克隆实例
    /*
    * 使用一个静态敌机对象作为原型；简单地调用克隆方法得到一个新的克隆对象；
    * */
    public static EnemyPlane getInstance(int x) throws CloneNotSupportedException{
        EnemyPlane clone = protoType.clone();
        clone.setX(x);
        return clone;
    }
}
