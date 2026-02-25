package Lek08Objekter.personeksempel;

public class PersonApp {

    public static void main(String[] args) {
        Person p1 = new Person("Jens", "Aarhus", 28344.46, 5, true);
        p1.yearlySalary();
        p1.printPerson();
        p1.setName("Viggo");
        p1.setAddress("aarhus");
        p1.setWorkPlace(7);
        p1.setEmployed(true);
        p1.setMonthlySalary(21236.57);
        p1.yearlySalary();
        p1.printPerson();

    }
}

