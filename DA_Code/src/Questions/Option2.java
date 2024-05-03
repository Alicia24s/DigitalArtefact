package Questions;
import java.util.Random;

public class Option2 {

    //Option 2 - Investment and portfolio

     private Random randomGenerator = new Random();
    
     protected String result;
            
        public String beginner(){
                
       
            int randNumber = randomGenerator.nextInt(8);
    
              switch (randNumber) {
                case 1:
    
                //Question 1
    
                System.out.println("What is an investmet?\r\n" + //
                "\r\n" + //
                " A) Saving money in a bank account\r\n" + //
                "\r\n" + //
                "B) Spending money on luxury items\r\n" + //
                "\r\n" + //
                " C) Putting money into assets with expectation of a profit \r\n" + //
                "\r\n" + //
                "D) Giving money away to charity\r\n" + //
                "\r\n");
    
                //Answer is c
                result = "c";
                
                break;
                    
                   
                case 2:
    
                System.out.println("What is a portfolio?\r\n" + //
                                "\r\n" + //
                                " A)A collection of valuable stamps \r\n" + //
                                "\r\n" + //
                                "B) A selection of investment assets held by an individual or entity\r\n" + //
                                "\r\n" + //
                                " C) A type of savings account \r\n" + //
                                "\r\n" + //
                                "D) A budget plan\r\n" + //
                                "\r\n" 
                                );
        
                                //Answer is b
    
                result = "b";
    
                break;
    
                case 3:
    
               
                System.out.println("What is diversification in investing?\r\n" + //
                "\r\n" + //
                " A)Putting all your oney into one investment \r\n" + //
                "\r\n" + //
                "B) Spreading investments across assets to reduce risk\r\n" + //
                "\r\n" + //
                " C)Focussing on only high risk investments \r\n" + //
                "\r\n" + //
                "D)Investing in a single industry \r\n" + //
                "\r\n");
        
                //Get function for A
    
    
    
                result = "b ";
    
                break;
    
                case 4:
    
                
           
            System.out.println("What is the stock market?\r\n" + //
            "\r\n" + //
            " A)A market where only stocks of technology companies are traded \r\n" + //
            "\r\n" + //
            "B) A market where only government bonds are traded\r\n" + //
            "\r\n" + //
            " C)A market where shares of publicly traded companies are bought and sold\r\n" + //
            "\r\n" + //
            "D)A market where only physical goods are traded\r\n" + //
            "\r\n" );
    
            //Get function super C
           
    
                result = "c";
    
                break;
    
                case 5:
    
               
                System.out.println("What is an index fund?\r\n" + //
                "\r\n" + //
                " A) A fund managed by a group of investors \r\n" + //
                "\r\n" + //
                "B) A fund that invests in a diverse portdolio of stocks\r\n" + //
                "\r\n" + //
                " C)A fund that invests in Gold and Silver \r\n" + //
                "\r\n" + //
                "D) A fund that invests only in government bonds\r\n" + //
                "\r\n" );
    
                result = "b";
    
                break;
    
                case 6:
    
               
                System.out.println("\r\n" + //
                            "What is a mutual fund? \r\n" + //
                            "\r\n" + //
                            "A) A fund managed by a single investor\r\n" + //
                            "\r\n" + //
                            "B) A fund that invests only in real estate\r\n" + //
                            "\r\n" + //
                            " C) A fund that pools money from multiple investors to invest in a diversified portfolio\r\n" + //
                            "\r\n" + //
                            "D) A fund that invests only in stocks of technology companies\r\n" //
                        );
            
                //get function for c
               
    
                result = "c";
    
                break;
    
                case 7:
    
               
            System.out.println("What is the primary goal of investing?\r\n" + //
            "\r\n" + //
            " A) To never lose money \r\n" + //
            "\r\n" + //
            "B)To maximise returns while minimising risk\r\n" + //
            "\r\n" + //
            " C) To always beat the market \r\n" + //
            "\r\n" + //
            "D) To get rich quickly\r\n" + //
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
                System.out.println("\tWhat is dollar cost averaging?\r\n" + //
                "A)  Investing a fixed amount of money in a particular stock each month\r\n" + //
                " B) Investing a fixed amount of money in different assets each month \r\n" + //
                "C) Buying and selling stocks rapidly to take advantage of short-term price fluctuations\r\n" + //
                " D)  Investing a variable amount of money in different assets each month\r\n");
                    
                    result = "a";
    
                    break;
                case 2:
    
                System.out.println(" 1.\tWhat is the purpose of rebalancing a portfolio?\r\n" + //
                " A)To maximize returns\r\n" + //
                " B)  To minimize taxes \r\n" + //
                "C)  To maintain the desired asset allocation\r\n" + //
                " D) To increase risk\r\n" + //
                "" );
    
                 //Answer: C) To maintain the desired asset allocation
            
    
                result = "c";
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
    
                System.out.println("1.\tWhat is an ETF (Exchange-Traded Fund)?\r\n" + //
                " A) A fund that invests only in government bonds\r\n" + //
                "B)  A fund that trades on an exchange like a stock and holds assets such as stocks, commodities, or bonds \r\n" + //
                "C) A fund that invests only in real estate \r\n" + //
                "D) A fund that is managed by a group of investors\r\n" + //
                "");
    
                //Answer: B) A fund that trades on an exchange like a stock and holds assets such as stocks, commodities, or bonds
    
                result = "b";
                break;
    
                case 5:
    
                
                  System.out.println("\tWhat is the difference between active and passive investing strategies?\r\n" + //
                             "A)Active investing involves buying and holding assets for the long term, while passive investing involves frequent trading \r\n" + //
                             "B)  Active investing aims to outperform the market, while passive investing aims to match the market returns\r\n" + //
                            " C) Active investing is less risky than passive investing\r\n" + //
                            "D) Passive investing requires more time and effort than active investing\r\n" );
    
                //Answer: B) Active investing aims to outperform the market, while passive investing aims to match the market returns
                result = "b";
                break;
    
                case 6:
    
                
                     System.out.println("\tWhat is alpha in investment?\r\n" + //
                         "A) The return of the market index \r\n" + //
                         "B) The return of a specific investment \r\n" + //
                         "C) The excess return of an investment compared to its benchmark\r\n" + //
                        " D) The risk associated with an investment\r\n" + //
                         "" );
    
                          //Answer: C) The excess return of an investment compared to its benchmark
    
                    
    
                result = "c";
                break;
    
                case 7:
    
                System.out.println("What is portfolio optimization? \r\n" + //
                "A) Maximizing the number of assets in a portfolio \r\n" + //
                "B)  Minimizing the risk of a portfolio while achieving the desired return\r\n" + //
                " C)  Diversifying investments across different sectors \r\n" + //
                "D) Investing only in high-risk assets\r\n" + //
                "" );
                    //Answer: B) Minimizing the risk of a portfolio while achieving the desired return
    
                
                
                result = "b";
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
                System.out.println("\tWhat is the Capital Market Line (CML) used for in portfolio theory?\r\n" + //
                "A) To determine the efficient frontier of a portfolio \r\n" + //
                "B) To calculate the expected return of an asset\r\n" + //
                "C) To evaluate the performance of mutual funds \r\n" + //
                "D)To represent the risk-return tradeoff for efficient portfolios\r\n" + //
                "");
    
                //Answer: D) To represent the risk-return tradeoff for efficient portfolios
                   
    
                    result = "d";
                    break;
    
                case 2:
    
                System.out.println("\tWhat is the concept of Modern Portfolio Theory (MPT)?"+ //
                "\r\n" + //
                " A) It suggests that investors should focus only on individual stock selection \r\n" +//
                 "B)It emphasizes minimizing risk by holding a diversified portfolio of assets \r\n" + //
                "C) It advocates for investing solely in high-risk, high-return assets \r\n" + //
                "D)  It recommends timing the market to maximize returns\r\n" + //
                "" );
      
                //Answer: B) It emphasizes minimizing risk by holding a diversified portfolio of assets
               
    
                result = "b";
                break;
    
                case 3:
    
                System.out.println("\tWhat is the difference between alpha and beta in the context of investment? \r\n" + //
                "\r\n" + //
                "A) Alpha measures the market risk of a portfolio, while beta measures the excess return of a portfolio compared to the market\r\n" + //
                " B) Alpha measures the excess return of a portfolio compared to the market, while beta measures the market risk of a portfolior\n" + //
                " C) Alpha measures the short-term volatility of a portfolio, while beta measures the long-term performance\r\n" + //
                " D) Alpha measures the absolute return of a portfolio, while beta measures the relative return\r\n" + //
                "");
    
                //Answer: B) Alpha measures the excess return of a portfolio compared to the market, while beta measures the market risk of a portfolio
               
    
                result = "b";
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
    
                System.out.println("2.\tWhat is the role of a hedge fund manager in portfolio management? \r\n" + //
                "A) To manage a diversified portfolio of assets on behalf of individual investors \r\n" + //
                "B) To implement high-risk trading strategies to generate above-average returns \r\n" + //
                "C)  To provide investment advice to retail investors \r\n" + //
                "D) To minimize risk by hedging against adverse market movements\r\n" + //
                "" );
    
                //Answer: C) Investors can consistently earn above-average result =s
               
                
                result = "b";
              break;
    
                default:
                    
              }
    
              return "Please enter your answer A,B,C, or D";
    
        }
    
           public String getCorrectAnswer(){   
            return result;
        }
    
        
        
    }
    