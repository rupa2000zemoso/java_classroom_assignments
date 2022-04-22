package Assignment7.Question1;


public class Main1
{
    public static void main(String[] args)
    {
        Rodent[] rodent = new Rodent[3];

        // if class is abstract we can't create obj for that class directly, using reference we have to create or implement all methods
        rodent[0] = new Hamster();
        rodent[0].display();
        rodent[0].rodent();

        rodent[1] = new Mouse();
        rodent[1].rodent();
        rodent[1].display();

        rodent[2]= new Gerbil();
        rodent[2].rodent();
        rodent[2].display();
    }
}

abstract class Rodent
{
    public void rodent()
    {
        System.out.println("small gnawing mammals...........");
    }

    public abstract void display();
}

class Mouse extends Rodent
{
    Mouse()
    {
        System.out.println("am mouse constructor....");
    }
    public void display()
    {
        System.out.println("am mouse..");
    }
}

class Gerbil extends Rodent
{
    Gerbil()
    {
        System.out.println("am gerbil constructor....");
    }

    public void display()
    {
        System.out.println("am gerbil");
    }
}

class Hamster extends Rodent
{
    Hamster()
    {
        System.out.println("am hamster constructor....");
    }

    public void display()
    {
        System.out.println("am hamster");
    }
}
