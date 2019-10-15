/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaprogrames;

/**
 *
 * @author my pc
 */
public class StaticBlock {
    static{
        System.out.println("JVM executes a static block on the highest priority. This means JVM first Goes"
                + "to a static block even before it look for the main() method of the program.");
        System.exit(0);
    }
}
