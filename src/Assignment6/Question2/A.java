package Assignment6.Question2;

public class A
{
    String name;
    public A()
    {
        //System.out.println("hello world");

        // calling the second constructor
        //using this(parameters...) we can call one constructor inside other

        this("sai");
    }

    public A(String s)
    {


        name = s;
    }

    public void display()
    {
        System.out.println(name);
    }

    public static void main(String[] args)
    {
        A obj = new A();
        obj.display();
    }
}


