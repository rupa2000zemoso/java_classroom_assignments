package Assignment6.Question3;


//Create a class with a constructor that takes a String argument. During construction, print the argument.
//Create an array of object references to this class, but don't actually create objects to assign into the array.
//When you run the program, notice whether the initialization messages from the constructor calls are printed.

public class Question3 {
    Question3(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        //creating array of objects

        //question3 empObjects[];
        //The declarations of the array of objects above will need to be instantiated using ‘new’ before being used in the program.

        /*so, if you have a class ‘Employee’ then you can create an array of Employee objects as given below:
      Employee[] empObjects;
        OR
     Employee empsObjects[];*/

        Question3 empObjects[] = new Question3[2];

        //The above statement will create an array of objects ‘empObjects’ with 2
        // elements/object references.

        /*In the case of an array of objects, each element of array i.e. an object needs to be initialized.
         an array of objects contains references to the actual class objects.
         Thus, once the array of objects is declared and instantiated,
         you have to create actual objects of the class.*/
        /* Employee[] obj = new Employee[2] ;

     //create & initialize actual employee objects using constructor
     obj[0] = new Employee(100,"ABC");
     obj[1] = new Employee(200,"XYZ");

class Employee{
  //constructor
  Employee(inteid, String n){
     empId = eid;
     name = n;*/


        //example for array of objects
        //https://www.softwaretestinghelp.com/array-of-objects-in-java/
    }
}