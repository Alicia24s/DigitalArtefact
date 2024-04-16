import java.util.Scanner;

public class O1INT extends AnswerManager{
 
    public void question1(Scanner scanner){

    String usersAnswer = scanner.nextLine();
      
     System.out.println("\tWhich of the following investments has the highest liquidity? \r\n" + //
                  "A) Real estate\r\n" + //
                  " B) Stocks \r\n" + //
                  "C) Bonds\r\n" + //
                  " D) Certificate of Deposit (CD)\r\n");

                  //"Answer: B) Stocks
                  super.Answer(1, "b", usersAnswer, false, true, false);
      
     }
 
     public void question2(Scanner scanner){
        
        String usersAnswer = scanner.nextLine();

         System.out.println(" 1.\tWhat is the difference between stocks and bonds?\r\n" + //
                          " A) Stocks represent ownership in a company, while bonds represent debt\r\n" + //
                          " B) Stocks pay fixed interest, while bonds pay dividends \r\n" + //
                          "C) Stocks are less risky than bonds\r\n" + //
                          " D) Bonds are more liquid than stocks\r\n" + //
                          "" );

                 //Answer: A) Stocks represent ownership in a company, while bonds represent debt
            super.Answer(1, "a", usersAnswer, false, true, false);

     }
 
 
      public void question3(Scanner scanner){

        String usersAnswer = scanner.nextLine();
      
         System.out.println("1.\tWhat does the Rule of 72 determine?\r\n" + //
                          " A) The doubling time for an investment\r\n" + //
                          " B) The interest rate required to double an investment\r\n" + //
                          " C) The annual growth rate of an investment \r\n" + //
                          "D) The risk associated with an investment\r\n" + //
                          "");

                          //Answer: A) The doubling time for an investment
            super.Answer(1, "a", usersAnswer, false, true, false);
                         
      }
 
 
 
     public void question4(Scanner scanner){

        String usersAnswer = scanner.nextLine();

         System.out.println("1.\tWhich of the following is a measure of risk in an investment portfolio?\r\n" + //
                          " A) Beta \r\n" + //
                          "B) Dividend yield \r\n" + //
                          "C) Earnings per share (EPS) \r\n" + //
                          "D) Return on Investment (ROI)\r\n" + //
                          "");

                          //Answer: A) Beta

                super.Answer(1, "a", usersAnswer, false, true, false);
 
     }
 
 
     public void question5(Scanner scanner){

        String usersAnswer = scanner.nextLine();

         System.out.println("\tWhat is the difference between nominal interest rate and real interest rate? \r\n" + //
                          "A) Nominal interest rate includes inflation, while real interest rate does not \r\n" + //
                          "B) Real interest rate includes inflation, while nominal interest rate does not\r\n" + //
                          " C) Nominal interest rate is adjusted for inflation, while real interest rate is not\r\n" + //
                          "D) Nominal interest rate and real interest rate are the same\r\n" );
 
         //Answer: A) Nominal interest rate includes inflation, while real interest rate does not
         super.Answer(1, "a", usersAnswer, false, true, false);
    
    }
 
    
    public void question6(Scanner scanner){

        String usersAnswer = scanner.nextLine();

     System.out.println("1.\tWhat is the purpose of the Sharpe ratio? \r\n" + //
                  "A) To measure the risk-adjusted return of an investment \r\n" + //
                  "B) To calculate the total return of an investment \r\n" + //
                  "C) To determine the liquidity of an investment\r\n" + //
                  " D) To evaluate the long-term growth potential of an investment\r\n" + //
                  "" );

                  //Answer: A) To measure the risk-adjusted return of an investment
 
        super.Answer(1, "a", usersAnswer, false, true, false);
     //Get function AnswerManager A
 
 }
 
    public void question7(Scanner scanner){

        String usersAnswer = scanner.nextLine(); 
     System.out.println("What is the present value of $500 to be received in two years with a discount rate of 5%? \r\n" + //
                  "A) $454.55 \r\n" + //
                  "B) $476.19\r\n" + //
                  " C) $490.00 \r\n" + //
                  "D) $510.00\r\n" + //
                  "" );
    //Answer: A) $454.55

    super.Answer(1, "a", usersAnswer, false, true, false);

    }

}
