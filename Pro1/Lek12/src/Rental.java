import java.time.LocalDate;

public class Rental {
    private int number;
    private int days;
    private double price;
    private LocalDate startDate;

    public Rental(int days, int number, double price, LocalDate startDate) {
        this.days = days;
        this.number = number;
        this.price = price;
        this.startDate = startDate;

    }

    public double getTotalPrice() {
        return days * price;
    }

    public double getPricePerDay() {
        return price;
    }

    public LocalDate getEndDate() {
        return startDate.plusDays(days);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}
