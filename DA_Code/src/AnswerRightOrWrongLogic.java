public class AnswerRightOrWrongLogic {

    O1BEG option1 = new O1BEG();
    OptionOneRandom randomOptionOne = new OptionOneRandom();

    public void rightAnswer(int option, boolean beginner, boolean intermediate, boolean advanced){

        switch(option){
       
            case 1:
                    if (beginner){

                    //call an intermediate option 1 q (Need to rendomise the methods first)
                    
                    randomOptionOne.RandomIntermediate();
                        
                    //add 1 point to scoreManager using getters and setters
                    
                    //add a switch statement for the rest of the classes
                    }
                    else if(intermediate){
                    //call an advanced option 1 q (Need to randomise methods first)

                    randomOptionOne.RandomAdvanced();

                    //add 2 points to score manager using getters and setters

                    //repeat throughout the other cases
                     }
                     else if(advanced){
                    //call an advanced option 1 q (Need to randomise mehods first)

                    randomOptionOne.RandomIntermediate();
                    //add 3 points to score manager using getters and setters
                    //repeat throughout the other cases
                     }
    
                 break;

           case 2:
        
                 if (beginner){
       
                 }
        
            else if(intermediate){
            
             }
               
               else if(advanced){
               }
            
        break;

        case 3:
        if (beginner){
            
            }
        
            else if(intermediate){
            
              }
               else if(advanced){
            
                }

        break;

        case 4:

            if (beginner){
               }
        
               else if(intermediate){
                 }
             
                 else if(advanced){
                  }

        break;
       
    }

    }


public void wrongAnswer(int option, boolean beginner, boolean intermediate, boolean advanced){

    switch(option){
    case 1:
                if (beginner || intermediate){
                //call an beginner option 1 q (Need to rendomise the methods first)
                  randomOptionOne.RandomBeginner();
                }else if(advanced){
                //call an beginner option 1 q (Need to randomise mehods first)
                  randomOptionOne.RandomIntermediate();
                //repeat throughout the other cases
                 }

             break;

    case 2:
    
    if (beginner){
   
        }
    
        else if(intermediate){
        
         }
           
           else if(advanced){
           }
        
    break;

    case 3:
    if (beginner){
        
        }
    
        else if(intermediate){
        
          }
           else if(advanced){
        
            }

    break;

    case 4:

        if (beginner){
           }
    
           else if(intermediate){
             }
         
             else if(advanced){
              }

    break;
   
}

}}