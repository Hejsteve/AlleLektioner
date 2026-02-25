package Lek08Objekter;

public class opgave02 {
    // attribut variable

    private String navn;
    private int nummer;

    public void hund(String inputNavn, int inputNummer) {
        navn = inputNavn;
        nummer = inputNummer;
    }
    public void setNavn(String inputNavn) {
        navn = inputNavn;
    }
    public String getNavn() {
        return navn;
    }
    public int getNummer() {
        return nummer;
    }
}
