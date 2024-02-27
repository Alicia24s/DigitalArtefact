import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //Objects for game logic and Object to combat user 'breaking' the code 
        DigitalArtifactLogic DigitalArtifact = new DigitalArtifactLogic();
        Rejection UnexpectedInput = new Rejection();

        //Beginning decision 
        System.out.println("Are you ready to learn how to invest? (yes/no))");
        Scanner usersDecision = new Scanner(System.in);

        String x = "yes";

    
             if (usersDecision.equals(x)){

                //Method that takes the questionnaire forward
                        DigitalArtifact.questionnaire();
                        UnexpectedInput.userfeedback();

                    }
                else{

                //Method getting feedback in order to improve
                    UnexpectedInput.userfeedback();

                 }
    
        usersDecision.close();
    }
}
