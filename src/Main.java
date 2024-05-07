import java.io.File;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        File file=new File("file.txt");

        ArrayList<String> arraylist=new ArrayList<>();
        String data=Utility.read(file);
        arraylist.add(data);
        String dataa[]=data.split("\n");
        for(String temp:dataa){
            String arr[]=temp.split(",");
            System.out.println(arr[0]);
        }

    }
}