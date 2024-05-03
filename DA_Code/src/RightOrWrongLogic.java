/*
This class is the underlying logic of the answer manager class iT IS ONLY COMPLETE FOR OPTION 1 QUESTIONS
*/  

      public class RightOrWrongLogic  {

        
         scoreManager scoreManager = new scoreManager();

              public void rightAnswer(boolean beginner, boolean intermediate, boolean advanced){

                          if (beginner){     
                                //add 1 point to scoreManager using getters and setters

                              scoreManager.set_score(scoreManager.get_score()+1);
                                
                             } 
                                else if(intermediate){
                                  //add 2 points to score manager using getters and setters
                                  
                                scoreManager.set_score(scoreManager.get_score()+2);

                                }
                                    else if(advanced){  
                                    //add 3 points to score manager using getters and setters 

                                      scoreManager.set_score(scoreManager.get_score()+3);
                                      
                                      } 
                }

      }

  