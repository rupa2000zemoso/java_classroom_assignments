package Assignment12;

import java.io.PrintStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String engDepartment;
    private int year_of_enrollment;
    private double perTillDate;

    Student(int id, String name, int age, String gender, String engDepartment, int year_of_enrollment, double perTillDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.year_of_enrollment = year_of_enrollment;
        this.perTillDate = perTillDate;
    }

    public static void task1(ArrayList<Student> list) {
        Stream var = list.stream().map((x) -> {
            return x.engDepartment;
        }).distinct();
        //PrintStream var10001 = System.out;
        //Objects.requireNonNull(var10001);
        //var.forEach(var10001::println);
        var.forEach(i->System.out.println(i));
    }

    public static void task2(ArrayList<Student> list) {
        list.stream().filter((x) -> {
            return x.year_of_enrollment > 2018;
        }).forEach((x) -> {
            System.out.println(x.name);
        });
    }

    public static void task3(ArrayList<Student> list) {
        list.stream().filter((x) -> {
            //return x.engDepartment =="Computer Science" && x.gender=="Male";
            return x.engDepartment.equals("Computer Science") && x.gender.equals("Male");
        }).forEach((x) -> {
            System.out.println(x.name);
        });
    }

    public static void task4(ArrayList<Student> list) {
        list.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.counting())).forEach((x, y) -> {
            System.out.println("Count of " + x + " is " + y);
        });

        //employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
    }

    public static void task5(ArrayList<Student> list) {
        ((Map)list.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)))).forEach((x, y) -> {
            System.out.println("Average age of " + x + " is " + y);
        });
    }

    public static String task6(ArrayList<Student> list) {
        return (list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Student::getMarks)))).toString();
    }

    public static void task7(ArrayList<Student> list) {
        ((Map)list.stream().collect(Collectors.groupingBy(Student::getDept,Collectors.counting()))).forEach((x, y) -> {
            System.out.println("Count of " + x + " is " + y);
        });
    }

    public static void task8(ArrayList<Student> list) {
        ((Map)list.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.averagingDouble(Student::getMarks)))).forEach((x, y) -> {
            System.out.println("average percentage of " + x + " is " + y);
        });
    }

    public static String task9(ArrayList<Student> list) {
        return ((Optional)list.stream().filter((x) -> {
            return x.gender.equals("Male");
        }).filter((x) -> {
            return x.engDepartment.equalsIgnoreCase("Electronic");
        }).collect(Collectors.minBy(Comparator.comparingInt(Student::getAge)))).toString();
    }

    public static void task10(ArrayList<Student> list) {
        ((Map)list.stream().filter((x) -> {
            return x.engDepartment.equalsIgnoreCase("computer science");
        }).collect(Collectors.groupingBy(Student::getGender,Collectors.counting()))).forEach((x, y) -> {
            System.out.println("No of " + x + " in Computer Science is " + y);
        });
    }

    public double getMarks() {
        return this.perTillDate;
    }

    public String toString() {
        return this.name + " " + this.engDepartment + " " + this.age + " " + this.gender;
    }

    public String getName() {
        return this.name;
    }

    private String getDept() {
        return this.engDepartment;
    }

    private int getAge() {
        return this.age;
    }

    private String getGender() {
        return this.gender;
    }
}
