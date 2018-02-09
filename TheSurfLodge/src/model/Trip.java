package model;

import model.Seats.iSeats;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Trip {
        
    private LocalDateTime startTime;
    private double duration;
    private String name;
    private int numberOfSeats;
    private String description;
    private int numberOfSoldSeats;
    private ArrayList<iSeats> seatsSold;

    public Trip(LocalDateTime startTime, double duration, String name, int numberOfSeats, String description, int numberOfSoldSeats) {
        this.startTime = startTime;
        this.duration = duration;
        this.name = name;
        this.numberOfSeats = numberOfSeats;
        this.description = description;
        this.numberOfSoldSeats = 0;
        this.seatsSold = new ArrayList<>();
    }

    public int availableSeats(){
        //return number of seats - seatsSold.size()
        return 0;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public double getDuration() {
        return duration;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberOfSoldSeats() {
        return numberOfSoldSeats;
    }

    public ArrayList<iSeats> getSeatsSold() {
        return seatsSold;
    }
}
