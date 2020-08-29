package StackAndQueue;

import org.junit.Test;
import StackAndQueue.sortedByStack.SortedByStack;

import java.util.Stack;

/**
 * @author zjbao123
 * @version 1.0
 * @since 2020-08-17 21:43:38
 */
public class sortedByStackTest {
    @Test
    public void test(){
        Stack<Integer> stack = new Stack<>();
        stack.add(3);
        stack.add(5);
        stack.add(4);
        stack.add(7);
        Stack result = SortedByStack.sortedStackByStack(stack);
        System.out.println(result);
    }
}
