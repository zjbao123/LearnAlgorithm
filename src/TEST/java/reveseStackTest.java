import org.junit.Test;
import reverseStack.ReverseStack;

import java.util.Stack;

/**
 * @author zjbao123
 * @version 1.0
 * @since 2020-08-03 23:08:20
 */
public class reveseStackTest {
    @Test
    public void test(){
        Stack<Integer> elements = new Stack<Integer>();
        elements.push(1);
        elements.push(2);
        elements.push(3);
        elements.push(4);
        ReverseStack.reverse(elements);
        assert(elements.pop() == 1);
    }
}
