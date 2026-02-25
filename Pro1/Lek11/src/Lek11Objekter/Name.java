package Lek11Objekter;

public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        if (middleName.isEmpty()) {
            return firstName + " " + lastName;
        }
        else {
        return  firstName + " " + middleName + " " + lastName;
        }
    }
    public String getInit() {
        if (middleName.isEmpty()) {
            return " " + Character.toUpperCase(firstName.charAt(0)) + Character.toUpperCase(lastName.charAt(0));
        }
        return " " + Character.toUpperCase(firstName.charAt(0)) + Character.toUpperCase(middleName.charAt(0)) + Character.toUpperCase(lastName.charAt(0));
    }
    public String getUsername() {
        String first = firstName.substring(0, 2).toUpperCase();
        String middle = String.valueOf(middleName.length());
        String last = lastName.substring(lastName.length() - 2).toLowerCase();
        return first + middle + last;
    }
    public String getCryptoInit(int count) {
        String init = getInit();
        String result = "";

        for (int i = 0; i < init.length(); i++) {
            char c = init.charAt(i);
            char shifted = (char) (c + count);
            result = result + shifted;
        }
        return result;
    }
}