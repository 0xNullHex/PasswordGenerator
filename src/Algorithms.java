import java.util.Random;
import java.io.*;
public class Algorithms {
    int length;
    String fileName="Passwords";
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
    public boolean fileIsAvailable(){
        File file= new File(fileName+".txt");
        return file.exists();
    }
    public void createFile(){
        try {
            FileWriter file= new FileWriter(fileName+".txt");
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void setText(String text) throws IOException {
        FileWriter file= new FileWriter(fileName+".txt",true);
        file.append(text).append("\n");
        file.close();

    }

}
