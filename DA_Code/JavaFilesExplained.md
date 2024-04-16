## App.Java 

- Minimal code 
- Just the beginning and end of what is happening

## DigitalArtefactLogic.java
   
   -Logic that all other classes go through 
   - Essentially the body to the Brain (App.java)

## OptionSelection.Java

- Components of logic to be called within itself and in the DA_Logic 
- Divides the users into their respective questionnaire pathways 
- Suits questionnaire to see if theyre the kind of individual to be targetted, Uses Psychology to find their needs, wants, and expectations


## Rejection.Java

- Components of logic to be called within DA_Logic, Option Selection, App.Java (Basically anywhere in the code that has a loophole that the user can break, methods from this class fixes them)
- This is a Class that holds methods for users rejections/ unexpected answers 
- (Basically a class mitigating situations for the user to break the logic)
- Challenge: Create a way to take word input and specialise and output with some AI API

## AnswerManager.java

- Determines what happens when user picks an answer A-B and tells them if its right or wrong  

## PersonalInformation.java

- Holds and privitises all user information
- Used to show encrypted info back to the user

## AnswerRecorder.java

- Holds records of users Answers to all qs
- Why? To pull at the end of the quiz to show how they did

## Beg___.java, Int___.java, Adv___.java

- Holds questions for the different levels of question difficulty in each option selection
- There are four options therefore there will be 12 of these classes in total
- You'll have to divide these into folders for each option in the src file then call them as packages for simplicity 

## Storage Manager

- Holds garbage answers that have caused an error in the code --> Getters and setters ---> Store answers and go through to debug




