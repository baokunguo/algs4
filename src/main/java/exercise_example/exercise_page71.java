package exercise_example;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Point2D;

import java.util.ArrayList;
import java.util.HashMap;
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
        System.out.println(str.indexOf('C'));

        System.out.println(str.substring(0,2));

        // circular rotation
        String str1 = "ACTGACG";
        String str2 = "TGACGAC";
        System.out.println(circular2(str1, str2));

        System.out.println(mystery("ioperwec"));
    }

    public static boolean circular2(String stra, String strb){
        if (stra.isEmpty() || strb.isEmpty()) return false;
        if (stra == null || strb == null) return false;
        if (stra.length() != strb.length()) return false;
        if (stra.equals(strb)) return true;
        if ((stra.length() == strb.length()) && (stra.concat(stra).indexOf(strb) >= 0)){
            return true;
        } else {
            return false;
        }

    }

    public static String mystery(String s){
        int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0, N/2);
        String b = s.substring(N/2, N);
        return mystery(b) + mystery(a);
    }

    /**
    public boolean circular(String stra, String strb){
        if (stra.isEmpty() || strb.isEmpty()) return false;
        if (stra == null || strb == null) return false;
        if (stra.length() != strb.length()) return false;
        if (stra.equals(strb)) return true;
        char[] strbArray = strb.toCharArray();

        // 以stringA 为主，查找stringB 第一个字符实在A中位置
        int stra1st = stra.indexOf(strb.charAt(0));
        int straend = stra.lastIndexOf(strb.charAt(0));

        if (stra1st == straend){
            String straTmp = stra.substring(stra1st,stra.length()).concat(stra.substring(0,stra1st));
            if (straTmp.equals(strb)){
                return true;
            } else {
                return false;
            }
        }else {

        }
        return false;


    }
    ***/
}
