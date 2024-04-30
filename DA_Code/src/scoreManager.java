import java.util.ArrayList;

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
    ArrayList<Integer> scoreRecord = new ArrayList<Integer>();


    public void set_score(int _score){
        this._score = _score;
        manageScores(); 
    } 
    
    public void manageScores(){

    scoreRecord.add(get_score());

    }
    
    public int get_score(){
        return _score;
    }

    public void printScoreRecord(){

         System.out.println("Question 1:" + scoreRecord.get(0));
         System.out.println("Question 2:" + scoreRecord.get(1));
         System.out.println("Question 3:" + scoreRecord.get(2));
         System.out.println("Question 4:" + scoreRecord.get(3));
         System.out.println("Question 5:" + scoreRecord.get(4));
         System.out.println("Question 6:" + scoreRecord.get(5));
         System.out.println("Question 7:" + scoreRecord.get(6));

         
    }


}
