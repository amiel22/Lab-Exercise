import java.util.*;
public class RunBloodData{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        BloodData no = new BloodData();
        System.out.print("Enter blood type: ");
        String oms = sc.nextLine();
        
        if (oms.equals("A")||oms.equals("B")||oms.equals("AB")||oms.equals("O")) {
            System.out.print("Enter Rhesus factor (+ or -):  ");
            String omsim = sc.next();
            BloodData bd = new BloodData(oms, omsim);

            if (omsim.equals("-")||omsim.equals("+")) {
                bd.display();
            }
            else{
            System.out.println("Invalid Input");
            }
        }
        else if (oms == "") {
            no.display();
        }
        else{
            System.out.println("Invalid Input");
        }

        sc.close();

    }
}