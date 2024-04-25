import java.util.Scanner;

    //Lab 1 & 2
    public class TestLogic{

        //Object that stores users question and answer data
        PersonalInformation usersRecords = new PersonalInformation();
        
        Scanner scanner = new Scanner(System.in);
        
        //Move this into personal information.java and then call it through the recordmanagement.java class (Use getters and setters to privitise/Protect personalinfo)
        public void questionnaire(){
        
            boolean rightDetails;
        

            do{

            System.out.println("FirstName:");
                String firstname = scanner.nextLine();

            System.out.println("Surname:");
                 String surname = scanner.nextLine();

            System.out.println("Age:");
                 int years = scanner.nextInt();
 
            scanner.nextLine();
            
            System.out.println("E-mail");
                 String email = scanner.nextLine();


            //Find out how to get this into Personal information
            System.out.println("firstname:" + firstname);
            System.out.println("surname:" + surname);
            System.out.println("Age:" + years);
            System.out.println("Email:" + email);

            System.out.println("Is this your details?");
               
            String userContinuation = scanner.nextLine();  


            rightDetails = userContinuation.equalsIgnoreCase("yes");

        }    while(!rightDetails);
             
            

        //Lab 3 & Lab 4
        boolean finished;

    //Called from another class to do my Option selection
        PathwayManager options = new PathwayManager();


      do{

            System.out.println("Please select (1-4)");
            System.out.println("Option 1: Basic Finance Concepts");
            System.out.println("Option 2: Investment and Portfolio Management");
            System.out.println("Option 3: Financial Analysis and Valuation");
            System.out.println("Option 4: Corporate finance");
            

       int numberSelection = scanner.nextInt();
            scanner.nextLine();

                switch(numberSelection){

                    case 1:
                        options.option1(numberSelection);
                        
                        break;

                    case 2:
                        options.option2(numberSelection); 
                                               
                        break;
                        
                    case 3:
                        options.option3(numberSelection);
                         
                        break;

                    case 4:
                        options.option4(numberSelection);
                         
                        break;

                    default:
                        System.out.println(numberSelection + "is not a valid choice");
                    }

                    

                        
                 System.out.println("Do you want to take another(yes/no)");
                         String userContinuation = scanner.nextLine();  

                    finished = userContinuation.equalsIgnoreCase("no");


            }while(!finished);


 
        System.out.println("Thanks so much goodbye");
        
        scanner.close();

    }

}
