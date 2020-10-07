package Sorts;

import org.junit.Test;

/**
 * @author zjbao123
 * @version 1.0
 * @since 2020-10-07 16:54:36
 */
public class SortsTest {
    @Test
    public void test(){
        int[] arrs = {1,4,6,3,2,5};
        Sorts.bubbleSort(arrs);
        for (int a: arrs) {
            System.out.print(a+"\t");
        }
    }
    @Test
    public void test2(){
        int[] arrs = {5,4,6,3,2,1};
        Sorts.bubbleSort2(arrs);
        for (int a: arrs) {
            System.out.print(a+"\t");
        }
    }

}
