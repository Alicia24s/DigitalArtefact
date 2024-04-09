
 /*
     * This is the logic for whether A users selection from the choices A-B is correct and what will happen
     * 
     * The parameters in each method will distinguish between each option pathway and the correct question switch so
     * that options don't crossover
     * 
     */

public class AnswerManager {

    public void rightAnswer(){
        //Put embedded switch statements that you've got repeated into here for right answers
    }

    public void wrongAnswer(){
       //Put embeded switch statements that you've got repeated into here for wrong answers
    }


    public void AnswerA(int option, String answer, boolean beginner, boolean intermediate, boolean advanced ){

        //put a do while loop around this so that if they say anything mad it goes to default in the switch statement and repeats the q
    switch (answer.toLowerCase()) {
    
    case "a":
    
    /*(Make into a method and call it in here)
    
     * If boolean beginner is true - Switch to intermediate q for that option - Add 1 point to users point in scoreManager.java 
     * 
     * Collectivise the following statements into one:
     * If boolean intermediate is true - Switch to an advanced question - Add 3 points to scoreManager.java
     * If boolean Advanced is true - Keep to Advanced question - Add 5 points to scoreManager.java
     * 
     * Use getters and setters for the score manager stuff
     */

     //get following if statement into a function rn
    switch(option){
        case 1:
                    if (beginner){
                    //call an advanced option 1 q 
                    //add 1 point to scoreManager
                    }
                
                    else if(intermediate){
                    //call an advanced option 1 q
                    //add 2 points to score manager
                     }
                     else if(advanced){
                    //call an intermediate option 1 q
                    //add 3 points to score manager
                     }
    
                 break;

        case 2:
        
        if (beginner){
            //call an advanced option 2 q 
            //add 1 point to scoreManager
            }
        
            else if(intermediate){
            //call an advanced option 2 q
            //add 2 points to score manager
             }
             else if(advanced){
            //call an intermediate option 2 q
            //add 3 points to score manager
             }
            


        break;

        case 3:
        if (beginner){
            //call an advanced option 3 q 
            //add 1 point to scoreManager
            }
        
            else if(intermediate){
            //call an advanced option 3 q
            //add 2 points to score manager
             }
             else if(advanced){
            //call an intermediate option 3 q
            //add 3 points to score manager
             }

        break;

        case 4:

        if (beginner){
            //call an advanced option 4 q 
            //add 1 point to scoreManager
            }
        
            else if(intermediate){
            //call an advanced option 4 q
            //add 2 points to score manager
             }
             else if(advanced){
            //call an intermediate option 4 q
            //add 3 points to score manager
             }

        break;
    }
   







    break;
    
    case "d":
    case "b":
    case "c":
    /*
     * Switch statement through int option:
     * 
     * Collectivise the following 2 switch Statement cases:
     * If boolean beginner: call method from Beginner.java for that int option (whether its option 1-4)that randomises the questions
     * If boolean intermediate: call method...(Same as above)
     * 
     * 
     * 
     * Call a randomQuestion method from 
     * 
     */
    
      break;
    
    default:
      //rejection class call from there
          break;  
    }
    }

public void AnswerB(int option, String answer, boolean beginner, boolean intermediate, boolean advanced ){

    //put a do while loop around this so that if they say anything mad it goes to default in the switch statement and repeats the q
    switch (answer.toLowerCase()) {

case "b":

/*(Make into a method and call it in here)

 * If boolean beginner is true - Switch to intermediate q for that option - Add 1 point to users point in scoreManager.java 
 * 
 * Collectivise the following statements into one:
 * If boolean intermediate is true - Switch to an advanced question - Add 3 points to scoreManager.java
 * If boolean Advanced is true - Keep to Advanced question - Add 5 points to scoreManager.java
 * 
 * Use getters and setters for the score manager stuff
 */

break;

case "a":
case "d":
case "c":
/*
 * Switch statement through int option:
 * 
 * Collectivise the following 2 switch Statement cases:
 * If boolean beginner: call method from Beginner.java for that int option (whether its option 1-4)that randomises the questions
 * If boolean intermediate: call method...(Same as above)
 * 
 * 
 * 
 * Call a randomQuestion method from 
 * 
 */

  break;

default:
  //rejection class call from there
      break;  
}
}

public void AnswerC(int option, String answer, boolean beginner, boolean intermediate, boolean advanced ){

    //put a do while loop around this so that if they say anything mad it goes to default in the switch statement and repeats the q
    switch (answer.toLowerCase()) {

case "c":

/*(Make into a method and call it in here)

 * If boolean beginner is true - Switch to intermediate q for that option - Add 1 point to users point in scoreManager.java 
 * 
 * Collectivise the following statements into one:
 * If boolean intermediate is true - Switch to an advanced question - Add 3 points to scoreManager.java
 * If boolean Advanced is true - Keep to Advanced question - Add 5 points to scoreManager.java
 * 
 * Use getters and setters for the score manager stuff
 */

break;

case "a":
case "b":
case "d":
/*
 * Switch statement through int option:
 * 
 * Collectivise the following 2 switch Statement cases:
 * If boolean beginner: call method from Beginner.java for that int option (whether its option 1-4)that randomises the questions
 * If boolean intermediate: call method...(Same as above)
 * 
 * 
 * 
 * Call a randomQuestion method from 
 * 
 */

  break;

default:
  //rejection class call from there
      break;  
}
}

public void AnswerD(int option, String answer, boolean beginner, boolean intermediate, boolean advanced ){

    //put a do while loop around this so that if they say anything mad it goes to default in the switch statement and repeats the q
    switch (answer.toLowerCase()) {

case "d":

/*(Make into a method and call it in here)

 * If boolean beginner is true - Switch to intermediate q for that option - Add 1 point to users point in scoreManager.java 
 * 
 * Collectivise the following statements into one:
 * If boolean intermediate is true - Switch to an advanced question - Add 3 points to scoreManager.java
 * If boolean Advanced is true - Keep to Advanced question - Add 5 points to scoreManager.java
 * 
 * Use getters and setters for the score manager stuff
 */

break;

case "a":
case "b":
case "c":
/*
 * Switch statement through int option:
 * 
 * Collectivise the following 2 switch Statement cases:
 * If boolean beginner: call method from Beginner.java for that int option (whether its option 1-4)that randomises the questions
 * If boolean intermediate: call method...(Same as above)
 * 
 * 
 * 
 * Call a randomQuestion method from 
 * 
 */

  break;

default:
  //rejection class call from there
      break;  
}
}

}
