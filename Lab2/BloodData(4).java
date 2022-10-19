public class BloodData{
    private String BloodData;
    private String RhFactor;
    public BloodData(){
        BloodData = "O";
        RhFactor = "+";
    }
   public void setBloodType(String BloodData){
        this.BloodData = BloodData;
    }
   public void setRhFactor(String RhFactor){
        this.RhFactor = RhFactor;
    }
    public void getBloodType(){
        System.out.print(BloodData);
    }
    public void getRhFactor(){
        System.out.print(RhFactor);
    }
}