import java.util.Scanner;

/**
 * @author: Eduardo Caceres
 * date:10-12-17
 * purpose: authenticate user
 */
public class LogIn {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        String user, pass;
        //user name input
        System.out.println("Enter Username");
        user = input.nextLine();

        //password input
        System.out.println("Enter Password");
        pass = input.nextLine();

        //if condition
        if(user.equals("eduardo") && (pass.equals("12345"))){
            System.out.println("Welcome "+ user);
        }else{
            System.out.println("Wrong Username or Password");
        }

    }
}