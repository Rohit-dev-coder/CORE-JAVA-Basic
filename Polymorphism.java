
package basicjavaprogrames;

class Sample4
{
    void add(int a,int b)
    {
        System.out.println("Sum of two = "+(a+b));
    }
    void add(int a,int b,int c)
    {
        System.out.println("Sum of three = "+(a+b+c));
    }
}
        
public class Polymorphism {
    public static void main(String[] args) {
        Sample4 s = new Sample4();
        s.add(5, 5);
        s.add(5, 10,10);
    }
}
