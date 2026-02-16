package Lek08Objekter.personeksempel;

public class Person {

    private String name;
    private String address;
    private int workPlace;
    private boolean employed;
    private double monthlySalary;
    private double yearlySalary;

    public Person(String inputName, String inputAddress, double inputMonthlySalary, int inputWorkPlace, boolean isEmployed) {
        name = inputName;
        address = inputAddress;
        workPlace = inputWorkPlace;
        employed = isEmployed;
        monthlySalary = inputMonthlySalary;
    }

    public Person() {
    }

    public void setName(String inputName) {
        name = inputName;
    }

    public String getName() {
        return name;
    }

    public void setWorkPlace(int inputWorkPlace) {
        workPlace = inputWorkPlace;
    }

    public int getWorkPlace() {
        return workPlace;
    }

    public void setEmployed(boolean isEmployed) {
        employed = isEmployed;
    }

    public boolean getEmployed() {
        return employed;
    }

    public void setAddress(String inputAddress) {
        address = inputAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setMonthlySalary(double inputMonthlySalary) {
        monthlySalary = inputMonthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double yearlySalary() {
        yearlySalary = monthlySalary * 12 * 1.025;
        return yearlySalary;
    }

    public void printPerson() {
        System.out.println("*******************");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Places worked: " + workPlace);
        System.out.println("Employed right now? " + employed);
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Yearly salary: " + yearlySalary);
    }
}
