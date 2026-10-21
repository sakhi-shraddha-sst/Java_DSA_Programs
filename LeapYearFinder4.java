import java.io.*;
import java.time.*;
import java.util.*;

public class LeapYearFinder4 {

    public static void isLeapYear(int year)
    {
        // flag to take a non-leap year by default
        boolean is_leap_year = false;

        Year checkyear = Year.of(year);

        is_leap_year = checkyear.isLeap();

        if (!is_leap_year)
            System.out.println(year + " : Non Leap-year");
        else
            System.out.println(year + " : Leap-year");
    }

    // Driver Code
    public static void main(String[] args)
    {
        // Calling our function by
        // passing century year not divisible by 400
        isLeapYear(2000);

        // Calling our function by
        // passing Non-century year
        isLeapYear(2002);
    }
}