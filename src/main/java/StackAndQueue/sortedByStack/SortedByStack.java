package StackAndQueue.sortedByStack;

import java.util.Stack;

/**
 * @author zjbao123
 * @version 1.0
 * @since 2020-08-17 21:25:46
 */
public class SortedByStack {
    public static Stack<Integer> sortedStackByStack(Stack<Integer> stack) {

        Stack<Integer> help = new Stack<>();
        while (stack.size() > 0) {
            Integer item = stack.pop();
            if (help.isEmpty() || help.peek() <= item) {
                help.push(item);
            } else {
                while(!help.isEmpty()){
                    stack.push(help.pop());
                }
                help.push(item);
            }
        }
        return help;
    }

}
