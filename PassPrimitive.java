
package basicjavaprogrames;

class Check
{
    void swap(int num1, int num2)
    {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
}
public class PassPrimitive {
    public static void main(String[] args) {
        int n1 = 10, n2 = 20;
        Check obj = new Check();
        System.out.println(n1+"\t"+n2);
        obj.swap(n1, n2);
        System.out.println(n1+"\t"+n2);
    }
    /*
    When we send primitive data types like int, float, char etc..,to a method, a copy of their values will be sent
    to the method. So any modifications to them inside the method will not affect their original copy.
    This is also called pass by value or call by value.
    */
    
}
