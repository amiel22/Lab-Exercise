class YesorNo extends Person {
    private boolean status;
    public boolean isContinue(String s) {
        if(s.equalsIgnoreCase("Y")){
            status = true;
        } 
        else if (s.equalsIgnoreCase("N")){
            status = false;
        }
        else{
            System.out.println("Invalid input");
        }
        return status;
    }
}