package bracket;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public boolean isValid(String s) {
        // 1. 准备好一个放 Character 类型的栈
        Deque<Character> stack = new LinkedList<>();

        // 2. 遍历 s 的每一个字符
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    // 因为没有 break，所以，无论 ([{，都会执行
                    stack.push(c);
                    break;
                default: {
                    // 一定是右括号
                    if (stack.isEmpty()) {
                        // 右括号多了
                        return false;
                    }

                    // 否则取出栈顶元素
                    char left = stack.pop();
                    // 进行左右括号的比较
                    if (!compareBracket(left, c)) {
                        // 左括号和右括号不匹配
                        return false;
                    }
                }
            }
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            // 左括号多了
            return false;
        }
    }
}
