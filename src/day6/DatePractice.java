package day6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

public class DatePractice {
    public static void main(String[] args) {
        Date date = new Date();
        Logger.getGlobal().info(String.valueOf(date));

        LocalDate localDate =LocalDate.now();
        Logger.getGlobal().info(String.valueOf(date));

        LocalTime localTime =LocalTime.now();
        Logger.getGlobal().info(String.valueOf(localTime));

        LocalDateTime localDateTime =LocalDateTime.now();
        Logger.getGlobal().info(String.valueOf(localDateTime));

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yy hh:mm:ss a");
        String formattedDate = dateFormatter.format(localDateTime);
        Logger.getGlobal().info(formattedDate);

        //current
        Calendar calendar = Calendar.getInstance();
        Logger.getGlobal().info(String.valueOf(calendar));

        //specific
//        Calendar specificCalendar = Calendar.getInstance();
//        specificCalendar.set(Calendar.YEAR, 2012);
//        specificCalendar.set(Calendar.MONTH, 12);
//        specificCalendar.set(Calendar.DAY_OF_MONTH, 5);
//        Logger.getGlobal().info(String.valueOf(specificCalendar));

    }

}
