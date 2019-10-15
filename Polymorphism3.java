/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaprogrames;
class Demo7
{
    static void calculate(double x)
    {
        System.out.println("Square value ="+(x*x));
    }
}
class Demo8 extends Demo7
{
    static void calculate(double x)
    {
        System.out.println("Square root ="+Math.sqrt(x));
    }
}
public class Polymorphism3 {
    public static void main(String[] args) {
        Demo7 d = new Demo8();
        d.calculate(25);
        Demo8 dd = new Demo8();
        dd.calculate(25);
    }
}
/*
A static method is a method whose single copy is memory is shared by all the objects of the class.
Static methods belong to the class rather than to the object. So they are called class methods.
When static methods are overloaded or overriden, since they do not depend on the objects, 
the Java compiler need not wait till the objects are craeted.

The point is that when static methods are overidden then JVM decides which method is to be excecuted depending
on the reference type used to call the method.
*/