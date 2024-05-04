
import java.util.Scanner;

import Questions.Option1;
import Questions.Option2;
import Questions.Option3;
import Questions.Option4;

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
 * you could simplify this all down into one method but theres no time so leave it alone
 */
public class OptionManager extends scoreManager{
    
   //Questions for each option
    Option1 option1 = new Option1();
    Option2 option2 = new Option2();
    Option3 option3 = new Option3();
    Option4 option4 = new Option4();


   Scanner scanner = new Scanner(System.in);

   //Counter to make sure the quiz only run for 7 questions
  
   //Sequence for option 1 pathway questions
    public void option1(){
      
        int counter = 0;       
        int number = 1;

        do{

            switch (number){
                   case 1: //beginner
                 
                    option1.beginner();
                    String answer = scanner.nextLine();
                    String usersAnswer = answer.toLowerCase();
                     

                        if(usersAnswer.equals(option1.getCorrectAnswer())) {   
                            
                               rightAnswer(true, false, false);
                                    number = 2;
                                    
                                } else{
                                      
                                    wrongAnswer(); 
                                            number = 1;
                                        }
                     
               
                counter++;
                break;

                   case 2: //intermediate
                   
                      option1.intermediate();  
                      String answer2 = scanner.nextLine();
                      String usersAnswer2 = answer2.toLowerCase();

                                if(usersAnswer2.equals(option1.getCorrectAnswer())) {   
                                   rightAnswer(false, true, false);
                                    number = 3;
                                
                                    } else{

                                       wrongAnswer(); 
                                          number = 1;
                                        }
        
                counter++;

                break;
                
                   case 3:

                   option1.advanced();
                   String answer3 = scanner.nextLine();
                   String usersAnswer3 = answer3.toLowerCase();
                        
                            if(usersAnswer3.equals(option1.getCorrectAnswer())) {   
                                
                               rightAnswer(false, false, true);
                                number = 3;
                                
                                }else{
                                     
                                  wrongAnswer();
                                    number = 2;
                                }
               
                counter++;
               break;

            }

        }while(counter <8);

       printScoreRecord();
    }



public void option2(){
  //same code as the one in option1() but tailor to option 2
               
  int counter = 0;       
  int number = 1;

  do{

      switch (number){
             case 1: //beginner
           
            option2.beginner();
              String answer = scanner.nextLine();
              String usersAnswer = answer.toLowerCase();


                          if(usersAnswer.equals(option2.getCorrectAnswer())) {   
                      
                             rightAnswer(true, false, false);
                              number = 2;
                              
                              } else{

                               wrongAnswer();
                                      number = 1;
                                  }
         
          counter++;
          break;

             case 2: //intermediate
             
                option2.intermediate();  
                String answer2 = scanner.nextLine();
                String usersAnswer2 = answer2.toLowerCase();

                          if(usersAnswer2.equals(option1.getCorrectAnswer())) {   
                      
                             rightAnswer(false, true, false);
                              number = 3;
                              
                              } else{
                                 
                               wrongAnswer();
                                  number = 1;
                                  }
                
         
          counter++;

          break;

             case 3:

             option2.advanced();
             String answer3 = scanner.nextLine();
             String usersAnswer3 = answer3.toLowerCase();
                  
                      if(usersAnswer3.equals(option2.getCorrectAnswer())) {   
                          
                         rightAnswer(false, false, true);
                          number = 3;
                          
                          }else{
                             
                           wrongAnswer();
                              number = 2;
                          }
         
          counter++;
         break;

    
     
      }
      
  }while(counter <8);

 printScoreRecord();
}

public void option3(){
    //same code as the one in option1() but tailor to option 
                 
    int counter = 0;       
    int number = 1;

    do{

        switch (number){
               case 1: //beginner
             
                option3.beginner();
                    String answer = scanner.nextLine();
                    String usersAnswer = answer.toLowerCase();

                            if(usersAnswer.equals(option3.getCorrectAnswer())) {   
                        
                               rightAnswer(true, false, false);
                                number = 2;
                                
                                } else{
                                        number = 1;
                                       wrongAnswer();
                                    }
       
            counter++;
            break;

               case 2: //intermediate
               
                  option3.intermediate();  
                    String answer2 = scanner.nextLine();
                    String usersAnswer2 = answer2.toLowerCase();

                            if(usersAnswer2.equals(option3.getCorrectAnswer())) {   
                        
                               rightAnswer(false, true, false);
                                number = 3;
                                
                                } else{

                                    number = 1;
                                   wrongAnswer();
                                    }
           
            counter++;

            break;

               case 3:

               option3.advanced();
               String answer3 = scanner.nextLine();
               String usersAnswer3 = answer3.toLowerCase();
                    
                        if(usersAnswer3.equals(option3.getCorrectAnswer())) {   
                            
                           rightAnswer(false, false, true);
                            number = 3;
                            
                            }else{
                                 
                               wrongAnswer();
                                number = 2;
                            }
           
            counter++;
           break;

      
       
        }

        scanner.nextLine();

    }while(counter <8);

   printScoreRecord();
}

public void option4(){
    //same code as the one in option1() but tailor to option 4
                 
    int counter = 0;       
    int number = 1;

    do{

        switch (number){
               case 1: //beginner
             
                option4.beginner();
                String answer = scanner.nextLine();
                String usersAnswer = answer.toLowerCase();


                            if(usersAnswer.equals(option4.getCorrectAnswer())) {   
                        
                               rightAnswer(true, false, false);
                                number = 2;
                                
                                } else{

                                   wrongAnswer();
                                        number = 1;
                                    }
           
            counter++;
            break;

               case 2: //intermediate
               
                  option4.intermediate();  
                  String answer2 = scanner.nextLine();
                  String usersAnswer2 = answer2.toLowerCase();

                            if(usersAnswer2.equals(option4.getCorrectAnswer())) {   
                        
                               rightAnswer(false, true, false);
                                number = 3;
                                
                                } else{
                                
                                   wrongAnswer();
                                    number = 1;
                                    }
           
            counter++;

            break;

               case 3:

               option4.advanced();
               String answer3 = scanner.nextLine();
               String usersAnswer3 = answer3.toLowerCase();
                    
                        if(usersAnswer3.equals(option4.getCorrectAnswer())) {   
                            
                           rightAnswer(false, false, true);
                            number = 3;
                            
                            }else{
                               
                              wrongAnswer();
                                number = 2;
                            }
           
            counter++;
           break;

        }
     
        scanner.nextLine();

    }while(counter <8);

   printScoreRecord();
}



}