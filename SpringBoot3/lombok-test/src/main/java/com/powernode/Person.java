package com.powernode;

import lombok.Builder;

public class Person {
    private final String name;
    private final int age;
    private final String email;
    private Person(String name,int age,String email){
        this.name=name;
        this.age=age;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public static PersonBuilder builder(){
        return new PersonBuilder();
    }
    public static class PersonBuilder{
        private String name;
        private int age;
        private String email;
        public PersonBuilder name(String name){
            this.name=name;
            return this;
        }
        public PersonBuilder age(int age){
            this.age=age;
            return this;
        }
        public PersonBuilder email(String email){
            this.email=email;
            return this;
        }
        public Person build(){
            return new Person(name,age,email);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person person=Person.builder().name("jackson").age(20).email("jackson@123.com").build();
        System.out.println(person);
    }
}
