package com.ex.stack.rudimentary;

import java.util.Stack;

public class ParenthesisChecker {

    public boolean checkParentheses(String expression) {
        // 괄호를 담을 스택을 생성합니다.
        Stack<Character> stack = new Stack<>();

        // 문자열을 한 글자씩 순회합니다.
        for (char ch : expression.toCharArray()) {
            switch (ch) {
                // 여는 괄호인 경우 스택에 push합니다.
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                
                // 닫는 괄호인 경우 스택의 최상단과 짝이 맞는지 확인합니다.
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false; // 짝이 맞지 않거나 스택이 비어 있으면 false 반환
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
            }
        }
        
        // 모든 문자를 확인한 후 스택이 비어 있어야 유효한 괄호입니다.
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ParenthesisChecker checker = new ParenthesisChecker();

        String expr1 = "({[]})";
        String expr2 = "([)]";
        String expr3 = "{[}]";
        String expr4 = "()";
        String expr5 = "(()";

        System.out.println(expr1 + " : " + checker.checkParentheses(expr1)); // 예상: true
        System.out.println(expr2 + " : " + checker.checkParentheses(expr2)); // 예상: false
        System.out.println(expr3 + " : " + checker.checkParentheses(expr3)); // 예상: false
        System.out.println(expr4 + " : " + checker.checkParentheses(expr4)); // 예상: true
        System.out.println(expr5 + " : " + checker.checkParentheses(expr5)); // 예상: false
    }
}