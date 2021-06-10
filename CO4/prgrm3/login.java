package packoops;
import java.util.Scanner;

class authException extends Exception
{

  public authException(String s) {
      super(s);
  }
  
}
public class login
{
  public static void main(String[] args) {
      String username = "jomin";
      String passcode = "123";
      String user_name,password;
      Scanner sc = new Scanner(System.in);
      try
      {
          System.out.println("Username:");
          user_name = sc.nextLine();
          System.out.println("Password:");
          password = sc.nextLine();
          if(username.equals(user_name) && passcode.equals(password))
          {
              System.out.println("Authentication successful...");
          }
          else
              throw new authException("Invalid user credentials");
          
      }
      catch(authException e)
      {
          System.out.println("Exception caught "+e);
      }
  }

}