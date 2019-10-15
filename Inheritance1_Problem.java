
package basicjavaprogrames;

class Teacher
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

class Student
{
    int id;
    String name;
    String address;
    int mark;

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

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    
    
}

public class Inheritance1_Problem {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(1001);
        s.setName("Rajesh Singh");
        s.setAddress("M-150 Nehru Nagar, Panjab");
        s.setMark(880);
        
        System.out.println("ID: "+s.getId());
        System.out.println("Name: "+s.getName());
        System.out.println("Address: "+s.getAddress());
        System.out.println("Marks: "+s.getMark());
    }
}
/*
Just compare the teacher class and student class. we can find 75% similarities in both the classes.while developing
the student class, if the programmer decides to reuse the teacher class code, then developing the student class
would become easier.
see Inheritace2_solution
*/