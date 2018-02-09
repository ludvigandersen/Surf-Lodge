package view;

import model.Customer;

import java.util.Scanner;

public class customerView {

    //Bruges til at returnere mange værdier tilbage til controlleren (TheSurfLodge)
    public static Customer enterCustomer(){
        Customer customerObj = new Customer();
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Indtast kundenavn: ");
        customerObj.setName(inputScanner.nextLine());
        System.out.println("Indtast addresse");
        customerObj.setAddress(inputScanner.nextLine());
        System.out.println("Indtast Tlf-nr");
        customerObj.setPhoneNumber(inputScanner.nextLine());

        return customerObj;
    }

}
