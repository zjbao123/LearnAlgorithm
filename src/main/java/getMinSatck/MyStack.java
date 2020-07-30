package getMinSatck;

import java.util.Stack;

/**
 * @author zjbao123
 * @version 1.0
 * @since 2020-07-30 22:55:04
 */
public class MyStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MyStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public int pop() {
        if (stack.isEmpty()){
            throw new RuntimeException("stack is null");
        }
       int i =  minStack.peek();
       int min = stack.peek();
       if(min == i){
           minStack.pop();
       }
        return stack.pop();
    }


    public void push(int value) {

        stack.push(value);
        if (minStack.isEmpty()){
            minStack.push(value);
        }
        else if (value <= getMin()) {
            minStack.push(value);
        }

    }

    public int getMin() {
        if (stack.isEmpty()){
            throw new RuntimeException("stack is null");
        }
        return minStack.peek();
    }


}
