import java.util.Scanner;


public class Rejection {


    //Called when the user prints nonsense
        public void unexpectedAnswer(){

        System.out.println("Sorry I dont understand pls try again");
        //UnexectedAnswer? Sorry I DONT UNDERSTAND try again please - Continue code
        //It happens again? Prompt 'pLEASE TRYAGAIN'
        //areYouSure? if 'not no' loop back into the code if no move onto the methods below
        //userfeedback();
        //userReview();
        }

        
    //Called to give user another chance to continue 
    
        public void areYouSure(){
        //Are you sure you want to quit --> yes --> User feedback
        }


    //Called when user is finished

        public void userfeedback(){

        Scanner scanner = new Scanner(System.in);
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
         }


    //Called as option for more personalised feedback -- Gives contacting options etc etc
        
        public void userReview(){

            //Logic for review (If its only used once just delete this and slapp the logic into userFeedback)
         }

    //Called to close out the questionnaire

        public void questionnaireCloseOut(){

        //If you would like to take the test again navigate to (My Github Account)
        //Code saying thanks for your time then closing out your thing
         }


}
