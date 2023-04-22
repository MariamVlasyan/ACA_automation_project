package a;

import b.AA;
import b.B;

public class A {
    String myStringFromA = "A";
    B b = new B();
    AA a = new AA();
}

//package org.example;
//
//ToDo
//              /*  charAt()-Returns the character located at the specified index.
//                concat()-Appends one String to the end of another("+"also works).
//                equalsIgnoreCase()-Determines the equality of two Strings,ignoring case.
//                length()-Returns the number of characters in A String.
//                replace()-Replaces occurrences of A character with A new character.
//                substring()-Returns A part of A String.
//                toLowerCase()-Returns A String with uppercase characters converted.
//                toString()-Returns the value of A String.
//                toUpperCase()-Returns A String with lowercase characters converted.
//                trim()-Removes whitespace from the ends of A String.
//                equals(s1:Object):Boolean - Returns true if this string is equal to string s1.
//                equalsIgnoreCase(s1:String):Boolean - Returns true if this string is equal to string s1 case-insensitive.
//                compareTo(s1:String):int - Returns an integer greater than 0, equal to 0, or less than 0 to indicate whether this string is greater than, equal to, or less than s1.
//                compareToIgnoreCase(s1:String):int - Same as compareTo except that the comparison is case-insensitive.
//                startsWith(prefix:String):Boolean - Returns true if this string starts with the specified prefix.
//                endsWith(suffix:String):boolean - Returns true if this string ends with the specified suffix.
//                intern()
//               */
//
//import java.awt.print.Book;
//
public class Main {
    public static void main(String[] args) {
    }
}


////
//class BookWithMultipleConstructors
//{
//    public static void main(String s[])
//    {
//        class Book{
//        int edition;
//        String author;
//        String name;
//
//            public Book() {
//                this.edition = edition;
//                this.author = author;
//                this.name = name;
//            }
//
//            public void String printData(int edition, String author, String name){
//        Book book1 = new Book("Java, The Complete Reference");
//        Book book2 = new Book("Java, The Complete Reference", "Herbert Schildt");
//        Book book3 = new Book("Java, The Complete Reference", "Herbert Schildt", 8);
//
//        System.out.println("Book 1 = " + book1.name);
//        System.out.println("Book 2 = " + book2.name + " - " + book2.author);
//        System.out.println("Book 3 = " + book3.name + " - " + book3.author + " - " + book3.edition);
//
//    }
//}
//
////class Main {
////    public static void main(String[] args) {
////    }
////        class Student {
////            String firstName;
////            String lastName;
////            int age;
////
////            Student() {
////                System.out.println("The student info is: ");
////            }
////
////            Student(String firstName, String lastName, int age) {
////                firstName = firstName;
////                lastName = lastName;
////                age = age;
////            }
////
////            String getStudentInfo() {
////                String getStudentInfo = "Student data is: " + firstName + ", " + lastName + ", " + age;
////                return getStudentInfo;
////            }
////
////            void printStudentInfo() {
////                String studentInfo = "Student data is: " + firstName + ", " + lastName + ", " + age;
////                System.out.println(studentInfo);
////            }
////        }
////    }
//
//
////ToDo exercise 3
////        float number = 2.8f;
////        int castedNumber = (int) number;
////        System.out.println(castedNumber);
////    }
////ToDo exercise 2
////    public static void mothodString() {
////        String s = new String();
////        s = "asas";
////        String s1 = new String("asdasd");
////        s = s.concat(s1);
////            System.out.println(s);
//
////        //ToDo exercise 3
////        String x = "Java";
////        String rules = x.concat(" Rules!");
////        System.out.println("x = " + rules);
////
////        //ToDo exercise 4
////        String x1 = "Java";
////        x1.concat(" Rules!");
////        System.out.println("x = " + x1);
////        x1.toUpperCase(Locale.ROOT);
////        System.out.println("x = " + x1);
////
////        //ToDo exercise 5 replace
////        String x2 = x1.replace("J", "A");
////        System.out.println(x2);
////
////        //ToDo exercise 5 - to lower case - not completed
////        String lower = "Java";
////        lower = lower.concat("Rules!");
////
////        String xx = lower.replaceAll(x2, "A");
////        System.out.println(xx);
////
////        String s = "Java String Quiz";
////        System.out.println(s.substring(2,6));
//
////        String s1 = new String("Welcome");
////                String s2 = "welcome";
////
////        if (s1.compareTo(s2) > 0) {
////            // s1 is greater than s2
////        }
////        else if (s1.compareTo(s2) == 0) {
////            System.out.println("s1 and s2 have the same contents");
////        }
////        else
////            System.out.println("s1 is less than s2");
////
////        //Todo Lesson 3 Class and objects
////        // access modifiers - public, private
////        Cat myCat = new Cat();
////        Cat cat1 = new Cat("red", "Shotland");
////        System.out.println(cat1.color);
////        System.out.println(cat1.bread);
////        System.out.println(cat1.getCatInfo());
////        cat1.printCatInfo();
////
////        int num = 5;
////        num = increment(num, 15);
////        System.out.println(num);
////    }
////
////    static int increment(int num, int value) {
////        return num += value;
////    }
////}
////
////class Cat {
////    String color;
////    String bread;//
////    Cat() {
////        System.out.println("The object has created");
////    }
////
////    Cat(String color, String bread) {
////        this.color = color;
////        this.bread = bread;
////    }
////
////    String getCatInfo() {
////        String catinfo = "color is: " + color + "bread is" + bread;
////        return catinfo;
////    }
////
////    void printCatInfo() {
////        String catinfo = "color is: " + color + "bread is" + bread;
////        System.out.println(catinfo);
////    }
//
////    class Mobile () {
////        String model;
////        int numberOfSims;
////        int memory;
////        boolean hasCamera;
////
////
////        String getMobileInfo(String model, int numberOfSims, int memory, boolean hasCamera) {
////            this.model = model;
////            this.numberOfSims = numberOfSims;
////            this.memory = memory;
////            this.hasCamera = hasCamera;
////        }
////
////    }
////    }
//
////}