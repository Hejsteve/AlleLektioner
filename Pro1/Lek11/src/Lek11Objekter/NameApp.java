package Lek11Objekter;

public class NameApp {
    static void main(String[] args) {
        Name name1 = new Name("Margrethe", "Mosbær", "Dybdahl");
        System.out.println("Full Name: " + name1.getFullName());
        System.out.println("Initials: " + name1.getInit());
        System.out.println("Username: " + name1.getUsername());
        System.out.println("CryptoInit: " + name1.getCryptoInit(2));

        System.out.println();

        Name name2 = new Name("Hanne", "", "sommer");
        System.out.println("Full Name: " + name2.getFullName());
        System.out.println("initials: " + name2.getInit());
        System.out.println("UserName: " + name2.getUsername());
        System.out.println("CryptoInit: " + name2.getCryptoInit(2));
    }
}
