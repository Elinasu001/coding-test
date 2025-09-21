package com.ex.stack.rudimentary;
import java.util.Stack;

public class PostfixRun {

    /**
     * 후위 표기식 문자열을 계산하는 메서드
     * @param postfixExpression 후위 표기식 문자열 (예: "369*+")
     * @return 계산 결과
     */
    public int solution(String postfixExpression) {
        Stack<Integer> stack = new Stack<>();

        for (char symbol : postfixExpression.toCharArray()) {
            // 숫자인지 확인: isDigit()
            if (Character.isDigit(symbol)) {
                // 문자를 정수로 변환하여 스택에 push
                stack.push(Character.getNumericValue(symbol));
            } 
            // 연산자인지 확인
            else {
                // 스택에서 두 개의 피연산자를 pop (LIFO)
                int oper2 = stack.pop();
                int oper1 = stack.pop();
                
                int result = 0;
                
                // 연산자에 따라 계산
                switch (symbol) {
                    case '+':
                        result = oper1 + oper2;
                        break;
                    case '-':
                        result = oper1 - oper2;
                        break;
                    case '*':
                        result = oper1 * oper2;
                        break;
                    case '/':
                        result = oper1 / oper2;
                        break;
                    default:
                        throw new IllegalArgumentException("올바르지 않은 연산자입니다: " + symbol);
                }
                
                // 계산 결과를 다시 스택에 push
                stack.push(result);
            }
        }
        
        // 마지막으로 스택에 남은 최종 결과를 pop하여 반환
        return stack.pop();
    }
    
   
    public static void main(String[] args) {
    	PostfixRun sol = new PostfixRun();
        
        String expression = "369*+"; 
        // 3 + (6 * 9) = 57
        System.out.println("후위 표기식 " + expression + "의 결과: " + sol.solution(expression));

        String expression2 = "523*-";
        // 5 - (2 * 3) = -1
        System.out.println("후위 표기식 " + expression2 + "의 결과: " + sol.solution(expression2));
    }
}

