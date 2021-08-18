import java.util.Random;
import java.io.*;
public class GeneratingAlgorithm {
    int length;
    String Password;
    public String getGeneratingAlgorithm(int length){
        this.length=length;
        Random random = new Random();
        String characters="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@!&%$";
        String holder="";

        while (holder.length()<this.length){
            holder += characters.charAt(random.nextInt(characters.length()));
        }
        return holder;
    }
    public boolean SavePassword(String Password){
        this.Password=Password;
        File File=new File("PasswordList.txt");
        return File.exists();
    }
}
