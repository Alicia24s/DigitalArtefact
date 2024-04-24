import java.util.Random;


public class OptionOneRandom {

    O1BEG beginnerQuestions = new O1BEG();
    O1INT intermediateQuestions = new O1INT();
    O1ADV advancedQuestions = new O1ADV();

    /*
     *
     * 
     * 5PUT THE ENTIRE QUESTION FROM O1-4(into each case) ++++++
     *
     * 
     * 
     * 
     */

    private Random randomGenerator = new Random();

    public void RandomBeginner(){

        int randNumber = randomGenerator.nextInt(8);
        switch(randNumber) {
            case 1:
                // P

                beginnerQuestions.question1();
                break;
            case 2:
                // call method "b" here
                beginnerQuestions.question2();
                break;
            case 3: 

               beginnerQuestions.question3();
               break;
            case 4: 
              beginnerQuestions.question4();

            case 5: 
              beginnerQuestions.question5();
            
            break;

            case 6:

            beginnerQuestions.question6();

            break; 

            case 7:

            beginnerQuestions.question7();
            
            break;
            default:
                break;
            
    }
}

public void RandomIntermediate(){

    int randNumber = randomGenerator.nextInt(8);
    switch(randNumber) {
        case 1:
            // call method "a" here

            beginnerQuestions.question1();
            break;
        case 2:
            // call method "b" here
            intermediateQuestions.question1();
            break;
        case 3: 

           intermediateQuestions.question3();
           break;
        case 4: 
          intermediateQuestions.question4();

        case 5: 
          intermediateQuestions.question5();
        
        break;

        case 6:

        intermediateQuestions.question6();

        break; 

        case 7:

        intermediateQuestions.question7();
        
        break;
        default:
            break;
        
}
}

public void RandomAdvanced(){

    int randNumber = randomGenerator.nextInt(8);
    switch(randNumber) {
        case 1:
            // call method "a" here

            advancedQuestions.question1();
            break;
        case 2:
            // call method "b" here
            advancedQuestions.question2();
            break;
        case 3: 

           advancedQuestions.question3();
           break;
        case 4: 
          advancedQuestions.question4();

        case 5: 
          advancedQuestions.question5();
        
        break;

        case 6:

        advancedQuestions.question6();

        break; 

        case 7:

        advancedQuestions.question7();
        
        break;
        default:
            break;
        
}
}
}
