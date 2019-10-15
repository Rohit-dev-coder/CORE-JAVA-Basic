
package basicjavaprogrames;

class Sample
{
    private double n1,n2;

    public Sample(double x, double y) {
        System.out.println("Constructor Called");
        n1 = x;
        n2 = y;
    }
    /*
    Instance methods are the methods which act on the instance variables of the class.
    To call the instance methods, we should use the form; objectname.methodname().
    */
    void sum()
    {
        double res = n1 + n2;
        System.out.println(res);
    }
}

public class ObjectOriented1_Constructor {
    public static void main(String[] args) {
        Sample s1 = new Sample(10,22.5);
        s1.sum();
        Sample s2 = new Sample(5.5,69.1);
        s2.sum();
    }
}
