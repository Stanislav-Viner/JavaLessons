package Java_Core.Homework_25_10_22.Person;

import java.time.YearMonth;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return YearMonth.now().getYear() - this.birthYear;
    }

    public int input(int birthYear) {
        return this.birthYear = birthYear;
    }

    public void output() {
        System.out.printf("Person firstname: %s \n", this.firstName);
        System.out.printf("Person lastname: %s \n", this.lastName);
        System.out.printf("Person birth date: %d \n", this.birthYear);
    }

    public void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
