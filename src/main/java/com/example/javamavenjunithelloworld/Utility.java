package com.example.javamavenjunithelloworld;
public class Utility {
    public static void checkOddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }
    public static void rahul() {
        System.out.println("I am Rahul");
    }
        public static void main(String[] args) {
        checkOddOrEven(10); 
        checkOddOrEven(7);  
        rahul();
    }
}
