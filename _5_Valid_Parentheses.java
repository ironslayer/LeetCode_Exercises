import java.util.Stack;
import java.util.Map;

public class _5_Valid_Parentheses {
    public static void main(String[] args) {
        Solution sol = new Solution();
        boolean result = sol.isValid("()[]{}");  
        System.out.println("Result: " + result);
        boolean result2 = sol.isValid("(){}}{");  
        System.out.println("Result2: " + result2);
        boolean result3 = sol.isValid("()[]");  
        System.out.println("Result3: " + result3);
        boolean result4 = sol.isValid("([])");  
        System.out.println("Result4: " + result4);
        boolean result5 = sol.isValid("([)]");  
        System.out.println("Result5: " + result5);
        boolean result6 = sol.isValid("[");  
        System.out.println("Result6: " + result6);
    }
}

// My solution
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            Character character = s.charAt(i);
            if (character == '(' || character == '[' || character == '{') {
                stack.push(character);
            } else {
                if (stack.empty() && (character == ')' || character == ']' || character == '}')) {
                    return false;
                } else {
                    Character aux = stack.peek();
                    if (aux == '(' && character == ')' || aux == '[' && character == ']' || aux == '{' && character == '}') {
                        stack.pop();
                        continue;
                    }
                    break;
                }
            }
        }
        return stack.empty();
    }
}