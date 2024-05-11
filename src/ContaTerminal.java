import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int number = 0;
        String agency = "";
        String clientName = "";
        double balance = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, insert your account number: ");
        number = sc.nextInt();

        System.out.println("Please, insert your agency: ");
        agency = sc.next();

        System.out.println("Please, insert your name: ");
        clientName = sc.next();

        System.out.println("Please, insert your balance: ");
        balance = sc.nextDouble();

        System.out.println("Hello " + clientName + ", " + "thanks for creating a new account in our bank, your agency is " + agency + " account " + number + " and your balance of " + balance + " is already available to withdraw.");
    }
}
