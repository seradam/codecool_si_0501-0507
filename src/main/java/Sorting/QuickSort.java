package Sorting;

import java.util.Arrays;

/**
 * Created by seradam on 2017.05.07..
 */
public class QuickSort {

    int[] numbers;

    public void sort(int[] array) {
        this.numbers = array;
        quicksort(0, array.length - 1);
    }

    public void quicksort(int low, int high) {
        int i = low;
        int j = high;
        int pivot = numbers[(high+low)/2];

        while (i <= j) {
            while (numbers[i] < pivot) {
                i++;
            }
            while (numbers[j] > pivot) {
                j--;
            }

            if (i<=j){
                exchange(i,j);
                i++;
                j--;
            }
        }
        if (i < high) quicksort(i,high);
        if (j > low) quicksort(low,j);
    }

    public void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public static void main(String[] args) {
        int[] testArray = {8,42,34,23,99,1312,345,111,666,1};
        QuickSort qs = new QuickSort();
        qs.sort(testArray);
        System.out.println(Arrays.toString(testArray));
    }
}
