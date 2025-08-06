package com.powernode;

public class CustomerTest {
    public static void main(String[] args) {
        Customer c1=new Customer(1L,"jackson","123");
        System.out.println(c1);
        System.out.println(c1.getId());
        System.out.println(c1.getName());
        System.out.println(c1.getPassword());
        System.out.println(c1.hashCode());
        Customer c2=new Customer(1L,"jackson","123");
        System.out.println(c1.equals(c2));
    }
}
