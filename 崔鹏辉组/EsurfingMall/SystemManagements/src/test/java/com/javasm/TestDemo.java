package com.javasm;

import com.javasm.sys.entity.User;
import com.javasm.sys.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author: JAVASM
 * @date: 2021/12/3 11:19
 * @className: TestDemo
 * @descrption:
 * @since: jbk1.8
 * @version: 0.1
 */
@SpringBootTest
public class TestDemo {

    @Autowired
    private UserServiceImpl us;

    @Test
    public void  add(){
        User user = new User();
//        user.setSysName("张三");
//        List<User> users = us.getMap(user);
//        for (User u:users){
//            System.out.println(u);
//        }
    }
}
