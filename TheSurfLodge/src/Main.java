import experiments.*;
import model.Customer;
import view.*;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

import controller.*;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        MainMenus mainMenus = new MainMenus();
        TheSurflodge mainController = new TheSurflodge("The Surf Lodge i Gudhjem");

        mainController.insertTestData();


    }

}
