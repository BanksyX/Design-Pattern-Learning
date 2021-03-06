### 工厂方法 Factory Method
1. 工厂类往往是对 **对象构造、实例化、初始化**过程的 封装
2. 而工厂方法可以升华为一种设计模式，它对工厂制造方法进行**接口规范化**，
以允许子类工厂决定具体制造哪类产品的实例，最终降低系统耦合，提升可维护性、可扩展性；

3. 问题所在
   1. 传统的构造方式用到 new 关键字，这样会使得飞机对象的产生代码被牢牢硬编码在客户端类里，
    也就是说客户端和实例化过程强耦合了。
   2. 但是客户端应该完全不必关心产品的制造过程(实例化、初始化)，而将任务交给相应工厂负责即可
   3. 此外，工厂方法模式是基于多元化产品的构造方法发展的，开辟了产品多元化的生产模式
    不同的产品由不同的生产工厂生产，专业化分工；
4. 通过将生产对象从客户端中抽离出来单独组成一个抽象工厂来实现对象的获取，能够
简化客户端代码；
5. 但是这样任然存在问题，即 生产方式的多元化
6. 随着生产方式的多元化，工厂类就需要被不断地被反复修改，这样严重缺乏灵活性、可扩展性
尤其是对一些庞大的系统，大量产品的判断逻辑会被堆积在制造方法中；
7. 这严重不符合代码逻辑，**不能经常修改已经写好的类**
8. **制定工业制造标准，接口实现**
9. 针对复杂多样的生产需求，我们需要对产品制造的相关代码进行合理规划，
将简单工厂的制造方法进行拆分，构建起 抽象化、多态化的生产模式；首先定义一个工厂接口，
以确立统一个工业制造标准 public interface Factory{}
10. 之后如要加入新的种类的敌人，只需要添加相应的地人类和相应的工厂类；
11. **工厂方法中，不仅产品需要分类，工厂也需要进行分类**
12. 生产方式不会再堆积在一个文件代码中实现，而是放到具体的子类中进行实现
13. 工厂方法模式的各角色定义如下：
    1. Product 所有产品的顶级父类，可以是抽象类或者接口；
    2. ConcreteProduct 由产品类派生出来的产品子类，可以有多个产品子类，如这里的Airplane、Tank、Boss类
    3. Factory 工厂接口，既可以是接口也可以是抽象类，使得制造方法抽象化、标准统一化
    4. ConcreteFactory 工厂实现，实现了工厂接口的工厂实现类，并决定工厂方法中具体返回哪种产品子类的实例；
14. 工厂方法模式不但能使得 客户端与敌人的实例化过程彻底解耦，抽象化、多态化得工厂还能让我们灵活的构建出独特多样的产品
