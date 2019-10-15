
package basicjavaprogrames;

class Test
{
    static int x = 55;
    int y = 17;
    
    static void access()
    {
        System.out.println("x = "+x);
    }
}
public class ObjectOriented5_StaticMethod1 {
    public static void main(String[] args) {
        Test.access();
        System.out.println(Test.x); //also valid
    }
}
