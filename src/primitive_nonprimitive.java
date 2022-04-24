//Non-Primitive type :-

//class point{
//    int a;
//    int b;
//}
//public class primitive_nonprimitive {
//    public static void main(String[] args) {
//        point p1 = new point();
//        p1.a = 10;
//        p1.b = 20;
//        point p2 = p1;
//        p2.a = 30;
//        System.out.println(p1.a);
//        System.out.println(p2.a);
//    }
//}



//Primitive type :-



public class primitive_nonprimitive {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b = 20;
        System.out.println(a);
        System.out.println(b);
    }
}