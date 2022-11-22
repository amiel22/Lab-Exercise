import java.util.*;
public class RunAnimal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose an animal. Press B for Bird, C for Cat, D for Dog: ");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("B")) {
            Bird b = new Bird();
            b.eat();
            b.sleep();
            b.makeSound();
        } else if (choice.equalsIgnoreCase("C")) {
            Cat c = new Cat();
            c.eat();
            c.sleep();
            c.makeSound();
        } else if (choice.equalsIgnoreCase("D")) {
            Dog d = new Dog();
            d.eat();
            d.sleep();
            d.makeSound();
        } else{
            System.out.println("Invalid Input po");
        }
        sc.close();
    }
}