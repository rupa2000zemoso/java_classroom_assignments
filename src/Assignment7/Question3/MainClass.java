package Assignment7.Question3;

public class MainClass
{
    static void method1(interface1 i1) {
        i1.m1();
        System.out.println("method 1.............");
    };
    static void method4(interface4 i4) {
        i4.m4();
        System.out.println("method 4............");
    };
    static void method3(interface3 i3) {
        i3.m3();
        System.out.println("method 3................");
    };
    static void method2(interface2 i2) {
        i2.m2();
        System.out.println("method 2.................");
    };

    public static void main(String[] args)
    {
        execute obj1 = new execute() ;

        method1(obj1);
        method2(obj1);
        method3(obj1);
        method4(obj1);

    }
}
