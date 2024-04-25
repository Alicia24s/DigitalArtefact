/*
This class is the underlying logic of the answer manager class iT IS ONLY COMPLETE FOR OPTION 1 QUESTIONS
*/


public class RightOrWrongLogic  {

  Option1 option1 = new Option1();

    public void rightAnswer(int option, boolean beginner, boolean intermediate, boolean advanced){

        switch(option){
       
            case 1:
                    if (beginner){

      
                    option1.intermediate();
                        
                    //add 1 point to scoreManager using getters and setters
                    
                    //add a switch statement for the rest of the classes
                    }
                    else if(intermediate){
                    //call an advanced option 1 q (Need to randomise methods first)

                    option1.advanced();

                    //add 2 points to score manager using getters and setters

                    //repeat throughout the other cases
                     }
                     else if(advanced){
                    //call an advanced option 1 q (Need to randomise mehods first)

                     option1.intermediate();
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
          
                  option1.beginner();
                }else if(advanced){
                
                  option1.intermediate();
                
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