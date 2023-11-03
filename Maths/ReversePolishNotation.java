package Maths;

import java.util.Stack;

public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(String token: tokens){
            if(token.equals("+") || 
                token.equals("-") ||
                token.equals("*") ||
                token.equals("/")){
                int first = Integer.parseInt(stack.pop());
                int second = Integer.parseInt(stack.pop());
                int ans = 0;
                switch(token) {
                    case "+" -> {
                        ans = second + first;
                    }
                    case "-" -> {
                        ans = second - first;
                    }
                    case "*" -> {
                        ans = second * first;
                    }
                    case "/" -> {
                        ans = second / first;
                    }
                }

                stack.push(String.valueOf(ans));
            }
            else{
                stack.push(token);
            }
        }

        return Integer.parseInt(stack.pop());
    }
}
