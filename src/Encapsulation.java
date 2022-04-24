
// Java program to demonstrate encapsulation : -

class Encapsulate {
    // private variables declared
    // these can only be accessed by
    // public methods of class
    private String studentName;
    private int studentRoll;
    private int studentAge;

    // get method for age to access
    // private variable studentAge
    public int getAge()
    {
        return studentAge;
    }

    // get method for name to access
    // private variable studentName
    public String getName()
    {
        return studentName;
    }

    // get method for roll to access
    // private variable studentRoll
    public int getRoll()
    {
        return studentRoll;
    }

    // set method for age to access
    // private variable studentAge
    public void setAge(int newAge)
    {
        studentAge = newAge;
    }

    // set method for name to access
    // private variable studentName
    public void setName(String newName)
    {
        studentName = newName;
    }

    // set method for roll to access
    // private variable studentRoll
    public void setRoll(int newRoll)
    {
        studentRoll = newRoll;
    }
}

public class Encapsulation {
    public static void main(String[] args)
    {
        Encapsulate obj = new Encapsulate();

        // setting values of the variables
        obj.setName("Vipul Kumar");
        obj.setAge(21);
        obj.setRoll(153);

        // Displaying values of the variables
        System.out.println("Student's name: " + obj.getName());
        System.out.println("Student's age: " + obj.getAge());
        System.out.println("Student's roll: " + obj.getRoll());

        // Direct access of studentRoll is not possible
        // due to encapsulation
        // System.out.println("Student's roll: " +
        // obj.studentName);
    }
}
