package exercise_example.abstract_;

/**
 * Created by baobao on 2017/3/27.
 */
public abstract class Canine {

    // instance variables
    String name;
    String color;
    String gender;
    int age;

    /** Parameterized Constructor
     *   @param name Dog's name
     *   @param color Dog's color
     *   @param age Dog's age
     *   @param mF Dog's gender ('M' for male, 'F' for female)
     **/
    Canine(String name, String color, int age, char mF){
        this.name = name;
        this.color = color;
        this.age = age;
        this.gender = (mF == 'M') ? "Male " : "Female ";
    }

    /** Abstract method declaration
     *   @return Implementations should return a string describing the breed **/
    abstract String getBreed();

    /** Defined method **/
    void printInfo(){
        // print information about the dog:
        System.out.println(name + " is " + ((age%10 == 8)? "an " : "a ") + age + " year old "
                + gender + getBreed() + " with a " + color + " coat.");
        // note: the '(age%10 == 8)' conditional ensures grammatical correctness if dog is 8 or 18; dogs do not live longer than this.
    }
}

