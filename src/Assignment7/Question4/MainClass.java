package Assignment7.Question4;

/*n Factory pattern, we create object without exposing the creation logic to the client
and refer to newly created object using a common interface.
 */

import java.util.concurrent.Callable;

//Use the Factory to get object of concrete class by passing an information such as type.
public class MainClass
{
    public static void main(String[] args)
    {
        FactoryClass fc = new FactoryClass();

        //get object of bicycle and call method
        Cycle c1 = fc.getType("bicycle"); // interface
        //call display method of bicycle
        c1.display();

        Cycle c2 = fc.getType("unicycle");
        c2.display();

        Cycle c3= fc.getType("tricycle");
        c3.display();

    }
}

