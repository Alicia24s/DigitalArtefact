package Options;
import java.util.Random;

public class Option3 {
/*
 * THERE ARE PLACEHOLDER QUESTIONS IN HERE PLEASE CHANGE THEM IN LINE WITH THE TOPIC INSIDE OF 
 * PathwaysManager.java
 * 
 */
    private Random randomGenerator = new Random();

    protected String result;
           
       public String beginner(){
               
      
           int randNumber = randomGenerator.nextInt(8);
   
             switch (randNumber) {
               case 1:
   
               //Question 1
   
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
               result = "b";
               
               break;
                   
                  
               case 2:
   
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
                               "");
       
                               //Answer is A
   
               result = "a";
   
               break;
   
               case 3:
   
              
               System.out.println("What does APR stand for?\r\n" + //
               "\r\n" + //
               " A)Annual Percentage Rate \r\n" + //
               "\r\n" + //
               "B) Annual Profit Rate\r\n" + //
               "\r\n" + //
               " C) Annual Payment Ratio \r\n" + //
               "\r\n" + //
               "D) Annual Principal result = \r\n" + //
               "\r\n");
       
               //Get function for A
   
   
   
               result = "a";
   
               break;
   
               case 4:
   
               
          
           System.out.println("What does ROI stand for?\r\n" + //
           "\r\n" + //
           " A)Rate of investment \r\n" + //
           "\r\n" + //
           "B) Rate  of inflation\r\n" + //
           "\r\n" + //
           " C)result = on Investment \r\n" + //
           "\r\n" + //
           "D) Rate of Interest\r\n" + //
           "\r\n" );
   
           //Get function super C
          
   
               result = "c";
   
               break;
   
               case 5:
   
              
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
   
               result = "a";
   
               break;
   
               case 6:
   
              
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
              
   
               result = "c";
   
               break;
   
               case 7:
   
              
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
           
   
               
               result = "b";
   
               break;
             
               default:
                   result = "error in OPTION1JAVA ";
             }
   
