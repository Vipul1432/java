//Output :-


//Use of print & Println :-

//public class output {
//    public static void main(String[] args) {
//        int a = 5, b = 10;
//        String s = "Vipul";
//        System.out.println(a);
//        System.out.println(a+b);
//        System.out.println(a+ " " +b);
//        System.out.print(s+ " ");
//        System.out.print("Kumar\n");
//    }
//}


//Use fo Printf or format function :-

public class output {
    public static void main(String[] args) {
        int a = 100, b = 200;
        System.out.format("Value of a is %d\n", a);
        float c = (float) Math.PI;
        System.out.println(c);
        System.out.format("Value of PI =%3f\n", c);
        System.out.format("Value of PI =%5.2f\n", c);
        System.out.format("Value of PI =%05.2f\n", c);
        System.out.printf("a = %d, b = %d", a, b);
    }
}
