
// Copyright Made by Mansour Boucitta aka xSnipeRGh0sTx
import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the lenght of your key: ");
        int lenght = input.nextInt();
        input.close();
        Random random = new Random();
        String characters="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@!&%$";
        String holder="";

        while (holder.length()<lenght){
            holder += characters.charAt(random.nextInt(characters.length()));
        }
        
        System.out.println(holder);
        
    }
}
