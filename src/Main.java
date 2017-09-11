import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        Scanner scanner = new Scanner(System.in);
        String firstNumber = scanner.nextLine();
        System.out.println("Enter the second number: ");
        scanner = new Scanner(System.in);
        String secondNumber = scanner.nextLine();
        double firstDouble = Double.parseDouble(firstNumber); // convert inputs to doubles
        double secondDouble = Double.parseDouble(secondNumber);

    }
}
