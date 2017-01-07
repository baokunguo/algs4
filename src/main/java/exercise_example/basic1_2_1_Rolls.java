package exercise_example;

import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by baobao on 2017/1/3.
 */
public class basic1_2_1_Rolls {
    public static void main(String[] args){
        System.out.print("Hello ");

        Counter heads = new Counter("headers");
        //Counter tails = new Counter("tails");
        heads.increment();
        System.out.println("heads is : " + heads + "\n heads id is : " + heads.tally());
        //int T = Integer.parseInt(args[0]);
        int T = 10000;
        int SIDES = 6;
        Counter[] rolls = new Counter[SIDES + 1];
        for (int i = 1; i <= SIDES; i++){
            rolls[i] = new Counter(i + "'s");
        }

        for (int i = 0; i < T; i++){
            int result = StdRandom.uniform(1, SIDES + 1);
            rolls[result].increment();
        }
        int sum = 0;
        for (int i = 1; i <= SIDES; i++){
            //System.out.println(rolls[i] + "  tally is :" + rolls[i].tally());
            System.out.println(rolls[i]);
            sum += rolls[i].tally();
        }

        System.out.println("Sum is : " + sum);
    }
}
