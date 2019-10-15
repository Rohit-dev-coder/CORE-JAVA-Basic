package basicjavaprogrames;
class Employee2
{
    int id1,id2;
    public Employee2(int id1,int id2) {
        this.id1 = id1;
        this.id2 = id2;
    } 
}
class Check2
{
    void swap(Employee2 oo)
    {
        int temp = oo.id1;
        oo.id1 = oo.id2;
        oo.id2 = temp;
    }
}
public class PassObjects1 {
    public static void main(String[] args) {
        Employee2 obj = new Employee2(10,20);
        System.out.println("BEfore Swap: ");
        System.out.println("obj1 : "+ obj.id1+ "\tobj2: "+obj.id2);
        Check2 ck = new Check2();
        ck.swap(obj);
        System.out.println("After Swap: ");
        System.out.println("obj1 : "+ obj.id1+ "\tobj2: "+obj.id2);      
    }
}