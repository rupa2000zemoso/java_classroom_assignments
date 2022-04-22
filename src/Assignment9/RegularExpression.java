package Assignment9;

import java.util.regex.Pattern;

public class RegularExpression
{
        public static void main(String[] args)
        {
            String str1="Am learning regex.";
            String str2="its fun learning this.";
            String str3="Hello";

            String regexpvar = "[A-Z].*\\.";
            System.out.println(Pattern.matches(regexpvar,str3));
        }
}
