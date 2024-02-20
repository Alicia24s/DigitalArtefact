import java.util.Scanner;

public class DigitalArtifactLogic{
    
    //Lab 2
    /**
     * 
     */
    public void importantExercise(){

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

    System.out.println(
        "Ok, All information has been gathered \n" +
        "Welcome to the programme \n" + firstname + surname +
        "\n Congratulations on working for " + workplace +" for " + years + " years" +
        "\n Now lets Begin"
        );

        // beginning of new thing

       


        do{
            
            int numberSelection = scanner.nextInt();

            System.out.println("Option 1: See your full name"); 
            System.out.println("Option 2: Remember where you work");
            System.out.println("Option 3: See how many years you have left until retirement");
            System.out.println("Option 4: Hear some personalised words of encouragement");
            System.out.println("Please select (1-4)");

            
            

            switch(numberSelection){
                case 1:
                   System.out.println(firstname + surname);
                   break;

               case 2:
                   System.out.println("You work at" + workplace);
                
                   break;

               case 3:
                   System.out.println("You have" + yearsTillRetirement + "years until retirement");
                   break;

               case 4:
                   System.out.println("You can do literally anythingggg you set your mind to");
                   break;
           
               default: 
                   System.out.println(numberSelection + "is not a valid choice");


                   
            String continueQuestion = "Do you want to coninue (yes/no)";
            String userContinueation = scanner.nextLine();
            boolean finished;

            System.out.println(continueQuestion);

            if (userContinueation.equals("yes")){
                finished = false;
            }
            else{
                finished = true;
            }
           
            }
    } while(!finished);
          
        
   scanner.close();
    }
}

