import java.util.Scanner;


public class Rejection {

    //Called when the user prints nonsense for bants
        public void unexpectedAnswer(){
        System.out.println("Invalid answer: please try again");

        }

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

        public void userfeedback(){


            System.out.println("Rate your experience from (1-5) 1 being horrific and 5 being amazeballs");
            boolean isValidInput;



        Scanner scanner = new Scanner(System.in);

        int feedback = scanner.nextInt();


        
         do{

   
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

        }
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
