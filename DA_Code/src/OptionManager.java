import java.util.Scanner;

public class OptionManager {
    
   RightOrWrongLogic rightOrWrongLogic = new RightOrWrongLogic();

    Option1 option1 = new Option1();
    Option2
   Scanner scanner = new Scanner(System.in);
  int counter = 0;

    public void optionSequencial1(){

        String beginnerQuestion = option1.beginner();

        System.out.println(beginnerQuestion);
        
        String usersAnswer = scanner.nextLine();

        if(usersAnswer.equals(option1.getCorrectAnswer())){

            rightOrWrongLogic.rightAnswer(1, true, false, false);
        } else {
            rightOrWrongLogic.wrongAnswer(1, false, false, false);
        }

       //Call thing that shows results/score
    }

    

}