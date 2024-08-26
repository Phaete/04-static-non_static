package com.phaete;

public class Main {
    public static void main(String[] args) {
        Counter counter_1 = new Counter();
        Counter counter_2 = new Counter();
        Counter counter_3 = new Counter();

        // _1
        counter_1.incrementTotalCount(); // total count = 1
        counter_1.incrementTotalCount(); // total count = 2
        counter_1.incrementTotalCount(); // total count = 3
        counter_1.incrementTotalCount(); // total count = 4
        counter_1.incrementInstanceCount(); // instance count = 1
        counter_1.incrementInstanceCount(); // instance count = 2
        // _2
        counter_2.incrementInstanceCount(); // instance count = 1
        counter_2.incrementInstanceCount(); // instance count = 2
        counter_2.incrementInstanceCount(); // instance count = 3
        // _3
        counter_3.incrementTotalCount(); // total count = 5
        counter_3.incrementInstanceCount(); // instance count = 1

        System.out.println(counter_1);
        System.out.println(counter_2);
        System.out.println(counter_3);

        System.out.println(Calculator.add(4,5));
        System.out.println(Calculator.sub(4,5));
        System.out.println(Calculator.mul(4,5));
        System.out.println(Calculator.div(4,5));

    }

    /*
    Create a new class 'Calculator' with a static method 'add' that takes two numbers as parameters and returns their sum.

    Write code in the main method to call the 'add' method and print the result.

    Optional: Implement additional static methods in the 'Calculator' class (subtraction, multiplication, division) and
    call them in the main method.

    */
}