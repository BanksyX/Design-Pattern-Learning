package Singleton;




public class Sun {

    /*
    * private确保了太阳实列的私有性、不可见性、不可访问性
    * static关键字确保了太阳的静态性，将太阳放入内存中的静态区，类加载时就初始化了，与类同在，在内存中永生
    * final关键字确保这个太阳是常量、恒量，一旦被赋值便不可修改；
    * */
//    private static final Sun sun = new Sun();
    // 这里不再进行实例化，无请求不实例化，节省了内存空间，而是再第一次请求时进行实例化；
    // 使用volatile关键字对静态变量的修饰能够保证变量值在各线程访问时的同步性、唯一性；
    private volatile static Sun sun;

    private Sun(){
        // 构造方法私有化，一旦私有化，太阳类就被完全封闭了，实例化工作完全属于内部事务；

    }

    public static Sun getInstance(){
        // 一个静态方法来获取太阳的单例对象，设置为public暴露给外部使用；
        //
        if (sun == null){
            synchronized (Sun.class){
                if (sun == null){
                    sun = new Sun();
                }
            }
        }

        return sun;
    }
}






