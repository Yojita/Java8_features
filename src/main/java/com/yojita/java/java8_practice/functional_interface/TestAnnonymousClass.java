package com.yojita.java.java8_practice.functional_interface;

public class TestAnnonymousClass {

    public static void main(String[] args) {
        TestAnnonymousClass test = new TestAnnonymousClass();
        test.createClass();
    }

    public void createClass() {
        AnnonymousClass newclass = new AnnonymousClass() {
            public void eat() {
                System.out.println("Eating inside Annonymous class");
            }
        };
        newclass.eat();
    }
}
