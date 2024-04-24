import java.util.Scanner;

public class O1ADV extends AnswerManager{

    //Insert Scanner so user can acc input stuff
    Scanner scanner = new Scanner(System.in);

    public void question1(){

      if (answerCounter < 7) {

        String usersAnswer = scanner.nextLine();
      
     System.out.println("1.\tWhat is the formula for calculating the present value of a perpetuity?\r\n" + //
                  "A) PV = PMT / r \r\n" + //
                  "B) PV = PMT * (1 - (1 / (1 + r)^t)) / r\r\n" + //
                  "C) PV = PMT / r \r\n" + //
                  "D) PV = PMT / r + g\r\n" + //
                  "");

                  //Answer: A) PV = PMT / r
           super.Answer(1, "a", usersAnswer, false, false, true);

         }else{
            System.out.println("This is the end of the Quizz");
            //Output the score
        }
 
     }
 
     public void question2() {

      if (answerCounter < 7) {

        String usersAnswer = scanner.nextLine();
      
         System.out.println("\tWhich of the following options best describes the Modigliani-Miller theorem?\r\n" + //
                          "\r\n" + //
                          " A) It states that the value of a company is not affected by its capital structure B) It provides a method for calculating the optimal capital structure for a company \r\n" + //
                          "C) It explains how investors can arbitrage between different securities to earn riskless profits \r\n" + //
                          "D) It determines the relationship between risk and return in a portfolio\r\n" + //
                          "" );
                
                          //Answer A) It states that the value of a company is not affected by its capital structure
                          super.Answer(1, "a", usersAnswer, false, false, true);

                        }else{
                           System.out.println("This is the end of the Quizz");
                           //Output the score
                       }
    }
    
 
 
      public void question3(){

         if (answerCounter < 7) {

        String usersAnswer = scanner.nextLine();
      
         System.out.println("2.\tWhat does the term \"Beta\" measure in finance? \r\n" + //
                          "\r\n" + //
                          "A) It measures the systematic risk of a security or a portfolio in relation to the market\r\n" + //
                          " B) It measures the volatility of a security or a portfolio\r\n" + //
                          " C) It measures the correlation between two securities or portfolios\r\n" + //
                          " D) It measures the unsystematic risk of a security or a portfolio\r\n" + //
                          "");
                //Answer: A) It measures the systematic risk of a security or a portfolio in relation to the market(
                super.Answer(1, "a", usersAnswer, false, false, true);

               }else{
                  System.out.println("This is the end of the Quizz");
                  //Output the score
              }
 
      }
 
 
 
     public void question4(){

      if (answerCounter < 7) {

        String usersAnswer = scanner.nextLine();

         System.out.println("Which of the following is true about the Efficient Market Hypothesis (EMH)? \r\n" + //
                          "\r\n" + //
                          "A) It suggests that it is impossible to consistently outperform the market\r\n" + //
                          " B) It suggests that markets are always perfectly efficient\r\n" + //
                          " C) It suggests that markets are inefficient due to behavioral biases \r\n" + //
                          "D) It suggests that markets are inefficient due to government regulations\r\n" + //
                          "");

                //Answer: A) It suggests that it is impossible to consistently outperform the market

                super.Answer(1, "a", usersAnswer, false, false, true);

               }else{
                  System.out.println("This is the end of the Quizz");
                  //Output the score
              }
 
     }
 
 
     public void question5(){

      if (answerCounter < 7) {

        String usersAnswer = scanner.nextLine();

         System.out.println("1.\tWhich of the following is NOT a factor affecting the Black-Scholes option pricing model? \r\n" + //
                          "A) Strike price \r\n" + //
                          "B) Dividend yield \r\n" + //
                          "C) Time to expiration \r\n" + //
                          "D) Risk-free rate\r\n" + //
                          "" );

                //Answer: B) Dividend yield
                super.Answer(1, "b", usersAnswer, false, false, true);

               }else{
                  System.out.println("This is the end of the Quizz");
                  //Output the score
              }
 
    
    }
 
    
    public void question6(){
      if (answerCounter < 7) {
        String usersAnswer = scanner.nextLine();


     System.out.println("2.\tWhat is the primary purpose of financial leverage? \r\n" + //
                  "A) To increase the risk of a firm's operations\r\n" + //
                  " B) To decrease the volatility of a firm's earnings \r\n" + //
                  "C) To increase the return on equity for shareholders \r\n" + //
                  "D) To decrease the cost of debt financing for a firm\r\n" + //
                  "" );

                  //Answer: C) To increase the return on equity for shareholders
                  super.Answer(1, "c", usersAnswer, false, false, true);

               }else{
                  System.out.println("This is the end of the Quizz");
                  //Output the score
              }
 
 }
 
    public void question7(){

      if (answerCounter < 7) {
        String usersAnswer = scanner.nextLine();
 
     System.out.println("2.\tWhich of the following is NOT a characteristic of efficient markets according to the Random Walk Theory? \r\n" + //
                  "A) All available information is reflected in the current stock price \r\n" + //
                  "B) Future stock price movements are unpredictable \r\n" + //
                  "C) Investors can consistently earn above-average returns \r\n" + //
                  "D) Stock prices follow a random pattern\r\n" + //
                  "" );
            //Answer: C) Investors can consistently earn above-average returns
            super.Answer(1, "c", usersAnswer, false, false, true);

         }else{
            System.out.println("This is the end of the Quizz");
            //Output the score
        }
 
    }

    //one more q 
}
