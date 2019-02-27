import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TheSingleton
{
    // static variable single_instance of type Singleton 
    private static TheSingleton single_instance = null;
    private static int counter,currentCounter = 0 ;
    private  String content[];
    // variable of type String 
    public String s;

    // private constructor restricted to this class itself 
    private TheSingleton()
    {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("F:\\CBU\\CSC 526\\Assignment\\cities.txt"));
            reader = new BufferedReader(new FileReader("F:\\CBU\\CSC 526\\Assignment\\Bible.txt"));

            StringBuilder stringBuilder = new StringBuilder();
            String line = null;
            String ls = System.getProperty("line.separator");
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }
            // delete the last new line separator
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            reader.close();

            content = stringBuilder.toString().split(" ");
            counter = content.length;
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // static method to create instance of Singleton class 
    public static TheSingleton getInstance()
    {
        if (single_instance == null)
            single_instance = new TheSingleton();

        return single_instance;
    }

    public synchronized String getWord() {

        //System.out.println(currentCounter);
        if(currentCounter < counter){
            String r = content[currentCounter] + " "+currentCounter;
            currentCounter = currentCounter + 1;
            //System.out.println(currentCounter);
            return r;
        }else{
            return null;
        }
    }
} 