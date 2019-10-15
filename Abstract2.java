
package basicjavaprogrames;

abstract class Car
{
    int regno;

    public Car(int regno) {
        this.regno = regno;
    }
    void openTank(){
        System.out.println("Fill the tank");
    }
    abstract void steering(int direction, int angle);
    abstract void braking(int force);
}

class Maruti extends Car
{

    public Maruti(int regno) {
        super(regno);
    }

    @Override
    void steering(int direction, int angle) {
        System.out.println("take a turn");
        System.out.println("This is ordinary steering");
    }

    @Override
    void braking(int force) {
        System.out.println("brakes applied");
        System.out.println("These are hydraulic brakes");
    }    
}

class Santro extends Car
{

    public Santro(int regno) {
        super(regno);
    }

    @Override
    void steering(int direction, int angle) {
        System.out.println("take a turn");
        System.out.println("This car uses power steering");
    }

    @Override
    void braking(int force) {
        System.out.println("brakes applied");
        System.out.println("These cars uses gas brakes");
    }
    
}
public class Abstract2 {
    public static void main(String[] args) {
        Maruti m = new Maruti(1002);
        Santro s = new Santro(5003);
        
        Car c;
        c = m;
        c.openTank();
        c.steering(1, 15);
        c.braking(50);
    }
}

/*
We created a reference of the super class and using this reference, we are accessing all the features of the sub 
classes in main() method. Why should we create a referecne of the super class? Can't we access the features of the
sub classes by individually creating sub class object?
It is perfectly possible to access all the members of the sub classes by using sub class objects. But we prefersto
use super class reference to access the sub class features because, the reference variable can access only those
features of the sub classes which have been already declared in super class. If we write an individual method
in the sub class, the super class reference cannot access that method.
*/