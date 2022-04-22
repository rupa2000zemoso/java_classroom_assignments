package Assignment8;

public class ErrorHandling
{

    public static void main(String[] args)
    {
        int i,j;
        i=8;
        j=9;
        int a[] =new int[6];
        a[4] = 8;
        //a[6] am writing then wrong bcz a[5] is last idx starts with 0

        try {
            int k = i / j;

            if(k==0)
                throw new MyException("this is not possible"); // here we are passing string to obj, so create constructor
            System.out.println(k);

            for(int c=0;c<=a.length;c++)
            {
                a[j]=5; //ArrayIndexOutOfBoundException
            }
        }
        catch(MyException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println("error"+e.getMessage());
        }
    }
}


   /* int i,j;
        i=8;
                j=0;

                try {
                int k = i / j;
                System.out.println(k);
                }
                catch(Exception e)
                {
                System.out.println("error");
                }*/


