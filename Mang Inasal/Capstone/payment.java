import java.util.Scanner;
public class payment extends menus {
    private double amount;
    private String paymentMethod;

    public payment(double amount, String paymentMethod) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public void makePayment() {
        System.out.println("Total amount due: " + this.amount);
        System.out.print("Enter payment method (cash/card): ");
        Scanner sc = new Scanner(System.in);
        String paymentMethod = sc.next();

        if (paymentMethod.equalsIgnoreCase("cash")) {
            System.out.print("Enter cash amount: ");
            double cashAmount = sc.nextDouble();

            if (cashAmount < this.amount) {
                System.out.println("Insufficient payment. Please try again.");
            }
            else{
                double change = cashAmount - this.amount;
                System.out.println("Payment successful. Your change is: " + change);
                System.out.println("THANK YOU ! ");
                System.out.println("-------------------------------------------------------------");

            }
        }

        else if (paymentMethod.equalsIgnoreCase("card")) {
            System.out.println("Processing card payment...");
            // code to process card payment goes here
            System.out.println("Payment successful.");
        }
        else{
            System.out.println("Invalid payment method. Please try again.");
        }
    }
}