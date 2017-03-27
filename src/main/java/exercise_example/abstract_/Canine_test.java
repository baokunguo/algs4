package exercise_example.abstract_;

/**
 * Created by baobao on 2017/3/27.
 */
public class Canine_test {
    public static void main(String[] args){
        //Canine myPuppy = new Canine("Lilah", "Grey/White", 5, 'F');
        KleeKai myPuppy = new KleeKai("Lilah", "Grey/White", 5, 'F');
        System.out.println(myPuppy.getBreed());

        Canine c = new KleeKai("Lilah", "Grey/White", 5, 'F');
        Canine d = new SiberianHusky("Alaska", "Grey/Black/White", 16, 'F');
        c.printInfo();
        d.printInfo();

    }
}
