package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            String[] inputAndNumber = input.split(" ");
            String command = inputAndNumber[0];
            switch (command) {
                case "1":
                    stack.push(Integer.parseInt(inputAndNumber[1]));
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    for (Integer I : stack) {
                        if (I > max) {
                            max = I;
                        }
                    }
                    System.out.println(max);
                    max = Integer.MIN_VALUE;
                    break;

            }
        }
    }
}

//9
//1 97
//2
//1 20
//2
//1 26
//1 20
//3
//1 91
//3

//7
//1 81
//2
//1 14
//2
//1 14
//1 47
//3