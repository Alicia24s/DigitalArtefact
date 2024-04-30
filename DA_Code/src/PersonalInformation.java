import java.util.Scanner;

public class PersonalInformation {

     /* Class to hold the getters and setters for user's collected personal information 
        *eg. you've taken their email and need to return encrypted version
        *(You'll give the user an option to refactor these in the logic)
     */

    /*
     * Holds users personal info
     * eg - you've taken their email and need to return an encrypted version
     * 
     * (Give the user a chance to refactor their personal information in TestLogic.Java by returning encrypted personal info)
     * 
     */
    private String _firstname;
    private String _surname;
    private int _years;
    private String _email;

public void usersPersonalinfo(Scanner scanner){

       // Sets and stores users personal information
     

            System.out.println("FirstName:");
               String firstname = scanner.nextLine();
               set_firstname(firstname);
       
            System.out.println("Surname:");
               String surname = scanner.nextLine();
               set_surname(surname);
       
            System.out.println("Age:");
                int years = scanner.nextInt();
                set_years(years);

            scanner.nextLine();
       
            System.out.println("E-mail:");
                String email = scanner.nextLine();
                set_email(email);
       
       
           System.out.println("Your recorded details:");
           System.out.println("firstname: " + get_firstname());
           System.out.println("surname: " + get_surname());
           System.out.println("Age:" + get_years());
           System.out.println("E-mail:" + get_email());
       
           }


    //Setters
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
