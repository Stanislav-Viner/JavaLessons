package Java_Core.Homework_25_10_22.Student;

public class Student {

    private String name;
    private int rating;

    static int avgRating;

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Student() {
    }

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public boolean betterStudent(int rating) {
        return this.rating > rating;
    }

    public String toString() {
        System.out.printf("The student name: %s \n", this.name);
        System.out.printf("The student rating: %d \n", this.rating);
        return null;
    }

}
