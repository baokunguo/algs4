package exercise_example.abstract_;

/**
 * Created by baobao on 2017/3/27.
 */
class SiberianHusky extends Canine{
    /** Parameterized Constuctor **/
    SiberianHusky(String name, String color, int age, char mF){ // Constructor
        super(name, color, age, mF);
    }

    /** Abstract method implementation
     *   @return "Siberian Husky" **/
    String getBreed(){ // abstract method implementation
        return "Siberian Husky";
    }
}
