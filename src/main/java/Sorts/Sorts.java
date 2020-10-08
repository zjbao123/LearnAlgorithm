package Sorts;

/**
 * @author zjbao123
 * @version 1.0
 * @since 2020-10-07 16:45:40
 * 各种排序算法的实现
 */
public class Sorts {

    /**
     * 冒泡排序
     *
     * @param arrs
     */
    public static void bubbleSort(int[] arrs) {

        if (arrs == null || arrs.length <= 1) {
            return;
        }
        int length = arrs.length;
        for (int i = 0; i < length; i++) {
            boolean flag = false;
            for (int j = 0; j < length - 1 - i; j++) {
                if (arrs[j + 1] > arrs[j]) {
                    int temp = arrs[j + 1];
                    arrs[j + 1] = arrs[j];
                    arrs[j] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }

        }
    }

    /**
     * 冒泡改进版 ，记录上一次的边界值减少比较次数
     *
     * @param arrs
     */
    public static void bubbleSort2(int[] arrs) {
        if (arrs == null || arrs.length <= 1) {
            return;
        }
        int length = arrs.length;
        int border = length - 1;
        int tempBorder = 0;
        for (int i = 0; i < length; i++) {
            boolean flag = false;
            for (int j = 0; j < border; j++) {
                if (arrs[j + 1] > arrs[j]) {
                    int temp = arrs[j + 1];
                    arrs[j + 1] = arrs[j];
                    arrs[j] = temp;
                    flag = true;
                    tempBorder = j;
                }

            }
            border = tempBorder;
            if (!flag) {
                break;
            }

        }
    }

    /**
     * 插入排序,注意用临时变量保存i值
     *
     * @param arrs
     */
    public static void insertSort(int[] arrs) {
        if (arrs == null || arrs.length <= 1) {
            return;
        }
        int length = arrs.length;
        for (int i = 1; i < length; i++) {
            int value = arrs[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arrs[j] < value) {
                    arrs[j+1] = arrs[j];
                }else{
                    break;
                }
            }
            arrs[j+1] = value;
        }
    }

    /**
     * 选择排序
     * @param arrs
     */
    public static void selectSort(int[] arrs) {
        if (arrs == null || arrs.length <= 1) {
            return;
        }
        int length = arrs.length;
        for(int i = 0; i<length-1; i++){

            int minIndex = i;
            for(int j = i;j< length;j++){
                if(arrs[j] < arrs[minIndex]){
                    minIndex = j;
                }
            }

            int tmp = arrs[minIndex];
            arrs[minIndex] = arrs[i];
            arrs[i] = tmp;
        }
    }
}


