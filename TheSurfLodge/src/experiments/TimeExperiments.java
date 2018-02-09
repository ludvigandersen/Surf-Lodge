package experiments;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeExperiments {

    public LocalDateTime currentTimeTest() {


        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy HH:mm:ss").withLocale(Locale.US);
        String formatDateTime = localDateTime.format(dateTimeFormatter);
        System.out.println(formatDateTime);

        return localDateTime;
    }



}
