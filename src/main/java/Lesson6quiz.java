//https://form.jotform.com/231063173199052
// public class Lesson6quiz {
//            private int x = 10;
//            static int m1() {
//                int y = x;
//                return y;
//            }
//            public static void main(String[] args) {
//                m1();
//            }}

//      class Myclass
//    {
//        static int a = 20;
//        static int b = 30;
//        static int c = 40;
//        Myclass()
//        {
//            a = 200;
//        }
//        static void m1() {
//            b = 300;
//        }
//        static {
//            c = 400;
//        }
//        public static void main(String[] args) {
//            System.out.println(a);
//            System.out.println(b);
//            System.out.println(c);
//        }
//    }

// class Myclass {
//    static int a = 20;
//    Myclass() {
//        a = 200;
//    }
//    public static void main(String[] args) {
//        new Myclass();
//        System.out.println(a);
//    }
//}

/* class Myclass {
    static {
        System.out.println("static block");
    }
    {
        System.out.println("instance block");
    }
    public static void main(String[] args) {
        Myclass obj = new Myclass();
        Myclass obj2 = new Myclass();
        Myclass obj3 = new Myclass();
    }}
 */
// class Myclass {
//    private static int x = 10;
//    static {
//        x++;
//    }
//    static {
//        ++x;
//    }
//    {
//        x--;
//    }
//    public static void main(String[] args) {
//        Myclass obj = new Myclass();
//        Myclass obj2 = new Myclass();
//        Myclass obj3 = new Myclass();
//        System.out.println(x);
//    }
//}