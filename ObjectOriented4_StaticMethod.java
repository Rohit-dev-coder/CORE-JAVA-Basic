
package basicjavaprogrames;

class Sample3
{
   /*
    The reason why static methods can not act on instance variables is that the JVM first executes the static methods
    and then only if creates the objects. Since the objects are not available at the time of calling the static
    methods, the instance variable are also not available.
    
    Note:- 
    Static Method can asses static variables. Static variables are also declared as 'static'.
    see ObjectOriented5_StaticMethod1
    */
    static double sum(double n1,double n2)
    {
        double res = n1 + n2;
        return res;
    }
}

public class ObjectOriented4_StaticMethod {
    public static void main(String[] args) {
        
        double x = Sample3.sum(12.5,55.3);
        System.out.println(x);
        double y = Sample3.sum(55.6, 5.6);
        System.out.println(y);
    }
}
