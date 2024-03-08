import java.lang.Math;
import java.util.Scanner;
public class Culminating {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int x = 0;
        int sum = 0;
        double initialNum = 0;


        System.out.println("CALCULATOR\n");
        System.out.println("(1) Add\n(2) Subtract\n(3) Multiply\n(4) Divide\n(5) Modulus\n(6) Special Functions");
        System.out.print("Please choose the number of the function you would like to use: ");
        int choice = keyboard.nextInt();

        if (choice == 1) {
            System.out.print("How many numbers would you like to add?: ");
            int numOfNums = keyboard.nextInt();
            int[] nums = new int[numOfNums];
            System.out.println("Input the numbers you would like to add IN ORDER: ");
            for (x = 0; x < nums.length; x++){
                nums[x] = keyboard.nextInt();
                sum += nums[x];
            }
            System.out.print(sum);
        }
        else if (choice == 2) {
            System.out.print("How many numbers would you like to subtract?: ");
            int numOfNums = keyboard.nextInt();
            int[] nums = new int[numOfNums];
            System.out.println("Input the numbers you would like to subtract IN ORDER: ");
            initialNum = keyboard.nextInt();
            while(x < nums.length-1){
                nums[x] = keyboard.nextInt();
                initialNum -= nums[x];
                x++;
            }
            System.out.print(initialNum);
        }
        else if (choice == 3) {
            System.out.print("How many numbers would you like to multiply?: ");
            int numOfNums = keyboard.nextInt();
            int[] nums = new int[numOfNums];
            System.out.println("Input the numbers you would like to multiply IN ORDER: ");
            initialNum = keyboard.nextDouble();
            while(x < nums.length-1){
                nums[x] = keyboard.nextInt();
                initialNum *= nums[x];
                x++;
            }
            System.out.print(initialNum);
        }
        else if (choice == 4) {
            System.out.print("How many numbers would you like to divide?: ");
            int numOfNums = keyboard.nextInt();
            int[] nums = new int[numOfNums];
            System.out.println("Input the numbers you would like to divide IN ORDER: ");
            initialNum = keyboard.nextInt();
            while(x < nums.length-1){
                nums[x] = keyboard.nextInt();
                initialNum /= nums[x];
                x++;
            }
            System.out.print(initialNum);
        }
        else if (choice == 5) {
            System.out.print("How many numbers would you like to mod?: ");
            int numOfNums = keyboard.nextInt();
            int[] nums = new int[numOfNums];
            System.out.println("Input the numbers you would like to mod IN ORDER: ");
            initialNum = keyboard.nextInt();
            while(x < nums.length-1){
                nums[x] = keyboard.nextInt();
                initialNum %= nums[x];
                x++;
            }
            System.out.print(initialNum);
        }
        else if (choice == 6){
            System.out.println("(1) Leap year calculator\n(2) Cent amount calculator\n(3) Coin breaker\n(4) Triangle side length\n(5) Sin checker");
            System.out.print("Please choose the number of the special function you would like to use: ");
            int specialChoice = keyboard.nextInt();

            if (specialChoice == 1){
                System.out.print("Input a year: ");
                int year = keyboard.nextInt();
                if (year % 4 == 0){
                    System.out.print("This is a leap year.");
                }
                else{
                    System.out.print("This is not a leap year.");
                }
            }
            if (specialChoice == 2){
                System.out.print("Input the amount of dollars you have: ");
                double dollars = keyboard.nextDouble();
                double centAmount = dollars * 100;
                System.out.print("That is " + (int)centAmount + " cents.");
            }
            if (specialChoice == 3){
                System.out.print("Input the amount of dollars you have: ");
                double dollars = keyboard.nextDouble();
                double toonies = dollars/2;
                double loonies = dollars/1;
                double quarters = dollars/.25;
                double dimes = dollars/.10;
                double nickels = dollars/.5;
                System.out.print("That is " + (int)toonies + " toonies, " + (int)loonies + " loonies, " + (int)quarters + " quarters, " + (int)dimes + " dimes, and " + (int)nickels + " nickels.");
            }
            if (specialChoice == 4){
                System.out.println("Input the other two side lengths and the angle opposite to the unknown side.");
                System.out.print("Side length 1 = ");
                double a = keyboard.nextDouble();
                System.out.print("Side length 2 = ");
                double b = keyboard.nextDouble();
                System.out.print("Opposite Angle = ");
                double angleC = keyboard.nextDouble();
                double sideLength = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) - (2*a*b) * Math.cos(Math.toDegrees(angleC)));
                System.out.print("The unknown side length is " + sideLength + " units.");
            }
        }

    }
}
