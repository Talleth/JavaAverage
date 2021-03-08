package Average;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // Define variables
        Scanner scanner = new Scanner(System.in);
        int     number1 = 0;
        int     number2 = 0;
        int     number3 = 0;
        int     number4 = 0;
        float   average = 0;
        
        // Get first number
        System.out.println("Enter first number");
        number1 = scanner.nextInt();
        
        // Get second number
        System.out.println("Enter second number");
        number2 = scanner.nextInt();
        
        // Get third number
        System.out.println("Enter third number");
        number3 = scanner.nextInt();
        
        // Get fourth number
        System.out.println("Enter fourth number");
        number4 = scanner.nextInt();

        // Calculate average and convert to float
        average = (float)(number1 + number2 + number3 + number4) / 4;
        
        // Output all four numbers along with the floating point average
        System.out.println("The average of " + number1 + "," + number2 + 
                "," + number3 + "," + number4 + " is: " + average);
    }
}
