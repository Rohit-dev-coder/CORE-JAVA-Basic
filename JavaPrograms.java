
package basicjavaprogrames;


//Two Classes System and String. These Classes Belong to a package called java.lang (here lang represent language)
//So these two classes must be imported into our program as 
// Import java.lang.System;
//import java.lang.String;
// But by default java imported java.lang package in our every java code


public class JavaPrograms {
    public static void main(String[] args) {
        System.out.println("Hello Worlds");
    }
}


//A method should be called by using objectname.methodname. So to call println() method, we should create an object to the class to 
//which println() method belongs. println() method belongs to PrintStream class. But it not possible to create the object to PrintStream
//class directly, an alternative is given to us i.e. System.out Here System is the class name and out is a static variable in System
//class. out is called a field in System class. When we call this field, a PrintStream class object will be created internally.
//System.out gives the PrintStream class object
// The object by default represents the standard output device i.e. the moniter

