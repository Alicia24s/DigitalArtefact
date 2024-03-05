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

