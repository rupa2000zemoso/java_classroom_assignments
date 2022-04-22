package Assignment7.Question4;


/*n Factory pattern, we create object without exposing the creation logic to the client
and refer to newly created object using a common interface.
 */


public class FactoryClass
{
    //using getType method to get object of type Cycle
    public Cycle getType(String type)
    {
        if(type==null)
        {
            return null;
        }
        if(type.equalsIgnoreCase("Bicycle"))
        {
            return new Bicycle();
        }
        else if(type.equalsIgnoreCase("Unicycle"))
        {
            return new Unicycle();
        }
        else if (type.equalsIgnoreCase("Tricycle"))
        {
            return new Tricycle();
        }
        return null;
    }
}
