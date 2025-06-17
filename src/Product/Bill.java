package src.Product;

public class Bill {
    private boolean isPaid = Boolean.FALSE;
    private Reservation reservation;
    private Double amount;

    public Bill( Reservation reservation) {
        this.reservation = reservation;
        this.amount = computeBillAmount();
        isPaid = false;

    }

    private Double computeBillAmount() {
        return 100.0;
    }
}
