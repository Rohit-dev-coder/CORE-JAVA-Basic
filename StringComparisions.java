
package basicjavaprogrames;
public class StringComparisions {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String ("Hello");
        
        if(s1==s2)
            System.out.println("Both are Same");
        else
            System.out.println("Not same");
        
        /*
        When an object is created in JVM, it returns the memory address of the object as a hexadecimal number,
        which is called object reference.
        When a new object is created, a new reference number is allotted to it. it means every object will have a
        unique reference.
        
        So, String s1 = "Hello" JVM create an object on heap and stores "Hello" in it. A reference number, say
        354112as is alloted for this object.
        Similary with other statement String s2 = new String ("Hello");
        So the Statement if(s1 == s2) will compare these reference number..Hence both are not same.
        Actually we are trying to compare their References which are not same.
        To Compare their contents of string object use equals() method
        */
        
        
        if(s1.equals(s2))
            System.out.println("Both are same");
        else
            System.out.println("Not same");
        
        
        //But What about this 
        
        String s3 = "Hello";
        if (s1 == s3)
            System.out.println("Both are same");
        else
            System.out.println("Not same");
        
        /*
        Here, JVM creates a String object and stores "Hello" in it. Observe that we are not using new operator
        to create the string. We are using Assignment operator (=) for this purpose.
        So, After creating the String object, JVM uses a special block of memory which is called String Constant
        pool and stores the object there.
        When the next statement, String s3 = "Hello"; is executed by the JVM, it searches in the string constant pool
        to know whether the object with same namecontent is already available there or not.
        Since the same object is already available there ( which is s1), then JVM does not create another object.
        It simply creates another reference variable s2 to the same object, and copies the reference number of s1
        s2.
        So, we have same value in the s1 and s2. 
        */
        
        
    }
    
}
