
public class App{
    public static void main(String[] args) throws Exception {

        //Runs entire program
        System.out.println("\r\n Welcome to Digital artifact: Financial assessment\r\n" + //
                            "\r\n" + //
                            "You will decide a financial topic pathway, take a quick questionnaire that goes up and down in difficulty depending \r\n" + //
                            "on how well you do and at the end you'll get a score and a chance to go again\r\n" + //
                            "\r\n" + //
                            "Please enter your details below:");
                
        DigitalArtifact digitalArtifact = new DigitalArtifact();
            digitalArtifact.questionnaire();
                 
    }
}
