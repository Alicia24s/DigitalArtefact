import java.util.Scanner;
/* Stuff to do
 *
 *  Fix the sequence because if you get the advanced question wrong you would do an intermediate question until
 * you get it right and move back up meaning it wouldn't drop to beginner after getting it wrong
 * 
 * 
 * but this is now your bottom priority cause theres other parts of the code to get more marks on 
 * so mention how you messed this part up in your report as a way to improve
 * 
 * Also find out how you can reuse the same option sequencial class for the entire code or use change it before submitting report and 
 * put it as an improvement
 * 
 * maybe you can put a switch statement with the do while loops which outputs a number and that number determines whether youre up or down
 * 1 = beginner 2= intermediate 3= advanced
 *
 */

public class OptionManager {
    
   RightOrWrongLogic rightOrWrongLogic = new RightOrWrongLogic();

    Option1 option1 = new Option1();
    Option2 option2 = new Option2();
    Option3 option3 = new Option3();
    Option4 option4 = new Option4();


   Scanner scanner = new Scanner(System.in);

   //Counter to make sure the quiz only run for 7 questions
   int counter = 0;
  
   
   boolean right;

   //Sequence for option 1 pathway questions

   
    public void option1(){
      
        int number = 1;

        while (counter <8){

            String beginnerQuestion = option1.beginner();
            String intermediateQuestion = option1.intermediate();
            String advancedQuestion = option1.advanced();

           

            switch (number){
                   case 1: //beginner

                       do{
                            System.out.println(beginnerQuestion);

                             String usersAnswer = scanner.nextLine();

                             if(usersAnswer.equals(option1.result)) {   
                       
                            rightOrWrongLogic.rightAnswer(true, false, false);
                            right = true;
                            number = 2;
                             
                        } else{

                            rightOrWrongLogic.wrongAnswer(true, false, false);
                            number = 1;
                        }
               
                counter++;
             
            }while(!right);

                   break;

                   case 2: //intermediate

                    do{
                            System.out.println(intermediateQuestion);

                             String usersAnswer = scanner.nextLine();

                             if(usersAnswer.equals(option1.result)) {   
                       
                            rightOrWrongLogic.rightAnswer(false, true, false);
                            right = true;
                            number = 3;
                             
                        } else{
                            
                            rightOrWrongLogic.wrongAnswer(false, true, false);
                            number = 1;
                        }
               
                counter++;
             
            }while(!right);

                   break;

                   case 3:

                   do{
                            System.out.println(advancedQuestion);

                             String usersAnswer = scanner.nextLine();

                             if(usersAnswer.equals(option1.result)) {   
                       
                            rightOrWrongLogic.rightAnswer(false, false, true);
                            right = true;
                            number = 3;
                             
                        }else{
                            
                            rightOrWrongLogic.wrongAnswer(false, false, true);
                            number = 2;
                        }
               
                counter++;
             
            }while(!right);

                   break;

          
           
            }

            right = false;

    }

}


public void option2(){
  //same code as the one in option1() but tailor to option 2
}

public void option3(){
    //same code as the one in option1() but tailor to option 2

}

public void option4(){
    //same code as the one in option1() but tailor to option 2

}


}