package Assignment7.Question2;

/*subclass (child) - the class that inherits from another class
superclass (parent) - the class being inherited from */

/* 1.A process of converting one data type to another is known as Typecasting
    2.Upcasting and Downcasting is the type of object typecasting.
    3.Parent and Child objects are two types of objects
    4.So, there are two types of typecasting possible for an object, i.e.,
     Parent to Child and Child to Parent or can say Upcasting and Downcasting.
 */

/*1.upcasting
By using the Upcasting, we can easily access the variables and methods of the parent class to the child class.
Here, we don't access all the variables and the method.
We access only some specified variables and methods of the child class.*/

/*2
DownCasting

 */

/*There are two ways in which the objects can be initialized while inheriting the properties of the parent and child classes. They are:

Child c = new Child():
The use of this initialization is to access all the members present in both parent and child classes, as we are inheriting the properties.

Parent p = new Child():
This type of initialization is used to access only the members present in the parent class and the methods which are overridden in the child class.
This is because the parent class is upcasted to the child class.
 */
abstract class Cycle
{
    public abstract void balance();
}

class Unicycle extends Cycle
{
    public void balance()
    {
        System.out.println("from unicycle...........");
    }
}

class Bicycle extends Cycle
{
    public void balance()
    {
        System.out.println("from bicycle..............");
    }
}

/*class Tricycle extends Cycle
{
//error bcz not implementing balance method
}*/

public class UpDownCasting
{
    public static void main(String[] args)
    {
        Cycle[] obj = new Bicycle[3];

        obj[0] = new Bicycle();
        obj[0].balance();

        Cycle[] obj1 = new Unicycle[3];
        obj1[1] = new Unicycle();
        obj1[1].balance();

       /*obj[2]=new Tricycle();
        obj[2].balance(); */


    }
}


/*conclusion
From the above example, it can be clearly understood that
we can not access child class members using a parent class reference even though it is of the child type.
 */