package Lek03Selektion;

import java.util.Scanner;

public class ChildApp {
    static void main(String[] args) {

        // Metoden skal returenre en tekststreng der beskriver hvilken institution et barn skal gå i, afhængig af barnets alder.
        // Reglerne for dette kan ses på opgavedsedlen
        //
        public static String institution (int age) {
            Scanner scanner = new Scanner(System.in);
            if (i = 0) {
                String i = "home";
            } else if (i < age && age < i) {
                String age = "Nursery";
            } else if (3 < age && age < 5) {
                String i = "Kindergarten";
            }
        }

    // Metoden skal returenre en tekststreng der beskriver hvilket gymnastikhold et barn skal gå på, afhængig af barnets alder og køn.
    // Reglerne for dette kan ses på opgavedsedlen
    //
    public static String team(boolean isBoy, int age) {

    }

    public static void main(String[] args){
            System.out.println("Et barn på 5 skal i" + ChildApp.institution(5));
            System.out.println("Et dreng på 8 skal i" + team(true, 8));
        }
    }
}

