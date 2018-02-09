package model.Seats;

public class SealRegularSeat implements iSeats {

    private int customerID;
    private int seatID;

    public SealRegularSeat(int customerID, int seatID) {
        this.customerID = customerID;
        this.seatID = seatID;
    }

    @Override
    public int getPrice() {
        return 900;
    }

    @Override
    public String getType() {
        return "SEALREGULARSEAT";
    }

    @Override
    public String getDescription() {
        return "Regular trip to Christiansø";
    }
}
