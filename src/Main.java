import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Hello! My name is Bob. And you are?");
        String message1 = scanner.nextLine();
        System.out.println("Nice to meet you, " + message1 + "! May I know how do you talk to me?");
        String message2 = scanner.nextLine();
        System.out.println("That is so cool! I just 'speak' 0s and 1s");
        String message3 = scanner.nextLine();
        System.out.println("Don't worry. It's easy!");
        String message4 = scanner.nextLine();
        System.out.println("Ok. See you later, " + message1 + ".");
        String message5 = scanner.nextLine();
        System.out.println("Bye!");
    }
}