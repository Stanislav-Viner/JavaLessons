package Java_Core.Homework_25_10_22.Student;

public class StudentTest {

    public static void main(String[] args) {

        Student student1 = new Student("John", 60);
        Student student2 = new Student("Jack", 40);
        Student student3 = new Student("Jim", 20);

        Student.avgRating = (student1.getRating() + student2.getRating() + student3.getRating()) / 3;
        System.out.printf("The average rating of all students: %d \n", Student.avgRating);

        int totalRating = student1.getRating() + student2.getRating() + student3.getRating();
        System.out.printf("The total rating of all students: %d \n", totalRating);
    }

}
