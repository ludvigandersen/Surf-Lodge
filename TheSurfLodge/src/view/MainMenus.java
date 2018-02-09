package view;

import controller.TheSurflodge;
import model.Customer;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class MainMenus {

    public void adminMenu(){System.out.println("1. Opret tur\n" +
            "2. Se ture\n" +
            "3. Redgiér tur\n" +
            "4. Slet tur\n" +
            "5. Se kunder\n"+
            "6. Tilbage");}

    public void kundeMenu() {System.out.println("1. Opret kunde\n" +
            "2. Book tur\n" +
            "3. Vis ture\n" +
            "4. Tilbage");}

    public void startMenu(){System.out.println("1. Admin menu\n" +
            "2. Kunde menu\n" +
            "3. Luk program");
    }

}
