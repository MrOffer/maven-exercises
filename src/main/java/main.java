import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Something:\n");
        String input = scan.nextLine();
        System.out.println("You entered: " + input);
        if(StringUtils.isNumeric(input)) {
            System.out.println(input + " is a number");
        } else {
            System.out.println(input + " is not a number");
        }
        System.out.println("Flipped Case: " + StringUtils.swapCase(input));
        System.out.println("Reversed: " + StringUtils.reverse(input));
        if(hasVowels(input)) {
            System.out.println(input + " has vowels.");
        } else {
            System.out.println(input + " does not have vowels.3");
        }


    }
    public static boolean hasVowels(String input) {
        return StringUtils.containsAny(input, "aeiou");
    }
}

