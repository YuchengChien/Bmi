package com.jason.javalib;

import com.jason.javalib.hello.Person;
import com.jason.javalib.hello.Student;

public class Tester {
    public static void main(String[] args) {
        Student student = new Student("001", "Jason", 60, 80);
        Student student1 = new Student("004", "Eric", 35, 40);
        student.print();
        student1.print();

        /*student.setId("Jason");
        student.setId("001");
        student.setMath(60);
        student.setEnglish(80);*/

//        System.out.println("Hello world");
        /*Person person = new Person();
        person.hello();
        person.hello("Tom");
        person.setWeight(66);
        person.setHeight(1.7f);
        System.out.println(person.bmi());*/
    }
}
