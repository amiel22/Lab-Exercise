class customer extends client {

    public customer(String name) {
        super(name);
    }
    public void user() {
        System.out.print(this.name);

    }
}
/*The customer class is instantiated with the customer csm = new customer
("Hi there welcome! to our restaurant may we ask your name? "); line. The customer class 
has a method called user which is called with csm.user();*/