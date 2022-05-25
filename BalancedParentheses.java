package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        ArrayDeque<Character> queue = new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if ((symbol == '(') || (symbol == '[') || (symbol == '{')) {
                stack.push(symbol);
            } else {
                queue.offer(symbol);
            }
        }
        boolean isNot = true;
        if ((stack.size() == queue.size()) && (!stack.isEmpty()) && (!queue.isEmpty())) {
            for (int i = stack.size(); i > 0; i--) {
                switch (stack.peek()) {
                    case '(':
                        if (queue.peek() == ')') {
                            stack.pop();
                            queue.poll();
                        }
                        break;
                    case '[':
                        if (queue.peek() == ']') {
                            stack.pop();
                            queue.poll();
                        }
                        break;
                    case '{':
                        if (queue.peek() == '}') {
                            stack.pop();
                            queue.poll();
                        }
                        break;
                }
            }
            if (stack.isEmpty() && queue.isEmpty()) {
                isNot = false;
            }
        }
        if (isNot) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}

//{[()]}
//{[(])}
//{{[[(())]]}}