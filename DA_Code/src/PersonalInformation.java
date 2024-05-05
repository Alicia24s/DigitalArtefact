
import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonalInformation {


      /*
      * Class Holds users personal info
      *
      * Gives the user a chance to refactor their personal information in DigitalArtifact.Java 
      */
      private String _firstname;
      private String _surname;
      private int _years;
      private String _email;

      public void usersPersonalinfo(Scanner scanner){

       // Sets and stores users personal information
            System.out.println("\nFirstName:");
               String firstname = scanner.nextLine();


            // error handling so that firstname cant be empty
              //Added after integration test because users name was allowed to be blank
               while (firstname.isEmpty()) {
                  System.out.println("Error: Firstname cannot be empty - Please try again:");
                  firstname = scanner.nextLine();
              }
               set_firstname(firstname);
       
            System.out.println("\nSurname:");
               String surname = scanner.nextLine();
            
               //Added after integration test because users surname was allowed to be blank
               while (surname.isEmpty()) {
                  System.out.println("Error: Surname cannot be empty - Please try again:");
                  surname = scanner.nextLine();
              }
               set_surname(surname);
       
            System.out.println("\nAge:");
            
                int years = 0;
                boolean validAge = false;
                 
              // error handling:
              // added after integration test because code broke when passing string instead of int
  
              while (!validAge) {
                    try {
                        years = scanner.nextInt();
                        if (years < 0) {
                            System.out.println("Invalid age please try again:");
                        } else {
                            validAge = true;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid age:");
                        scanner.nextLine(); // Clear the invalid input from the scanner
                    }
                }
               
                set_years(years);

            scanner.nextLine();
       
            System.out.println("\nE-mail:");
                String email = scanner.nextLine();
                set_email(email);
       
       
           System.out.println("\n Your recorded details are as follows:");
           System.out.println("\nfirstname: " + get_firstname());         
           System.out.println("surname: " + get_surname());
           System.out.println("Age: " + get_years());
           System.out.println("E-mail: " + get_email());
       
      }


      public void set_firstname(String _firstname){
            this._firstname = _firstname;
      }

      public void set_surname(String _surname){
      this._surname = _surname;
      }

      public void set_years(int _years){
            this._years = _years;
      }

      public void set_email(String _email){
      this._email = _email;
      }

      public String get_firstname(){
            return _firstname;
      }

      public String get_surname(){
            return _surname;
      }

      public int get_years(){
            return _years;
      }

      public String get_email(){
            return _email;
      }
 
}
