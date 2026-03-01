import java.time.LocalDate;

public class RentalApp {
    static void main(String[] args) {
        Rental rental1 = new Rental(2, 1,1200, LocalDate.of(2026, 3, 1));

        System.out.println("Days: " + rental1.getDays());
        System.out.println("Number: " + rental1.getNumber());
        System.out.println("Price: " + rental1.getPrice());
        System.out.println("Start Date: " + rental1.getStartDate());
        System.out.println("End Date: " + rental1.getEndDate());
        System.out.println("Price Per Day: " + rental1.getPricePerDay());
        System.out.println("Total Price: " + rental1.getTotalPrice());
        System.out.println();

        Rental rental2 = new Rental(305, 2, 1000 , LocalDate.of(2026, 2, 27));

        System.out.println("Days: " + rental2.getDays());
        System.out.println("Number: " + rental2.getNumber());
        System.out.println("Price: " + rental2.getPrice());
        System.out.println("Start Date: " + rental2.getStartDate());
        System.out.println("End Date: " + rental2.getEndDate());
        System.out.println("Price Per Day: " + rental2.getPricePerDay());
        System.out.println("Total Price: " + rental2.getTotalPrice());
    }
}
