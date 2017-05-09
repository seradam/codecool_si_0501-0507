package Advanced.OptimalizedBubbleSort;

import java.util.Arrays;

/**
 * Created by seradam on 2017.05.04..
 */
public class BubbleSort {

    public int[] sort(int[] input){
        int changeCounter = 0;
        int changeCounterPrevious = 0;
        for (int i=0;i<input.length;i++){
            for (int j = 1; j<input.length-i;j++){
                if (input[j] < input[j-1]){
                    int temp=input[j];
                    input[j]=input[j-1];
                    input[j-1]=temp;
                    changeCounter++;
                }
                System.out.println(Arrays.toString(input));
            }
            if (changeCounter == changeCounterPrevious){
                break;
            }
            changeCounterPrevious = changeCounter;
        }
        return input;
    }

    public static void main(String[] args) {
        int[] testArray = {8,42,34,23,99,1312,345,111,666,1};
        int[] testArray2 = {8,42,44,53,99,222,131,345,1111,6666};
        BubbleSort bs = new BubbleSort();
        System.out.println(Arrays.toString(bs.sort(testArray2)));
    }
}
