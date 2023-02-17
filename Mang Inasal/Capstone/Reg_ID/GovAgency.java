import java.util.*;
public class GovAgency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Date date = new Date();
        ArrayList<Person> personList = new ArrayList<Person>();
        ArrayList<Person> peopleList = new ArrayList<Person>();
        ArrayList<Person> people = new ArrayList<Person>();
        Info impor = new Info();
        Person pd = new Person();
        YesorNo nd = new YesorNo();
        Person pn = new Person();

        System.out.println("WELCOME TO GovID! WE ARE HERE TO ASSIST YOU TO REGISTER IN THIS GOVERNMENT AGENCIES"); 
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Choose which Primary Government ID you want to Register:"); 
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String input = "";
        while(!input.equalsIgnoreCase("X")){
            System.out.print("Press P for Passport, D for Drivers License (Student Permit), S for SSS or X to Exit: ");
            input= sc.nextLine();


            if(input.equalsIgnoreCase("X")){
                System.out.println("-------------------------------------");
                System.out.println("| System closed thank you for using.|");
                System.out.println("-------------------------------------");
            }

        if(input.equalsIgnoreCase("P")){  

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 
            System.out.println("======================================");
            System.out.println("= THIS IS THE PASSPORT REGISTRATION  =");
            System.out.println("======================================");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~ Press 'Y' if you want to see the Guidelines or 'N' if you want to continue without reading the Guidelines: ~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            String sq = sc.nextLine();
            
            if(nd.isContinue(sq)){

            System.out.println("Loading information Please wait...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }    
            System.out.println("                                                                                                                        ");
            System.out.println("========================================================================================================================");
            System.out.println("=                                   Requirements for Passport Registration                                             =");
            System.out.println("=     Online Appointment Confirmation. The first thing to do is to secure a slot by setting an appointment online. ... =");
            System.out.println("=     Duly Accomplished Application Form. When setting an appointment, you need to complete the application form. ...  =");
            System.out.println("=     Birth Certificate. ...                                                                                           =");
            System.out.println("=     Valid ID. ...                                                                                                    =");
            System.out.println("=     Personal Appearance.                                                                                             =");
            System.out.println("========================================================================================================================");
            System.out.println("                                                                                                                        ");
            }
             else{
                 System.out.println("Loading Please wait...");
                        try {
                        Thread.sleep(1000);
                        } catch (InterruptedException e) {
                        e.printStackTrace();
                        }  
                        System.out.println("---------------------------------------");
                        System.out.println("| Redirecting to the registration form |");
                        System.out.println("---------------------------------------");
        }
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            impor.Firstname(); 
            pd.setFirstName(sc.nextLine());
            impor.Lastname();
            pd.setLastName(sc.nextLine());
            impor.Contact();
            pd.setContactNum(sc.nextLine());
            impor.Dataofbirth();
            pd.setbirthdate(sc.nextLine());
            impor.Address();
            pd.setAddress(sc.nextLine());
            impor.Nationality();
            pd.setNationality(sc.nextLine());
            impor.Gender();
            pd.setGender(sc.nextLine());
            impor.Age();
            pd.setAge(sc.nextInt()); 
            sc.nextLine();
            personList.add(pd);

            String choice1 = "";
            while(!choice1.equalsIgnoreCase("X")){
                System.out.print("Press V to View your details, Press A to Add another Person, X to Exit into main menu: ");
                choice1 = sc.nextLine();
                if(choice1.equalsIgnoreCase("X")){
                    System.out.println("------------------------------------");
                    System.out.println("| Process ended thank you for using.|");
                    System.out.println("------------------------------------");
                }

                if(choice1.equalsIgnoreCase("V")){
                    for(Person p : personList){
                        System.out.println("---------------------------------------------------");
                        System.out.println("        You are registered! ");
                        System.out.println("        This is your Credentials!");
                        System.out.println("                                             ");
                        System.out.println("        " + date);
                        System.out.println("                                             ");
                        System.out.println("        >Name: " + p.getLastName()+" "+p.getFirstName());
                        System.out.println("        >Contact Number: " + p.getContactNum());
                        System.out.println("        >Date of Birth: " + p.getbirthdate());
                        System.out.println("        >Address: " + p.getAddress());
                        System.out.println("        >Nationality: " + p.getNationality());
                        System.out.println("        >Gender: " + p.getGender());
                        System.out.println("        >Age: " + p.getAge());
                        System.out.println("---------------------------------------------------");
                    }
                }
                else if(choice1.equalsIgnoreCase("A")){   //If pressed A
                    Person newPerson = new Person();
                    try {
                        Thread.sleep(20);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     } 
                            System.out.println("==============================");
                            System.out.println("=    Loading Please Wait     =");
                            System.out.println("==============================");

                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            impor.Firstname(); 
                            newPerson.setFirstName(sc.nextLine());
                            impor.Lastname();
                            newPerson.setLastName(sc.nextLine());
                            impor.Contact();
                            newPerson.setContactNum(sc.nextLine());
                            impor.Dataofbirth();
                            newPerson.setbirthdate(sc.nextLine());
                            impor.Address();
                            newPerson.setAddress(sc.nextLine());
                            impor.Nationality();
                            newPerson.setNationality(sc.nextLine());
                            impor.Gender();
                            newPerson.setGender(sc.nextLine());
                            impor.Age();
                            newPerson.setAge(sc.nextInt());
                            sc.nextLine();
                            personList.add(newPerson);
                        }
                    }             
                }


                    else if(input.equalsIgnoreCase("D")){ 
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } 
                        System.out.println("============================================");
                        System.out.println("= THIS IS THE DRIVERS LICENSE REGISTRATION =");
                        System.out.println("============================================");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("~ Press 'Y' if you want to see the Guidelines or 'N' if you want to continue without reading the Guidelines: ~");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("                                             ");
                        String s = sc.nextLine();
                        
                        if(nd.isContinue(s)){

                        System.out.println("Loading information Please wait...");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }    
                        System.out.println("                                                                                                                        ");
                        System.out.println("========================================================================================================================");
                        System.out.println("=                                    Applying for a student permit:                                                    =");
                        System.out.println("= 1. Submit an accomplished application form along with the other requirements to the LTO representative.              =");
                        System.out.println("= 2. Have your photo taken and affix your signature in the designated area.                                            =");
                        System.out.println("= 3. Once your application is approved, head to the cashier to pay.                                                    =");
                        System.out.println("= 4. You will receive your student permit in the form of an official receipt.                                          =");
                        System.out.println("========================================================================================================================");
                        System.out.println("                                                                                                                        ");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    else{
                        System.out.println("Loading Please wait...");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }    
                        System.out.println("---------------------------------------");
                        System.out.println("| Redirecting to the registration form |");
                        System.out.println("---------------------------------------");
                    }

                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } 
                        System.out.println("                                             ");
                        System.out.println("To Verify please follow the instructions: Type your LastName, FirstName, Address, Age, Contact number, and Date of Birth.");
                        System.out.println("Press Enter after every input.");
                        System.out.println("                                             ");

                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }    
                        System.out.print("Please enter your LastName: ");
                        nd.setLastName(sc.nextLine());
                        System.out.print("Please enter your FirstName: ");
                        nd.setFirstName(sc.nextLine());
                        System.out.print("Please enter your Address (House no, lot): ");
                        nd.setAddress(sc.nextLine());
                        System.out.print("Please enter your contact number (+63): ");
                        nd.setContactNum(sc.nextLine());
                        System.out.print("Please input your Birth Date (MM/DD/YYYY): ");
                        nd.setbirthdate(sc.nextLine());
                        System.out.print("Please enter your Age (16 above): ");
                        nd.setAge(sc.nextInt());
                        sc.nextLine();
                        peopleList.add(nd);

                    String choice1 = "";
                    while(!choice1.equalsIgnoreCase("X")){
                        System.out.print("Press V to View your details, Press A to Add another Person, X to Exit into main menu: ");
                        choice1 = sc.nextLine();
                        if(choice1.equalsIgnoreCase("X")){
                            System.out.println("------------------------------------");
                            System.out.println("| Process ended thank you for using.|");
                            System.out.println("------------------------------------");
                        }
                        if(choice1.equalsIgnoreCase("V")){
                            for(Person d : peopleList){
                                System.out.println("---------------------------------------------------------");
                                System.out.println("    This is your Driver's License Information! ");
                                System.out.println("        You are registered! ");
                                System.out.println("        This is your Credentials!");
                                System.out.println("                                             ");
                                System.out.println("        " + date);
                                System.out.println("                                             ");
                                System.out.println("        >Name: "+ d.getFirstName() +" "+ d.getLastName()); 
                                System.out.println("        >Address: " + d.getAddress());
                                System.out.println("        >Contact Number: " + d.getContactNum()); 
                                System.out.println("        >Date of Birth: " + d.getbirthdate()); 
                                System.out.println("        >Age: " + d.getAge());
                                System.out.println("---------------------------------------------------------");
                            }
                        }
                        else if(choice1.equalsIgnoreCase("A")){
                            Person newPerson2 = new Person();
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            } 
                                    System.out.println("==============================");
                                    System.out.println("=    Loading Please Wait     =");
                                    System.out.println("==============================");

                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.print("Please enter your LastName: ");
                                    newPerson2.setLastName(sc.nextLine());
                                    System.out.print("Please enter your FirstName: ");
                                    newPerson2.setFirstName(sc.nextLine());
                                    System.out.print("Please enter your Address (House no, lot): ");
                                    newPerson2.setAddress(sc.nextLine());
                                    System.out.print("Please enter your contact number (+63): ");
                                    newPerson2.setContactNum(sc.nextLine());
                                    System.out.print("Please input your Birth Date (MM/DD/YYYY): ");
                                    newPerson2.setbirthdate(sc.nextLine());
                                    System.out.print("Please enter your Age (16 above): ");
                                    newPerson2.setAge(sc.nextInt());
                                    peopleList.add(newPerson2);
                                }
                            }
                        }

                        else if(input.equalsIgnoreCase("S")){ 
                            Ask assk = new Ask();
                            assk.infos();
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("~ Press 'Y' if you want to see the Guidelines or 'N' if you want to continue without reading the Guidelines: ~");
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            String s = sc.nextLine();
                            
                            if(nd.isContinue(s)){
    
                            System.out.println("Loading information Please wait...");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }    
                            System.out.println("                                                                                                                        ");
                            System.out.println("========================================================================================================================");
                            System.out.println("=                                              Applying for SSS:                                                       =");
                            System.out.println("=  Step 1: Go to the SSS Online Registration Page. Access the SSS Member Portal (member.sss.gov.ph/members)            =");
                            System.out.println("=  and click on the link at the bottom of the page that says 'Register.' ...                                           =");
                            System.out.println("=  Step 2: Provide the Required Information. ...                                                                       =");
                            System.out.println("=  Step 3: Check Your Email. ...                                                                                       =");
                            System.out.println("========================================================================================================================");
                            System.out.println("                                                                                                                        ");
                
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        else{
                            System.out.println("Loading Please wait...");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }    
                            System.out.println("---------------------------------------");
                            System.out.println("| Redirecting to the registration form |");
                            System.out.println("---------------------------------------");
                        } 
                            System.out.print("Input your LastName: ");
                            pn.setLastName(sc.nextLine());
                            System.out.print("Input your FirstName: ");
                            pn.setFirstName(sc.nextLine());
                            System.out.print("Input Contact Number (+63): ");
                            pn.setContactNum(sc.nextLine());
                            System.out.print("Input Birth Date (MM/DD/YYYY): ");
                            pn.setbirthdate(sc.nextLine());
                            System.out.print("Input your Address (House no, lot): ");
                            pn.setAddress(sc.nextLine());
                            System.out.print("Input your Nationality: ");
                            pn.setNationality(sc.nextLine());
                            System.out.print("Input your Gender (Male/Female): ");
                            pn.setGender(sc.nextLine());
                            System.out.print("Input your Marital Status: ");
                            pn.setStatus(sc.nextLine());
                            people.add(pn);

                        String choice1 = "";
                        while(!choice1.equalsIgnoreCase("X")){
                            System.out.print("Press V to View your details, Press A to Add another Person, X to Exit into main menu: ");
                            choice1 = sc.nextLine();
                            if(choice1.equalsIgnoreCase("X")){
                                System.out.println("------------------------------------");
                                System.out.println("| Process ended thank you for using.|");
                                System.out.println("------------------------------------");
                            }

                        if(choice1.equalsIgnoreCase("V")){
                            for(Person ss : people){
                                System.out.println("---------------------------------------------------");
                                System.out.println("        You are registered! ");
                                System.out.println("        This is your Credentials!");
                                System.out.println("                                             ");
                                System.out.println("        " + date);
                                System.out.println("                                             ");
                                System.out.println("        >Name: " + ss.getFirstName()+ " " + ss.getLastName());
                                System.out.println("        >Contact Number: " + ss.getContactNum());
                                System.out.println("        >Date of Birth: " + ss.getbirthdate());
                                System.out.println("        >Address: " + ss.getAddress());
                                System.out.println("        >Gender: " + ss.getGender());
                                System.out.println("        >Nationality: " + ss.getNationality());
                                System.out.println("        >Marital Status: " + ss.getStatus());
                                System.out.println("---------------------------------------------------");
                            }
                        }
                        else if(choice1.equalsIgnoreCase("A")){
                        Person newPerson1 = new Person();
                            try {
                                Thread.sleep(20);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            } 
                                    System.out.println("==============================");
                                    System.out.println("=    Loading Please Wait     =");
                                    System.out.println("==============================");

                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    } 
                                    System.out.print("Input your Lastname: ");
                                    newPerson1.setLastName(sc.nextLine());
                                    System.out.print("Input your Firstname: ");
                                    newPerson1.setFirstName(sc.nextLine());
                                    System.out.print("Input Contact Number: (+63) ");
                                    newPerson1.setContactNum(sc.nextLine());
                                    System.out.print("Input Birth Date: (MM/DD/YY)");
                                    newPerson1.setbirthdate(sc.nextLine());
                                    System.out.print("Input your Address: (House no, lot) ");
                                    newPerson1.setAddress(sc.nextLine());
                                    System.out.print("Input your Nationality: ");
                                    newPerson1.setNationality(sc.nextLine());
                                    System.out.print("Input your Gender: ('Male or Female') ");
                                    newPerson1.setGender(sc.nextLine());
                                    System.out.print("Input your Marital Status: ");
                                    newPerson1.setStatus(sc.nextLine());
                                    people.add(newPerson1);
                                }
                            }
                         }
                    }                          
      sc.close(); } 
        }           