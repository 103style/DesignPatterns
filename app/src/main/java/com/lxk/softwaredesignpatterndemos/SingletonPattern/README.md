# Singleton Pattern  单例模式（创建型模式）

保证一个类仅有一个实例，并提供一个访问它的全局访问点。


### 几种实现方式

* [LazyNotSafeSingleton](https://github.com/103style/DesignPatterns/tree/master/app/src/main/java/com/lxk/softwaredesignpatterndemos/SingletonPattern/imp/LazyNotSafeSingleton.java)
  线程不安全的懒汉式

* [LazySafeSingleton](https://github.com/103style/DesignPatterns/tree/master/app/src/main/java/com/lxk/softwaredesignpatterndemos/SingletonPattern/imp/LazySafeSingleton.java)
  线程安全的懒汉式

* [SafeNotLazySingleton](https://github.com/103style/DesignPatterns/tree/master/app/src/main/java/com/lxk/softwaredesignpatterndemos/SingletonPattern/imp/SafeNotLazySingleton.java)
  线程安全的恶汉式

* [DCLSingleton](https://github.com/103style/DesignPatterns/tree/master/app/src/main/java/com/lxk/softwaredesignpatterndemos/SingletonPattern/imp/DCLSingleton.java)
  双检锁/双重校验锁 实现的单例

* [InnerClassSingleton](https://github.com/103style/DesignPatterns/tree/master/app/src/main/java/com/lxk/softwaredesignpatterndemos/SingletonPattern/imp/InnerClassSingleton.java)
  静态内部类 实现的单例

* [EnumSingleton](https://github.com/103style/DesignPatterns/tree/master/app/src/main/java/com/lxk/softwaredesignpatterndemos/SingletonPattern/imp/EnumSingleton.java)
  枚举 实现的单例

* [SingletonTest](https://github.com/103style/DesignPatterns/tree/master/app/src/main/java/com/lxk/softwaredesignpatterndemos/SingletonPattern/SingletonTest.java)
  LazyNotSafeSingleton 线程不安全的测试