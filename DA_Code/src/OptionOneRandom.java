import java.util.Random;


public class OptionOneRandom {

    O1BEG beginnerQuestions = new O1BEG();
    O1INT intermediateQuestions = new O1INT();
    O1ADV advancedQuestions = new O1ADV();

    /*
     *How in Jesus name will you stop running this code forever??? It loops perfectly
     * 
     */

    private Random randomGenerator = new Random();

    public void RandomBeginner(){

        int randNumber = randomGenerator.nextInt(8);
        switch(randNumber) {
            case 1:
                // call method "a" here

                beginnerQuestions.question1(null);
                break;
            case 2:
                // call method "b" here
                beginnerQuestions.question2(null);
                break;
            case 3: 

               beginnerQuestions.question3(null);
               break;
            case 4: 
              beginnerQuestions.question4(null);

            case 5: 
              beginnerQuestions.question5(null);
            
            break;

            case 6:

            beginnerQuestions.question6(null);

            break; 

            case 7:

            beginnerQuestions.question7(null);
            
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

            beginnerQuestions.question1(null);
            break;
        case 2:
            // call method "b" here
            intermediateQuestions.question1(null);
            break;
        case 3: 

           intermediateQuestions.question3(null);
           break;
        case 4: 
          intermediateQuestions.question4(null);

        case 5: 
          intermediateQuestions.question5(null);
        
        break;

        case 6:

        intermediateQuestions.question6(null);

        break; 

        case 7:

        intermediateQuestions.question7(null);
        
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

            advancedQuestions.question1(null);
            break;
        case 2:
            // call method "b" here
            advancedQuestions.question2(null);
            break;
        case 3: 

           advancedQuestions.question3(null);
           break;
        case 4: 
          advancedQuestions.question4(null);

        case 5: 
          advancedQuestions.question5(null);
        
        break;

        case 6:

        advancedQuestions.question6(null);

        break; 

        case 7:

        advancedQuestions.question7(null);
        
        break;
        default:
            break;
        
}
}
}
