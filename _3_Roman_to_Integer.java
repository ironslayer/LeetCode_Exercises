
import java.util.*;

public class _3_Roman_to_Integer {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int result = sol.romanToInt("MCMXCIV");  
        System.out.println("Result: " + result);
    }
}
// My solution
class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> numMap = Map.of(
            "I", 1,
            "V", 5,
            "X", 10,
            "L", 50,
            "C", 100,
            "D", 500,
            "M", 1000
        );

        int result = 0;
        String aux = "";

        String currentChar = String.valueOf(s.charAt(s.length()-1));
        int value = numMap.get(currentChar);  
        result += value;
        aux = currentChar;

        for (int i = s.length()-2; i >= 0; i--) {
            currentChar = String.valueOf(s.charAt(i));
            value = numMap.get(currentChar);  
            if ( (currentChar.equalsIgnoreCase("I") && aux.equalsIgnoreCase("V")) || (currentChar.equalsIgnoreCase("I") && aux.equalsIgnoreCase("X")) ){
                result -= value;
                aux = currentChar;
                continue;
            }
            if ( (currentChar.equalsIgnoreCase("X") && aux.equalsIgnoreCase("L")) || (currentChar.equalsIgnoreCase("X") && aux.equalsIgnoreCase("C")) ){
                result -= value;
                aux = currentChar;
                continue;
            }
            if ( (currentChar.equalsIgnoreCase("C") && aux.equalsIgnoreCase("D")) || (currentChar.equalsIgnoreCase("C") && aux.equalsIgnoreCase("M")) ){
                result -= value;
                aux = currentChar;
                continue;
            }
            result += value;
            aux = currentChar;
        }
        
        return result;
    }
}

