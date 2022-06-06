package Prototype;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Random;

public class Client {

    public static void main(String[] args) {

        List<EnemyPlane> enemyPlanes = new ArrayList<EnemyPlane>();

        /*
        * 这里是采用循环的方式批量生产敌机，并使用new关键字来实例化敌机；
        * 循环实例化看似没有任何问题，但是效率却非常低！这样会使加载速度变慢，也会浪费有限内存资源；
        * 最大的问题在于，每次使用new关键字进行基于类的实例化过程，每架敌机都进行全新构造的做法是不合适的，这样会耗费更多CPU资源；
        * 原型模式，循环第一次后就已经实例好第一个原型，后续只需要不断进行复制；
        * */
        for (int i = 0; i < 500; i++){
            EnemyPlane ep = new EnemyPlane(new Random().nextInt(200));
            enemyPlanes.add(ep);
        }

        EnemyPlane ep = new EnemyPlane(new Random().nextInt(200));
        for (int i = 0; i < 500; i++){
            try {
                enemyPlanes.add(ep.clone());
            }catch (CloneNotSupportedException clone){
                System.out.println("clone error");
            }
        }

    }
}
