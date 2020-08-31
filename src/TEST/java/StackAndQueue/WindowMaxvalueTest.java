package StackAndQueue;

import StackAndQueue.WindowMaxValue.WindowMaxValue;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author zjbao123
 * @version 1.0
 * @since 2020-08-31 23:08:05
 */
public class WindowMaxvalueTest {
    @Test
    public void test(){
        int[] arr = {4,3,5,4,3,3,6,7};
        int w = 3;
        int[] values =  WindowMaxValue.getWindowMaxValue(arr,w);
        System.out.println(Arrays.toString(values));
    }
}
