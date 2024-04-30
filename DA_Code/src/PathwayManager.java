import java.util.Scanner;


public class PathwayManager {

    OptionManager optionManager = new OptionManager();
    scoreManager scoreManager = new scoreManager();

    Scanner scanner = new Scanner(System.in);
    public void QuestionnaireOverview(){

        System.out.println("This assessment will score you on your financial knowledge in your chosen topic\r\n" + //
                        "\r\n" + //
                        "The questions range between beginner, intermediate, and advanced.\r\n" + //
                        "\r\n" + //
                        "The questions will increase and decrease in difficulty dependant on  correct and incorrect answers\r\n" + //
                        "It is multiple choice (A-B)");

        //if you make it to making it a GUI change this and have a counter
        System.out.println("Time: Unlimited");
        System.out.println("Questions: 10\r\n");
        System.out.println("");
    }

    //Option pathways 
    public void option1(int option){
        
        //Basic Financial Concepts
        System.out.println("You have chosen option" + option );
        QuestionnaireOverview();
        optionManager.option1();

         //Call score display
        scoreManager.printScoreRecord();

    }
        
    public void option2(int option){

        //Investment and Portfolio Assessment

        System.out.println("You have chosen option" + option);
        QuestionnaireOverview();
        optionManager.option2();
         //Call score display
         scoreManager.printScoreRecord();

    }

    public void option3(int option){

        //Financial Literacy Assessment

        System.out.println("You have chosen option 3");
        QuestionnaireOverview();
        optionManager.option3();
         //Call score display
         scoreManager.printScoreRecord();

    }
    
    public void option4(int option){
        
        //Corporate finance Assessment

        System.out.println("You have chosen option 4");
        QuestionnaireOverview();
        optionManager.option4();
         //Call score display
         scoreManager.printScoreRecord();

    }

}