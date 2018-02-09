package model.Seats;

public class SealSnorkelingSeat implements iSeats {

    private int customerID;
    private int seatID;

    public SealSnorkelingSeat(int customerID, int seatID) {
        this.customerID = customerID;
        this.seatID = seatID;
    }

    @Override
    public int getPrice() {
        return 1200;
    }

    @Override
    public String getType() {
        return "SEALSNORKELINGSEAT";
    }

    @Override
    public String getDescription() {
        return "Trip to Christiansø with snorkeling";
    }
}
