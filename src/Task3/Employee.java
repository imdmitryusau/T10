package Task3;

public class Employee extends Person {
    double hireDate;
    String companyName;
    double salary;

    public Employee(String firstName, String lastName, double birthdayYear) {
        super(firstName, lastName, birthdayYear);
    }

    public double getHireDate() {
        return hireDate;
    }

    public double getSalary() {
        return salary;
    }
}
