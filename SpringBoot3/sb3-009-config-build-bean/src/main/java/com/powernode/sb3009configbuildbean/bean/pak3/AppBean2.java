package com.powernode.sb3009configbuildbean.bean.pak3;

import com.powernode.sb3009configbuildbean.bean.pak2.Address;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "app2")
public class AppBean2 {
    private String name;
    private Integer age;
    private String email;
    private com.powernode.sb3009configbuildbean.bean.pak2.Address address;

    @Override
    public String toString() {
        return "AppBean1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public com.powernode.sb3009configbuildbean.bean.pak2.Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
