package Assignment5.assignment.main;

import Assignment5.assignment.data.A;
import Assignment5.assignment.singleton.B;

public class MainClass {

    public static void main(String[] args) {
        A obj =new A();
        //global variables which can print default values.
        obj.printing();
        //local variables which are not initialized but does not get any default values.
        obj.show(); //or A.show()

        /*for A also use a.show bcz its static method*/

        //static methods can only access static variables.
        /*B obj1 = new B("str");
        obj1.m1("str");
        obj1.print();*/

        //for static methods no need to create obj
        B.m1("my string");

        //assignment 5
    }

}
