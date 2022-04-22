package Assignment5.assignment.singleton;

public class B
{
    String str;
    B(String otherStr){
        str=otherStr;
    }
    //if no return type is mentioned
    public static Object m1(String s) { //since we have return obj
        //static methods can only access static variables;
        //str=s;
        B obj1= new B(s);
        //obj1.str=s;
        return obj1.str;

        /*crct way
        B obj1= new B(s);
        obj1.str=s;
        return obj1.str;
        // in static methods we can call non-static variables using objects*/

    }
    public void print() {
        System.out.println(str);
    }

    public static void main(String[] args)
    {
        String str = "ABCD";
        B obj = new B(str);
        obj.m1(str);
        obj.print();
    }
}
