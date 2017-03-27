package exercise_example.abstract_;

/**
 * Created by baobao on 2017/3/27.
 */
abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}