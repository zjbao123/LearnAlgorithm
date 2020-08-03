import queueOfStack.QueueOfStack;
import org.junit.Test;

/**
 * @author zjbao123
 * @version 1.0
 * @since 2020-08-01 22:14:02
 */
public class QueueOfStackTest {
    @Test
    public void test(){
        QueueOfStack myQueue = new QueueOfStack();
        myQueue.add(1);
        myQueue.add(2);
        assert(myQueue.peek() == 1);
        assert (myQueue.poll() == 1);
        myQueue.add(3);
        assert (myQueue.poll() == 2);
        assert(myQueue.peek() == 3);
        assert (myQueue.poll() == 3);
    }
}
