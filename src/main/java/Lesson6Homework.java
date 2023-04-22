public class Lesson6Homework {

//TODO 1
// Write a program to print the area and perimeter of a triangle by creating a class named 'Triangle'
// with 3 parameters in its constructor.( in separate class ). Triangle sides are entered through
// keyboard. Also check in the constructor that valid values are passed( Scanner class) mi hat classs erankyuni (packageov erkrachapakan araganer), ereq parameter parunakox constructoer, erankyan tver@ scanner classov
// erku koxmeri gumar@ mec lini 3-rdic, negative number.

        static class Triangle {
                int a;
                int b;
                int c;

                public int getPerimeter() {
                        return (a + b + c);
                }

                public double getArea() {
                        int s = getPerimeter() / 2;
                        double areaTriangle = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                        return areaTriangle;
                }
        }
}

//            public int AreaCalculate(int a, int b, int c) {
//                this.a = a;
//                this.b = b;
//                this.c = c;
//            }
//
//            public int getArea(){
//
//                return getArea();
//            }
//
//
//                int s = a * b * c;
//                System.out.println("s:=" + s);
//                return s;
//            }
//
////        public int Perimeter(int d, int e, int f) {
////            int p = d + e + f;
////            return p;
////        }
//
//
//            public static void main(String[] args) {
//                Scanner myScanner = new Scanner(System.in);
//
////                AreaCalculate area = new AreaCalculate();
//                String x = myScanner.nextLine();
//                String y = myScanner.nextLine();
//                String z = myScanner.nextLine();
//                System.out.println("X= " + x + "\nY= " + y + "\nZ= " + z);
////                System.out.println(area);
//
////        System.out.println("Area= " + area);
//area        }}}

//ToDo 2 Write a program to calculate the sum, difference and product of two numbers by creating a class named 'ActionsWithNumbers' with separate methods for each operation. Numbers and action types are entered by user.( make methods static
// stananq tver u asi te inch en uzum anel, +, - ...
//ToDO 3 Write a program that would print the information (name, year of joining, salary, workingHours, address) of three employees by creating a class named 'Employee'. The output should be as follows: Name Year of joining Salary Address Robert 2004 2000$ 64C
//WallsStreat Sam 2020 1300$ 68D- WallsStreat. John 2019 1000k 26B- WallsStreat
// employee class, ira mej anun, join tari, sum,  address
//ToDo 4 Write a program by creating an 'Employee' ( in addition to previous question) class having the following methods and print the final salary. 1 - 'getInfo()' which takes the salary, number of
//hours of work per day of employee as parameter 2 - 'AddSal()' which adds $10 to salary of the employee if it is less than 1100. 3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.
//TODO 5 Make the Adress as class and use in previous example
//TODO 6 Write a program to print the area of a rectangle by creating a separate class named 'Rectangle'. Class should contain getter and setter methods for length and breadth of rectangle. Also methods for calculating area(S) and perimeter(P) of the rectangle. Length and breadth of rectangle are entered through keyboard.( Scanner class)


