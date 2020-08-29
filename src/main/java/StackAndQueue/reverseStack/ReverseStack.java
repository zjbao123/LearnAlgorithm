package StackAndQueue.reverseStack;

import java.util.Stack;

/**
 * @author zjbao123
 * @version 1.0
 * @since 2020-08-03 22:38:43
 */
public class ReverseStack {

    public static int getAndRemoveLastElement(Stack<Integer> stack){
        if (stack.isEmpty()){
            throw new RuntimeException("queue is null");
        }
        int result = stack.pop();
        if(stack.isEmpty()){
            return result;
        }else{

           int result2 = getAndRemoveLastElement(stack);
            stack.push(result);
            return result2;

        }
    }

    public static void reverse(Stack stack){
        if (stack.isEmpty()){
            return;
        }
        int result = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(result);
    }
}
