import java.util.Scanner;

public class App {

    public static int passTest(String password){
        int count = 0;
        String symbols = "~!@#$%^&*()-=+_";
        boolean lowerC = false;
        boolean upperC = false;
        boolean number = false;        
        boolean symbol = false;
        for(char c : password.toCharArray()){
            //Checks if password has lowercase
            if(Character.isLowerCase(c)){
                lowerC = true;
            }
            //Checks if password has uppercase
            if(Character.isUpperCase(c)){
                upperC = true;
            }
            //Checks if password has a number
            if(Character.isDigit(c)){
                number = true;
            }
            //Checks if password has a symbol
            for(char d : symbols.toCharArray()){
                if (c == d){
                    symbol = true;
                }
            }
        }
        if (lowerC == true){
            count++;
            System.out.println("Password has lowercase");
        } else {
            System.out.println("Password does not have lowercase");
        }
        if (upperC == true){
            count++;
            System.out.println("Password has uppercasecase");
        } else {
            System.out.println("Password does not have uppercase");
        }
        if (number == true){
            count++;
            System.out.println("Password has a number");
        } else {
            System.out.println("Password does not have a number");
        }
        if (symbol == true){
            count++;
            System.out.println("Password has a symbol");
        } else {
            System.out.println("Password does not have a symbol");
        }
        return count;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Enter a password that meets the requirements:");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        //Checks if password has 8-16 characters
        int count = 0;
        if ((password.length() >= 8) && (password.length() <= 16)){
            count = passTest(password);
            if (count >= 3){
                System.out.println("***Password Valid.***");
            } else {
                System.out.println("***Password invalid.***");
            }
        } else {
            System.out.println("Password is not between 8-16 characters.");
        }

        scanner.close();
    }
}
