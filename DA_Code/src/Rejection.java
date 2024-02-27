import java.util.Scanner;

//This is a Class that holds methods for users rejections
//UserRejections: Cases in which the user says no or submits an answer that is out of context
//Challenge: Create a way to take word in
//Needed in the case that the user's answers are not what I want them to be
public class Rejection {

        public void unexpectedAnswer(){

        System.out.println(null);
        //UnexectedAnswer? Sorry I DONT UNDERSTAND try again please - Continue code
        //It happens again? Prompt 'pLEASE TRYAGAIN'
        //areYouSure? if 'not no' loop back into the code if no move onto the methods below
        //userfeedback();
        //userReview();
        }

        
    //Called to give user another chance to continue 
      //- Used in main java for people that do not want to take the quiz initially
     // - Used in unexpectedAnswer() for the people who give terrible answers
    */
        public void areYouSure(){
        //Are you sure you want to quit --> yes
        }

    //Call this if user does not want to move forward
        public void userfeedback(){

        Scanner scanner = new Scanner(System.in);
        //Method Asking if user would give feedback
        /*Questions
         * 1. Good or bad experience
         */
        //if yes print users feedback qs 1-5 least to most likely
        //completed? userReview();
         

    }

    //Called if the user left the questionnaire early --> Execute after are you sure
    public void unfinishedFeeback(){

    }

    public void questionnaireCloseOut(){

        //If you would like to take the test again navigate to (My Github Account)
        //Code saying thanks for your time then closing out your thing
    }


}
