package exercise_example;

import edu.princeton.cs.algs4.StdOut;

import java.util.Map;

/**
 * Created by baobao on 2016/12/26.
 */
public class exercise_page32 {
    public static void main(String[] args){
        System.out.print("HelloWorld come here\n");
        System.out.println((0 +15) / 2);
        System.out.println(2.0e-6* 1000000000.1);
        System.out.println(2.0*1000000000.1);
        System.out.println(true && false || true && true);
        System.out.println(true && false || false);
        System.out.println(true && false );

        String a = 1 + 2 + "3";

        if (args.length == 3 && args[0].equals(args[1])){
            System.out.println("args is :" + args[0]);
        }

        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001){
            t = (9.0/t + t) / 2.0;
            StdOut.printf("this is the iteration : %.5f\n",t);
        }

        int N = 90;
        System.out.println(Integer.toBinaryString(N));
        String s = "";
        for (int n = N; n > 0; n /=2){
            s = (n % 2) + s;
        }
        System.out.print(s);

        Boolean[][] blean = new Boolean[3][3];
        blean[1][1] = true;
        System.out.println(blean + " " + blean[1][1]);

        int[] aint = new int[10];

        for(int i = 0; i < 10; i++) {
            aint[i] = 9 - i;
        }

        int iii = 1000;

        for (iii = 0; iii< 10; iii++) {
            aint[iii] = aint[aint[iii]];
            System.out.print(String.valueOf(aint[iii]));
        }

        System.out.print("iii is  : " + iii + " random : " + Math.random());


    }
}
