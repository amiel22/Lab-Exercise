import java.util.*;
public class RunBloodData {
    public static void main(String[] args) {
        BloodData bd = new BloodData();
        Scanner sc = new Scanner(System.in);
        BloodData no = new BloodData();
        System.out.print("Enter blood type: ");
        String oms = sc.nextLine();
        bd.setBloodType(oms);
        if (oms.equals("A")||oms.equals("B")||oms.equals("AB")||oms.equals("O")) {
            System.out.print("Enter Rhesus factor (+ or -):  ");
            String omsim = sc.next();
            if (omsim.equals("-")||oms.equals("+")) {
                bd.setRhFactor(omsim);
                bd.getBloodType();
                bd.getRhFactor();
                System.out.print(" is added to the blood bank");
            } else{
                System.out.println("Invalid Input");
            }
        } else if (oms.equals("")) {
            no.getBloodType();
            no.getRhFactor();
            System.out.print(" is added to the blood bank");
        } else{
            System.out.println("Invalid Input");
        }
    sc.close();
    }
}