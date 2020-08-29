package StackAndQueue;

import StackAndQueue.HannoiProblem.HannoiMove;
import org.junit.Test;

/**
 * @author zjbao123
 * @version 1.0
 * @since 2020-08-29 22:26:21
 */
public class HannoiProblemTest {
    @Test
    public void Test(){
       int result = HannoiMove.process(2,"left", "right");
        assert(result == 8);
    }
}
