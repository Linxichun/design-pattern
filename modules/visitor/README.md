# 简介
## 为什么要使用访问者模式
在软件设计中，有些复杂对象可能存储了不同类型的对象元素，而且需要根据对象元素的类型的不同进行不同的处理，还
可能增加新的处理方式。想要操作这种复杂对象是比较复杂的，访问者模式可以解决这个问题。
## 什么是访问者模式
访问者模式(Visitor Pattern)：表示一个作用于某对象结构中的各元素的操作，它使我们可以在不改变各元素的类的前提下
定义作用于这些元素的新操作。
## 类型
对象行为型模式
## 遵守的原则
部分遵守开闭原则。 
为什么说部分遵守呢？因为新增新的访问操作很方便，仅需要增加一个新的访问者即可在一个对象结构上定义一个新的操
作。但如果需要新增元素类，要在抽象访问者角色中增加一个新的抽象操作，并在每一个具体访问者类中增加相应的具体操作。
## 使用频率
★★☆☆☆
## 学习难度
★★★★★
# 本文角色
- Vistor：抽象访问者 
    - 抽象类。
    - 具体访问者的父类。
    - 为对象结构中每个具体元素声明了访问方法。一般情况下从访问方法的名称可以了解到这个方法访问的哪个类型的具体元素。
- ConcreteVisitor：具体访问者 
    - 具体类。
    - 继承了抽象访问者。
    - 实现了每个由抽象访问者声明的方法。
    - 每一个方法用于访问对象结构中一种类型的元素。
- Element：抽象元素 
    - 抽象类或者接口
    - 被具体元素继承或实现。
    - 声明了一个accept(Visitor visitor)方法，以抽象访问者为参数是为了指定一个具体访问者来访问实现了本抽象类的具体元素。
- ConcreteElement：具体元素 
    - 具体类
    - 继承或实现抽象元素。
    - 实现了了一个accept(Visitor visitor)，以抽象访问者为参数是为了指定一个具体访问者来访问具体元素。
- ObjectStructure：对象结构 
    - 具体类
    - 可能是一个符合或集合，能枚举它的元素。
    - 并提供了允许访问者访问它的元素的方法。
## 角色之间的协作
- 一个使用Visitor模式的客户必须创建一个ConcreteVisitor对象，然后遍历该对象结构，并用访问者访问每个元素。
- 当一个元素被遍历时，它调用对应于它的类的Visitor操作。如有必要，该元素将自身作为这个操作的一个参数以便该访问者访问它的状态。
# 实现
- 新建抽象访问者Vistor.java
- 新建具体访问者ConcreteVisitorA.java
- 新建抽象元素Element.java
- 新建具体元素ConcreteElementA.java、ConcreteElementB.java
- 新建对象结构ObjectStructure.java
- 新建测试类Client.java.java
# 总结&优缺点
- 访问者模式中对象结构存储了不同类型的元素对象，以供不同访问者访问。
- 访问者模式包括两个层次结构，一个是访问者层次结构，提供了抽象访问者和具体访问者，一个是元素层次结构，提供了抽象元素和具体元素。
- 相同的访问者可以以不同的方式访问不同的元素，相同的元素可以接受不同访问者以不同访问方式访问。
- 在访问者模式中，增加新的访问者无须修改原有系统，系统具有较好的可扩展性。
## 优点
- 部分遵守“开闭原则”。新增新的访问操作很方便，仅需要增加一个新的访问者即可在一个对象结构上定义一个新的操作。
- 对元素对象的访问方法集中到了一个访问者中而不是分散在各个元素中。
## 缺点
- 不完全遵守“开闭原则”。如果需要新增元素类，要在抽象访问者角色中增加一个新的抽象操作，并在每一个具体访问者类中增加相应的具体操。
# 适用环境
- 一个对象结构包含多个类型的元素，而且对于不同类型的元素，你想对这些元素进行依赖其类型的处理。
- 需要对一个对象结构中进行很多不同而且不相关的操作，而你想避免让这些操作“污染”这些对象的类。因为新增一种操作只需要新增一个访问者就可以了。
- 在对象结构的元素数目确定的情况下。因为新增新的元素比较麻烦，需要在抽象访问者角色中增加一个新的抽象操作，并在每一个具体访问者类中增加相应的具体操作。
## 使用场景
- 待补充
# 扩展
- 组合模式Composite：访问者模式可以用于对一个由Composite模式定义的对象结构进行操作。
- 解释器模式Intepreter：访问者可以用于解释器模式。
# 问题
## 在软件开发中，你在哪里用到了访问者模式？
待补充。
行为型模式讲到这里就结束了，下一篇文章对最近所学的行为型模式做阶段性总结。 
传送门：[设计模式-行为型模式总结](http://blog.csdn.net/panweiwei1994/article/details/76163946)