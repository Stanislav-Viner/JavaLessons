package Java_Core.Homework_25_10_22.Employee;

public class Employee {

    private String name;
    private double rate;
    private double hours;
    static double totalSum;

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public double getHours() {
        return hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public Employee() {
    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public double getSalary() {
        return this.rate * this.hours;
    }

    public String toString() {
        System.out.printf("Object name: %s \n", this.name);
        System.out.printf("Object rate: %.2f \n", this.rate);
        System.out.printf("Object hours: %.2f \n", this.hours);
        return null;
    }

    public void changeRate(double rate) {
        this.rate = rate;
    }

    public double getBonuses() {
        return getSalary() * 0.1;
    }
}
