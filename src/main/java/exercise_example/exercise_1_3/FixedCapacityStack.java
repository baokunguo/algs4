package exercise_example.exercise_1_3;

/**
 * Created by baobao on 2017/1/16.
 */
public class FixedCapacityStack<Item> {
    private Item[] a;
    private int N;
    public FixedCapacityStack(int cap){
        a = (Item[]) new Object[cap];

    }

    public boolean isEmpty() {
        return N==0;
    }

    public int Size(){
        return N;
    }

    public void push(Item item){
        a[N++] = item;
    }

    public Item pop(){
        return a[--N];
    }

}
