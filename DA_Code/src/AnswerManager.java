
 /*
     * This is the logic for whether A users selection from the choices A-B is correct and what will happen next according to that in terms
     * of whether or not the users question level will move up or down
     * 
     * The parameters in each method will distinguish between each option pathway and the correct question switch so
     * that options don't crossover
     * 
     */

public class AnswerManager {

    //Objects
    AnswerRightOrWrongLogic rightOrWrongLogic;
    int answerCounter;

    public AnswerManager(){
        rightOrWrongLogic = new AnswerRightOrWrongLogic();
    }

public void Answer(int option, String answer, String usersAnswer, boolean beginner, boolean intermediate, boolean advanced ){
    
    if (answer.equals(usersAnswer.toLowerCase())){

    rightOrWrongLogic.rightAnswer(option, beginner, intermediate, advanced);

    }
       else{
         rightOrWrongLogic.wrongAnswer(option, beginner, intermediate, advanced);
        
        }


        answerCounter++;
}
}