import java.io.*;
import java.util.ArrayList;

public class Utility {

    public static void writetofile(File file,String text){
        try{
            FileWriter f=new FileWriter(file);
            BufferedWriter b=new BufferedWriter(f);
            f.write(text);
            b.newLine();
            b.close();

        }
        catch(IOException e){

        }
    }
    public static String read(File file){
        String temp=" ";
        String text="";
        try {
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);
            while ((temp = bf.readLine()) != null) {
                text += temp + "\n";
            }
        }
        catch(IOException e){

        }
        return text;
    }
   /* public static void Serialized(File file, ArrayList<Email> list){
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(list);
            os.close();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static ArrayList<Email> deSerialized(File file){
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream is = new ObjectOutputStream(fis);
            ArrayList<Email> list=(ArrayList<Email>)is.readObject();
            is.close();
            return list;
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }*/
}
