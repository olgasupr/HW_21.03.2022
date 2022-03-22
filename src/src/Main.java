package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number: ");
    int number = scanner.nextInt();

    double percent = number * 0.25;

    System.out.println("25% of your number is: " + percent + ".");
    }
}
