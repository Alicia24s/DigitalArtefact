import java.util.Scanner;

public class App extends TestLogic {
    public static void main(String[] args) throws Exception {
 
        //Questionnaire Logic Object
        TestLogic DigitalArtifact = new TestLogic();


        Rejection UnexpectedInput = new Rejection();

        //Start of questionnaire (pUT THIS INTO TEST LOGIC INTO A NEW FUNCTION THEN CALL IT)
        System.out.println("Are you ready to assess your financial literacy (yes/no))");

        Scanner scanner = new Scanner(System.in);
        String usersDecision = scanner.nextLine();
        String x = "yes";

    
             if (usersDecision.equals(x)){

                //Method that takes the questionnaire forward
                        DigitalArtifact.questionnaire();


                        UnexpectedInput.userfeedback();

                    }
                else{

                //Method getting feedback in order to improve UX
                    UnexpectedInput.userfeedback();

                 }

        System.out.println("Thank You!");
        
        //Print out users scores along with the date
    
        scanner.close();
    }
}
