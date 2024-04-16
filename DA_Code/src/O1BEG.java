import java.util.Scanner;

public class O1BEG extends AnswerManager{
 
   public void question1(Scanner scanner){
    
    
    String usersAnswer = scanner.nextLine();
    System.out.println("What is compound interest?\r\n" + //
                "\r\n" + //
                " A) Interest calculated only on the principal amount \r\n" + //
                "\r\n" + //
                "B) Interest calculated on the initial principal and also on the accumulated interest from previous periods\r\n" + //
                "\r\n" + //
                " C) Interest calculated at a fixed rate annually \r\n" + //
                "\r\n" + //
                "D) Interest calculated only on the accumulated interest\r\n" + //
                "\r\n");

                //Answer is B
                super.Answer(1, "b", usersAnswer, true, false, false);
        //Call QuestionAtoD.java function for B
     
    }

    public void question2(Scanner scanner){
     
        String usersAnswer = scanner.nextLine();
        System.out.println("Which of the following is an example of an asset?\r\n" + //
        "\r\n" + //
        " A) Loan \r\n" + //
        "\r\n" + //
        "B) House\r\n" + //
        "\r\n" + //
        " C) Credit card debt \r\n" + //
        "\r\n" + //
        "D) Rent Payment\r\n" + //
        "\r\n"
        );
        
        //Answers for B
        super.Answer(1, "b", usersAnswer, true, false, false);
        //Call QuestionAtoD.java function for B

    }


     public void question3(Scanner scanner){
        
        String usersAnswer = scanner.nextLine();
        System.out.println("What is the purpose of diversification in investment?\r\n" + //
                        "\r\n" + //
                        " A)To minimise risk by spreading investments across different assets \r\n" + //
                        "\r\n" + //
                        "B) To maximise risk by concentrating investments on one asset\r\n" + //
                        "\r\n" + //
                        " C) To increase taxes on investment income \r\n" + //
                        "\r\n" + //
                        "D) To decrease taxes on investment income\r\n" + //
                        "\r\n" + //
                        "ncipal and also on the accumulated interest from previous periods\r\n" + //
                        "");

                        //Get method from super for A
                        super.Answer(1, "a", usersAnswer, true, false, false);
     }



    public void question4(Scanner scanner){

        String usersAnswer = scanner.nextLine();
        System.out.println("What does APR stand for?\r\n" + //
        "\r\n" + //
        " A)Annual Percentage Rate \r\n" + //
        "\r\n" + //
        "B) Annual Profit Rate\r\n" + //
        "\r\n" + //
        " C) Annual Payment Ratio \r\n" + //
        "\r\n" + //
        "D) Annual Principal Return \r\n" + //
        "\r\n");

        //Get function for A
        super.Answer(1, "a", usersAnswer, true, false, false);
    }


    public void question5(Scanner scanner){

        String usersAnswer = scanner.nextLine();
        System.out.println("What does ROI stand for?\r\n" + //
        "\r\n" + //
        " A)Rate of investment \r\n" + //
        "\r\n" + //
        "B) Rate  of inflation\r\n" + //
        "\r\n" + //
        " C)Return on Investment \r\n" + //
        "\r\n" + //
        "D) Rate of Interest\r\n" + //
        "\r\n" );

        //Get function super C
        super.Answer(1, "c", usersAnswer, true, false, false);
   
   }

   
   public void question6(Scanner scanner){

    String usersAnswer = scanner.nextLine();
    System.out.println("What is the time value of money?\r\n" + //
    "\r\n" + //
    " A) Money received today is worth more than the same amount received in the future \r\n" + //
    "\r\n" + //
    "B) Money earned over a period of time\r\n" + //
    "\r\n" + //
    " C)Money received at a fixed rate of interest \r\n" + //
    "\r\n" + //
    "D) Money received in the future is worth more than the same amount received today\r\n" + //
    "\r\n" );

    super.Answer(1, "a", usersAnswer, true, false, false);

}

   public void question7(Scanner scanner){


    String usersAnswer = scanner.nextLine();
    System.out.println("\r\n" + //
                "What is liquidity in finance? \r\n" + //
                "\r\n" + //
                "A) Ability to invest in long-term assets\r\n" + //
                "\r\n" + //
                "B) Ability to borrow money easily\r\n" + //
                "\r\n" + //
                " C) Ability to convert assets into cash quickly without significant loss of value\r\n" + //
                "\r\n" + //
                "D) Ability to avoid financial risks\r\n" //
            );

    //get function for c
    super.Answer(1, "c", usersAnswer, true, false, false);

   }

}
