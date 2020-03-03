# Null Object Pattern  空对象模式（行为型模式）
在空对象模式 中，一个空对象取代 NULL 对象实例的检查。Null 对象不是检查空值，而是反应一个不做任何动作的关系。这样的 Null 对象也可以在数据不可用的时候提供默认的行为。

在空对象模式中，我们创建一个指定各种要执行的操作的抽象类和扩展该类的实体类，还创建一个未对该类做任何实现的空对象类，该空对象类将无缝地使用在需要检查空值的地方。


---

![示例](https://github.com/103style/DesignPatterns/tree/master/pic/NullObjectPattern.jpg)

---


摘自[phperz](http://www.phperz.com/article/15/0814/148652.html).