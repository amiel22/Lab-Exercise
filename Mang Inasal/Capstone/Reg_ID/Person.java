class Person {
    private String Firstname, Lastname, Date, birthdate, contactNum, Address, nationality, Status, Gender;
    private int idNum, Age;
    private double Weight;

    public void setFirstName (String n) {
        Firstname = n;
    }
    public void setLastName (String n) {
        Lastname = n;
    }
    public void setAddress(String AD){
        Address = AD;
    }
    public void setContactNum(String c){
        contactNum = c;
    }
    public void setGender(String Gen){
        Gender = Gen;
    } 
    public void setcDate(String dt){
        Date = dt;
    }
    public void setbirthdate(String BD){
        birthdate = BD;
    }
    public void setidNum(int in){
        idNum = in;
    }
    public void setStatus(String stat){
        Status = stat;
    }
    public void setNationality(String NT) {
        nationality = NT;
    }
    public void setAge(int age){
        Age = age;
    }
    public void setWeight(double weight){
        Weight = weight;
    }

    public String getFirstName() {
        return Firstname;
    }
    public String getLastName() {
        return Lastname;
    }
    public String getAddress() {
        return Address;
    }
    public String getContactNum() {
        return contactNum;
    }
    public String getGender(){
        return Gender;
    }
    public String getcDate(){
        return Date;
    }
    public String getbirthdate(){
        return birthdate;
    }
    public int getidNum(){
        return  idNum;
    }
    public String getStatus(){
        return Status;
    }
    public String getNationality() {
        return nationality;
    }
   public int getAge(){
    return Age;
   }
   public double getWeight(){
    return Weight;
   }
}