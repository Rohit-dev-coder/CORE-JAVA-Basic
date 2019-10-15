/*
When sub class object is created. First of all super class default constructor is called and then only the sub
class constructor is called.
*/
package basicjavaprogrames;
class Demo1
{
    Demo1()
    {
        System.out.println("Demo1 Constructer is called");
    }
}
class Demo2 extends Demo1
{
    Demo2()
    {
        System.out.println("Demo2 Constructer is called");
    }
}

public class Inheritance4_SuperKeyword {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
    }
}
