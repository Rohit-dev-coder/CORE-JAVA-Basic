/*
-------------NOTE:---------------
An abstract method is a method without method body. An abstract method is written when the same method has to 
perform diffrent tasks depending on the object calling it.
Abstract class: It is a class that contains 0 or more abstract methods.
*/
package basicjavaprogrames;
abstract class MyClass{
    abstract void calculate(double x);
}
class Sub1 extends MyClass{
    void calculate(double x){
        System.out.println("Square :"+(x*x));
    }
}
class Sub2 extends MyClass{
    void calculate(double x){
        System.out.println("Square root :"+Math.sqrt(x));
    }
}
class Sub3 extends MyClass{
    void calculate(double x){
        System.out.println("Square root :"+(x*x*x));
    }
}
public class Abstract1 {
    public static void main(String[] args) {
        Sub1 obj1 = new Sub1();
        Sub2 obj2 = new Sub2();
        Sub3 obj3 = new Sub3();
        
        obj1.calculate(3);
        obj1.calculate(4);
        obj1.calculate(5);
    }
}
