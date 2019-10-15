/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaprogrames;

class Demo5
{
    void calculate(double x)
    {
        System.out.println("Square value ="+(x*x));
    }
}
class Demo6 extends Demo5
{
    void calculate(double x)
    {
        System.out.println("Square root ="+Math.sqrt(x));
    }
}
public class Polymorphism2 {
    public static void main(String[] args) {
        Demo6 d = new Demo6();
        d.calculate(25);
        Demo5 dd = new Demo6();
        dd.calculate(25);
    }
}
/*
Square root =5.0

When a super class method is overriden by the sub class method. JVM calls only the sub class method and never the 
super class method. In other words, we can say the sub class method is replacing the super class method.
*/