package com.powernode;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person1 {
    private String name;
    private int age;
    private String email;

    public static void main(String[] args) {
        Person1 person1=Person1.builder().name("jackson").age(20).email("jackson@123.com").build();
        System.out.println(person1);
    }
}
