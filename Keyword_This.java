
package basicjavaprogrames;

class MyThis
{
    private int x;
    MyThis()
    {
        this(55);      
    }
    MyThis(int x)
    {
        this.x = x;
        this.access();
    }
    void access()
    {
        System.out.println("x = "+x);
    }
}
public class Keyword_This {
    public static void main(String[] args) {
        MyThis mt = new MyThis(56);
    }
}
