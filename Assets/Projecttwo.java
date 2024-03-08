import java.util.Scanner;
public class Projecttwo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //array of each possible day of the week
        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        //collects info for the date
        System.out.print("Enter the year: ");
        int year = keyboard.nextInt();

        //while loops check to make sure the number inputted is valid
        while (year < 0) {
            System.out.print("Invalid year. Enter the year: ");
            year = keyboard.nextInt();
        }

        System.out.print("Enter the month (1-12): ");
        int m = keyboard.nextInt();

        while (m <= 0 || m > 12) {
            System.out.print("Invalid month. \nEnter the month (1-12): ");
            m = keyboard.nextInt();
        }

        System.out.print("Enter the day of the month (1-31): ");
        int q = keyboard.nextInt();

        while (q <= 0 || q > 31) {
            System.out.print("Invalid day. \nEnter the day of the month (1-31): ");
            q = keyboard.nextInt();
        }

        //accounts for January and February being considered part of the previous year
        if (m == 1 || m == 2) {
            m += 12;
            year--;
        }

        //finds the year of the century and the zero-based century respectively
        int K = year % 100;
        int J = year / 100;

        //calculates the day of the week to a number
        int h = (q + (13 * (m + 1)) / 5 + K + (K / 4) + (J / 4) + (5 * J)) % 7;

        //outputs the day of the week by using the result of the calculation to grab a day from the list
        System.out.print("The day of the week is " + (days[h]));
    }
}