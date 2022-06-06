package Factory;

// 任何工厂都应该遵顼此接口
// 这种非常易于扩展；
// 比如有敌人Boss，先定义一个继承自敌人抽象类Enemy的Boss类，相应的还有Boss的工厂类，同样实现工厂方法接口
public interface Factory {
    Enemy create(int screenWidth);
}
