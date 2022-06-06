package Prototype;

public class EnemyPlane implements Cloneable{
    private int x;  // 敌机横坐标
    private int y = 0;  // 敌机纵坐标

    public EnemyPlane(int x){
        this.x = x;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void fly(){
        y++;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    /*
    * EnemyPlane实现了克隆接口Cloneable，这样外部就能够对本类的实例进行克隆操作；
    * 省去了由类而生的再造过程；
    * 至此克隆模式已经实现了，我们只需要简单调用克隆方法便能够高效的得到一个全新的实例副本；
    * 但是可以定义一个敌机克隆工厂类； EnemyPlaneFactory
    * */
    @Override
    public EnemyPlane clone() throws CloneNotSupportedException{
        return (EnemyPlane)super.clone();
    }

}




