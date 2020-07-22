public class Booking {

    private Bedroom bedroom;
    private int numberOfNights;
    private double totalBill;

    public Booking(Bedroom bedroom, int numberOfNights) {
        this.bedroom = bedroom;
        this.numberOfNights = numberOfNights;
        this.totalBill = totalBill;
    }

    public double getTotalBill(Bedroom bedroom, int numberOfNights) {
        return this.totalBill = bedroom.getCostPerNight() * numberOfNights;
    }





}
