# 单例模式
## 场景
单例模式的目的是，所有的客户端都使用同一个实例。极端的，让一个类只有一个实例，当所有的客户端需要使用这个类提供的接口、资源时候，使用的是同一个实例。

常见的场景是数据库连接单例化、配置文件字段获取等。

## 实现

有两种实现方法：

1. 饿汉式： 在程序启动时完成单例创建。 通过static 代码段来完成初始化，可以实现饿汉式。
2. 懒汉式：当需要使用到单例的时候，才进行创建初始化。

对于懒汉式，要通过双重校验锁保证一个只被实例化一次。

1. 第一重判断 null -> 防止每次访问获得锁、影响多线程性能。
2. 第二重判断null ->  防止多次实例化。





## 生长思考
1. 框架已经将单例模式封装的非常优秀。那么在日常的开发中，还需要自己手动创建单例模式吗？
道行尚浅，以后便知。 万一以后我是写框架的呢。 😄