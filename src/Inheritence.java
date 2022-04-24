
// Single Inheritence :-

//class one {
//    public void print_Hello()
//    {
//        System.out.println("Hello,");
//    }
//}
//
//class two extends one {
//    public void print_for() { System.out.println("Mr.Vipul"); }
//}
//// Driver class
//public class Inheritence {
//    public static void main(String[] args)
//    {
//        two g = new two();
//        g.print_Hello();
//        g.print_for();
//    }
//}


//Multilevel Inheritence :-

class one {
    public void print_hello()
    {
        System.out.print("Hello,");
    }
}

class two extends one {
    public void print_name() { System.out.print("Mr.Vipul "); }
}

class three extends two {
    public void print_surName()
    {
        System.out.println("Upadhyay");
    }
}

// Drived class
public class Inheritence {
    public static void main(String[] args)
    {
        three g = new three();
        g.print_hello();
        g.print_name();
        g.print_surName();
    }
}


//    Hierarchical Inheritance :-



