package org.example;

public class Lesson7 {
    //max value returning
 /*   static int getMax(int x, int y) {
        int maxValue = x;
        if (y > x) {
            maxValue = y;
        }
        return maxValue;
    }

    public static void main(String[] args) {
        System.out.println(getMax(5, 25));

        int maxVal = getMax(5, 25);
        System.out.println("Max values is: " +maxVal);}*/
//ternal operator
    static int getMax(int x, int y) {
        //expression if true return y if false return x
        int maxV = (y > x) ? y : x;
        int max = (y > x) && (x > 0) ? y : x;
        return maxV;

        //    return (y > x) ? y : x;
    }

    public static void main(String[] args) {
        System.out.println(getMax(5, 25));
    }
}

