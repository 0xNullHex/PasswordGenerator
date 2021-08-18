import java.util.Scanner;
public class PsswdGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GeneratingAlgorithm value = new GeneratingAlgorithm();
        while (true) {
            System.out.println("*** Please enter the length you want ***");
            int length = scanner.nextInt();
            String result = value.getGeneratingAlgorithm(length);
            System.out.printf("The password is => %s\n", result);
        }
        value.SavePassword("test");
    }
}
