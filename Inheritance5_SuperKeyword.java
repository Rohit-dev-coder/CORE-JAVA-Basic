
package basicjavaprogrames;

class Demo3
{
    int i;
    private int x=1000;
    protected int y = 9999;
    Demo3(int i)
    {
        this.i = i;
    }
}

class Demo4 extends Demo3
{
    int i;
    Demo4(int a,int b)
    {
        super(a);
        i = b;
    }
    void show()
    {
        System.out.println("Sub class i = "+i);
        System.out.println("Super class i = "+super.i);
        System.out.println(y); //available
        // System.out.println(x);  error - a is private
    }
}

public class Inheritance5_SuperKeyword {
    public static void main(String[] args) {
        Demo4 d4 = new Demo4(2,4);
        d4.show();
    }
}

/*
Note:
private members of the super class are not availble to sub classes directly.
*/