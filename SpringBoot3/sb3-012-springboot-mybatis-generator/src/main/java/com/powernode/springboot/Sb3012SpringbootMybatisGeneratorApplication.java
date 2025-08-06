package com.powernode.springboot;

import com.powernode.springboot.model.Vip;
import com.powernode.springboot.repository.VipMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@MapperScan(basePackages = "com.powernode.springboot.repository")
@SpringBootApplication
public class Sb3012SpringbootMybatisGeneratorApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext=SpringApplication.run(Sb3012SpringbootMybatisGeneratorApplication.class, args);
        VipMapper vipMapper = applicationContext.getBean("vipMapper", VipMapper.class);
        Vip vip=new Vip("孙悟空","1999-11-11","1234567895");
        vipMapper.insert(vip);

        Vip vip1=vipMapper.selectByPrimaryKey(2L);
        System.out.println(vip1);

        vipMapper.deleteByPrimaryKey(4L);

        applicationContext.close();
    }

}
