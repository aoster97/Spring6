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
  
4,如何使用反射创建的对象
  * 加载bean.xml配置文件
  * 对xml文件进行解析操作
  * 获取xml文件bean标签属性
  id属性值和class属性值
  *使用反射根据类全路径创建对象
  
  
  

```

