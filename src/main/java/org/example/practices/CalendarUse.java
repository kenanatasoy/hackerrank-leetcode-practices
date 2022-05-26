package org.example.practices;

import java.util.Calendar;
import java.util.Map;

import static java.util.Map.entry;

public class CalendarUse {

    public String findDayOfWeek(int month, int day, int year) {

        Calendar cld = Calendar.getInstance();
        cld.set(year, month - 1, day);

        Map<Integer, String> daysOfWeek = Map.ofEntries(
                entry(1, "SUNDAY"),
                entry(2, "MONDAY"),
                entry(3, "TUESDAY"),
                entry(4, "WEDNESDAY"),
                entry(5, "THURSDAY"),
                entry(6, "FRIDAY"),
                entry(7, "SATURDAY")
        );

        System.out.println(cld.get(Calendar.YEAR));
        System.out.println(cld.get(Calendar.DATE));
        System.out.println(cld.get(Calendar.MONTH));
        System.out.println(cld.get(Calendar.DAY_OF_WEEK));


        //LocalDate lcd = LocalDate.of(year, month, day);
        //DayOfWeek dayOfWeek = lcd.getDayOfWeek();

        return daysOfWeek.get(cld.get(Calendar.DAY_OF_WEEK));

    }

}
