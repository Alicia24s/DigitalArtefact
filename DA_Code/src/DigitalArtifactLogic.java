import java.util.Scanner;

    //Lab 1 & 2
    public class DigitalArtifactLogic{


         public void questionnaire(){

            Scanner scanner = new Scanner(System.in);

            System.out.println("FirstName?");
                String firstname = scanner.nextLine();

            System.out.println("Surname?");
                 String surname = scanner.nextLine();

            System.out.println("Place of work?");
                 String workplace = scanner.nextLine();

            System.out.println("How many years?");
                int years = scanner.nextInt();


                int yearsTillRetirement = 65 - years;


            System.out.println("Ok, All information has been gathered ");
            System.out.println("Welcome to the programme \n" + firstname + surname );  
            System.out.println("Congratulations on working for " + workplace +" for " + years + " years");
            System.out.println("Now lets Begin");

 

        //Lab 3 & Lab 4
        boolean finished;

        //Lab 5 - changing the context --> Below I have called from another class to do my Option selection
        OptionSelection options = new OptionSelection();


        do{

            System.out.println("Please select (1-4)");
            System.out.println("Option 1: Inexperienced");
            System.out.println("Option 2: Novice");
            System.out.println("Option 3: Intermediate");
            System.out.println("Option 4: Expert");
            

            int numberSelection = scanner.nextInt();
            scanner.nextLine();

                switch(numberSelection){

                    case 1:
                        options.option1();
                        break;

                    case 2:
                        options.option2();
                        break;
                        
                    case 3:
                        options.option3();
                        break;

                    case 4:
                        options.option4();
                        break;

                    default:
                        System.out.println(numberSelection + "is not a valid choice");
                    }

                        
                    System.out.println("Do you want to re-evslusteste your score (yes/no)");
                         String userContinuation = scanner.nextLine();  

                    finished = userContinuation.equalsIgnoreCase("no");


            }while(!finished);

 
        System.out.println("Thanks so much goodbye");
        scanner.close();

    }

}
