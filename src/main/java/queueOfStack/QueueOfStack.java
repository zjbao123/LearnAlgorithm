package queueOfStack;

import java.util.Stack;

/**
 * @author zjbao123
 * @version 1.0
 * @since 2020-08-01 21:59:30
 */
public class QueueOfStack {
    private Stack<Integer> stackPop;
    private Stack<Integer> stackPush;

    public QueueOfStack(){
        stackPop = new Stack<>();
        stackPush = new Stack<>();
    }

    public void add(int value){
        stackPush.push(value);
    }

    public int poll(){
        if (stackPush.isEmpty()&& stackPop.isEmpty()){
            throw new RuntimeException("queue is null");
        }
        else if(stackPop.isEmpty()) {
            while (!stackPush.isEmpty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    public int peek(){
        if (stackPush.isEmpty()&& stackPop.isEmpty()){
            throw new RuntimeException("queue is null");
        }
        else if(stackPop.isEmpty()) {
            while (!stackPush.isEmpty()) {
                stackPop.push(stackPush.pop());
            }
        }
       return stackPop.peek();

    }
}
