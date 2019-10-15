
package basicjavaprogrames;

class Sample1
{
    private double n1,n2;

    public Sample1 (double x, double y) {
        n1 = x;
        n2 = y;
    }
    
    double sum()
    {
        double res = n1 + n2;
        return res;
    }
}

public class ObjectOriented2_Methods {
    public static void main(String[] args) {
        Sample1 s1 = new Sample1(10,22.5);
        double x = s1.sum();
        System.out.println(x);
        Sample1 s2 = new Sample1(5.5,69.1);
        double y = s2.sum();
        System.out.println(y);
    }
}
