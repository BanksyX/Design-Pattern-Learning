### 原型模式 Prototype
1. 关于类的实例化与克隆的区别；
2. 类的实例化和克隆都是在产生对象，但是方法是不同的；
3. 原型模式目的是从原型实例克隆出新的实例，这对于有非常复杂的
初始化过程的对象或者是需要耗费大量资源的情况，原型模式是更好的选择；
4. 从类到对象过程叫做 创建；从本体对象到副本对象叫做 克隆；
5. 当需要创建多个类似复杂对象时，就可以考虑原型模式，直接拷贝原型对象数据流生成新的副本对象
这样的效率远远高于new关键字所触发的实例化操作；