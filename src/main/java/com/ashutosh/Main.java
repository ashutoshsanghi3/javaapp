package com.ashutosh;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Person p1 = Person.builder().name("Ram Kumar").age(19).build();
        Person p2 = Person.builder().name("Ram Kumar").age(19).build();

        System.out.println(p1.getAge());
        System.out.println(p2.getName());
        //Due to @EqualsAndHashCode ,p1 and p2 will have the same hash if both have same age and name
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p1.equals(p2)); //true because matches hash code
        System.out.println(p1==p2); //false because it compares memory locations
    }
}