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
        
        
        //Called to send the user down their chosen pathway
        public void optionPathways(int option){
            
            switch(option){

                case 1: 
                //Basic Financial Concepts assessment
                System.out.println("You have chosen option" + option + ": Basic financial concepts");
                QuestionnaireOverview();
                optionManager.option1();

                break;

                case 2:
                    
                //Investment and portfolio assessment
                System.out.println("You have chosen option" + option + ": Investment and Portfolio");
                QuestionnaireOverview();
                optionManager.option2();
                break;

                case 3:

                //Financial Literacy assessment
                System.out.println("You have chosen option" + option + ": Financial literacy");
                QuestionnaireOverview();
                optionManager.option3();

                break;

                case 4:

                // Corporate finance questions
                System.out.println("You have chosen option" + option + ": Corporate finance");
                QuestionnaireOverview();
                optionManager.option4();

                break;
        
            }
        
        }
    }