package com.test.spring6.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//类似于<bean id="user"class="...">
//属性默认为首字母的小写
//@Component(value = "user")
//public class User {
//}
//@Repository
//@Service
@Controller
public class User {
}