package utilities;

public class IdHandler {

    private static int customerId = 0;
    private static int seatId = 0;
    private static int bookingId = 0;

    public static int getNextCustomerId(){
        customerId++;
        return customerId;
    }

    public static int getNextSeatId(){
        seatId++;
        return seatId;
    }

    public static int getNextBookingId(){

        bookingId++;
        return bookingId;
    }

    public static void setCustomerId(int id){
        customerId = id;
    }

    public static void setSeatId(int id) {
        seatId = id;
    }

    public static void setBookingId(int id) {
        bookingId = id;
    }

    public static int getCustomerId() {
        return customerId;
    }

    public static int getSeatId() {
        return seatId;
    }

    public static int getBookingId() {
        return bookingId;
    }
}
