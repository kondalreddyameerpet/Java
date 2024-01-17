import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();
        
        int reversedNumber = reverseDigits(inputNumber);
        
        System.out.println("Reversed number: " + reversedNumber);
    }
    
    static int reverseDigits(int number) {
        int reversedNumber = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        return reversedNumber;
    }
}
