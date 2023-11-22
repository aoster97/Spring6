入门开发案例

![截屏2023-11-22 11.00.24](./assets/截屏2023-11-22 11.00.24.png)

```java
package com.test.spring6;



import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    @Test
    public void testUserObject() {
        // 加载spring的配置文件,进行对象的创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 获取创建的对象
        User user = (User) context.getBean("user");
        System.out.println(user);

        // 使用对象调用方法进行测试
        user.add();
    }

}



<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!--完成user对象创建
     bean标签
        id属性 :唯一标识
        class属性 : 要创建对象所在类的全路径(包名称 + 类名称)
    -->
    <bean id="user" class="com.test.spring6.User"></bean>
</beans>啊
      
通过spring创建对象
```

通过Spring创建对象和new一个对象之间的区别

```java
1,之前创建对象,无参数构造执行?
  
2,不用new的方式,还可以如何创建对象
  反射
3,创建的对象放在哪里?
通过反射创建出来的对象都储存在map里面Map<String, BeanDefinition> beanDefinitionMap中,以key,Value的方式存储
key:唯一标识
Value:类的定义(描述信息)
  
  
4,如何使用反射创建的对象
  * 加载bean.xml配置文件
  * 对xml文件进行解析操作
  * 获取xml文件bean标签属性
  id属性值和class属性值
  *使用反射根据类全路径创建对象
  //反射创建对象
    @Test
    public void testUserObject1() throws Exception {
        //获取类Class对象
        Class clazz = Class.forName("com.test.spring6.User");
        //调用方法创建对象
        //Object o = clazz.newInstance();
        User user = (User) clazz.getDeclaredConstructor().newInstance();
        System.out.println(user);
    }
```



3. 把创建好的对象存储到一个什么样的数据结构当中了呢？

bean对象最终存储在spring容器中，在spring源码底层就是一个map集合，存储bean的map在DefaultListableBeanFactory类中：

```java
private final Map<string,BeanDefinition>beanDefinitionMap = new ConcurrentHashMap<>(256);
```

Spring容器加载到Bean类时，会把这个类的描述信息，以包名加类名的方式存到beanDefinitionMap中，
Map<String,BeanDefinition>:,其中String是Key,默认是类名首字母小写，BeanDefinition,存的是类的定义（描述信息)，我们通常叫BeanDefinition接口为：bean的定义对象，





### 2.5、启用Log4j2日志框架

2.5.1、L0g4j2日志概述

在项目开发中，日志十分的重要，不管是记录运行情况还是定位线上问题，都离不开对日志的分析。日志记录了系统行为的时间、地点、状态等相关信息，能够帮助我们了解并监控系统状态，在发生错误或者接近某种危险状态时能够及时提醒我们处理，同时在系统产生问题时，能够帮助我们快速的定位、诊断并解决问题。



==Apache Log4j2==是一个开源的日志记录组件，使用非常的广泛。在工程中以易用方便代替了System.out等打印语句,  它是JAVA下最流行的日志输入工具。

Log4j2主要由几个重要的组件构成：

(1)**日志信息的优先级，**

日志信息的优先级从高到低有TRACE<DEBUG<INFO<WARN<ERROR<FATAL

TRACE:追踪，是最低的日志级别，相当于追踪程序的执行

DEBUG:调试，一般在开发中，都将其设置为最低的日志级别

INFO:信息，输出重要的信息，使用较多

ERROR:错误，输出错误信息

FATAL:严重错误

这些级别分别用来指定这条日志信息的重要程度；级别高的会自动屏蔽级别低的日志，也就是说,设置了WARN日志,INFO和DEBUG级别的日志不会显示




(2)日志信息的输出目的地，日志信息的输出目的地指定了日志将打印到控制台  还是文件中;

(3)日志信息的输出格式，而输出格式则控制了日志信息的显示内容





2.5.2 引入Log4j2依赖









2.5.3加入日志配置文件

