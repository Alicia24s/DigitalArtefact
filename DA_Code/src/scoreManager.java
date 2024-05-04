
public class scoreManager {

    private int score;

    public void set_score(int score){
        this.score = score;
    
    } 
    
    public int get_score(){
        return score;
    }

    public void printScoreRecord(){
        
        System.out.println("your final score was: " + get_score());

        if(get_score()>= 20){
            System.out.println("you did great what a financial whiz you are!");
        }
        else if(19 >= get_score() && get_score()>= 9){
            System.out.println("you did average theres room to grow");
        }
        else{
            System.out.println("There is room to grow");
        }
    }
    
    public void rightAnswer(boolean beginner, boolean intermediate, boolean advanced){

        if (beginner){     
              //add 1 point to scoreManager using getters and setters

            set_score(get_score()+1);
            System.out.println("Correct you have scored 1 point");
              
           } 
              else if(intermediate){
                //add 2 points to score manager using getters and setters
                
              set_score(get_score()+2);
              System.out.println("Correct you have scored 2 points");

              }
                  else if(advanced){  
                  //add 3 points to score manager using getters and setters 

                    set_score(get_score()+3);
                    System.out.println("Correct you have scored 3 points");
                    
                    } 
    }

    public void wrongAnswer(){
        System.out.println("wrong better luck next time");
    }

}
