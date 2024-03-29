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
     
    Scanner scanner = new Scanner(System.in);


    //Setters
    public void set_firstname(String _firstname){
          this._firstname = _firstname.replaceFirst(_firstname, "***");
    }

    public void set_surname(String _surname){
     this._surname = _surname.replaceFirst(_surname, "***");
     }

     public void set_years(int _years){
          this._years = _years;
    }

    public void set_email(String _email){
     this._firstname = _firstname.replaceFirst(_firstname, "***");
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


    // Sets and stores users personal information
    public void usersPersonalinfo(){

     System.out.println("FirstName:");
        String firstname = scanner.nextLine();
        set_firstname(firstname);

     System.out.println("Surname:");
        String surname = scanner.nextLine();
        set_surname(surname);

     System.out.println("Age:");
         int years = scanner.nextInt();
         set_years(years);

     System.out.println("E-mail:");
         String email = scanner.nextLine();
         set_email(email);

    scanner.close();

    }

    public void returnUserInfo(){

     // do a system .out.print ln for all the grtters with encrypted data
     System.out.println();
    }


     
}
