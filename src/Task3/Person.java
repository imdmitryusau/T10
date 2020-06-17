package Task3;

public abstract class Person {
    String firstName, lastName;
    double birthdayYear;

    public Person(String firstName, String lastName, double birthdayYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdayYear = birthdayYear;
    }


    public double getAge() {
        return birthdayYear;
    }
}
