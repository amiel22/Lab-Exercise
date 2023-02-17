import java.util.*;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        customer csm = new customer("Hi there welcome! to our restaurant may we ask your name? "); //insert surname
        csm.user();
        String customername = sc.next();
        try{
            if(customername.matches("^[a-zA-Z]+$")){
               System.out.println("Good Day! Mr/Ms. " + customername + " here is our menu, order when ready.");
               System.out.println("");
                menus menu = new menus(); //polymorph
                menu.menus();
            }else{
                throw new Exception("Invalid put please use letters only"); 
            }
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}