
package basicjavaprogrames;

class Shape
{
    double area =0;
    protected double l;
    Shape(double l)
    {
        this.l = l;
    }
}
class Square extends Shape
{
    Square(double l)
    {
        super(l);
    }
    void calculate()
    {
        area = l*l;
    }
    void showarea()
    {
        calculate();
        // becaues of inheritance l is available
        System.out.println("Area of square : "+area);
    }
}
class Rectangle extends Shape
{
    private double b;
    Rectangle(double x,double y)
    {
        super(x);
        b = y;
    }
    void calculate()
    {
        area = l*b;
    }
    
    void showarea()
    {
        calculate();
        System.out.println("Area of Rectangle = "+area);
    }
}
public class Inheritance6 {
    public static void main(String[] args) {
        Square s= new Square(5);
        s.showarea();
        Rectangle r = new Rectangle(5,6);
        r.showarea();
    }
}
