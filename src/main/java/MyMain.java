import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if(ch >= 'A' && ch <= 'Z'){
            return (char) (ch + 32);
        }
        return ch;
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        char[] lower = str.toCharArray();
        
        for (int i = 0; i < str.length(); i ++){
             lower[i] = toLower(lower[i]);
        }

        String result = new String(lower);
        return result;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
            if(ch >= 'a' && ch <= 'z'){
                return (char) (ch - 32);
            }
        return ch;
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        char[] data = str.toCharArray();

        for(int j = 0; j < data.length; j ++){
            data[j] = toUpper(data[j]);
        }

        String result = new String(data);

        return result;
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a String");
        String input = s.nextLine();
        
        String choice = "";
        do{
            System.out.println("Would you like to make your string lowercase or upper case?");
            choice = myToLowerCase(s.next()).replace(" ", "");
        }while(!"upper".equals(choice) && !"lower".equals(choice));

        System.out.println("upper".equals(choice)? myToUpperCase(input) : myToLowerCase(input));
    }

}

/*
Please enter a String
THE ATHENIAN SCHOOL IS GREAT
What would you like to make your string lowercase or uppercase?
lowercase
Here is your string in lowercase: the athenian school is great
*/