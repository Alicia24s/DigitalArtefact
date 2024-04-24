import java.util.Random;

;public class Option1 extends Option {
    /*
     * What will I do for answers a b c and d
     * 
     */
 // mAKe a random number from 1 to 8 andd then put it into the switch statement 

 private Random randomGenerator = new Random();

    public void beginnerQuestions(){

        
        int randNumber = randomGenerator.nextInt(8);

          switch (randNumber) {
            case 1:

            //Question 1

            System.out.println("What is compound interest?\r\n" + //
            "\r\n" + //
            " A) Interest calculated only on the principal amount \r\n" + //
            "\r\n" + //
            "B) Interest calculated on the initial principal and also on the accumulated interest from previous periods\r\n" + //
            "\r\n" + //
            " C) Interest calculated at a fixed rate annually \r\n" + //
            "\r\n" + //
            "D) Interest calculated only on the accumulated interest\r\n" + //
            "\r\n");

            //Answer is B
                
                break;
            case 2:

            

            break;

            case 3:

            break;

            case 4:

            break;

            case 5:

            break;

            case 6:

            break;

            case 7:
            
            break;
          
            default:
                break;
          }
    }

    public void intermediateQuestions(){

        int randNumber = randomGenerator.nextInt(8);

        switch (randNumber) {
            case 1:

            //Question 1
                
                break;
            case 2:

            break;

            case 3:

            break;

            case 4:

            break;

            case 5:

            break;

            case 6:

            break;

            case 7:
            
            break;
          
            default:
                break;
          }

    }
    
    public void advancedManager(){

        int randNumber = randomGenerator.nextInt(8);

        switch (randNumber) {
            case 1:

            //Question 1
                
                break;
            case 2:

            break;

            case 3:

            break;

            case 4:

            break;

            case 5:

            break;

            case 6:

            break;

            case 7:
            
            break;
          
            default:
                break;
          }

    }

    
    
}
