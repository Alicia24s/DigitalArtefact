import java.util.HashMap;

public class scoreManager {
    
    /*
     * Class to record the scores with getters and setters
     * 
     * The Hash map will store the info --> The integer parameter will be abstracted into the score calcu
     * 
     */



    private HashMap<String, Integer> scoreRecord;

     public void setScoreRecord(HashMap<String, Integer> scoreRecord){

        this.scoreRecord =scoreRecord;
     }


     public HashMap<String, Integer> scoreRecord(){

     return this.scoreRecord;

     }


    public void printScoreRecord(){
         //Prints the values from the hashmap in full so the user knows which questions they got right
    }


}
