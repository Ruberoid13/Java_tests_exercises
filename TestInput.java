import java.util.Scanner;


public class TestInput {
    public static void main(String[] args) {
        String scanvar;
        Scanner scan = new Scanner(System.in);
        System.out.print("Print something: ");
        scanvar = scan.nextLine();
        System.out.print("You printed: \"" + scanvar + "\"");
    }
}
