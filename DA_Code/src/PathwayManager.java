/*Overview of this class is in Documentation.md
 * 
 */

public class PathwayManager {

        // Object for the class that controls the assessments and their logic
        OptionManager optionManager = new OptionManager();

        public void QuestionnaireOverview(){

                System.out.println("\r\nThis assessment will score you on your financial knowledge in your chosen topic\r\n" + //
                                "\r\n" + //
                                "The questions range between beginner, intermediate, and advanced.\r\n" + //
                                "\r\n" + //
                                "The questions will increase and decrease in difficulty dependant on  correct and incorrect answers\r\n" + //
                                "It is multiple choice (A-D)");

                
                System.out.println("Time: Unlimited");
                System.out.println("Questions: 10\r\n");

            }
        
        
        //Basic Financial Concepts assessment
        public void option1(int option){
            
                System.out.println("You have chosen option" + option + ": Basic financial concepts");
                QuestionnaireOverview();
                optionManager.option1();
        
            }
        
        //Investment and Portfolio Assessment
        public void option2(int option){
                
                System.out.println("You have chosen option" + option + ": Investment and Portfolio");
                QuestionnaireOverview();
                optionManager.option2();

            }

        //Financial Literacy Assessment
        public void option3(int option){

                System.out.println("You have chosen option" + option + ": Financial literacy");
                QuestionnaireOverview();
                optionManager.option3();   

            }

        //Corporate finance Assessment
        public void option4(int option){
                
                System.out.println("You have chosen option" + option + ": Corporate finance");
                QuestionnaireOverview();
                optionManager.option4();
            
            }

}