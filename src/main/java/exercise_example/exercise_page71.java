package exercise_example;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Point2D;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by baobao on 2017/1/7.
 */
public class exercise_page71 {
    public static void main(String[] args){
        System.out.println("Hello World");
        int N = 1000;
        ArrayList<Point2D> arr = new ArrayList<Point2D>();
        double distMin = 10000;
        double distTmp = 0.0;
        //Point2D distMinP2D = new Point2D(0.0,0.0);
        for (int i = 0; i <= N; i++){
            Point2D pointa = new Point2D(Math.random()*N, Math.random()*N);
            arr.add(pointa);
            for (int j = 0; j <= i; j++){
                distTmp = pointa.distanceTo(arr.get(j));
                if (distTmp > 0.0 && distTmp < distMin){
                    distMin = distTmp;
                }
            }
        }

        System.out.println(distMin);
        //Interval1D

        // 字符串不可变性
        String s1 = "Hello";
        String s2 = s1;
        s1 = "world";
        System.out.println("S1 is: " + s1 + " s2 is " + s2);

        // 数组试试看,还是会改变的，
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        ArrayList<Integer> arrayList2 = arrayList;
        arrayList.add(100);
        for (int i = 0; i < arrayList2.size(); i++) {
            System.out.println(arrayList2.get(i));
        }

        String str = "AGCAC";
        System.out.print(str.indexOf('C'));

        // circular rotation

    }
}
