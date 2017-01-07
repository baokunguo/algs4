package exercise_example;

/**
 * Created by baobao on 2016/10/27.
 */
public class HelloWorld2 {
    public static void main(String[] args){
        System.out.print("HelloWorld come here\n");
        int p = 10, q= 15;
        System.out.print(gcd(p,q) + " is the gcd of " + p + " ," + q);
    }

    public static int gcd(int p, int q){
        if(q == 0) return p;
        int r = p % q;
        return gcd(q,r);
    }
}
