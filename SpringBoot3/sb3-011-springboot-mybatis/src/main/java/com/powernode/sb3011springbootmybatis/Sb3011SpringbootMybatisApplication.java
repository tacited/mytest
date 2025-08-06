package com.powernode.sb3011springbootmybatis;

import com.powernode.sb3011springbootmybatis.model.Vip;
import com.powernode.sb3011springbootmybatis.resporitory.VipMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@MapperScan(basePackages = {"com.powernode.sb3011springbootmybatis.resporitory"})
@SpringBootApplication
public class Sb3011SpringbootMybatisApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =  SpringApplication.run(Sb3011SpringbootMybatisApplication.class, args);
        VipMapper vipMapper = applicationContext.getBean("vipMapper", VipMapper.class);
        Vip vip=vipMapper.selectById(1L);
        System.out.println(vip);

        Vip newVip=new Vip("杰克","1234567893","1999-11-10");
        vipMapper.insert(newVip);

        List<Vip> vips=vipMapper.selectAll();
        System.out.println(vips);

        vip.setName("zhangsan");
        vipMapper.update(vip);

        List<Vip> vips2=vipMapper.selectAll();
        System.out.println(vips2);

        vipMapper.deleteById(1L);

        List<Vip> vips3=vipMapper.selectAll();
        System.out.println(vips3);
        applicationContext.close();
    }

}
