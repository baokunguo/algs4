package exercise_example.exercise_1_3;

import edu.princeton.cs.algs4.Stack;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by baobao on 2017/1/16.
 */
public class MainTest {
    public static void main(String[] args){
        System.out.println("Hello World");

        Integer N = new Integer(50);
        Stack<Integer> stack = new Stack<Integer>();
        while (N > 0){
            stack.push(N % 2);
            N = N / 2;
        }
        System.out.println(stack);
        for (int d: stack) {
            System.out.println(d);
        }
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:ms");
        Long timevalue = System.currentTimeMillis();
        System.out.println(timevalue + " is time now");

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timevalue);
        System.out.println(timevalue + " = " + formatter.format(calendar.getTime()));
    }

}
