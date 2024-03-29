import java.util.Scanner;

    //Lab 1 & 2
    public class TestLogic{

        //Object that stores users question and answer data
        RecordManagement usersRecords = new RecordManagement();

        
        //Move this into personal information.java and then call it through the recordmanagement.java class (Use getters and setters to privitise/Protect personalinfo)
        public void questionnaire(){
        
            boolean rightDetails;
        
        
            Scanner scanner = new Scanner(System.in);

            do{

            System.out.println("FirstName:");
                String firstname = scanner.nextLine();

            System.out.println("Surname:");
                 String surname = scanner.nextLine();

            System.out.println("Age:");
                 int years = scanner.nextInt();
 
            System.out.println("E-mail");
                 String email = scanner.nextLine();


            //Find out how to get this into Personal information
            Object[] infoString = {firstname, surname, email, years};
            String[] infoPrefix = {"Firstname: ", "Surname:", "email ", "Age:"};

            System.out.println("is this information correct? (yes/no)");

            for (int i = 0; i < infoString.length; i++){

                for(int j = 0; j < infoPrefix.length; j++){
                System.out.println(infoPrefix[j] + infoString[i]);
                }

            }
               
            String userContinuation = scanner.nextLine();  
            rightDetails = userContinuation.equalsIgnoreCase("no");


        }    while(!rightDetails);
             
            

        //Lab 3 & Lab 4
        boolean finished;

        //Called from another class to do my Option selection
        OptionPathways options = new OptionPathways();


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
                        //Insert steps for the logic sequencial
                        break;

                    case 2:
                        options.option2(numberSelection); 
                        //Insert steps for the logic sequencial                       
                        break;
                        
                    case 3:
                        options.option3(numberSelection);
                         //Insert steps for the logic sequencial
                        break;

                    case 4:
                        options.option4(numberSelection);
                         //Insert steps for the logic sequencial
                        break;

                    default:
                        System.out.println(numberSelection + "is not a valid choice");
                    }

                        
                    System.out.println("Do you want to re-pick an option (yes/no)");
                         String userContinuation = scanner.nextLine();  

                    finished = userContinuation.equalsIgnoreCase("no");


            }while(!finished);

 
        System.out.println("Thanks so much goodbye");
        //Insert the logic for feedback/closeout and all of that
        scanner.close();

    }

}
