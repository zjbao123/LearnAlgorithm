package StackAndQueue.WindowMaxValue;

import java.util.LinkedList;

/**
 * @author zjbao123
 * @version 1.0
 * @since 2020-08-30 22:31:08
 */
public class WindowMaxValue {
    public static int[] getWindowMaxValue(int[] arr, int w) {
        if(arr == null || w < 1 || arr.length < w){
            return null;
        }
        int n = arr.length;
        int[] values = new int[n - w+1];
        int index= 0;
        int i = 0;
        int count = 0;
        LinkedList<Integer> qMax = new LinkedList<>();
        while(i < n){
            while(!qMax.isEmpty() && arr[qMax.peekLast()] <= arr[i]) {
                qMax.pollLast();
            }
            qMax.addLast(i);
            if(qMax.peekFirst() == i-w){
                qMax.pollFirst();
            }

            if(i >= w-1){
                values[index++] = arr[qMax.peekFirst()];
            }

            i++;
        }
        return values;
    }
}
