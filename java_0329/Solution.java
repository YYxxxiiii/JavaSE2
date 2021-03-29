import java.util.*;

import java.util.Stack;
public class Solution {
    /**
     * 
     * @param s string字符串 
     * @return bool布尔型
     */
    public boolean isValid (String s) {
        // write code here
        Stack<Character> c = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (c.empty()) {
                c.push(s.charAt(i));
                continue;
            }
            if (s.charAt(i) == ')' && c.peek() == '(') {
                c.pop();
            } else if (s.charAt(i) == '}' && c.peek() == '{') {
                c.pop();
            } else if (s.charAt(i) == ']' && c.peek() == '[') {
                c.pop();
            } else {
                c.push(s.charAt(i));
            }
        }
        return c.empty();
    }
}