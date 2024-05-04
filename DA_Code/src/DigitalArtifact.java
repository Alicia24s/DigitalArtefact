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

                    System.out.println("\n Are these the correct details?");
                    String userContinuation = scanner.nextLine();  

                    rightDetails = userContinuation.equalsIgnoreCase("yes");

                    }while(!rightDetails);
             
        // use of array 50-59
        String optionNames[] = {
            " 1 Basic Finance Concepts",
            " 2 Investment and Portfolio Management",
            " 3 Financial Analysis and Valuation",
            " 4 Corporate finance"
        };

           
        System.out.println("\nPlease select (1-4)");
        for (int i = 0; i < optionNames.length; i++) {
            System.out.println("Option" + optionNames[i]);
        }
            
        PathwayManager options = new PathwayManager();
    
        int numberSelection = scanner.nextInt();

           while(numberSelection > 4 && numberSelection < 1){

            System.out.println("PLEASE select between 1 AND 4");
            numberSelection = scanner.nextInt();
           }

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
                        System.out.println(numberSelection + " is not a valid choice");
                    }
                    
                    System.out.println("Would you like to restart the assessment? (yes/no)");
                     
                    scanner.nextLine();
                    String userContinuation = scanner.nextLine();
                        
                    finished = userContinuation.equalsIgnoreCase("no");
                    

            }while(!finished);

       System.out.println("THANK YOU <3");
       scanner.close();

    }

}
