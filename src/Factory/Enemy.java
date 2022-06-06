package Factory;

// 使用抽象类来定义所有敌人的父类，将共同的属性和行为抽离出来；
public abstract class Enemy {
    // 坐标
    protected int x;
    protected int y;

    // 初始化坐标
    public Enemy(int x, int y){
        this.x = x;
        this.y = y;
    }

    // 抽象方法，在地图上进行绘制，但是具体实现是交给具体的子类去实现
    public abstract void show();
}
