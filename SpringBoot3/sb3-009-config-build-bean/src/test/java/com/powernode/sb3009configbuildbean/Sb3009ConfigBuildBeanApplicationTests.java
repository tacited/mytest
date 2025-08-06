package com.powernode.sb3009configbuildbean;

import com.powernode.sb3009configbuildbean.bean.AppBean;
import com.powernode.sb3009configbuildbean.bean.SomeBean;
import com.powernode.sb3009configbuildbean.bean.pak1.CollectionConfig;
import com.powernode.sb3009configbuildbean.bean.pak2.AppBean1;
import com.powernode.sb3009configbuildbean.bean.pak3.AppBean2;
import com.powernode.sb3009configbuildbean.bean.pak4.ApplicationConfig;
import com.powernode.sb3009configbuildbean.bean.pak5.Group;
import com.powernode.sb3009configbuildbean.bean.pak6.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Sb3009ConfigBuildBeanApplicationTests {
    @Autowired
    private AppBean appBean;
    @Test
    void test01() {
        System.out.println(appBean);
        System.out.println(appBean.getClass());
    }

    @Autowired
    private AppBean1 appBean1;
    @Test
    void test02(){
        System.out.println(appBean1);
    }

    @Autowired
    private AppBean2 appBean2;
    @Test
    void test03(){
        System.out.println(appBean2);
    }

    @Autowired
    private CollectionConfig collectionConfig;
    @Test
    void test04(){
        System.out.println(collectionConfig);
    }

    @Autowired
    private ApplicationConfig applicationConfig;
    @Test
    void test05(){
        System.out.println(applicationConfig.getAddress());
    }

    @Autowired
    private Group group;
    @Test
    void test06(){
        System.out.println(group);
    }

    @Autowired
    private Person person;
    @Test
    void test07(){
        System.out.println(person);
    }

    @Autowired
    private SomeBean someBean;
    @Test
    void test08(){
        someBean.doSome();
    }
}
