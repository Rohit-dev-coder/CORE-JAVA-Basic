package basicjavaprogrames;
class Employee1
{
    int id;
    public Employee1(int id) {
        this.id = id;
    } 
}
class Check1
{
    void swap(Employee1 e1, Employee1 e2)
    {
        Employee1 temp = e1;
        e1 = e2;
        e2 = temp;
    }
}
public class PassObjects {
    public static void main(String[] args) {
        Employee1 obj1 = new Employee1(10);
        Employee1 obj2 = new Employee1(20);
        System.out.println("BEfore Swap: ");
        System.out.println("obj1 : "+ obj1.id+ "\tobj2: "+obj2.id);
        Check1 ck = new Check1();
        ck.swap(obj1, obj2);
        System.out.println("After Swap: ");
        System.out.println("obj1 : "+ obj1.id+ "\tobj2: "+obj2.id);      
    }
}
/*
Even the objects are also passed to methods by value. This means, when we send as object to a method, its bit by bit 
copy will be sent to the method. Any modificatios to the object inside the method will not affect the original copy 
outside the method. So when we come out of the method, we find the original value unchanged.
Actually, a copy of the references obj1 and obj2 are passed to the method where they will be interchanged.
Outside the method, the original obj1 and obj2 will remain same. So, when we come out of swap() method, we find the 
'id' values are not changed. This effect of pass by value.
*/