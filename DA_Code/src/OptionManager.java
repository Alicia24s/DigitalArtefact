
import java.util.Scanner;

import Questions.Option1;
import Questions.Option2;
import Questions.Option3;
import Questions.Option4;

/* 
 * see Documentation.md for more in depth notes on this class
 */
   public class OptionManager extends scoreManager{
    
   //Objects for each question category
    Option1 option1 = new Option1();
    Option2 option2 = new Option2();
    Option3 option3 = new Option3();
    Option4 option4 = new Option4();


   Scanner scanner = new Scanner(System.in);

  
   //Sequence for option 1 pathway questions
    public void option1(){
            
            //Counter to make sure the quiz only run for 7 questions
            int counter = 0;       
            //Makes code start at the beginner question
            int difficulty = 1;

            do{

                  switch (difficulty){
                        case 1: //beginner
                     
                        option1.beginner();
                        String answer = scanner.nextLine();
                        String usersAnswer = answer.toLowerCase();
                           
                           //compares user input to the answer to the question
                              if(usersAnswer.equals(option1.getCorrectAnswer())) {   
                                 
                                 //move up in difficulty and stores score for a beginner question
                                    rightAnswer(true, false, false);
                                          difficulty = 2;
                                          
                                    } else{
                                       
                                       //returns wrong answer feedback to the user and keeps difficulty as beginner
                                          wrongAnswer(); 
                                                difficulty = 1;
                                             }
                           
                     
                     counter++;
                     break;

                        case 2: //intermediate
                        
                           option1.intermediate();  
                           String answer2 = scanner.nextLine();
                           String usersAnswer2 = answer2.toLowerCase();

                              //compares user input to the answer to the question
                                    if(usersAnswer2.equals(option1.getCorrectAnswer())) {   

                                       //move up in difficulty and stores score for an intermediate question
                                       rightAnswer(false, true, false);
                                          difficulty = 3;
                                    
                                          } else{

                                             wrongAnswer(); 
                                                difficulty = 1;
                                             }
            
                     counter++;

                     break;
                     
                        case 3:
                        
                        //calls an advanced question
                        option1.advanced();
                        String answer3 = scanner.nextLine();
                        String usersAnswer3 = answer3.toLowerCase();
                              
                              //compares user input to the answer to the question
                                 if(usersAnswer3.equals(option1.getCorrectAnswer())) {   
                                    
                                    //Stays as an advanced question and stores score for an advanced question
                                    rightAnswer(false, false, true);
                                    difficulty = 3;
                                    
                                    }else{
                                       
                                    //moves questions down in difficulty
                                       wrongAnswer();
                                          difficulty = 2;
                                    }
                     
                     counter++;
                     break;

                  }

            }while(counter <8);

            printScoreRecord();
         }

    /*
     * The following 3 methods option2(), option 3(), and option4() follow the same structure as the 
     * method above option4()
     * 
     */


      public void option2(){
                  
         int counter = 0;       
         int difficulty = 1;

            do{

               switch (difficulty){
                     case 1: //beginner
                  
                     option2.beginner();
                     String answer = scanner.nextLine();
                     String usersAnswer = answer.toLowerCase();


                                 if(usersAnswer.equals(option2.getCorrectAnswer())) {   
                              
                                    rightAnswer(true, false, false);
                                       difficulty = 2;
                                       
                                       } else{

                                       wrongAnswer();
                                             difficulty = 1;
                                          }
                  
                  counter++;
                  break;

                     case 2: //intermediate
                     
                        option2.intermediate();  
                        String answer2 = scanner.nextLine();
                        String usersAnswer2 = answer2.toLowerCase();

                                 if(usersAnswer2.equals(option1.getCorrectAnswer())) {   
                              
                                    rightAnswer(false, true, false);
                                       difficulty = 3;
                                       
                                       } else{
                                          
                                       wrongAnswer();
                                          difficulty = 1;
                                          }
                        
                  
                  counter++;

                  break;

                     case 3:

                     option2.advanced();
                     String answer3 = scanner.nextLine();
                     String usersAnswer3 = answer3.toLowerCase();
                           
                              if(usersAnswer3.equals(option2.getCorrectAnswer())) {   
                                 
                                 rightAnswer(false, false, true);
                                 difficulty = 3;
                                 
                                 }else{
                                    
                                    wrongAnswer();
                                       difficulty = 2;
                                 }
                  
                  counter++;
                  break;

            
            
               }
               
         }while(counter <8);

         printScoreRecord();
         }

      public void option3(){
               //same code as the one in option1() but tailored to option 3 
                           
               int counter = 0;       
               int difficulty = 1;

               do{

                  switch (difficulty){
                           case 1: //beginner
                        
                           option3.beginner();
                              String answer = scanner.nextLine();
                              String usersAnswer = answer.toLowerCase();

                                       if(usersAnswer.equals(option3.getCorrectAnswer())) {   
                                    
                                          rightAnswer(true, false, false);
                                          difficulty = 2;
                                          
                                          } else{
                                                   difficulty = 1;
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
                                          difficulty = 3;
                                          
                                          } else{

                                                difficulty = 1;
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
                                       difficulty = 3;
                                       
                                       }else{
                                             
                                          wrongAnswer();
                                          difficulty = 2;
                                       }
                     
                        counter++;
                     break;

                  
                  
                  }

                  scanner.nextLine();

               }while(counter <8);

               printScoreRecord();
            }


      public void option4(){
                     
               int counter = 0;       
               int difficulty = 1;

               do{

                  switch (difficulty){
                           case 1: //beginner
                        
                           option4.beginner();
                           String answer = scanner.nextLine();
                           String usersAnswer = answer.toLowerCase();


                                       if(usersAnswer.equals(option4.getCorrectAnswer())) {   
                                    
                                          rightAnswer(true, false, false);
                                          difficulty = 2;
                                          
                                          } else{

                                             wrongAnswer();
                                                   difficulty = 1;
                                                }
                     
                        counter++;
                        break;

                           case 2: //intermediate
                           
                              option4.intermediate();  
                              String answer2 = scanner.nextLine();
                              String usersAnswer2 = answer2.toLowerCase();

                                       if(usersAnswer2.equals(option4.getCorrectAnswer())) {   
                                    
                                          rightAnswer(false, true, false);
                                          difficulty = 3;
                                          
                                          } else{
                                          
                                             wrongAnswer();
                                                difficulty = 1;
                                                }
                     
                        counter++;

                        break;

                           case 3:

                           option4.advanced();
                           String answer3 = scanner.nextLine();
                           String usersAnswer3 = answer3.toLowerCase();
                              
                                    if(usersAnswer3.equals(option4.getCorrectAnswer())) {   
                                       
                                       rightAnswer(false, false, true);
                                       difficulty = 3;
                                       
                                       }else{
                                          
                                          wrongAnswer();
                                          difficulty = 2;
                                       }
                     
                        counter++;
                     break;

                  }
               
                  scanner.nextLine();

               }while(counter <8);

               printScoreRecord();
            }

}