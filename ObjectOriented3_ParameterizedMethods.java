
package basicjavaprogrames;

class Sample2
{
   
    double sum(double n1,double n2)
    {
        double res = n1 + n2;
        return res;
    }
}

public class ObjectOriented3_ParameterizedMethods {
    public static void main(String[] args) {
        Sample2 s = new Sample2();
        double x = s.sum(12.5,55.3);
        System.out.println(x);
        double y = s.sum(55.6, 5.6);
        System.out.println(y);
    }
}


/*
Since sum() method is not using any instance variable, there is no need to create an object to call this method.
such methods are calle 'static method'.
*/