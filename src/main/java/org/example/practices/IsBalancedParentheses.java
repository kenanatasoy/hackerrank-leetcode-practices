package org.example.practices;

import java.util.*;

class IsBalancedParentheses{

    private boolean isBalanced(String string){

        if (string.length() % 2 != 0)
            return false;

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> charMap = new HashMap<>();

        charMap.put('(', ')');
        charMap.put('{', '}');
        charMap.put('[', ']');
        charMap.put(')', '(');
        charMap.put('}', '{');
        charMap.put(']', '[');


        // {}(
        for (int i = 0; i < string.length(); i++) {

            char reverseChar = charMap.get(string.charAt(i));

            if(isLeftBracket(string.charAt(i)))
                stack.push(string.charAt(i));

            else if( stack.isEmpty() || stack.pop() != reverseChar )
                return false;

        }

        return stack.empty();

    }

    private boolean isLeftBracket(char c){
        return c == '[' || c == '{' || c == '(';
    }


}



