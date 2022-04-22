package Assignment2;

public class CheckIfStringHasAllAlphabets
{
    public static void main(String[] args)
    {String s="THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
        //String s="HELLO WORLD";
        s = s.replace(" ","");

        char y[]=s.toCharArray();  //o(n)

        int len=y.length;

        int a[]= new int[26]; //o(n)

        int i=0;

        while(i!=len)
        {
            //int idx = y[i]-65;
            int idx=y[i]-'A';
            a[idx]=1;
            i++;
        } //

        i=0;
        while (i!=26)
        {
            if(a[i]==1)
            {
                i++;
            }
            else
            {
                System.out.println("given string doesn't contain all alphabets");
                //break;
                System.exit(0);
            }
        }
        System.out.println("contains all alphabets");
    }
}

//pangram program

//o(n) time
//space complexity: o(n)



