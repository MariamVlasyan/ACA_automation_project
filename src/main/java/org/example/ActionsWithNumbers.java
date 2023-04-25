package org.example;

import java.util.Scanner;

/*Write a program to calculate the sum, difference and product of two numbers by creating a class
named 'ActionsWithNumbers' with separate methods for each operation. Numbers and action
types are entered by user.( make methods static)*/
public class ActionsWithNumbers {
    int a;
    int b;

    public ActionsWithNumbers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        ActionsWithNumbers actions = new ActionsWithNumbers(0, 0);
        actions.inputMethod();
        actions.prodMethod();
        actions.sumMethod();
        actions.differenceMethod();

    }

    public void inputMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the first number: " + a);
        a = scanner.nextInt();
        System.out.println("Please input the second number: " + b);
        b = scanner.nextInt();
    }

    public void sumMethod() {
        int sum = a + b;
        System.out.println("The sum of two numbers are: " + sum);
    }

    public void differenceMethod() {
        int diff = a - b;
        System.out.println("The diff of two numbers are: " + diff);
    }

    public void prodMethod() {
        int prod = a * b;
        System.out.println("The prod of two numbers are: " + prod);
    }
}
