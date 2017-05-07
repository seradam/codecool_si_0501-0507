package Sorting;

import java.util.Arrays;

/**
 * Created by seradam on 2017.05.07..
 */
public class MergeSort {

    public int[] sort(int[] input){
        if (input.length > 1){
            int[] leftArray = new int[input.length/2];
            int[] rightArray = new int[input.length - leftArray.length];
            for (int i=0;i<leftArray.length;i++){
                leftArray[i] = input[i];
            }
            for (int i=leftArray.length;i<input.length;i++){
                rightArray[i-leftArray.length] = input[i];
            }
            sort(leftArray);
            sort(rightArray);

            int i = 0;
            int j = 0;
            int k = 0;
            while (j < leftArray.length && k < rightArray.length){
                if (leftArray[j] < rightArray[k]){
                    input[i] = leftArray[j];
                    j++;
                }else{
                    input[i] = rightArray[k];
                    k++;
                }
                i++;
            }
            while (j<leftArray.length){
                input[i] = leftArray[j];
                j++;
                i++;
            }
            while (k<rightArray.length){
                input[i] = rightArray[k];
                k++;
                i++;
            }
        }
        return input;
    }

    public static void main(String[] args) {
        int[] testArray = {8,42,34,23,99,1312,345,111,666,1};
        MergeSort ms = new MergeSort();
        System.out.println(Arrays.toString(ms.sort(testArray)));
    }
}
