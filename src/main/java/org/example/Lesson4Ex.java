package org.example;

//class Lesson4Ex {
//    int A, b;
//
//    Lesson4Ex() {
//        A = 10;
//        b = 20;
//    }
//
//    public void print() {
//        System.out.println("A = " + A + " b = " + b);
//    }
//}
//
//class Test {
//    public static void main(String[] args) {
//        Lesson4Ex obj1 = new Lesson4Ex();
//        obj1.A += 1;
//        obj1.b += 1;
//
//        System.out.println("values of obj1 : ");
//        obj1.print();
//    }
//}
//
//
//class Rose {
//    public Rose(String name) {
//        System.out.println("Passed Name is :" + name);
//    }
//
//    public static void main(String[] args) {
//        Rose myRose = new Rose("red");
//        myRose = new Rose("white");
//    }
//}
//
//class Counter {
//    int count = 0;
//
//    Counter() {
//        count++;
//    }
//
//    public static void main(String srt[]) {
//        Counter c1 = new Counter();
//        Counter c3 = new Counter();
//        Counter c2 = new Counter();
//        System.out.print(c1.count + ", ");
//        System.out.print(c2.count + ", ");
//        System.out.print(c3.count);
//    }
//}
//

//class BookWithMultipleConstructors {
//    public static void main(String s[]) {
//        Book book1 = new Book("Java, The Complete Reference");
//        Book book2 = new Book("Java, The Complete Reference", "Herbert Schildt");
//        Book book3 = new Book("Java, The Complete Reference", "Herbert Schildt", 8);
//
//        System.out.println("Book 1 = " + book1.name);
//        System.out.println("Book 2 = " + book2.name + " - " + book2.authorName);
//        System.out.println("Book 3 = " + book3.name + " - " + book3.authorName + " - " + book3.edition);
//
//    }
//
//    class Book {
//        String name;
//        String authorName;
//        int edition;
//
//        public Book(String name) {
//            this.name = name;
//        }
//
//        public Book(String name, String authorName) {
//            this.name = name;
//            this.authorName = authorName;
//        }
//
//        public Book(String name, String authorName, int edition) {
//            this.name = name;
//            this.authorName = authorName;
//            this.edition = edition;
//        }
//    }
//}

//class Points{
//    int x;
//    int y;

//    Points(String s, String s1, int x, int y){
//        this.x = x;
//        this.y = y;
//        System.out.println("x=:" + x + "; " + "y=:" + y);
//    }
//
//    public static void main(String[] args) {
//        Points points1 = new Points("%s", "%s", 10 ,5);
//        Points points2 = new Points("%s", "%s", 11 ,6);
//    }
//}
//
//class Points {
//    int x;
//    int y;
//
//    Points(int _x, int _y) {
//        x = _x;
//        y = _y;
//    }

//    public static void main(String[] args) {
//        PointsPoints points1 = new PointsPoints(10, 5);
//        points1.printPointInfo();
//        PointsPoints points2 = new PointsPoints(11, 6);
//        points2.printPointInfo();
//        PointsPoints c = points1;
//        points1.x = 12;
//        points1.printPointInfo();
//        c.printPointInfo();
//        c.y = 35;
//        points1.printPointInfo();
//
//        Point[] myPoint = new Point[5];
//        System.out.println("Array list length is: " + myPoint.length);
//        System.out.println(myPoint[0]);
//    }
//
//    void printPointInfo() {
//        System.out.printf("x : %s \n\ry : %s \n\r", x, y);
//    }
//}
//
//class PointsPoints {
//    int x;
//    int y;
//
//    PointsPoints(int _x, int _y) {
//        x = _x;
//        y = _y;
//    }

//  public static void main(String[] args) {
//        PointsPoints A = new PointsPoints(10, 5);
//        A.printPointInfo();
//        PointsPoints b = new PointsPoints(11, 6);
//        b.printPointInfo();
//        PointsPoints c = A;
//        A.x = 12;
//        A.printPointInfo();
//        c.printPointInfo();
//        c.y = 35;
//        A.printPointInfo();
//
//        PointsPoints[] myPoint = new PointsPoints[5];
//        System.out.println("Array list length is: " + myPoint.length);
//        System.out.println(myPoint[0]);
//        myPoint[0] = A;
//    }
//
//    void printPointInfo() {
//        System.out.printf("x : %s \n\ry : %s \n\r", x, y);
//    }
//  Define the Bike class such that the program compiles and runs without any error.     class
//   class BikeTester
//    {
//        public static void main(String[] args)
//        {
//            Bike bike = new Bike("Hero Honda", "Shine", 125, true);
//            bike.mileage = 72.5;
//            bike.diskBrakes = false;
//            System.out.println(bike.company + "'s " + bike.model + " gives A mileage of " + bike.mileage + "kmpl."
//                    + bike.diskBrakes  + " and it's false");
//        }
//
//        static class Bike {
//            String company;
//            String model;
//            double mileage;
//            boolean diskBrakes;
//
//        public Bike(String company, String model, double mileage, boolean diskBrakes){
//            this.company = company;
//            this.model = model;
//            this.mileage = mileage;
//            this.diskBrakes = diskBrakes;
//        }
//        }
//    }
////Define Student class and write the output of the following program
class OutPut {

