import java.util.Random;
public class GeneratingAlgorithm {
    int length;
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
}
