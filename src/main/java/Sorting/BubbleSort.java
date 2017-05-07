package Sorting;

import java.util.Arrays;

/**
 * Created by seradam on 2017.05.07..
 */
public class BubbleSort {

    public int[] sort(int[] input){
        for (int i=0;i<input.length;i++){
            for (int j = 1; j<input.length-i;j++){
                if (input[j] < input[j-1]){
                    int temp=input[j];
                    input[j]=input[j-1];
                    input[j-1]=temp;
                }
            }
        }
        return input;
    }

    public static void main(String[] args) {
        int[] testArray = {8,42,34,23,99,1312,345,111,666,1};
        BubbleSort bs = new BubbleSort();
        System.out.println(Arrays.toString(bs.sort(testArray)));
    }
}
