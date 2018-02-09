package utilities;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataReader {

    private static final String IDS_file = "resource/ids.txt";

    public static void configReader() {

        String fieldName = "";
        int fieldValue = 0;

        try {
            Scanner idReader = new Scanner(new File(IDS_file));


            while (!fieldName.equals("STOP")) {

                fieldName = idReader.nextLine();

                switch (fieldName) {

                    case "CUSTOMER_ID":
                        fieldValue = Integer.parseInt(idReader.nextLine());
                        IdHandler.setCustomerId(fieldValue);
                        break;
                    case "SEAT_ID":
                        fieldValue = Integer.parseInt(idReader.nextLine());
                        IdHandler.setSeatId(fieldValue);
                        break;
                    case "BOOKING_ID":
                        fieldValue = Integer.parseInt(idReader.nextLine());
                        IdHandler.setBookingId(fieldValue);
                        break;
                    default:
                        break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
