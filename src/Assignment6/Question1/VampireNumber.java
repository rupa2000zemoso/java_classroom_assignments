package Assignment6.Question1;

import java.util.Arrays;
import java.util.HashSet;

public class VampireNumber
{
    //has even no. of digits (n)
    //the no. can be obtained by multiplying 2 integers x, y each with n/2 digits
    //both fangs cannot end with zero
    //the number can be made with all digits from x and y, in any order and only using each digit once.

    final static int START = 11, END = 1000;

    public static void main(String[] args) {
        char[] kChar, checkChar;
        String kStr, checkStr;
        int k;
        for (int i = START; i < END; i++) {
            for (int i1 = i; i1 < 100; i1++) {

                k = i * i1;

                kStr = Integer.toString(k);
                checkStr = Integer.toString(i) + Integer.toString(i1);


                kChar = kStr.toCharArray();
                checkChar = checkStr.toCharArray();

                Arrays.sort(kChar);
                Arrays.sort(checkChar);

                if (Arrays.equals(kChar, checkChar)) {
                    System.out.println(i + " * " + i1 + " = " + k);
                }
            }
        }
    }
}
