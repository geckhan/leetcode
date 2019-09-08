package cn.geckhan.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = new int[]{5,3,4,1,2,5,2,5,6};
        quickSort(array,0,array.length-1);
        printArr(array);

    }


    public static void quickSort(int[] array, int left, int right) {
        if ( left >= right ) {
            return;
        }

        int start=left,end=right;
        int temp = array[start];
        while (end > start) {
            // 先判断基准数和后面的数依次比较
            while (array[end]>=temp   && start < end) {
                end--;
            }
            // 当基准数大于了 array[right]，则填坑
            if (start < end) {
                array[start] = array[end];
                start++;
            }
            // 现在是 array[right] 需要填坑了
            while ( array[start]<=temp  && start < end) {
                start++;
            }
            if (start < end) {
                array[end] = array[start];
                end--;
            }
        }
        array[start] = temp;

        int middle =start;
        quickSort(array, left, middle);
        quickSort(array, middle + 1, right);
    }


    private static void printArr(int[] arr) {
        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }
    }




}
