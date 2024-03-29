import java.util.Scanner;


public class Rejection {


    //Called when the user prints nonsense for bants
        public void unexpectedAnswer(){

        System.out.println("Invalid answer: please try again");

        }

        
    //Called to give user another chance to continue 
    //I dont know how this would work if the user says yes. At what point will the code continue?
    
        public void areYouSure(){
        
            System.out.println("Would You like to quit? (Y/N)");
            Scanner scanner = new Scanner(System.in);

            String usersAreYouSureAnswer = scanner.nextLine();

            if (usersAreYouSureAnswer.equalsIgnoreCase("N")){
                userfeedback();
            }
            else if(usersAreYouSureAnswer.equalsIgnoreCase("n")){
                userfeedback();
            }
        }


    //Called when user is finished

        public void userfeedback(){


            System.out.println("Rate your experience from (1-5) 1 being horrific and 5 being amazeballs");

        Scanner scanner = new Scanner(System.in);

        int feedback = scanner.nextInt();

        /*Method Asking if user would give feedback
         *Questions
         * 1. Good or bad experience etc etc
         * 
         * function to give option for personalised feedback
         *
         * completed? option for 1-5 star user review 
         * 
         * call questionnaire close out
         * 
         */
        
         do{

            
        boolean isValidInput;

         switch (feedback) {

            case 1:
            case 2:

            System.out.println("Sorry to hear about your experience");
                //(CHALLENGE) Give user opportunity to give more details for future reference and store it in a new file called feedback

            break;

            case  3:

            System.out.println("nice");
                //(CHALLENGE) Give user opportunity to give more details for future reference and store it in a new file called feedback

            break;

            case 4:
            case 5: 
            
            System.out.println("Glad to hear that");

            break;

            default:

               unexpectedAnswer();

               isValidInput = false;
                break;

            }
            
         }while (!isValidInput);


    //Called as option for more personalised feedback -- Gives contacting options etc etc
        
        public void userReview(){

            System.out.println("Would you like to leave a review?");
         }

    //Called to close out the questionnaire 

        public void questionnaireCloseOut(){

         System.out.println("Thank you ");

         //inset function to display score, metrics, and how well they did --> call  from record management
         }


}
