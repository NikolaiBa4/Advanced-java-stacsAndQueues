package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfChain = Integer.parseInt(scan.nextLine());
        ArrayDeque<Long> stackOdd = new ArrayDeque<>();
        ArrayDeque<Long> stackEven = new ArrayDeque<>();
        stackOdd.push(1L);
        stackEven.push(1L);
        for (int i = 2; i <= numberOfChain; i++) {
            if (i % 2 == 0) {
                stackEven.push(stackEven.peek() + stackOdd.peek());
            } else {
                stackOdd.push(stackEven.peek() + stackOdd.peek());
            }
        }
        if (numberOfChain % 2 == 0) {
            System.out.println(stackEven.peek());
        } else {
            System.out.println(stackOdd.peek());
        }
    }
}
