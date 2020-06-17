package Task3;

public class Manager extends Employee {
     private double bonus=10;

    public Manager(String firstName, String lastName, double birthdayYear, double hiredate, String companyname, double salary, double bonus) {
        super(firstName, lastName, birthdayYear);
        this.hireDate=hiredate;
        this.companyName = companyname;
        this.salary=salary;
        this.bonus=bonus;
        //??
    }

    @Override
    public double getSalary() {
        return super.getSalary()+bonus;
    }

    @Override
    public String toString() {
        return "Manager with" +
                " lastName " + lastName  +
                " and age " + birthdayYear  +
                " has salary=" + getSalary();
    }
}
