# 简介
## 为什么要使用抽象工厂模式
- 参考工厂方法模式的优点
- 当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
## 什么是抽象工厂模式
抽象工厂模式(Abstract Factory Pattern)：提供一个创建一系列相关或相互依赖对象的接口，而无须指定它们具体的类。
## 别名
Kit模式
## 类型
对象创建型模式
## 相关概念：
产品族：如格力的洗衣机，冰箱，空调是一个产品族。
产品等级：如格力的空调，海尔的空调，三星的空调是一个产品等级。
## 遵守的原则
开闭原则。
# 本文角色
- 产品接口。产品接口的主要目的是定义产品的规范，所有的产品实现都必须遵循产品接口定义的规范。
- 产品实现。实现产品接口的具体类，决定了产品在客户端中的具体行为。
- 抽象工厂。一个抽象工厂派生不同的具体工厂，每个具体工厂生产自己的产品族（包含不同产品等级）
- 工厂实现。在编程中，工厂实现决定如何实例化产品，是实现扩展的途径。与工厂模式中需要有多少种产品就需要有多少个具体的工厂实现不
    同的是，抽象通常模式一个工厂可以生产多种产品。
# 实现
- 创建产品接口
- 创建实现产品接口的产品类。
- 创建抽象工厂接口
- 创建实现抽象工厂接口的工厂类
# 优缺点
## 优点 
符合“开闭原则”。增加新的具体工厂和产品族很方便，无须修改已有系统。
## 缺点 
增加新的产品等级结构麻烦。
# 适用环境
待补充
## 使用场景
待补充
# 问题
## 抽象工厂模式和工厂方法模式区别
- 工厂可以生产的产品种类不同。在抽象工厂模式中，工厂可以生产不同的产品。但在工厂方法中，工厂只能生产一种产品。
- 抽象产品个数不同。**在抽象工厂模式中，抽象产品有多个**。在工厂方法中，抽象产品只有一个。
## 如果需要增加一个海尔的产品族，该如何办？
新建海尔的工厂类HaierFactory，和海尔的空调类HaierAirCondition，海尔的冰箱类SamsungFridge。其他的不用修改。
## 如果需要增加一个洗衣机的产品等级，该如何办？
- 在抽象工厂中新建生产洗衣机的方法；
- 新建一个生产洗衣机的产品接口
- 为三星新建一个生产洗衣机的产品类
- 为格力新建一个生产洗衣机的产品类
## 在软件开发中，你在哪里用到了抽象工厂模式？ 
面试的时候经常被问到，好好想想吧^^