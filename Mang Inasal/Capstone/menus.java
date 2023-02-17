import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;

public class menus {

    LocalDateTime Date = LocalDateTime.now();
    public static LinkedHashMap <String, Double> menu;
    public static HashMap<String, Integer> order;

    public static double total = 0, disc = 0, itemprice, itemtotal;
    public static String itemname;
    public static int quantity;

    public void menus(){
        Scanner sc = new Scanner(System.in);
        menu = new LinkedHashMap<String, Double>(); //Item Name
        menu.put("Pm1",140.0);
        menu.put("Pm1V",162.0);
        menu.put("Pm2",162.0);
        menu.put("Pm2V",185.0);
        menu.put("CReg",109.0);

        int num = 1;
        System.out.println("=============================================================");
        System.out.println("\t\t\tMangInasal Menu");
        System.out.println("=============================================================");

        for (Entry<String, Double> e : menu.entrySet()) {
            System.out.printf("\t[%d]", num); //print format | %d print integer that were in string
            System.out.println(e.getKey() + "\t\t\t\t\t" + e.getValue());
            num++;
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("\tPlease do enter '0' if you're done ordering.");
        System.out.println("=============================================================\n");


        order = new LinkedHashMap<String, Integer>(); //Item Name | Quantity, Order computation
        String item = null;

        while (true) {
            System.out.print("May I take your order? ");
            int input = sc.nextInt();

            if (input == 0) { //input '0' for to stop the order processing
                break;
            }
            if (input != 0) {
                switch (input){

                    case 1:
                        item = "Pm1";
                        System.out.println(item + " " + menu.get(item));
                        break;

                    case 2:
                        item = "Pm1V";
                        System.out.println(item + " " + menu.get(item));
                        break;

                    case 3:
                        item = "Pm2";
                        System.out.println(item + " " + menu.get(item));
                        break;

                    case 4:
                        item = "Pm2V";
                        System.out.println(item + " " + menu.get(item));
                        break;
                    case 5:
                        item = "CReg";
                        System.out.println(item + " " + menu.get(item));
                        break;
                    default:
                        System.out.println("Item not available");
                        break;
                }
            }

            System.out.print("Enter the quantity: "); //to count the quantity
            int quantity = sc.nextInt();
            sc.nextLine();

            // Check if the item is already in the order
            if(order.containsKey(item)){
                // Retrieve the current quantity for the item
                int current = order.get(item);
                // Add the new quantity to it
                int newcurrent = current + quantity;
                // Update the value for the item in the HashMap
                order.put(item, newcurrent);
            }
            else{
                // Add the item and its quantity as a new entry
                order.put(item, quantity);
            }
        }
        //Receipt

        for (Entry<String, Integer> o : order.entrySet()) {
            itemname = o.getKey();
            double itemprice = menu.get(itemname);
            quantity = o.getValue();
            double itemtotal = itemprice * quantity;
            total += itemtotal;
        }
        
        System.out.print("Are you a senior citizen/PWD? (Y/N): ");
        System.out.print("");
        String ans = sc.next();
        while(!ans.equalsIgnoreCase("Y") && !ans.equalsIgnoreCase("N")){
            System.out.println("Invalid input. Please try again.");
            ans = sc.next();
        }
        if(ans.equalsIgnoreCase("Y")){
            disc = total * 0.2; // Calculate the discount amount
            total -= disc; // Subtract the discount from the total price
        } 

        System.out.println("-------------------------------------------------------------");
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("\tMM-dd-YY h:mm a");
        System.out.println(dt.format(Date));
        System.out.println("\tItem Name\tQuantity\tPrice"); //receipt part
        System.out.println("-------------------------------------------------------------");
        for (Entry<String, Integer> o : order.entrySet()) {
            itemname = o.getKey();
            itemprice = menu.get(itemname);
            quantity = o.getValue();
            itemtotal = itemprice * quantity;
            System.out.println("\t" + itemname + "\t\t" + quantity + "\t\tPhp " + itemtotal);
        }
        System.out.println("\tDiscount \t\t\tPhp " + disc);
        System.out.println("-------------------------------------------------------------");
        System.out.println("\tTotal \t\t\t\tPhp " + total);
        System.out.println("-------------------------------------------------------------");



        double totalAmount = total; //payment
        payment payment = new payment(totalAmount, "cash");
        payment.makePayment();

        System.exit(1);
    
    }
    public void receipt2() {
        for (Entry<String, Integer> o : order.entrySet()) {
            itemname = o.getKey();
            itemprice = menu.get(itemname);
            quantity = o.getValue();
            itemtotal = itemprice * quantity;
            System.out.println("\t" + itemname + "\t\t" + quantity + "\t\tPhp " + itemtotal);
        }

        System.out.println("\tDiscount \t\t\tPhp " + disc);
        System.out.println("-------------------------------------------------------------");
        System.out.println("\tTotal \t\t\t\tPhp " + total);
        System.out.println("-------------------------------------------------------------");
    }
}