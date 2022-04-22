package Assignment7.Question5;

import Assignment7.Question5.AOuter.AInner;

public class MainClass {
}

class AOuter
{
    AOuter()
    {
        System.out.println("outer class default constructor");
    }

    class AInner
    {
        AInner(int a,int b)
        {
            System.out.println("value of a AND b is: "+a+" "+b);
            System.out.println("inner class of A");
        }
    }
}

/*class BOuter
{
    BOuter()
    {
        System.out.println("B outer class");
    }

    class BInner extends AInner
    {
        BInner(int a, int b) {
            super(a, b);
        }
    }

}*/
