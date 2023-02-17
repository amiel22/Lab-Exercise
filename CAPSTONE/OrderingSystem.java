import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.*;

public class OrderingSystem{
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int choose, quantity = 1;
            double total = 0, discount = 0;
            int pay;
            Map<String, Integer> orders = new HashMap<>();
            Menus menu = new Menus();
            Customer user = new Customer();
            Ordermore add = new Ordermore();
            System.out.println("                Welcome to Chowking!                    ");
          while(true){
          System.out.print("Enter Your Name: ");
          String name = scan.nextLine();
          if (name.matches("[a-zA-Z]+")){
          user.setCustomername(name);
          break;
          } 
          else {
        System.out.println("Please enter letters only!");
          }
          }
            try{
            while(true){
                menu.Menu();
                System.out.print("Enter the number of your choice: ");
                choose = scan.nextInt();
                switch(choose){ 

                    case 1:
                    System.out.println("You chose Dimsum Chao Fan. ");
                    System.out.print("How many Dimsum Chao Fan you want to order?: ");
                    quantity = scan.nextInt();
                    if(orders.containsKey("Dimsum Chao Fan")){
                         int currentQuantity = orders.get("Dimsum Chao Fan");
                         int updatedQuantity = currentQuantity + quantity;
                         orders.put("Dimsum Chao Fan", updatedQuantity);
                    } else {
                         orders.put("Dimsum Chao Fan", quantity);
                    }
                    Food foods1 = new DimsumChaofan(quantity);
                    total += foods1.getPrice();
                    break;

                    case 2:
                    System.out.println("You chose Pork Chao Fan. ");
                    System.out.print("How many Pork Chao Fan you want to order?: ");
                    quantity = scan.nextInt();
                    if (orders.containsKey("Pork Chao Fan")){
                         int currentQuantity = orders.get("Pork Chao Fan");
                         int updatedQuantity = currentQuantity + quantity;
                         orders.put("Pork Chao Fan", updatedQuantity);
                    } else {
                         orders.put("Pork Chao Fan", quantity);
                    }
                    Food foods2 = new PorkChaoFan(quantity);
                    total += foods2.getPrice();
                    break;

                    case 3:
                    System.out.println("You chose Dimsum Beef Chao Fan. ");
                    System.out.print("How many Dimsum Beef Chao Fan you want to order?: ");
                    quantity = scan.nextInt();
                    if (orders.containsKey("Dimsum Beef Chao Fan")){
                         int currentQuantity = orders.get("Dimsum Beef Chao Fan");
                         int updatedQuantity = currentQuantity + quantity;
                         orders.put("Dimsum Beef Chao Fan", updatedQuantity);
                    } else {
                         orders.put("Dimsum Beef Chao Fan", quantity);
                    }
                    Food foods3 = new DimsumBeefChaoFan(quantity);
                    total += foods3.getPrice();
                    break;

                    case 4:
                    System.out.println("You chose Beef Chao Fan. ");
                    System.out.print("How many Beef Chao Fan you want to order?: ");
                    quantity = scan.nextInt();
                    if(orders.containsKey("Beef Chao Fan")){
                         int currentQuantity = orders.get("Beef Chao Fan");
                         int updatedQuantity = currentQuantity + quantity;
                         orders.put("Beef Chao Fan", updatedQuantity);
                    } else {
                         orders.put("Beef Chao Fan", quantity);
                    }
                    Food foods4 = new BeefChaoFan(quantity);
                    total += foods4.getPrice();
                    break;

                    case 5:
                    System.out.println("You chose Iced Tea. ");
                    System.out.print("How many Iced Tea you want to order?: ");
                    quantity = scan.nextInt();
                    if(orders.containsKey("Iced Tea")){
                         int currentQuantity = orders.get("Iced Tea");
                         int updatedQuantity = currentQuantity + quantity;
                         orders.put("Iced Tea", updatedQuantity);
                    } else {
                         orders.put("Iced Tea", quantity);
                    }
                    Drinks foods5 = new IcedTea(quantity);
                    total += foods5.getPrice();
                    break;

                    case 6:
                    System.out.println("You chose Coke. ");
                    System.out.print("How many Coke you want to order?: ");
                    quantity = scan.nextInt();
                    if(orders.containsKey("Coke")){
                         int currentQuantity = orders.get("Coke");
                         int updatedQuantity = currentQuantity + quantity;
                         orders.put("Coke", updatedQuantity);
                    } else {
                         orders.put("Coke", quantity);
                    }
                    Drinks foods6 = new Coke(quantity);
                    total += foods6.getPrice();
                    break;

                    case 7:
                    System.out.println("You chose Sprite. ");
                    System.out.print("How many Sprite you want to order?: ");
                    quantity = scan.nextInt();
                    if(orders.containsKey("Sprite")){
                         int currentQuantity = orders.get("Sprite");
                         int updatedQuantity = currentQuantity + quantity;
                         orders.put("Sprite", updatedQuantity);
                    } else {
                         orders.put("Sprite", quantity);
                    }
                    Drinks foods7 = new Sprite(quantity);
                    total += foods7.getPrice();
                    break;

                    case 8:
                    System.out.println("You chose Halo-Halo. ");
                    System.out.print("How many Halo-Halo you want to order?: ");
                    quantity = scan.nextInt();
                    if(orders.containsKey("Halo-Halo")){
                         int currentQuantity = orders.get("Halo-Halo");
                         int updatedQuantity = currentQuantity + quantity;
                         orders.put("Halo-Halo", updatedQuantity);
                    } else {
                         orders.put("Halo-Halo", quantity);
                    }
                    Food foods8 = new Halohalo(quantity);
                    total += foods8.getPrice();
                    break;
                    
                    case 9:
                    System.out.println("You chose to cancel. ");
                    System.out.println("Run the program again to order, thank you! ");
                    System.exit(0);
                    break;
                    
                    default:
                    System.out.println("Please only enter 1-9!");
                    System.out.println("Run the program again to order, thank you! ");
                    System.exit(0);
                }

                add.AddmoreOrders();
                String again = scan.next();
                if (again.equalsIgnoreCase("Y")||again.equalsIgnoreCase("N")||again.equalsIgnoreCase("E")) {
                    if (again.equalsIgnoreCase("Y")){
                         continue;
                     } else if (again.equalsIgnoreCase("N")){
                         break;
                     } else if (again.equalsIgnoreCase("E")){
                         System.out.println("Run the program again to order, thank you!");
                         System.exit(0);
                     }
                    } else{
                    System.out.println("Please only enter Y/y, N/n, E/e: ");
                    System.out.println("Run the program again to order, thank you!");
                    System.exit(0);
                }
               }
               while(true){
               System.out.print("Do you have a Senior Citizen or PWD Card? (Y/N): ");
               String response = scan.next();
               if(response.equalsIgnoreCase("Y")) {
               discount = total * 0.2;
               total -= discount;
               System.out.printf("Discount applied.%n");
               break;
               } 
          else if(response.equalsIgnoreCase("N")) {
               break;
               } 
               else {
               System.out.println("Invalid input, please try again!");
                    }
               }
                System.out.printf("New total price is: %.2f" , total);
                System.out.println("");
                System.out.print("Please enter your payment: ");
                pay = scan.nextInt();
                if(pay <=total){
                    System.out.println("Insufficient balance. Run the program again to order, thank you!");
                }else{
                    try{
                         FileWriter fw = new FileWriter("Finalreceipt.txt");
                         BufferedWriter bw = new BufferedWriter(fw);
                         double change = pay-total;
                         Random rand2 = new Random();
                         int randomNum2=  rand2.nextInt(10000000);
                         LocalDateTime now = LocalDateTime.now();
                         DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
                         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("\t\t\t\t MM/dd/yyyy HH:mm:ss");
                         System.out.println("\t\t\t\t ========================================================================================");
                         System.out.println("\t\t\t\t                                  ╦═╗┌─┐┌─┐┌─┐┬┌─┐┌┬┐                                    ");
                         System.out.println("\t\t\t\t                                  ╠╦╝├┤ │  ├┤ │├─┘ │                                     ");
                         System.out.println("\t\t\t\t                                  ╩╚═└─┘└─┘└─┘┴┴   ┴                                     ");
                         System.out.println("");
                         System.out.println("\t\t\t\t                                       CHOWKING                                          ");
                         System.out.println("\t\t\t\t                         Imus City, Cavite, Philippines 4103                              ");
                         System.out.println("\t\t\t\t                                      OR # " + randomNum2                                    );
                         System.out.println("");
                         System.out.println("\t\t\t\t Customer Name: " + user.getName());
                         bw.write("                Chowking");
                         bw.newLine();
                         bw.newLine();
                         bw.write("Or#: "+ randomNum2);
                         bw.newLine();
                         bw.write("Customer Name: " + user.getName());
                         bw.newLine();
                         bw.write("Orders:");
                         bw.newLine();
                         add.YourOrders();
                    add.YourOrders();
                for (Map.Entry<String, Integer> entry : orders.entrySet()) {
                        System.out.println("\t\t\t\t " + entry.getKey() + " x " + entry.getValue());
                        bw.write(entry.getKey() + " x " + entry.getValue());
                        bw.newLine();
                    }
                    System.out.printf("\t\t\t\t Your change is: %.2f", change);
                    bw.write("Total: " + total);
                    bw.newLine();
                    bw.write("Change: " + change);
                    bw.newLine();
                    System.out.println("");
                    System.out.println("\t\t\t\t                              Please come again, thank you!");
                    System.out.println("                                      " + dtf.format(now));
                    System.out.println("\t\t\t\t ========================================================================================");
                    if(total >= 500) {
                         String[] foods = {"Chicharap", "Chocolate Buchi", "Chocolate Xiao Long Bao", "Extra Egg Fried Rice", "Wonton Soup", "Chunky Siopao", "Bola-bola", "Kangkong w/ Chinese Bagoong", "Fried Siomao"};
                         Random rand = new Random();
                         int randomNum = rand.nextInt(8) + 1 ;
                         String food = foods[randomNum - 1];
                         System.out.println("\t\t\t\t           Your order has reached 500 PHP! Your freebie is: " + food + "!");
                         System.out.println("\t\t\t\t ========================================================================================");
                         bw.write("Freebie: " + food);
                         bw.newLine();
                    }
                    bw.write("Thank you for choosing us!");
                    bw.newLine();
                    bw.write(dtf1.format(now));
                    bw.newLine();
                    bw.close();
               } catch(IOException e) {
                    System.out.println("An error occurred while trying to create the receipt file.");
               }
               }
          } catch(Exception E){

               System.out.println("Run the program again to order, thank you!");
          }
          scan.close();
     }
}