import java.io.IOException;
import java.util.Scanner;

public class PsswdGenerator {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Algorithms Algorithms = new Algorithms();

        System.out.println("*** Please enter the length you want ***");
        int length = scanner.nextInt();
        while(true) {
            String result = Algorithms.getGeneratingAlgorithm(length);
            System.out.printf("The password is => %s\n", result);
            if (!Algorithms.fileIsAvailable()) {
                Algorithms.createFile();
            }
            Algorithms.setText(result);
        }

    }
}