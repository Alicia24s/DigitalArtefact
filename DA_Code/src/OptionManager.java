import java.util.Scanner;

public class OptionManager {
    
   RightOrWrongLogic rightOrWrongLogic = new RightOrWrongLogic();
   AnswerManager answerManager = new AnswerManager();

    Option1 option1 = new Option1();
    Option2 option2 = new Option2();
    Option3 option3 = new Option3();
    Option4 option4 = new Option4();


   Scanner scanner = new Scanner(System.in);
  
   int counter = 0;

    public void optionSequencial1(){

        while(counter < 8){
            String beginnerQuestion = option1.beginner();
            String intermediateQuestion = option1.intermediate();
            String advancedQuestion = option1.advanced();

            Object questions[] = {}
    
            System.out.println(beginnerQuestion);
    
            String usersAnswer = scanner.nextLine();
            
            answerManager.Answer(1, usersAnswer, usersAnswer, false, false, false);

            if(right){
                st
            }

            String usersAnswer2 = scanner.nextLine();

            answerManager.Answer(1, usersAnswer, usersAnswer2, false, false, false);

            counter++;

        }

    

       //Call thing that shows results/score
    }

    

}