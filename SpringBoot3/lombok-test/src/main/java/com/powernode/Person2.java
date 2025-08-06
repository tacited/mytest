package com.powernode;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

@Data
@Builder
public class Person2 {
    private final String name;
    private final int age;
    private final String email;
    @Singular("addPhone")
    private final List<String> phones;

    public static void main(String[] args){
        Person2 person2=Person2.builder().name("jackson").age(20).email("jackson@123.com").addPhone("15222020214").addPhone("14875421424").addPhone("16855241424").build();
        System.out.println(person2);
    }
}
