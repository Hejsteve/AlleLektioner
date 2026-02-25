public class variablerogscanner {
    static void main(String[] args) {
        String ord1 = "Datamatiker";
        String ord2 = "Uddannelsen";
        String ord3 = ord1 + " " + ord2.toLowerCase();

        System.out.print(ord1.toUpperCase() + " ");
        System.out.print(ord2.toLowerCase());
        System.out.println();
        System.out.println(ord3);
        System.out.println(ord3.length());
        System.out.println(ord3.length() / 2);
    }
}
