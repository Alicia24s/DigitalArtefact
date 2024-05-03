import java.util.Scanner;

    //Lab 1 & 2
    public class DigitalArtifact{
 
        //Move this into personal information.java and then call it through the recordmanagement.java class (Use getters and setters to privitise/Protect personalinfo)
        public void questionnaire(){

        //Object that stores users question and answer data
        PersonalInformation usersRecords = new PersonalInformation();
        
        Scanner scanner = new Scanner(System.in);

        //Lab 3 & Lab 4
        boolean finished;
        
        do{
           
            boolean rightDetails;
        
            do{

                usersRecords.usersPersonalinfo(scanner);

                System.out.println("Are these the correct details?");
                  String userContinuation = scanner.nextLine();  

                rightDetails = userContinuation.equalsIgnoreCase("yes");

                }while(!rightDetails);
             
      

    //Called from another class to do my Option selection
        PathwayManager options = new PathwayManager();


     

            System.out.println("Please select (1-4)");
            System.out.println("Option 1: Basic Finance Concepts");
            System.out.println("Option 2: Investment and Portfolio Management");
            System.out.println("Option 3: Financial Analysis and Valuation");
            System.out.println("Option 4: Corporate finance");
            

       int numberSelection = scanner.nextInt();
    

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

                    System.out.println("Would you like to select another assessment(yes/no)");

                         String userContinuation = scanner.nextLine();  

                    finished = userContinuation.equalsIgnoreCase("no");
                    


        }while(!finished);

       System.out.println("THANK YOU FOR TAKING THE QUIZ <3");
        
        scanner.close();

    }

}
