
public class scoreManager {
    
    /*
     * Class to record the scores with getters and setters
     * 
     * The Hash map will store the info --> The integer parameter will be abstracted into the score calculator method
     * which will calculate the score and then youll get to the front ykykykykyk
     * 
     * Deleted the Score calculator class cause its unneccesary --> Just gonna add them together as you dont have the time to do anything too mad
     * 
     */
    private int _score;



    public void set_score(int _score){
        this._score = _score;
    
    } 
    
    public int get_score(){
        return _score;
    }

    public void printScoreRecord(){
        
        if (get_score()> 10){

            //expert
            System.out.println("your score was "+ get_score());
            System.out.println("you did great");
        }
        else{
            System.out.println("Your score was "+get_score()+ " keep trying");
        }
    }
    

}
