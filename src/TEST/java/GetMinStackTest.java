import getMinSatck.MyStack;
import org.junit.Test;

/**
 * @author zjbao123
 * @version 1.0
 * @since 2020-07-30 23:16:53
 */
public class GetMinStackTest {
    @Test
    public void test() throws Exception {
        MyStack stack = new MyStack();
        stack.push(7);
        stack.push(2);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        assert(stack.getMin() ==1);
        assert(stack.pop() == 1);
        assert (stack.getMin() ==2);
        assert(stack.pop() == 2);
        assert (stack.getMin() ==2);
    }
}
