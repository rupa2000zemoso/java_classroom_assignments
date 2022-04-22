package Assignment11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CountingCharactersInFile
{
    public static void main(String[] args) throws IOException
    {
        //creating file
        PrintWriter pw = new PrintWriter("file1.txt");
        pw.println("hello world !");

        pw.close();

        //read file
        File f = new File("file1.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));

        String s;

        //create new file to write in it
        PrintWriter pw1 = new PrintWriter("file2.txt");
        String s1="";
        while((s=br.readLine())!=null)
        {
            //pw1.println(s);
            s1+=s;
        }
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(Character ch: map.keySet())
        {
            pw1.println(ch+" "+map.get(ch));
        }
        pw1.close();
    }
}
