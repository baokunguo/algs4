package exercise_example;

/**
 * Created by baobao on 2017/1/3.
 */
public class Counter {
    private final String name ;
    int id = 0;
    public Counter(String name_in){
        name = name_in;
    }

    public void increment(){
        id++;
    }

    public int tally(){
        return id;
    }

    public String toString(){
        return name + " " + id;
    }


}
