import java.io.*;

public class LeapYearFinder3 {

    public static void isLeapYear(int year)
    {
        // flag to take a non-leap year by default
        boolean is_leap_year = false;

        is_leap_year = (year % 4 == 0 && year % 100 != 0
                        || year % 400 == 0)
                           ? true
                           : false;
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