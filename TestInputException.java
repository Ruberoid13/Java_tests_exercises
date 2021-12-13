import java.util.Scanner;


public class TestInputException {
    public static void main(String[] args) {
        String scanstr;
        int scanint;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input text: ");
        scanstr = scan.nextLine();
        System.out.println("You printed: \"" + scanstr + "\"");
        System.out.print("Input number: ");
        while(true) {
            try {
                scanint = scan.nextInt();
                System.out.println("You printed: \"" + scanint + "\"");
                break;
            } catch (Exception e) {
                System.out.print("Wrong input! Please, input a number:");
                scan.next();
            }
        }
    }
}
