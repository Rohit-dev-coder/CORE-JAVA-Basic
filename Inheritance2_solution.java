/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaprogrames;

class Teacher1
{
    int id;
    String name;
    String address;
    float sal;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }
    
}

class Student2 extends Teacher
{
    int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    
    
}

public class Inheritance2_solution {
    public static void main(String[] args) {
        Student2 s = new Student2();
        s.setId(1001);
        s.setName("Rajesh Singh");
        s.setAddress("M-150 Nehru Nagar, Panjab");
        s.setMarks(880);
        
        System.out.println("ID: "+s.getId());
        System.out.println("Name: "+s.getName());
        System.out.println("Address: "+s.getAddress());
        System.out.println("Marks: "+s.getMarks());
    }
}
/*
When an object to Student class is created, it contains a copy of techer class within it. This means there is a 
relation between the teacher class an Student class objects.  This is the reason why Teacher class members are
available to student class.
Note: We do not create teacher class object, but still a copy of it is available to student class object.
*/