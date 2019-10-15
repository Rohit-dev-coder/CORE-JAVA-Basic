
package basicjavaprogrames;

class One
{
    int i =10;
    void show()
    {
        System.out.println("Super class method : i = "+i);
    }
}

class Two extends One
{
    int i=20;
    void show()
    {
        System.out.println("Sub class method: i = "+i);
        super.show();
        System.out.println("super : i = "+super.i);
    }
}
/*
        super refers to super class memebers from a sub class.
        super can be used to refer to super class variables ,as 
        ---------super.variable
        super can be used to refers to super class methods, as
        ---------super.method()
        super can be used to refer to super class constructor
        ---------super(values);
        
        */
public class Inheritance3_SuperKeyword {
    public static void main(String[] args) {
        Two t = new Two();
        t.show();
    }
}

