package Assignment1;

import java.io.File;
import java.util.Scanner;

public class SearchDirectory
{
    public static void main(String[] args) {
        int found=0;
        while(found==0){
            File file = new File("/home/rupaV");

            //File file = new File(System.getProperty("user.home")+"//Downloads");

            //we have method called list which returns all file in dir as string array
            String[] files = file.list();

            String search;
            //take input i.e. file or folder name for which you would like to find absolute path
            System.out.println("enter name of file");
            //to read input from user we use Scanner
            Scanner s = new Scanner(System.in);
            search = s.nextLine();

            //traverse through the string array and search for the match
            for (String str : files) {
                //System.out.println(str);

                //check if the name of file is present in array list
                Boolean str1 = search.equals(str);

                if (str1) {
                    found = 1;
                    System.out.println("file: " + str + " found");
                    File f = new File(str);
                    System.out.println("path of file is : " + f.getAbsolutePath());
                }
            }

            if (found == 0) {
                System.out.println("file not found");
            }
        }
    }

}
