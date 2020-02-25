package com.colinf.code.src;

import java.util.Stack;

class SolutionValidParens {

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack stack = new Stack<Character>();

        int i = 0;
        for (char c: s) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.empty()) return false;
                char top = (char) stack.pop();
                if ((top == '(' && c!=')') ||
                (top == '[' && c!=']') ||
                (top == '{' && c!='}')) {
                  return false;
                }
            }

        }

        return stack.empty();
    }
}