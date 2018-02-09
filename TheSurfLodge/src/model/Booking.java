package model;

import utilities.IdHandler;

import java.time.LocalDateTime;

public class Booking {

    private int bookingNumber;
    private int customerId;
    private LocalDateTime bookingDateTime;
    private int totalPrice;

    public Booking(int customerId) {
        this.customerId = customerId;
        this.bookingNumber = IdHandler.getNextBookingId();
        this.bookingDateTime = LocalDateTime.now();
        this.totalPrice = 0;
    }

    public int getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(int bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public LocalDateTime getBookingDateTime() {
        return bookingDateTime;
    }

    public void setBookingDateTime(LocalDateTime bookingDateTime) {
        this.bookingDateTime = bookingDateTime;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int calculatedTotal() {

        return 0;
    }

}

