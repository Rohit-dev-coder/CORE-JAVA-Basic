/*
Factory Methods are static methods only. But their intention is to create an object depending on the user choice.
Precisely, a factory method is a method returns an object to the class, to which it belongs.
For example, getNumberInstance() is a factory method. why? because it belongs to NumberFormat class and returns
an object to NumberFormat class.
*/
package basicjavaprogrames;


public class FactoryMethod_Why {
    public static void main(String[] args) {
        final double PI = (double)22/7;
        double r = 15.5;
        double area = PI*r*r;
        System.out.println("Area = "+area);
    }  
}
/*
Area = 755.0714285714286
There are 13 digits displayed after the decimal point. For most of the general purposes, these many digit are not
needed.
So the question is how to format the output(area) of the preceding program to display as many digits as we want in
the integer and fraction parts.
This is achieved by NumberFormat class. NumberFormat class of java.text package is useful to format the numerical values.

1. For creating NumberFormat object, we should use the factory method getNumberInstance().
2. Depending on  this, we should use any of the NumberFormat class methods:
    ---setMaximumIntegerDigits();
    ---setMinimumIntegerDigits();
    ---setMaximumFractionDigits();
    ---setMinimumFractionDigits();
3. Applay the format to the area value using format() method. and its method return String that formatted area value.

*/