package Basics;

/**
 * Created by seradam on 2017.05.07..
 */
public class BinarySearch {

    public int search(int[] sortedArray, int targetValue){
        int min = 0;
        int max = sortedArray.length-1;
        while (min <= max){
            int guess = (min + max)/2;
            if (sortedArray[guess] == targetValue){
                return guess;
            }else if (sortedArray[guess] >= targetValue){
                max = guess -1;
            }else{
                min = guess + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] testArray = {1,3,5,9,12,23,36,42,47,91};
        System.out.println(bs.search(testArray,1));
        System.out.println(bs.search(testArray,3));
        System.out.println(bs.search(testArray,5));
        System.out.println(bs.search(testArray,9));
        System.out.println(bs.search(testArray,12));
        System.out.println(bs.search(testArray,23));
        System.out.println(bs.search(testArray,36));
        System.out.println(bs.search(testArray,42));
        System.out.println(bs.search(testArray,47));
        System.out.println(bs.search(testArray,91));
        System.out.println(bs.search(testArray,55));
    }
}
