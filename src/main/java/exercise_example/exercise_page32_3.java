package exercise_example;

import java.util.Arrays;

/**
 * Created by baobao on 2016/12/29.
 */
public class exercise_page32_3 {
    public static void main(String[] args){
        System.out.println("Hello World");

        Integer[] arr = new Integer[4];
        for(int i = 0; i < arr.length; i++){
            arr[i] = new Integer(i*i);
        }
        Arrays.sort(arr);
        //System.out.println(binarySearch(arr, 2, 0, 3));
        System.out.println(binomial(10, 5, 0.25));
    }
    public static int binarySearch(Integer array[], int key, int left, int right) {
        int center = left + (right - left) / 2; // 防止用(left+right)/2时left+high溢出
        if (array[center] == key) {
            System.out.println("找到了");
            return center;
        } else if (array[center] < key) {
            return binarySearch(array, key, center + 1, right);
        } else if (array[center] > key) {
            return binarySearch(array, key, left, center - 1);
        }
        return -1;
    }
    /**
    int[] Nlist = new int[];
    int[] klist = new int[];
    double[] plist = new double[];
    int indexN = 0;
    **/

    public static double binomial(int N, int k, double p){
        if (N == 0 && k == 0) return 1.0;
        if (N < 0 || k < 0) return 0.0;
        double tmp = (1.0 - p)*binomial(N-1, k, p) + p*binomial(N-1, k-1,p);

        System.out.println("this is binomial : " + tmp + " N is : " + N + " K is : " + k);
        return tmp;
    }
}
