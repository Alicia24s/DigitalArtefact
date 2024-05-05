import java.util.Scanner;
    
/* 
 * see Documentation.md for more in depth notes on this class
 */
    public class DigitalArtifact{

        //Object that stores users question and answer data
        PersonalInformation usersRecords = new PersonalInformation();
        //Object that calls logic for each assessment
        PathwayManager assessmentPathway = new PathwayManager();
    
 
       
        public void questionnaire(){

        System.out.println("\r\n Welcome to Digital artifact: Financial assessment\r\n" + //
                            "\r\n" + //
                            "You will decide a financial topic pathway, take a quick questionnaire that goes up and down in difficulty depending \r\n" + //
                            "on how well you do and at the end you'll get a score and a chance to go again\r\n" + //
                            "\r\n" + //
                            "Please enter your details below:");

    
        
        Scanner scanner = new Scanner(System.in);

        boolean finished;

        // Loop to allow the code to keep going so long as the user wants to take another assessment
        do{
           
                boolean rightDetails;
                
            //Repeats the process of asking for users information as long as they don't say "yes"
                do{
                    
                    usersRecords.usersPersonalinfo(scanner);

                    System.out.println("\n Are these the correct details?");
                    String userContinuation = scanner.nextLine();  

                    rightDetails = userContinuation.equalsIgnoreCase("yes");

                    }while(!rightDetails);
                
        // Array to store the topics of the questionnaire pathways
         String[] optionNames = {
                " 1 Basic Finance Concepts",
                " 2 Investment and Portfolio Management",
                " 3 Financial Analysis and Valuation",
                " 4 Corporate finance"
            };

        // Prints out the questionnaire pathways for the user to choose from
            System.out.println("\nPlease select (1-4)");

                for (int i = 0; i < optionNames.length; i++) {

                        System.out.println("Option" + optionNames[i]);
                    }
                        
       
            int numberSelection = scanner.nextInt();

           //Calls logic for users chosen pathway
                assessmentPathway.optionPathways(numberSelection); 

            //Allows the user to take another questionnaire or do a re-do of the one they just did
                System.out.println("Would you like to restart the assessment? (yes/no)");
                     
                    scanner.nextLine();
                    String userContinuation = scanner.nextLine();
                        
                    finished = userContinuation.equalsIgnoreCase("no");
                    

            }while(!finished);

       System.out.println("THANK YOU <3");
       scanner.close();

    }

}