             return result;
       }
   
   
   
   
   
       public String intermediate(){
   
           int randNumber = randomGenerator.nextInt(8);
   
           switch (randNumber) {
               case 1:
   
               //Question 1
               System.out.println("\tWhich of the following investments has the highest liquidity? \r\n" + //
               "A) Real estate\r\n" + //
               " B) Stocks \r\n" + //
               "C) Bonds\r\n" + //
               " D) Certificate of Deposit (CD)\r\n");
   
               //"Answer: B) Stocks
              
                   
                   result = "b";
   
                   break;
               case 2:
   
               System.out.println(" 1.\tWhat is the difference between stocks and bonds?\r\n" + //
               " A) Stocks represent ownership in a company, while bonds represent debt\r\n" + //
               " B) Stocks pay fixed interest, while bonds pay dividends \r\n" + //
               "C) Stocks are less risky than bonds\r\n" + //
               " D) Bonds are more liquid than stocks\r\n" + //
               "" );
   
                //Answer: A) Stocks represent ownership in a company, while bonds represent debt
           
   
               result = "a";
               break;
   
               case 3:
   
               System.out.println("1.\tWhat does the Rule of 72 determine?\r\n" + //
               " A) The doubling time for an investment\r\n" + //
               " B) The interest rate required to double an investment\r\n" + //
               " C) The annual growth rate of an investment \r\n" + //
               "D) The risk associated with an investment\r\n" + //
               "");
   
               //Answer: A) The doubling time for an investment
               
   
               result = "a";
               break;
   
               case 4:
   
               System.out.println("1.\tWhich of the following is a measure of risk in an investment portfolio?\r\n" + //
               " A) Beta \r\n" + //
               "B) Dividend yield \r\n" + //
               "C) Earnings per share (EPS) \r\n" + //
               "D) result = on Investment (ROI)\r\n" + //
               "");
   
               //Answer: A) Beta
   
               result = "a";
               break;
   
               case 5:
   
               
                 System.out.println("\tWhat is the difference between nominal interest rate and real interest rate? \r\n" + //
                            "A) Nominal interest rate includes inflation, while real interest rate does not \r\n" + //
                            "B) Real interest rate includes inflation, while nominal interest rate does not\r\n" + //
                           " C) Nominal interest rate is adjusted for inflation, while real interest rate is not\r\n" + //
                           "D) Nominal interest rate and real interest rate are the same\r\n" );
   
               //Answer: A) Nominal interest rate includes inflation, while real interest rate does not
   
               result = "a";
               break;
   
               case 6:
   
               
                    System.out.println("1.\tWhat is the purpose of the Sharpe ratio? \r\n" + //
                        "A) To measure the risk-adjusted result = of an investment \r\n" + //
                        "B) To calculate the total result = of an investment \r\n" + //
                        "C) To determine the liquidity of an investment\r\n" + //
                       " D) To evaluate the long-term growth potential of an investment\r\n" + //
                        "" );
   
                         //Answer: A) To measure the risk-adjusted result = of an investment
   
                   
   
               result = "a";
               break;
   
               case 7:
   
               System.out.println("What is the present value of $500 to be received in two years with a discount rate of 5%? \r\n" + //
               "A) $454.55 \r\n" + //
               "B) $476.19\r\n" + //
               " C) $490.00 \r\n" + //
               "D) $510.00\r\n" + //
               "" );
                   //Answer: A) $454.55
   
               
               
               result = "a";
               break;
             
               default:
                   
             }
   
             return "Please enter your answer A,B,C, or D";
   
       }
       
       public String advanced(){
   
           int randNumber = randomGenerator.nextInt(8);
   
           switch (randNumber) {
               case 1:
   
               //Question 1
               System.out.println("1.\tWhat is the formula for calculating the present value of a perpetuity?\r\n" + //
               "A) PV = PMT / r \r\n" + //
               "B) PV = PMT * (1 - (1 / (1 + r)^t)) / r\r\n" + //
               "C) PV = PMT / r \r\n" + //
               "D) PV = PMT / r + g\r\n" + //
               "");
   
               //Answer: A) PV = PMT / r
                  
   
                   result = "a";
                   break;
   
               case 2:
   
               System.out.println("\tWhich of the following options best describes the Modigliani-Miller theorem?\r\n" + //
               "\r\n" + //
               " A) It states that the value of a company is not affected by its capital structure B) It provides a method for calculating the optimal capital structure for a company \r\n" + //
               "C) It explains how investors can arbitrage between different securities to earn riskless profits \r\n" + //
               "D) It determines the relationship between risk and result = in a portfolio\r\n" + //
               "" );
     
               //Answer A) It states that the value of a company is not affected by its capital structure
              
   
               result = "a";
               break;
   
               case 3:
   
               System.out.println("2.\tWhat does the term \"Beta\" measure in finance? \r\n" + //
               "\r\n" + //
               "A) It measures the systematic risk of a security or a portfolio in relation to the market\r\n" + //
               " B) It measures the volatility of a security or a portfolio\r\n" + //
               " C) It measures the correlation between two securities or portfolios\r\n" + //
               " D) It measures the unsystematic risk of a security or a portfolio\r\n" + //
               "");
   
               //Answer: A) It measures the systematic risk of a security or a portfolio in relation to the market(
              
   
               result = "a";
               break;
   
               case 4:
   
               
            System.out.println("Which of the following is true about the Efficient Market Hypothesis (EMH)? \r\n" + //
            "\r\n" + //
            "A) It suggests that it is impossible to consistently outperform the market\r\n" + //
            " B) It suggests that markets are always perfectly efficient\r\n" + //
            " C) It suggests that markets are inefficient due to behavioral biases \r\n" + //
            "D) It suggests that markets are inefficient due to government regulations\r\n" + //
            "");
   
                   //Answer: A) It suggests that it is impossible to consistently outperform the market
   
                  
   
               result = "a";
               break;
   
               case 5:
   
               System.out.println("1.\tWhich of the following is NOT a factor affecting the Black-Scholes option pricing model? \r\n" + //
               "A) Strike price \r\n" + //
               "B) Dividend yield \r\n" + //
               "C) Time to expiration \r\n" + //
               "D) Risk-free rate\r\n" + //
               "" );
   
               //Answer: B) Dividend yield
    
   
               result = "b";
               break;
   
               case 6:
   
               System.out.println("2.\tWhat is the primary purpose of financial leverage? \r\n" + //
               "A) To increase the risk of a firm's operations\r\n" + //
               " B) To decrease the volatility of a firm's earnings \r\n" + //
               "C) To increase the result = on equity for shareholders \r\n" + //
               "D) To decrease the cost of debt financing for a firm\r\n" + //
               "" );
   
               //Answer: C) To increase the result = on equity for shareholders
              
   
               result = "c";
               break;
   
               case 7:
   
               System.out.println("2.\tWhich of the following is NOT a characteristic of efficient markets according to the Random Walk Theory? \r\n" + //
               "A) All available information is reflected in the current stock price \r\n" + //
               "B) Future stock price movements are unpredictable \r\n" + //
               "C) Investors can consistently earn above-average result =s \r\n" + //
               "D) Stock prices follow a random pattern\r\n" + //
               "" );
   
               //Answer: C) Investors can consistently earn above-average result =s
              
               
               result = "c";
             break;
   
               default:
                   
             }
   
             return "Please enter your answer A,B,C, or D";
   
       }
   
          public String getCorrectAnswer(){   
           return result;
       }
   
       
    }
