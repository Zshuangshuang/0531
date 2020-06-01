import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void bubbleSort(int[][] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (Integer.parseInt(String.valueOf(arr[j][1])) < Integer.parseInt(String.valueOf(arr[j + 1][1]))) {
                    int[][] temp = new int[1][2];
                    temp[0] = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp[0];
                }
            }
        }

    }

    public static int greedySelector(int[] starTime, int[] endTime, boolean a) {
        int n = starTime.length - 1;
        a = true;
        int j = 1;
        int count = 1;
        for (int i = 2; i <= n; i++) {
            if (starTime[i] >= endTime[i]) {
                a = true;
                j = i;
                count++;
            } else {
                a = false;
            }

        }
        return count;
    }



        public static void main (String[]args){
            int[][] array = new int[11][3];
            array[0] = new int[]{1, 4, 1};
            array[1] = new int[]{3, 5, 0};
            array[2] = new int[]{0, 6, 0};
            array[3] = new int[]{5, 7, 0};
            array[4] = new int[]{3, 8, 0};
            array[5] = new int[]{5, 9, 0};
            array[6] = new int[]{6, 10, 0};
            array[7] = new int[]{8, 11, 0};
            array[8] = new int[]{8, 12, 0};
            array[9] = new int[]{2, 13, 0};
            array[10] = new int[]{12, 14, 0};
            bubbleSort(array);
       /* for (int i = 0; i < array.length; i++) {
            int arr1 = array[i][1];
            int arr2 = array[i][2];
            boolean a;
            if (array[i][3] == 1) {
                a = true;
            } else{
                a = false;
            }
            greedySelector(arr1,arr2,a);
        }*/

        }

}