    //        Scanner myScanner = new Scanner(System.in);
//        Student mark = new Student();
//        mark.name = myScanner.nextLine();
//        System.out.println("Student name is:" + mark.name);
    public static void main(String[] args) {
    }
}


//        Student yogesh = new Student("Yogesh", 67, 'B');
//        Student narayan = new Student("Narayan", 72);
//        Student mahesh = new Student("Mahesh");
//        Student kiran = new Student();
//        System.out.println("Name = " + yogesh.name + ", section = " + yogesh.section + ", marks = " +
//                yogesh.marks);
//        System.out.println("Name = " + narayan.name + ", section = " + narayan.section);
//        System.out.println("Name = " + mahesh.name);
//        System.out.println();


class Student {
    String name;
    char section;
    int marks;
    int[] mark = {1, 5, 7, 8, 9};

    public Student(String name, int marks, char section) {
        this.name = name;
        this.section = section;
        this.marks = marks;
        System.out.println(mark[0] + "  " + mark[4]);
    }

    public Student(String name, int marks) {
        this.marks = marks;
        this.section = section;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {

    }

}
//ToDo

//    //What will be the output of the following program.( Define the class)
//    class BikeTester {
//        public static void main(String s[]) {
//            Bike bike = new Bike();
//            bike.company = "Hero Honda";
//            bike.model = "Shine";
//            bike.cc = 150;
//            bike.c = 12.5;
//            bike.diskBrakes = true;
//            System.out.println(bike.company + "'s " + bike.model + " gives A mileage of " + bike.cc + " cc= " + bike.diskBrakes + " true: " + bike.c + " c= " + bike.mileage +
//                    "kmpl.");
//        }
//
//        public static class Bike {
//            double mileage;
//            String company;
//            String model;
//            int cc;
//            double c;
//            boolean diskBrakes;
//
//            public Bike() {
//                this.company = company;
//                this.model = model;
//                this.cc = cc;
//                this.c = c;
//                this.diskBrakes = diskBrakes;
//                this.mileage = mileage;
//            }
//
//        }
//    }


//    What will be the output of the following program.
//class Tricky {
//    int num;
//
//    Tricky(int n) {
//        num = n;
//    }
//
//    Tricky inc() {
//        Tricky temp = new Tricky(num + 10);
//        return temp;
//    }
//}
//
//class TrickyQuestion {
//    public static void main(String s[]) {
//        Tricky num1 = new Tricky(10);
//        Tricky num2;
//        num2 = num1.inc();
//        System.out.print("The program will display the output as: ");
//        System.out.print(num1.num + ",");
//        System.out.print(num2.num + ",");
//        num2 = num1.inc();
//        System.out.print(num2.num);
//    }
//}
//
//class CarTester {
//    public static void main(String s[]) {
//        Car car = new Car("Maruti", "Wagon R", 1000, 12.4);
//        System.out.println(car.company + "'s " + car.model + " has engine power of " + car.cc + "cc.");
//    }
//}
//
//class Car {
//    Car(String company, String model, int cc, double mileage) {
//        company = company;
//        model = model;
//        cc = cc;
//        mileage = mileage;
//    }
//
//    String company;
//    String model;
//    int cc;
//    double mileage;
//}
//

//import java.sql.SQLOutput;
//import java.util.SortedMap;
//
//class CalculateProfitEnvironment {
//    public static void main(String[] args) {
//        Investment investment = new Investment("Options", 20000, 9.3f);
//        System.out.println("After 1 year profit from" + investment.name + "would be " + investment.calculateProfit());
//    }
//
//    static class Investment {
//        String name;
//        int amount;
//        float percentage;
//
//        public Investment (String name, int amount, float percentage) {
//            this.name = name;
//            this.amount = amount;
//            this.percentage = percentage;
//        }
//
//        public float calculateProfit() {
//            float profit;
//            profit = amount * percentage / 100;
//            return profit;
//        }
//    }
//}
//
//class ConvertMobileToDelimitedFormat
//{
//    public static void main(String[] args) {
//        Mobile mobeen_mobile = new Mobile (1, "Nokia","3412", 2.5);
//        System.out.println("Converted Delimited Format is: " + convertToDelimitedFormat(mobeen_mobile));
//    }
//
//    public static String convertToDelimitedFormat(Mobile mobeen_mobile) {;
//        return null;
//    }
//}
//class Mobile{
//        int numberOfSims;
//        String maker;
//        String model;
//        double cameraMegaPixels;
//
//        public Mobile(int numberOfSims, String maker, String model, double cameraMegaPixels){
//            this.numberOfSims = numberOfSims;
//            this.maker = maker;
//            this.model = model;
//            this.cameraMegaPixels = cameraMegaPixels;
//        }
//}
////constructor error will be
//public class InitializationTest{
//    int number;
//    public void InitializationTest(int number){
//        this.number = number;
//        System.out.println(number);
//    }
//
//    public static void main(String... args) {
//        InitializationTest obj1, obj2;
//        obj1 = new InitializationTest();
//        obj2 = new InitializationTest(5);
//    }
//}


//}

