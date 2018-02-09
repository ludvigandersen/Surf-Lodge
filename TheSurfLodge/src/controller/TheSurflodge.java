package controller;

import com.sun.xml.internal.bind.v2.model.core.ID;
import model.Booking;
import model.Customer;
import model.Trip;
import sun.applet.Main;
import utilities.DataReader;
import utilities.DataWriter;
import utilities.IdHandler;
import view.MainMenus;
import view.customerView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class TheSurflodge {

    private String businessName;
    Scanner scanner = new Scanner(System.in);
    MainMenus menus = new MainMenus();

    private ArrayList<Trip> allTrips;
    private ArrayList<Customer> allCustomers;
    private ArrayList<Booking> allBookings;

    public TheSurflodge() {
        this.businessName = "";
    }

    public TheSurflodge(String businessName) {
        this.businessName = businessName;
        this.allTrips = new ArrayList<>();
        this.allCustomers = new ArrayList<>();
        this.allBookings = new ArrayList<>();
    }

    public void insertTestData() {
        int customerId;
        Customer newCustomer;


        createTrip(LocalDateTime.now(), 2.5, "Januar-turen", 20, "Kold tur i Østersøen", 0);
        createTrip(LocalDateTime.now().plusMonths(1), 3, "Februar-turen", 26, "Lunken varm tur i Østersøen", 0);
        customerId = createCustomer("Ole Jensen","Lygten 38","23454323");
        createBooking(customerId);
        createBooking(customerId);
        customerId = createCustomer("Jon Bertelsen","Nordre Frihavnsgade 28","22755844");
        createBooking(customerId);
        customerId = createCustomer(customerView.enterCustomer());
        createBooking(customerId);
        showCustomers();



    }

    private void createBooking(int customerId){
        allBookings.add(new Booking(customerId));

    }

    public void showBookings()
    {
        for (Booking b : allBookings) {
            System.out.println(b.toString());
        }
    }

    public void readData() {
        DataReader.configReader();
        System.out.println("Booking ID: " + IdHandler.getNextBookingId() +
                "\nCustomer ID:" + IdHandler.getCustomerId() +
                "\nSeat ID: " + IdHandler.getNextSeatId());
    }

    public void writeData(){
        DataWriter.configWriter();

    }

    public void createTrip(LocalDateTime startTime, double duration, String name, int numberOfSeats, String description, int numberOfSoldSeats) {
        allTrips.add(new Trip(startTime, duration, name, numberOfSeats, description, numberOfSoldSeats));
    }

    public void showTrips() {
        for (Trip allTrip : allTrips) {
            System.out.println(allTrip.getName());
        }

    }

    public int createCustomer(String name, String address, String phoneNumber ){
        allCustomers.add(new Customer(name, address, phoneNumber));
        return IdHandler.getCustomerId();
    }

    public int createCustomer(Customer newCustomer ){

        allCustomers.add(newCustomer);
        return IdHandler.getCustomerId();
    }

    public void showCustomers(){
        for (Customer allCustomer : allCustomers) {
            System.out.println("Navn:" + allCustomer.getName() +
                               "\nAddresse: " + allCustomer.getAddress() +
                               "\nTlf nr: " + allCustomer.getPhoneNumber() +
                               "\nKunde ID: " + allCustomer.getCustomerId());
        }
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public void customerMenuFunctions(Scanner scanner, MainMenus menus) {
        menus.kundeMenu();
        int customerChoice = Integer.parseInt(scanner.nextLine());
        boolean customerMenuRun = false;
        while (!customerMenuRun) {
            if (customerChoice == 1) {
                System.out.println("Indtast navn");
                String name = scanner.nextLine();
                System.out.println("Indtast addresse");
                String address = scanner.nextLine();
                System.out.println("Indtast tlf-nr");
                String phoneNumber = scanner.nextLine();
                createCustomer(name, address, phoneNumber);
                menus.kundeMenu();
                break;
            } else if (customerChoice == 2) {

            } else if (customerChoice == 3) {
                showTrips();
            } else if (customerChoice == 4) {
                customerMenuRun = true;
            }
        }
    }


    public void start() {
        MainMenus menus = new MainMenus();
        TheSurflodge mainController = new TheSurflodge();
        Scanner scanner = new Scanner(System.in);
        boolean run = false;

        menus.startMenu();
        while (!run) {
            int menuChoice = Integer.parseInt(scanner.nextLine());

            switch (menuChoice) {

                case 1: {
                    menus.adminMenu();
                    int adminChoice = Integer.parseInt(scanner.nextLine());
                    if (adminChoice == 1){

                    }else if (adminChoice == 2){

                    }else if (adminChoice == 3){

                    }else if (adminChoice == 4){

                    }else if (adminChoice == 5){

                    }else if (adminChoice == 6){
                        break;
                    }

                    break;
                }
                case 2: {
                    customerMenuFunctions(scanner, menus);

                }
                case 3: {
                    run = true;
                    break;
                }

            }

        }
    }


}
