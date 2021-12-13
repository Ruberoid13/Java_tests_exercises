import java.util.Scanner;


public class TestStringComparing {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String str;
        while (true) {
            System.out.print("Enter something to print or enter \"exit\" to exit: ");
            str = scan.nextLine();
            System.out.println("You entered: \"" + str + "\"");
            if (str.equals("exit")) {
                System.out.print("Ending program...");
                break;
            }
        }
    }
}
