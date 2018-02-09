package utilities;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DataWriter {

    private static final String IDS_file = "resource/ids.txt";

    public static void configWriter() {

        try {
            PrintWriter configWriter = new PrintWriter(new File(IDS_file));
            configWriter.println("CUSTOMER_ID");
            configWriter.println(IdHandler.getCustomerId());
            configWriter.println("SEAT_ID");
            configWriter.println(IdHandler.getSeatId());
            configWriter.println("BOOKING_ID");
            configWriter.println(IdHandler.getBookingId());
            configWriter.println("STOP");
            configWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
